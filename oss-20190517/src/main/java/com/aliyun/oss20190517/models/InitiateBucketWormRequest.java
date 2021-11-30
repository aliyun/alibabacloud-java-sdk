// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class InitiateBucketWormRequest extends TeaModel {
    @NameInMap("InitiateWormConfiguration")
    public InitiateWormConfiguration initiateWormConfiguration;

    public static InitiateBucketWormRequest build(java.util.Map<String, ?> map) throws Exception {
        InitiateBucketWormRequest self = new InitiateBucketWormRequest();
        return TeaModel.build(map, self);
    }

    public InitiateBucketWormRequest setInitiateWormConfiguration(InitiateWormConfiguration initiateWormConfiguration) {
        this.initiateWormConfiguration = initiateWormConfiguration;
        return this;
    }
    public InitiateWormConfiguration getInitiateWormConfiguration() {
        return this.initiateWormConfiguration;
    }

}
