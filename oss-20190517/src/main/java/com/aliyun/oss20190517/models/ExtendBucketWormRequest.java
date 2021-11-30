// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ExtendBucketWormRequest extends TeaModel {
    @NameInMap("extendWormConfiguration")
    public ExtendWormConfiguration extendWormConfiguration;

    @NameInMap("wormId")
    public String wormId;

    public static ExtendBucketWormRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtendBucketWormRequest self = new ExtendBucketWormRequest();
        return TeaModel.build(map, self);
    }

    public ExtendBucketWormRequest setExtendWormConfiguration(ExtendWormConfiguration extendWormConfiguration) {
        this.extendWormConfiguration = extendWormConfiguration;
        return this;
    }
    public ExtendWormConfiguration getExtendWormConfiguration() {
        return this.extendWormConfiguration;
    }

    public ExtendBucketWormRequest setWormId(String wormId) {
        this.wormId = wormId;
        return this;
    }
    public String getWormId() {
        return this.wormId;
    }

}
