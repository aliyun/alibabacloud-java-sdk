// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class BucketIsExistRequest extends TeaModel {
    // bucket名称
    @NameInMap("BucketName")
    public String bucketName;

    public static BucketIsExistRequest build(java.util.Map<String, ?> map) throws Exception {
        BucketIsExistRequest self = new BucketIsExistRequest();
        return TeaModel.build(map, self);
    }

    public BucketIsExistRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

}
