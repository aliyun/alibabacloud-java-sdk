// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeImageUrlsRequest extends TeaModel {
    @NameInMap("OriginUrls")
    public String originUrls;

    @NameInMap("ObjectKeys")
    public String objectKeys;

    @NameInMap("StoreId")
    public Long storeId;

    public static DescribeImageUrlsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageUrlsRequest self = new DescribeImageUrlsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageUrlsRequest setOriginUrls(String originUrls) {
        this.originUrls = originUrls;
        return this;
    }
    public String getOriginUrls() {
        return this.originUrls;
    }

    public DescribeImageUrlsRequest setObjectKeys(String objectKeys) {
        this.objectKeys = objectKeys;
        return this;
    }
    public String getObjectKeys() {
        return this.objectKeys;
    }

    public DescribeImageUrlsRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

}
