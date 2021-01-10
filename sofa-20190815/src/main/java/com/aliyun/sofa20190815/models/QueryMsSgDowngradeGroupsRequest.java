// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgDowngradeGroupsRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DowngradeService")
    public String downgradeService;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RuleName")
    public String ruleName;

    public static QueryMsSgDowngradeGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgDowngradeGroupsRequest self = new QueryMsSgDowngradeGroupsRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsSgDowngradeGroupsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryMsSgDowngradeGroupsRequest setDowngradeService(String downgradeService) {
        this.downgradeService = downgradeService;
        return this;
    }
    public String getDowngradeService() {
        return this.downgradeService;
    }

    public QueryMsSgDowngradeGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMsSgDowngradeGroupsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryMsSgDowngradeGroupsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsSgDowngradeGroupsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
