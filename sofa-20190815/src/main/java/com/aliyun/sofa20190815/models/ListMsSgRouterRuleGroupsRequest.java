// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgRouterRuleGroupsRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Start")
    public Long start;

    public static ListMsSgRouterRuleGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgRouterRuleGroupsRequest self = new ListMsSgRouterRuleGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListMsSgRouterRuleGroupsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListMsSgRouterRuleGroupsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListMsSgRouterRuleGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListMsSgRouterRuleGroupsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMsSgRouterRuleGroupsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListMsSgRouterRuleGroupsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
