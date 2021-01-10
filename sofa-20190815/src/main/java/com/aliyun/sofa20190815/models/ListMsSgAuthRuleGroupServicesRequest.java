// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgAuthRuleGroupServicesRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("HasAuthRule")
    public Boolean hasAuthRule;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Start")
    public Long start;

    public static ListMsSgAuthRuleGroupServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgAuthRuleGroupServicesRequest self = new ListMsSgAuthRuleGroupServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListMsSgAuthRuleGroupServicesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListMsSgAuthRuleGroupServicesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListMsSgAuthRuleGroupServicesRequest setHasAuthRule(Boolean hasAuthRule) {
        this.hasAuthRule = hasAuthRule;
        return this;
    }
    public Boolean getHasAuthRule() {
        return this.hasAuthRule;
    }

    public ListMsSgAuthRuleGroupServicesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListMsSgAuthRuleGroupServicesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMsSgAuthRuleGroupServicesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListMsSgAuthRuleGroupServicesRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
