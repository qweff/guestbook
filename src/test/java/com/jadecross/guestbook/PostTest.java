package com.jadecross.guestbook;

import static org.junit.jupiter.api.Assertions.asserEquals;
import org.junit.jupiter.api.Test;

class PostTest {
	@Test
	void testSetName() {
	  Post post =  new Post("TESTER", "20022-04-12 01:01:48", "Happy Wedding");
          post.setName("DEVOPS");
          assertEquals("DEVOPS", post.getName());
        }
}

