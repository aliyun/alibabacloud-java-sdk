// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServiceKeywordRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Keyword")
    public String keyword;

    public static QueryMsSgServiceKeywordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServiceKeywordRequest self = new QueryMsSgServiceKeywordRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServiceKeywordRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryMsSgServiceKeywordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMsSgServiceKeywordRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}
