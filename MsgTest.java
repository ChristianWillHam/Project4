import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MsgTest {

	// ------------------------------------------------------------------------
	
	@Test
	void testMsgStringStringStringChar_instance() {								// Test to make sure StringStringStringChar constructor creates an instance
		Msg msg = new Msg("Message", "Fritz", "Lauren", 'e');
		assertTrue(msg != null);												// Assert that object creates is not null - an instance was created
	}

	// ------------------------------------------------------------------------

	@Test
	void testMsgString_instance() {												// Test to make sure String constructor creates an instance
		Msg msg = new Msg("Message");					
		assertTrue(msg != null);												// Assert that object creates is not null - an instance was created
	}

	// ------------------------------------------------------------------------
	@Test
	void testMsg_instance() {													// Test to make sure no-args constructor creates an instance
		Msg msg = new Msg();
		assertTrue(msg != null);												// Assert that object creates is not null - an instance was created
	}

	// ------------------------------------------------------------------------
	
	@Test	
	void testGetContents() {													// Test for getContents()
		Msg msg = new Msg("a secret message");
		String output = "a secret message";
		assertEquals(output, msg.getContents());								// Assert that content is equal to predicted output
	}

	// ------------------------------------------------------------------------
	
	@Test								
	void testSetContents() {													// Test for setContents()
		Msg msg = new Msg();													// Use empty constructor
		String output = "a secret message";
		msg.setContents("a secret message");
		assertEquals(output, msg.getContents());								// Assert that content equals predicted output from setContents()
	}
	
	// ------------------------------------------------------------------------
	
	@Test								
	void testSetContents_override() {											// Test for setContents()
		Msg msg = new Msg("a bad message");										// Put a value that is overridden
		String output = "a secret message";
		msg.setContents("a secret message");
		assertEquals(output, msg.getContents());								// Assert that content equals predicted output from setContents()
	}
	
	// ------------------------------------------------------------------------

	@Test	
	void testGetSource() {														// Test for getSource()
		Msg msg = new Msg("a secret message", "Christian", "Fritz", 'e');
		String output = "Christian";
		assertEquals(output, msg.getSource());									// Assert that source is equal to predicted output
	}
	
	// ------------------------------------------------------------------------
	
	@Test																		// Test for getSource() with no-args constructor
	void testGetSource_noargs() {
		Msg msg = new Msg();	
		assertEquals(null, msg.getSource());									// Assert that output is null (expected from uninitialized String)
	}
	
	// ------------------------------------------------------------------------
	
	@Test								
	void testSetSource() {														// Test for setSource()
		Msg msg = new Msg();													// Use empty constructor
		String output = "Lauren";
		msg.setSource("Lauren");
		assertEquals(output, msg.getSource());									// Assert that source equals predicted output from setSource()
	}
	
	// ------------------------------------------------------------------------
	
	@Test								
	void testSetSource_override() {												// Test for setSource()
		Msg msg = new Msg("a secret message", "Christian", "Fritz", 'e');		// Put a value that is overridden
		String output = "Lauren";
		msg.setSource("Lauren");
		assertEquals(output, msg.getSource());									// Assert that source equals predicted output from setSource()
	}
	
	// ------------------------------------------------------------------------

	@Test
	void testGetDestination() {													// Test for getDestination()
		Msg msg = new Msg("a secret message", "Christian", "Fritz", 'e');
		String output = "Fritz";
		assertEquals(output, msg.getDestination());								// Assert that destination is equal to predicted output
	}
	
	// ------------------------------------------------------------------------
	
	@Test																		// Test for getDestination() with no-args constructor
	void testGetDestination_noargs() {
		Msg msg = new Msg();	
		assertEquals(null, msg.getDestination());								// Assert that output is null (expected from uninitialized String)
	}
	
	// ------------------------------------------------------------------------
	
	@Test
	void testSetDestination() {													// Test for setDestination()
		Msg msg = new Msg();													// Use empty constructor
		String output = "Dr. Elva";
		msg.setDestination("Dr. Elva");
		assertEquals(output, msg.getDestination());								// Assert that source equals predicted output from setDestination()
	}
	
	// ------------------------------------------------------------------------

	@Test
	void testSetDestination_override() {										// Test for setDestination()
		Msg msg = new Msg("a secret message", "Christian", "Fritz", 'e');		// Put a value that is overridden
		String output = "Dr. Elva";
		msg.setDestination("Dr. Elva");
		assertEquals(output, msg.getDestination());								// Assert that source equals predicted output from setDestination()
	}
	
	// ------------------------------------------------------------------------
	
	@Test
	void testGetType() {														// Test for getType()
		Msg msg = new Msg("a secret message", "Christian", "Fritz", 'e');
		char output = 'e';
		assertEquals(output, msg.getType());									// Assert that destination is equal to predicted output
	}

	// ------------------------------------------------------------------------
	
	@Test																		// Test for getType() with no-args constructor
	void testGetType_noargs() {
		Msg msg = new Msg();	
		assertEquals(0, msg.getType());											// Assert that output is expected default char value (0)
	}
	
	// ------------------------------------------------------------------------
	
	@Test
	void testSetType() {														// Test for setType()
		Msg msg = new Msg();													// Use empty constructor
		char output = 'e';
		msg.setType('e');
		assertEquals(output, msg.getType());									// Assert that source equals predicted output from setType()
	}
	
	// ------------------------------------------------------------------------

	@Test
	void testSetType_override() {												// Test for setType()
		Msg msg = new Msg("a secret message", "Christian", "Fritz", 'e');		// Put a value that is overridden
		char output = 't';
		msg.setType('t');
		assertEquals(output, msg.getType());									// Assert that source equals predicted output from setType()
	}
	
	// ------------------------------------------------------------------------
	
	@Test
	void testCostOfTransfer_e() {												// Test for costOfTransfer() when type = 'e'
		Msg msg = new Msg();
		msg.setType('e');														// Test message of type 'e'
		double output = 0;														// Cost for message of type 'e' should be 0
		assertEquals(output, msg.costOfTransfer());								// Assert that cost of transfer is equal to expected cost
	}
	
	// ------------------------------------------------------------------------
	
	@Test
	void testCostOfTransfer_t() {												// Test for costOfTransfer() when type = 't'
		Msg msg = new Msg();
		msg.setType('t');														// Test message of type 't'
		double output = 0.25;													// Cost for message of type 't' should be 0.25
		assertEquals(output, msg.costOfTransfer());								// Assert that cost of transfer is equal to expected cost
	}
	
	// ------------------------------------------------------------------------
	
	@Test
	void testCostOfTransfer_a() {												// Test for costOfTransfer() when type = 'a'
		Msg msg = new Msg();
		msg.setType('a');														// Test message of type 'a'
		double output = 1.50;													// Cost for message of type 'a' should be 1.50
		assertEquals(output, msg.costOfTransfer());								// Assert that cost of transfer is equal to expected cost
	}
	
	// ------------------------------------------------------------------------
	
	@Test
	void testCostOfTransfer_null() {											// Test for costOfTransfer() when type isn't declared
		Msg msg = new Msg();
		double output = 1.50;													// Cost for other message (other than 'e' and 't') should be 1.50
		assertEquals(output, msg.costOfTransfer());								// Assert that cost of transfer is equal to expected cost
	}

	// ------------------------------------------------------------------------
	
	@Test	
	void testEncrypt_oneWord() {												// Test for encrypt() with a single word
		Msg msg = new Msg("word");
		String output = "drow";													// Expects the content reversed
		assertEquals(output, msg.encrypt());									// Assert that the encrypted content is equal to expected output
	}
	
	// ------------------------------------------------------------------------
	
	@Test	
	void testEncrypt_twoWords() {												// Test for encrypt() with two words
		Msg msg = new Msg("pretty word");
		String output = "ytterp drow";											// Expects that each word gets reversed
		assertEquals(output, msg.encrypt());									// Assert that the encrypted content is equal to expected output
	}
	
	// ------------------------------------------------------------------------
	
	@Test	
	void testEncrypt_phrase() {													// Test for encrypt() with a phrase
		Msg msg = new Msg("I love CMS270!");
		String output = "I evol !072SMC";										// Expects that each word gets reversed
		assertEquals(output, msg.encrypt());									// Assert that the encrypted content is equal to expected output
	}
	
	// ------------------------------------------------------------------------
	
	@Test	
	void testEncrypt_emptyString() {											// Test for encrypt() with an empty string.
		Msg msg = new Msg("");
		String output = "";														// Expects that each word gets reversed
		assertEquals(output, msg.encrypt());									// Assert that the encrypted content is equal to expected output
	}
	
	// ------------------------------------------------------------------------
	
	@Test
	void testEncrypt_palindrome() {												// Test for encrypt() with a
		String palindrome = "racecar";											// racecar is a palindrome
		Msg msg = new Msg(palindrome);
		assertEquals(palindrome, msg.encrypt());								// check if encrypt is equal to palindrome
	}
	
	// ------------------------------------------------------------------------
	
	@Test	
	void testEncrypt_null() {													// Test for encrypt() without initializing content string.
		try{
			Msg msg = new Msg();
			msg.setContents(msg.encrypt());										// Try encrypting with null contents.
			fail("Expected NullPointerException");								// Fail if exception isn't thrown
		}catch (NullPointerException e){
			return;																// If exception is thrown make the test case pass
		}								
	}
	
	// ------------------------------------------------------------------------

	@Test
	void testDecrypt() {														// Test for decrypt() - this method always returns the string passed to it.
		String output = "fbnwasiu hbfnsjabgiueh jabnfiubeqr";
		Msg msg = new Msg(output);
		assertEquals(output, msg.decrypt());									// Assert that the decrypted output is equal to the original output
	}
	
	// ------------------------------------------------------------------------
	
	@Test
	void testDecrypt_oneWord() {												// Test for decrypt() - this method always returns content
		Msg msg = new Msg("word");
		assertEquals("word", msg.decrypt());									// Assert that the decrypted output is equal to the original output
	}
	
	// ------------------------------------------------------------------------
	
	@Test
	void testDecrypt_equalsGetContents() {										// Test that decrypt is the same as getContents()
		Msg msg = new Msg("testing is fun");
		assertEquals(msg.getContents(), msg.decrypt());							// Assert that both methods return an equal value
	}
	
	// ------------------------------------------------------------------------
	
	@Test	
	void testDecrypt_null() {													// Test for encrypt() without initializing content string.
		try{
			Msg msg = new Msg();
			msg.setContents(msg.decrypt());										// Try encrypting with null contents.
			fail("Expected NullPointerException");								// Fail if exception isn't thrown
		}catch (NullPointerException e){
			return;																// If exception is thrown make the test case pass
		}								
	}

}
