package test;

import static org.junit.Assert.assertNotNull;

import com.fasterxml.jackson.databind.JsonNode;

public class Assertions {

    public static void hasAddressComponents(JsonNode node) {
	assertNotNull(node);
	assertNotNull(node.get("results"));
	assertNotNull(node.get("results").get(0));
	assertNotNull(node.get("results").get(0).get("address_components"));
	assertNotNull(node.get("results").get(0).get("address_components").get(0));
    }

}
