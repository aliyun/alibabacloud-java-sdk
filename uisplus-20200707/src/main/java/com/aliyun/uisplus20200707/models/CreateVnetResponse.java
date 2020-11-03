// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class CreateVnetResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VnetId")
    @Validation(required = true)
    public String vnetId;

    public static CreateVnetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVnetResponse self = new CreateVnetResponse();
        return TeaModel.build(map, self);
    }

    public CreateVnetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVnetResponse setVnetId(String vnetId) {
        this.vnetId = vnetId;
        return this;
    }
    public String getVnetId() {
        return this.vnetId;
    }

}
