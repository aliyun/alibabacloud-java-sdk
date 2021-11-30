// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutBucketCorsRequest extends TeaModel {
    @NameInMap("CORSConfiguration")
    public CORSConfiguration cORSConfiguration;

    public static PutBucketCorsRequest build(java.util.Map<String, ?> map) throws Exception {
        PutBucketCorsRequest self = new PutBucketCorsRequest();
        return TeaModel.build(map, self);
    }

    public PutBucketCorsRequest setCORSConfiguration(CORSConfiguration cORSConfiguration) {
        this.cORSConfiguration = cORSConfiguration;
        return this;
    }
    public CORSConfiguration getCORSConfiguration() {
        return this.cORSConfiguration;
    }

}
