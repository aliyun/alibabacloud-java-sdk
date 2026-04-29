// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeletePolarClawAgentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>work</p>
     */
    @NameInMap("AgentId")
    public String agentId;

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
     * <p>true</p>
     */
    @NameInMap("DeleteFiles")
    public Boolean deleteFiles;

    public static DeletePolarClawAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolarClawAgentRequest self = new DeletePolarClawAgentRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolarClawAgentRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public DeletePolarClawAgentRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DeletePolarClawAgentRequest setDeleteFiles(Boolean deleteFiles) {
        this.deleteFiles = deleteFiles;
        return this;
    }
    public Boolean getDeleteFiles() {
        return this.deleteFiles;
    }

}
