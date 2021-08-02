// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class VerifyOrderRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static VerifyOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyOrderRequest self = new VerifyOrderRequest();
        return TeaModel.build(map, self);
    }

    public VerifyOrderRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
