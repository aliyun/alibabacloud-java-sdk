// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushSofamqOpenCallbackRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static PushSofamqOpenCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        PushSofamqOpenCallbackRequest self = new PushSofamqOpenCallbackRequest();
        return TeaModel.build(map, self);
    }

    public PushSofamqOpenCallbackRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
