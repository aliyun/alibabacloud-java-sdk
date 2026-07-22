// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ImportAgentJobsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>名称</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2027179f-20b1-4e0b-841b-d86f2bc7ebf7</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MigrateStrategy")
    public Integer migrateStrategy;

    public static ImportAgentJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportAgentJobsRequest self = new ImportAgentJobsRequest();
        return TeaModel.build(map, self);
    }

    public ImportAgentJobsRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public ImportAgentJobsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ImportAgentJobsRequest setMigrateStrategy(Integer migrateStrategy) {
        this.migrateStrategy = migrateStrategy;
        return this;
    }
    public Integer getMigrateStrategy() {
        return this.migrateStrategy;
    }

}
