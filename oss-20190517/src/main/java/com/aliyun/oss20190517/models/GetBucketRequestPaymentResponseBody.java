// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketRequestPaymentResponseBody extends TeaModel {
    @NameInMap("Payer")
    public String payer;

    public static GetBucketRequestPaymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketRequestPaymentResponseBody self = new GetBucketRequestPaymentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketRequestPaymentResponseBody setPayer(String payer) {
        this.payer = payer;
        return this;
    }
    public String getPayer() {
        return this.payer;
    }

}
