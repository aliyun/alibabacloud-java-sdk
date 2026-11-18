// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawMCPServersRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The list of MCP server names to query. If this parameter is left empty, all MCP servers are returned.</p>
     */
    @NameInMap("ServerList")
    public java.util.List<String> serverList;

    public static DescribePolarClawMCPServersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawMCPServersRequest self = new DescribePolarClawMCPServersRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawMCPServersRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribePolarClawMCPServersRequest setServerList(java.util.List<String> serverList) {
        this.serverList = serverList;
        return this;
    }
    public java.util.List<String> getServerList() {
        return this.serverList;
    }

}
