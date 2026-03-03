// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class AbbrevMonitorAlert extends TeaModel {
    @NameInMap("abbrevMonitorAlertRules")
    public java.util.List<AbbrevMonitorAlertRule> abbrevMonitorAlertRules;

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

    public static AbbrevMonitorAlert build(java.util.Map<String, ?> map) throws Exception {
        AbbrevMonitorAlert self = new AbbrevMonitorAlert();
        return TeaModel.build(map, self);
    }

    public AbbrevMonitorAlert setAbbrevMonitorAlertRules(java.util.List<AbbrevMonitorAlertRule> abbrevMonitorAlertRules) {
        this.abbrevMonitorAlertRules = abbrevMonitorAlertRules;
        return this;
    }
    public java.util.List<AbbrevMonitorAlertRule> getAbbrevMonitorAlertRules() {
        return this.abbrevMonitorAlertRules;
    }

    public AbbrevMonitorAlert setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public AbbrevMonitorAlert setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public AbbrevMonitorAlert setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AbbrevMonitorAlert setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AbbrevMonitorAlert setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AbbrevMonitorAlert setMonitorNotifyStrategy(MonitorNotifyStrategy monitorNotifyStrategy) {
        this.monitorNotifyStrategy = monitorNotifyStrategy;
        return this;
    }
    public MonitorNotifyStrategy getMonitorNotifyStrategy() {
        return this.monitorNotifyStrategy;
    }

    public AbbrevMonitorAlert setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AbbrevMonitorAlert setPbcId(String pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public String getPbcId() {
        return this.pbcId;
    }

    public AbbrevMonitorAlert setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AbbrevMonitorAlert setServiceGroupId(String serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public String getServiceGroupId() {
        return this.serviceGroupId;
    }

    public AbbrevMonitorAlert setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
