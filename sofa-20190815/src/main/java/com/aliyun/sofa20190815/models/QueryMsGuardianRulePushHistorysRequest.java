// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsGuardianRulePushHistorysRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Start")
    public Long start;

    public static QueryMsGuardianRulePushHistorysRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsGuardianRulePushHistorysRequest self = new QueryMsGuardianRulePushHistorysRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsGuardianRulePushHistorysRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryMsGuardianRulePushHistorysRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMsGuardianRulePushHistorysRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryMsGuardianRulePushHistorysRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryMsGuardianRulePushHistorysRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
