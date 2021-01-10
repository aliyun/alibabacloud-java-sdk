// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskSubscriberRequest extends TeaModel {
    @NameInMap("ModelCode")
    public String modelCode;

    public static GetClriskSubscriberRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClriskSubscriberRequest self = new GetClriskSubscriberRequest();
        return TeaModel.build(map, self);
    }

    public GetClriskSubscriberRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

}
