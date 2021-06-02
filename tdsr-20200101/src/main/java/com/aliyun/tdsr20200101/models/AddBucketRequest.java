// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddBucketRequest extends TeaModel {
    // bucket名称
    @NameInMap("BucketName")
    public String bucketName;

    // 输入或输出类型（1，2）
    @NameInMap("Type")
    public Long type;

    public static AddBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBucketRequest self = new AddBucketRequest();
        return TeaModel.build(map, self);
    }

    public AddBucketRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public AddBucketRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
