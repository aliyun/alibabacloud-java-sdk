// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorMqAlert extends TeaModel {
    @NameInMap("condition")
    public String condition;

    @NameInMap("env")
    public String env;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("id")
    public Long id;

    @NameInMap("monitorMqAlertRules")
    public java.util.List<MonitorMqAlertRule> monitorMqAlertRules;

    @NameInMap("monitorNotifyStrategy")
    public MonitorNotifyStrategy monitorNotifyStrategy;

    @NameInMap("name")
    public String name;

    @NameInMap("pbcId")
    public String pbcId;

    @NameInMap("remark")
    public String remark;

    @NameInMap("serviceId")
    public String serviceId;

    @NameInMap("type")
    public String type;

    public static MonitorMqAlert build(java.util.Map<String, ?> map) throws Exception {
        MonitorMqAlert self = new MonitorMqAlert();
        return TeaModel.build(map, self);
    }

    public MonitorMqAlert setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public MonitorMqAlert setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public MonitorMqAlert setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public MonitorMqAlert setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public MonitorMqAlert setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MonitorMqAlert setMonitorMqAlertRules(java.util.List<MonitorMqAlertRule> monitorMqAlertRules) {
        this.monitorMqAlertRules = monitorMqAlertRules;
        return this;
    }
    public java.util.List<MonitorMqAlertRule> getMonitorMqAlertRules() {
        return this.monitorMqAlertRules;
    }

    public MonitorMqAlert setMonitorNotifyStrategy(MonitorNotifyStrategy monitorNotifyStrategy) {
        this.monitorNotifyStrategy = monitorNotifyStrategy;
        return this;
    }
    public MonitorNotifyStrategy getMonitorNotifyStrategy() {
        return this.monitorNotifyStrategy;
    }

    public MonitorMqAlert setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MonitorMqAlert setPbcId(String pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public String getPbcId() {
        return this.pbcId;
    }

    public MonitorMqAlert setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public MonitorMqAlert setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public MonitorMqAlert setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
