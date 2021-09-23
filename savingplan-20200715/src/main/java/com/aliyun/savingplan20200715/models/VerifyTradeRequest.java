// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class VerifyTradeRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static VerifyTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyTradeRequest self = new VerifyTradeRequest();
        return TeaModel.build(map, self);
    }

    public VerifyTradeRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
