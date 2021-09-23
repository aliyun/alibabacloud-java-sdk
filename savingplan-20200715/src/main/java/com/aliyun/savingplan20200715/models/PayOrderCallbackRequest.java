// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class PayOrderCallbackRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static PayOrderCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        PayOrderCallbackRequest self = new PayOrderCallbackRequest();
        return TeaModel.build(map, self);
    }

    public PayOrderCallbackRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
