// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RemovePolarClawMCPServerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-v1</p>
     */
    @NameInMap("ServerName")
    public String serverName;

    public static RemovePolarClawMCPServerRequest build(java.util.Map<String, ?> map) throws Exception {
        RemovePolarClawMCPServerRequest self = new RemovePolarClawMCPServerRequest();
        return TeaModel.build(map, self);
    }

    public RemovePolarClawMCPServerRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public RemovePolarClawMCPServerRequest setServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }
    public String getServerName() {
        return this.serverName;
    }

}
