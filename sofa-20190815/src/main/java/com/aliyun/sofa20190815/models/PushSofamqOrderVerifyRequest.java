// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushSofamqOrderVerifyRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static PushSofamqOrderVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        PushSofamqOrderVerifyRequest self = new PushSofamqOrderVerifyRequest();
        return TeaModel.build(map, self);
    }

    public PushSofamqOrderVerifyRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
