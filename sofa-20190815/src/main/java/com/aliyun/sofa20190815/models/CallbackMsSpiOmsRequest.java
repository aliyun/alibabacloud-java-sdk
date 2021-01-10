// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CallbackMsSpiOmsRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static CallbackMsSpiOmsRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackMsSpiOmsRequest self = new CallbackMsSpiOmsRequest();
        return TeaModel.build(map, self);
    }

    public CallbackMsSpiOmsRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
