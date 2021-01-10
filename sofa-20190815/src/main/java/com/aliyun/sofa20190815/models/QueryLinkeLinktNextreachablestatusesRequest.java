// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktNextreachablestatusesRequest extends TeaModel {
    @NameInMap("WorkItemSign")
    public String workItemSign;

    public static QueryLinkeLinktNextreachablestatusesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktNextreachablestatusesRequest self = new QueryLinkeLinktNextreachablestatusesRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktNextreachablestatusesRequest setWorkItemSign(String workItemSign) {
        this.workItemSign = workItemSign;
        return this;
    }
    public String getWorkItemSign() {
        return this.workItemSign;
    }

}
