// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryOssResourcesRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    public static QueryOssResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOssResourcesRequest self = new QueryOssResourcesRequest();
        return TeaModel.build(map, self);
    }

    public QueryOssResourcesRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
