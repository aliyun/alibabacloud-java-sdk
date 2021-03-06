// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsSgRouterRuleGroupsRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("DispatchVersion")
    public String dispatchVersion;

    @NameInMap("Enabled")
    public Long enabled;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Rules")
    public String rules;

    @NameInMap("Type")
    public String type;

    public static AddMsSgRouterRuleGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMsSgRouterRuleGroupsRequest self = new AddMsSgRouterRuleGroupsRequest();
        return TeaModel.build(map, self);
    }

    public AddMsSgRouterRuleGroupsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddMsSgRouterRuleGroupsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public AddMsSgRouterRuleGroupsRequest setDispatchVersion(String dispatchVersion) {
        this.dispatchVersion = dispatchVersion;
        return this;
    }
    public String getDispatchVersion() {
        return this.dispatchVersion;
    }

    public AddMsSgRouterRuleGroupsRequest setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

    public AddMsSgRouterRuleGroupsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AddMsSgRouterRuleGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddMsSgRouterRuleGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddMsSgRouterRuleGroupsRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public AddMsSgRouterRuleGroupsRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

    public AddMsSgRouterRuleGroupsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
