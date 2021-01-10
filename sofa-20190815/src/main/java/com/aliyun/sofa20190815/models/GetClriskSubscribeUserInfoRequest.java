// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskSubscribeUserInfoRequest extends TeaModel {
    @NameInMap("ModelCode")
    public String modelCode;

    public static GetClriskSubscribeUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClriskSubscribeUserInfoRequest self = new GetClriskSubscribeUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetClriskSubscribeUserInfoRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

}
