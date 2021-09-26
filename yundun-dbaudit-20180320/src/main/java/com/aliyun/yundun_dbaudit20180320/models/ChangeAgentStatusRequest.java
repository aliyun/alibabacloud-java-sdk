// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ChangeAgentStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AgentId")
    public String agentId;

    @NameInMap("AgentStatus")
    public Integer agentStatus;

    public static ChangeAgentStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeAgentStatusRequest self = new ChangeAgentStatusRequest();
        return TeaModel.build(map, self);
    }

    public ChangeAgentStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ChangeAgentStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ChangeAgentStatusRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ChangeAgentStatusRequest setAgentStatus(Integer agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }
    public Integer getAgentStatus() {
        return this.agentStatus;
    }

}
