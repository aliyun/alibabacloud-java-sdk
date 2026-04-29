// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AddPolarClawMCPServerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;command&quot;: &quot;node&quot;,
     *     &quot;args&quot;: [
     *         &quot;-y&quot;,
     *         &quot;@polarclaw/mcp-dev&quot;
     *     ]
     * }</p>
     */
    @NameInMap("ServerConfig")
    public java.util.Map<String, ?> serverConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-v1</p>
     */
    @NameInMap("ServerName")
    public String serverName;

    public static AddPolarClawMCPServerRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPolarClawMCPServerRequest self = new AddPolarClawMCPServerRequest();
        return TeaModel.build(map, self);
    }

    public AddPolarClawMCPServerRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public AddPolarClawMCPServerRequest setServerConfig(java.util.Map<String, ?> serverConfig) {
        this.serverConfig = serverConfig;
        return this;
    }
    public java.util.Map<String, ?> getServerConfig() {
        return this.serverConfig;
    }

    public AddPolarClawMCPServerRequest setServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }
    public String getServerName() {
        return this.serverName;
    }

}
