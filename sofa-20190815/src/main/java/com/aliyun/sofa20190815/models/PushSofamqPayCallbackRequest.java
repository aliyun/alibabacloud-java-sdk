// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushSofamqPayCallbackRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static PushSofamqPayCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        PushSofamqPayCallbackRequest self = new PushSofamqPayCallbackRequest();
        return TeaModel.build(map, self);
    }

    public PushSofamqPayCallbackRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
