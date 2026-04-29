// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AddPolarClawMCPServerShrinkRequest extends TeaModel {
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
    public String serverConfigShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-v1</p>
     */
    @NameInMap("ServerName")
    public String serverName;

    public static AddPolarClawMCPServerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPolarClawMCPServerShrinkRequest self = new AddPolarClawMCPServerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddPolarClawMCPServerShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public AddPolarClawMCPServerShrinkRequest setServerConfigShrink(String serverConfigShrink) {
        this.serverConfigShrink = serverConfigShrink;
        return this;
    }
    public String getServerConfigShrink() {
        return this.serverConfigShrink;
    }

    public AddPolarClawMCPServerShrinkRequest setServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }
    public String getServerName() {
        return this.serverName;
    }

}
