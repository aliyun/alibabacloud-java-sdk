// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class OfflineClriskModelRequest extends TeaModel {
    @NameInMap("ModelCode")
    public String modelCode;

    public static OfflineClriskModelRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineClriskModelRequest self = new OfflineClriskModelRequest();
        return TeaModel.build(map, self);
    }

    public OfflineClriskModelRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

}
