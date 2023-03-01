package hwid.crypt;

import hwid.HwidConfig;

import java.util.logging.Logger;

public class FirstKey
{
	protected static Logger _log = Logger.getLogger(FirstKey.class.getName());

	private static final byte[] TKBOX =
	{
		-112,
		22,
		124,
		-93,
		68,
		-116,
		-19,
		-125,
		-4,
		101,
		-62,
		5,
		70,
		25,
		29,
		81,
		65,
		-86,
		79,
		-69,
		2,
		97,
		-108,
		-11,
		-84,
		-56,
		17,
		7,
		31,
		52,
		-34,
		-41,
		-110,
		-60,
		57,
		-5,
		-6,
		-24,
		98,
		-100,
		23,
		4,
		-74,
		-37,
		1,
		6,
		-2,
		-14,
		-77,
		12,
		-7,
		3,
		-29,
		-17,
		-75,
		49,
		44,
		-78,
		94,
		21,
		0,
		35,
		-18,
		83,
		9,
		-42,
		60,
		93,
		54,
		20,
		-49,
		114,
		106,
		-82,
		113,
		-90,
		86,
		-124,
		-73,
		-81,
		90,
		121,
		115,
		125,
		47,
		24,
		-28,
		73,
		56,
		-31,
		8,
		71,
		122,
		58,
		-33,
		108,
		-111,
		102,
		-118,
		-103,
		-122,
		88,
		28,
		-76,
		67,
		-115,
		-67,
		78,
		36,
		117,
		-8,
		-25,
		-97,
		107,
		-91,
		-50,
		-53,
		-52,
		111,
		-114,
		-58,
		-128,
		84,
		-98,
		63,
		74,
		10,
		41,
		-32,
		126,
		69,
		-68,
		11,
		-119,
		-44,
		-39,
		-107,
		-40,
		85,
		-87,
		61,
		91,
		-1,
		50,
		-72,
		-117,
		15,
		55,
		-51,
		43,
		87,
		105,
		120,
		-88,
		116,
		80,
		-48,
		-123,
		-127,
		-105,
		-22,
		76,
		109,
		19,
		-46,
		-30,
		112,
		16,
		-10,
		45,
		-63,
		-47,
		123,
		-106,
		27,
		38,
		104,
		-70,
		-79,
		18,
		-99,
		-16,
		-85,
		-23,
		30,
		-66,
		48,
		-89,
		-61,
		-113,
		-12,
		51,
		-95,
		-15,
		32,
		-9,
		62,
		-38,
		14,
		-45,
		-80,
		66,
		100,
		103,
		-104,
		-27,
		-43,
		110,
		-83,
		-26,
		-101,
		46,
		-120,
		-54,
		37,
		42,
		13,
		75,
		82,
		-109,
		26,
		-94,
		-57,
		-64,
		119,
		53,
		39,
		-13,
		-121,
		33,
		72,
		-126,
		-65,
		-36,
		-71,
		118,
		-35,
		92,
		96,
		89,
		64,
		34,
		-20,
		-96,
		77,
		40,
		127,
		-21,
		59,
		-55,
		-102,
		95,
		-3,
		99,
		-59,
		-92
	};
	private static final byte[] MGBOX =
	{
		-14,
		-108,
		90,
		75,
		15,
		115,
		-38,
		-37,
		-125,
		29,
		-77,
		9,
		-4,
		54,
		-72,
		70,
		65,
		-44,
		-48,
		85,
		-13,
		-121,
		118,
		-102,
		40,
		53,
		113,
		-5,
		-9,
		28,
		3,
		125,
		21,
		-124,
		10,
		67,
		-6,
		-98,
		96,
		-105,
		-104,
		126,
		-93,
		82,
		-47,
		41,
		-91,
		89,
		-59,
		122,
		47,
		37,
		-31,
		59,
		56,
		12,
		-112,
		-58,
		-39,
		-10,
		-40,
		-49,
		22,
		-107,
		33,
		-89,
		109,
		31,
		88,
		81,
		72,
		42,
		-66,
		-85,
		-15,
		93,
		-101,
		-7,
		-128,
		-19,
		-27,
		-90,
		-11,
		111,
		49,
		-70,
		121,
		79,
		-123,
		-127,
		-79,
		35,
		-28,
		114,
		-22,
		44,
		-54,
		107,
		106,
		30,
		92,
		4,
		-43,
		-82,
		-78,
		-26,
		-61,
		57,
		77,
		95,
		58,
		69,
		-76,
		103,
		-56,
		78,
		26,
		-92,
		48,
		-32,
		-52,
		16,
		-67,
		51,
		-50,
		-73,
		-29,
		52,
		-60,
		-118,
		-1,
		-80,
		63,
		2,
		124,
		-36,
		-65,
		8,
		-33,
		-115,
		-3,
		108,
		-21,
		18,
		110,
		36,
		-51,
		46,
		-103,
		94,
		20,
		-114,
		80,
		127,
		-86,
		19,
		-119,
		-113,
		68,
		-25,
		-120,
		-71,
		32,
		38,
		-95,
		-57,
		5,
		7,
		105,
		-17,
		-34,
		-81,
		24,
		-74,
		-35,
		100,
		1,
		-46,
		-94,
		43,
		13,
		17,
		-87,
		11,
		-69,
		-62,
		-126,
		-63,
		-64,
		-23,
		-97,
		27,
		-18,
		-53,
		84,
		0,
		-106,
		-83,
		39,
		116,
		91,
		104,
		14,
		-24,
		-42,
		34,
		-88,
		-84,
		62,
		61,
		-2,
		112,
		23,
		119,
		73,
		6,
		-122,
		55,
		-99,
		-41,
		83,
		99,
		60,
		87,
		45,
		120,
		-55,
		117,
		-117,
		98,
		123,
		-8,
		76,
		-16,
		-30,
		64,
		-96,
		-109,
		-75,
		25,
		101,
		-110,
		86,
		50,
		71,
		-12,
		74,
		-100,
		-116,
		-68,
		66,
		-20,
		-45,
		102,
		-111,
		97
	};
	public static final byte[] SKBOX =
	{
		HwidConfig.FST_KEY,
		HwidConfig.SCN_KEY,
		2,
		15,
		-5,
		17,
		24,
		23,
		18,
		45,
		1,
		21,
		122,
		16,
		HwidConfig.ANP_KEY,
		HwidConfig.ULT_KEY
	};

	public static byte[] expandKey(byte[] key, int size)
	{
		byte[] P = new byte[64];
		
		for (int i = 0; i < 64; i++)
			P[i] = key[(i % size)];
		
		for (int i = 0; i < 256; i++)
		{
			byte t = P[(i % 64)];
			byte m = (byte) (MGBOX[(MGBOX[(t & 0xFF)] & 0xFF)] & 0xFF ^ TKBOX[(TKBOX[i] & 0xFF)] & 0xFF);
			P[(i % 64)] = TKBOX[(m & 0xFF)];
		}
		
		return P;
	}
	
}