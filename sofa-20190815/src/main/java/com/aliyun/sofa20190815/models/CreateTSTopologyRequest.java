// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateTSTopologyRequest extends TeaModel {
    @NameInMap("BaseVersion")
    public Long baseVersion;

    @NameInMap("Cron")
    public String cron;

    @NameInMap("CustomParams")
    public String customParams;

    @NameInMap("Des")
    public String des;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsCrossZoneTopo")
    public Boolean isCrossZoneTopo;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProcessId")
    public Long processId;

    @NameInMap("Topology")
    public String topology;

    @NameInMap("TriggerType")
    public String triggerType;

    public static CreateTSTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTSTopologyRequest self = new CreateTSTopologyRequest();
        return TeaModel.build(map, self);
    }

    public CreateTSTopologyRequest setBaseVersion(Long baseVersion) {
        this.baseVersion = baseVersion;
        return this;
    }
    public Long getBaseVersion() {
        return this.baseVersion;
    }

    public CreateTSTopologyRequest setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public CreateTSTopologyRequest setCustomParams(String customParams) {
        this.customParams = customParams;
        return this;
    }
    public String getCustomParams() {
        return this.customParams;
    }

    public CreateTSTopologyRequest setDes(String des) {
        this.des = des;
        return this;
    }
    public String getDes() {
        return this.des;
    }

    public CreateTSTopologyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateTSTopologyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTSTopologyRequest setIsCrossZoneTopo(Boolean isCrossZoneTopo) {
        this.isCrossZoneTopo = isCrossZoneTopo;
        return this;
    }
    public Boolean getIsCrossZoneTopo() {
        return this.isCrossZoneTopo;
    }

    public CreateTSTopologyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTSTopologyRequest setProcessId(Long processId) {
        this.processId = processId;
        return this;
    }
    public Long getProcessId() {
        return this.processId;
    }

    public CreateTSTopologyRequest setTopology(String topology) {
        this.topology = topology;
        return this;
    }
    public String getTopology() {
        return this.topology;
    }

    public CreateTSTopologyRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

}
