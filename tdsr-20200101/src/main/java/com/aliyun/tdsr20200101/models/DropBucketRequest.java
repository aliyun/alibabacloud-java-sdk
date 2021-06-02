// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DropBucketRequest extends TeaModel {
    // bucket数据ID
    @NameInMap("Id")
    public String id;

    public static DropBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        DropBucketRequest self = new DropBucketRequest();
        return TeaModel.build(map, self);
    }

    public DropBucketRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
