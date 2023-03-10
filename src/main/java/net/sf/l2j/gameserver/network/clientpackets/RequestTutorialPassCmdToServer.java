package net.sf.l2j.gameserver.network.clientpackets;

import dev.l2j.tesla.autobots.autofarm.AutofarmCommandHandler;
import net.sf.l2j.gameserver.model.actor.Player;
import net.sf.l2j.gameserver.scripting.QuestState;

public class RequestTutorialPassCmdToServer extends L2GameClientPacket
{
	String _bypass;
	
	@Override
	protected void readImpl()
	{
		_bypass = readS();
	}
	
	@Override
	protected void runImpl()
	{
		final Player player = getClient().getPlayer();
		if (player == null)
			return;
		
		QuestState qs = player.getQuestState("Tutorial");
		if (qs != null)
			qs.getQuest().notifyEvent(_bypass, null, player);

		AutofarmCommandHandler.INSTANCE.onBypass(player, _bypass);
	}
}