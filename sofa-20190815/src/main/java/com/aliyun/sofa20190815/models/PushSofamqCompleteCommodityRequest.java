// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushSofamqCompleteCommodityRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static PushSofamqCompleteCommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        PushSofamqCompleteCommodityRequest self = new PushSofamqCompleteCommodityRequest();
        return TeaModel.build(map, self);
    }

    public PushSofamqCompleteCommodityRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
