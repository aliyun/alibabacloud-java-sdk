// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsSgFaultToleranceRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("RuleItemList")
    public String ruleItemList;

    public static UpdateMsSgFaultToleranceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsSgFaultToleranceRequest self = new UpdateMsSgFaultToleranceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMsSgFaultToleranceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateMsSgFaultToleranceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMsSgFaultToleranceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMsSgFaultToleranceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMsSgFaultToleranceRequest setRuleItemList(String ruleItemList) {
        this.ruleItemList = ruleItemList;
        return this;
    }
    public String getRuleItemList() {
        return this.ruleItemList;
    }

}
