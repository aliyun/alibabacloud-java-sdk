// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryTagsRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("ClientKey")
    public String clientKey;

    @NameInMap("KeyType")
    public String keyType;

    public static QueryTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTagsRequest self = new QueryTagsRequest();
        return TeaModel.build(map, self);
    }

    public QueryTagsRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public QueryTagsRequest setClientKey(String clientKey) {
        this.clientKey = clientKey;
        return this;
    }
    public String getClientKey() {
        return this.clientKey;
    }

    public QueryTagsRequest setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }
    public String getKeyType() {
        return this.keyType;
    }

}
