// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgAuthRuleGroupAppsRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Start")
    public Long start;

    public static ListMsSgAuthRuleGroupAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgAuthRuleGroupAppsRequest self = new ListMsSgAuthRuleGroupAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListMsSgAuthRuleGroupAppsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListMsSgAuthRuleGroupAppsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListMsSgAuthRuleGroupAppsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMsSgAuthRuleGroupAppsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListMsSgAuthRuleGroupAppsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
