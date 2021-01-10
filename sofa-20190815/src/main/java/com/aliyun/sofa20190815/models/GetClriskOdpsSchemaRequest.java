// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskOdpsSchemaRequest extends TeaModel {
    @NameInMap("ModelCode")
    public String modelCode;

    public static GetClriskOdpsSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClriskOdpsSchemaRequest self = new GetClriskOdpsSchemaRequest();
        return TeaModel.build(map, self);
    }

    public GetClriskOdpsSchemaRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

}
