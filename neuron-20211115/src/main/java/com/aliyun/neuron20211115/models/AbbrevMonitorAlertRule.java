// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class AbbrevMonitorAlertRule extends TeaModel {
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    @NameInMap("triggerContent")
    public String triggerContent;

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
