// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorSlsAlert extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("condition")
    public String condition;

    /**
     * <strong>example:</strong>
     * <p>TEST</p>
     */
    @NameInMap("env")
    public String env;

    /**
     * <strong>example:</strong>
     * <p>2022-08-24T00:00:00.000Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2022-08-24T00:00:00.000Z</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("monitorNotifyStrategy")
    public MonitorNotifyStrategy monitorNotifyStrategy;

    @NameInMap("monitorSlsAlertRules")
    public java.util.List<MonitorSlsAlertRule> monitorSlsAlertRules;

    /**
     * <strong>example:</strong>
     * <p>报警任务1</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("pbcId")
    public String pbcId;

    /**
     * <strong>example:</strong>
     * <p>测试任务</p>
     */
    @NameInMap("remark")
    public String remark;

    /**
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("serviceGroupId")
    public String serviceGroupId;

    /**
     * <strong>example:</strong>
     * <p>ARMS</p>
     */
    @NameInMap("type")
    public String type;

    public static MonitorSlsAlert build(java.util.Map<String, ?> map) throws Exception {
        MonitorSlsAlert self = new MonitorSlsAlert();
        return TeaModel.build(map, self);
    }

    public MonitorSlsAlert setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public MonitorSlsAlert setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public MonitorSlsAlert setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public MonitorSlsAlert setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public MonitorSlsAlert setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MonitorSlsAlert setMonitorNotifyStrategy(MonitorNotifyStrategy monitorNotifyStrategy) {
        this.monitorNotifyStrategy = monitorNotifyStrategy;
        return this;
    }
    public MonitorNotifyStrategy getMonitorNotifyStrategy() {
        return this.monitorNotifyStrategy;
    }

    public MonitorSlsAlert setMonitorSlsAlertRules(java.util.List<MonitorSlsAlertRule> monitorSlsAlertRules) {
        this.monitorSlsAlertRules = monitorSlsAlertRules;
        return this;
    }
    public java.util.List<MonitorSlsAlertRule> getMonitorSlsAlertRules() {
        return this.monitorSlsAlertRules;
    }

    public MonitorSlsAlert setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MonitorSlsAlert setPbcId(String pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public String getPbcId() {
        return this.pbcId;
    }

    public MonitorSlsAlert setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public MonitorSlsAlert setServiceGroupId(String serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public String getServiceGroupId() {
        return this.serviceGroupId;
    }

    public MonitorSlsAlert setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
