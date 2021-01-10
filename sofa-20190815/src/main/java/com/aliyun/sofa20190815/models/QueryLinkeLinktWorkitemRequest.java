// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktWorkitemRequest extends TeaModel {
    @NameInMap("WorkItemSign")
    public String workItemSign;

    public static QueryLinkeLinktWorkitemRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktWorkitemRequest self = new QueryLinkeLinktWorkitemRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktWorkitemRequest setWorkItemSign(String workItemSign) {
        this.workItemSign = workItemSign;
        return this;
    }
    public String getWorkItemSign() {
        return this.workItemSign;
    }

}
