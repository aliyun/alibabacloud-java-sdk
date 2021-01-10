// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskModelRequest extends TeaModel {
    @NameInMap("ModelCode")
    public String modelCode;

    public static GetClriskModelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClriskModelRequest self = new GetClriskModelRequest();
        return TeaModel.build(map, self);
    }

    public GetClriskModelRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

}
