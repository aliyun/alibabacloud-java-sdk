// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class RequestPaymentConfiguration extends TeaModel {
    // description
    @NameInMap("Payer")
    public String payer;

    public static RequestPaymentConfiguration build(java.util.Map<String, ?> map) throws Exception {
        RequestPaymentConfiguration self = new RequestPaymentConfiguration();
        return TeaModel.build(map, self);
    }

    public RequestPaymentConfiguration setPayer(String payer) {
        this.payer = payer;
        return this;
    }
    public String getPayer() {
        return this.payer;
    }

}
