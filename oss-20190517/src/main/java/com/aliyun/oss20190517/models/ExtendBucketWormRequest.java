// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ExtendBucketWormRequest extends TeaModel {
    @NameInMap("ExtendWormConfiguration")
    public ExtendWormConfiguration body;

    @NameInMap("wormId")
    public String wormId;

    public static ExtendBucketWormRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtendBucketWormRequest self = new ExtendBucketWormRequest();
        return TeaModel.build(map, self);
    }

    public ExtendBucketWormRequest setBody(ExtendWormConfiguration body) {
        this.body = body;
        return this;
    }
    public ExtendWormConfiguration getBody() {
        return this.body;
    }

    public ExtendBucketWormRequest setWormId(String wormId) {
        this.wormId = wormId;
        return this;
    }
    public String getWormId() {
        return this.wormId;
    }

}
