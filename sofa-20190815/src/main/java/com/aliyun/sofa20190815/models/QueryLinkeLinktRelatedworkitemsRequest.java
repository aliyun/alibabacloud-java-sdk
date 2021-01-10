// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktRelatedworkitemsRequest extends TeaModel {
    @NameInMap("WorkItemRelationType")
    public String workItemRelationType;

    @NameInMap("WorkItemSign")
    public String workItemSign;

    public static QueryLinkeLinktRelatedworkitemsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktRelatedworkitemsRequest self = new QueryLinkeLinktRelatedworkitemsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktRelatedworkitemsRequest setWorkItemRelationType(String workItemRelationType) {
        this.workItemRelationType = workItemRelationType;
        return this;
    }
    public String getWorkItemRelationType() {
        return this.workItemRelationType;
    }

    public QueryLinkeLinktRelatedworkitemsRequest setWorkItemSign(String workItemSign) {
        this.workItemSign = workItemSign;
        return this;
    }
    public String getWorkItemSign() {
        return this.workItemSign;
    }

}
