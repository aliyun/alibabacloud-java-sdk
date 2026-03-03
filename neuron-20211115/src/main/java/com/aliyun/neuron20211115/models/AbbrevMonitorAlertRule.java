// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class AbbrevMonitorAlertRule extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2022-06-11T00:00:00.000Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>规则1</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>最近5分钟节点机CPU使用率平均大于等于90%</p>
     */
    @NameInMap("triggerContent")
    public String triggerContent;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("triggerRule")
    public String triggerRule;

    public static AbbrevMonitorAlertRule build(java.util.Map<String, ?> map) throws Exception {
        AbbrevMonitorAlertRule self = new AbbrevMonitorAlertRule();
        return TeaModel.build(map, self);
    }

    public AbbrevMonitorAlertRule setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public AbbrevMonitorAlertRule setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AbbrevMonitorAlertRule setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AbbrevMonitorAlertRule setTriggerContent(String triggerContent) {
        this.triggerContent = triggerContent;
        return this;
    }
    public String getTriggerContent() {
        return this.triggerContent;
    }

    public AbbrevMonitorAlertRule setTriggerRule(String triggerRule) {
        this.triggerRule = triggerRule;
        return this;
    }
    public String getTriggerRule() {
        return this.triggerRule;
    }

}
