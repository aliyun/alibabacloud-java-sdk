// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorArmsAlert extends TeaModel {
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

    @NameInMap("monitorArmsAlertRules")
    public java.util.List<MonitorArmsAlertRule> monitorArmsAlertRules;

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

    public static MonitorArmsAlert build(java.util.Map<String, ?> map) throws Exception {
        MonitorArmsAlert self = new MonitorArmsAlert();
        return TeaModel.build(map, self);
    }

    public MonitorArmsAlert setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public MonitorArmsAlert setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public MonitorArmsAlert setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public MonitorArmsAlert setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public MonitorArmsAlert setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MonitorArmsAlert setMonitorArmsAlertRules(java.util.List<MonitorArmsAlertRule> monitorArmsAlertRules) {
        this.monitorArmsAlertRules = monitorArmsAlertRules;
        return this;
    }
    public java.util.List<MonitorArmsAlertRule> getMonitorArmsAlertRules() {
        return this.monitorArmsAlertRules;
    }

    public MonitorArmsAlert setMonitorNotifyStrategy(MonitorNotifyStrategy monitorNotifyStrategy) {
        this.monitorNotifyStrategy = monitorNotifyStrategy;
        return this;
    }
    public MonitorNotifyStrategy getMonitorNotifyStrategy() {
        return this.monitorNotifyStrategy;
    }

    public MonitorArmsAlert setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MonitorArmsAlert setPbcId(String pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public String getPbcId() {
        return this.pbcId;
    }

    public MonitorArmsAlert setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public MonitorArmsAlert setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public MonitorArmsAlert setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
