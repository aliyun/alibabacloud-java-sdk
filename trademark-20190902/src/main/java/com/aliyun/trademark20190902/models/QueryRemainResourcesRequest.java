// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class QueryRemainResourcesRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    public static QueryRemainResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRemainResourcesRequest self = new QueryRemainResourcesRequest();
        return TeaModel.build(map, self);
    }

    public QueryRemainResourcesRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
