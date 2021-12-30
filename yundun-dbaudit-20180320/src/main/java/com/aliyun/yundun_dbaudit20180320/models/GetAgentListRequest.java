// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetAgentListRequest extends TeaModel {
    @NameInMap("AgentIp")
    public String agentIp;

    @NameInMap("AgentOs")
    public String agentOs;

    @NameInMap("AgentStatus")
    public Integer agentStatus;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetAgentListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentListRequest self = new GetAgentListRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentListRequest setAgentIp(String agentIp) {
        this.agentIp = agentIp;
        return this;
    }
    public String getAgentIp() {
        return this.agentIp;
    }

    public GetAgentListRequest setAgentOs(String agentOs) {
        this.agentOs = agentOs;
        return this;
    }
    public String getAgentOs() {
        return this.agentOs;
    }

    public GetAgentListRequest setAgentStatus(Integer agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }
    public Integer getAgentStatus() {
        return this.agentStatus;
    }

    public GetAgentListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAgentListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
