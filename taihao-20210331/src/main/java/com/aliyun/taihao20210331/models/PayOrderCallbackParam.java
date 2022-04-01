// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class PayOrderCallbackParam extends TeaModel {
    // 支付回调数据体
    @NameInMap("data")
    public String data;

    public static PayOrderCallbackParam build(java.util.Map<String, ?> map) throws Exception {
        PayOrderCallbackParam self = new PayOrderCallbackParam();
        return TeaModel.build(map, self);
    }

    public PayOrderCallbackParam setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
