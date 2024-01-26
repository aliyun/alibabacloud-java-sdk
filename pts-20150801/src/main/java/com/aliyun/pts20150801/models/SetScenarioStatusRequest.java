// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class SetScenarioStatusRequest extends TeaModel {
    @NameInMap("NodeIp")
    public String nodeIp;

    @NameInMap("ScenarioId")
    public Integer scenarioId;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Wskey")
    public String wskey;

    public static SetScenarioStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetScenarioStatusRequest self = new SetScenarioStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetScenarioStatusRequest setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }
    public String getNodeIp() {
        return this.nodeIp;
    }

    public SetScenarioStatusRequest setScenarioId(Integer scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public Integer getScenarioId() {
        return this.scenarioId;
    }

    public SetScenarioStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public SetScenarioStatusRequest setWskey(String wskey) {
        this.wskey = wskey;
        return this;
    }
    public String getWskey() {
        return this.wskey;
    }

}
