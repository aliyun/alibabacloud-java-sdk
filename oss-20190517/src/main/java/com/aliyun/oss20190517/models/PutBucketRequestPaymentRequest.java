// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutBucketRequestPaymentRequest extends TeaModel {
    @NameInMap("RequestPaymentConfiguration")
    public RequestPaymentConfiguration requestPaymentConfiguration;

    public static PutBucketRequestPaymentRequest build(java.util.Map<String, ?> map) throws Exception {
        PutBucketRequestPaymentRequest self = new PutBucketRequestPaymentRequest();
        return TeaModel.build(map, self);
    }

    public PutBucketRequestPaymentRequest setRequestPaymentConfiguration(RequestPaymentConfiguration requestPaymentConfiguration) {
        this.requestPaymentConfiguration = requestPaymentConfiguration;
        return this;
    }
    public RequestPaymentConfiguration getRequestPaymentConfiguration() {
        return this.requestPaymentConfiguration;
    }

}
