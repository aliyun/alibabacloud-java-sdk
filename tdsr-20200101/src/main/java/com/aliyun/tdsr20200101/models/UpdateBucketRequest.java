// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class UpdateBucketRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    // bucket名称
    @NameInMap("NewBucketName")
    public String newBucketName;

    public static UpdateBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBucketRequest self = new UpdateBucketRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBucketRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateBucketRequest setNewBucketName(String newBucketName) {
        this.newBucketName = newBucketName;
        return this;
    }
    public String getNewBucketName() {
        return this.newBucketName;
    }

}
