// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class OnlineClriskModelRequest extends TeaModel {
    @NameInMap("ModelCode")
    public String modelCode;

    public static OnlineClriskModelRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineClriskModelRequest self = new OnlineClriskModelRequest();
        return TeaModel.build(map, self);
    }

    public OnlineClriskModelRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

}
