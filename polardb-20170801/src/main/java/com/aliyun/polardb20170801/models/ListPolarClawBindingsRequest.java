// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ListPolarClawBindingsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>work,research</p>
     */
    @NameInMap("AgentList")
    public java.util.List<String> agentList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    public static ListPolarClawBindingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPolarClawBindingsRequest self = new ListPolarClawBindingsRequest();
        return TeaModel.build(map, self);
    }

    public ListPolarClawBindingsRequest setAgentList(java.util.List<String> agentList) {
        this.agentList = agentList;
        return this;
    }
    public java.util.List<String> getAgentList() {
        return this.agentList;
    }

    public ListPolarClawBindingsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}
