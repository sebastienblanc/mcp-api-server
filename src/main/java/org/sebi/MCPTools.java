package org.sebi;

import io.quarkiverse.mcp.server.Tool;
import io.quarkus.logging.Log;
import io.quarkus.security.Authenticated;
import jakarta.annotation.security.RolesAllowed;

@Authenticated
public class MCPTools {

    @RolesAllowed("platform-team")
    @Tool(name = "add-new-db-region", description = "Add a new database region")
    public String addNewDBRegion(String region) {
        Log.info("Adding new DB region: " + region);
        return "New DB region added: " + region;
    }

}
