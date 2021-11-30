// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class CompleteBucketWormRequest extends TeaModel {
    // The ID of the retention policy
    @NameInMap("wormId")
    public String wormId;

    public static CompleteBucketWormRequest build(java.util.Map<String, ?> map) throws Exception {
        CompleteBucketWormRequest self = new CompleteBucketWormRequest();
        return TeaModel.build(map, self);
    }

    public CompleteBucketWormRequest setWormId(String wormId) {
        this.wormId = wormId;
        return this;
    }
    public String getWormId() {
        return this.wormId;
    }

}
