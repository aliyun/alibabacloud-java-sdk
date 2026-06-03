// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetAgentListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("AgentIp")
    public String agentIp;

    /**
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("AgentOs")
    public String agentOs;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AgentStatus")
    public Integer agentStatus;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbaudit-cn-78v1gc****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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

    public GetAgentListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetAgentListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
