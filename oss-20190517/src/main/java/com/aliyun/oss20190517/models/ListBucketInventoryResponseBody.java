// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListBucketInventoryResponseBody extends TeaModel {
    @NameInMap("InventoryConfiguration")
    public java.util.List<InventoryConfiguration> inventoryConfigurations;

    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("NextContinuationToken")
    public String nextContinuationToken;

    public static ListBucketInventoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBucketInventoryResponseBody self = new ListBucketInventoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBucketInventoryResponseBody setInventoryConfigurations(java.util.List<InventoryConfiguration> inventoryConfigurations) {
        this.inventoryConfigurations = inventoryConfigurations;
        return this;
    }
    public java.util.List<InventoryConfiguration> getInventoryConfigurations() {
        return this.inventoryConfigurations;
    }

    public ListBucketInventoryResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListBucketInventoryResponseBody setNextContinuationToken(String nextContinuationToken) {
        this.nextContinuationToken = nextContinuationToken;
        return this;
    }
    public String getNextContinuationToken() {
        return this.nextContinuationToken;
    }

}
