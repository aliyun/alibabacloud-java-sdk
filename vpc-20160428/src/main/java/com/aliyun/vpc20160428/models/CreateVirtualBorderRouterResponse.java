// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVirtualBorderRouterResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VbrId")
    @Validation(required = true)
    public String vbrId;

    public static CreateVirtualBorderRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualBorderRouterResponse self = new CreateVirtualBorderRouterResponse();
        return TeaModel.build(map, self);
    }

    public CreateVirtualBorderRouterResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVirtualBorderRouterResponse setVbrId(String vbrId) {
        this.vbrId = vbrId;
        return this;
    }
    public String getVbrId() {
        return this.vbrId;
    }

}
