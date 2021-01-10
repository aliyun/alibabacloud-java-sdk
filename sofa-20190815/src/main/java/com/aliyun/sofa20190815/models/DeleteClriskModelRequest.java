// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteClriskModelRequest extends TeaModel {
    @NameInMap("ModelCode")
    public String modelCode;

    public static DeleteClriskModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClriskModelRequest self = new DeleteClriskModelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClriskModelRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

}
