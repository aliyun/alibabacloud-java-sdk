// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAoneinternaliterationRequest extends TeaModel {
    @NameInMap("WorkItemExternalId")
    public String workItemExternalId;

    public static QueryLinkeBahamutAoneinternaliterationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAoneinternaliterationRequest self = new QueryLinkeBahamutAoneinternaliterationRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAoneinternaliterationRequest setWorkItemExternalId(String workItemExternalId) {
        this.workItemExternalId = workItemExternalId;
        return this;
    }
    public String getWorkItemExternalId() {
        return this.workItemExternalId;
    }

}
