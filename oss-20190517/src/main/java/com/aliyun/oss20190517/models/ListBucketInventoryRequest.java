// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListBucketInventoryRequest extends TeaModel {
    @NameInMap("continuation-token")
    public String continuationToken;

    public static ListBucketInventoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBucketInventoryRequest self = new ListBucketInventoryRequest();
        return TeaModel.build(map, self);
    }

    public ListBucketInventoryRequest setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }
    public String getContinuationToken() {
        return this.continuationToken;
    }

}
