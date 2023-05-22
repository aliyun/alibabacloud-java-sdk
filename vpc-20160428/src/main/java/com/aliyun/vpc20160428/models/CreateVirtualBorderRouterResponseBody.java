// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVirtualBorderRouterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VbrId")
    public String vbrId;

    public static CreateVirtualBorderRouterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualBorderRouterResponseBody self = new CreateVirtualBorderRouterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVirtualBorderRouterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVirtualBorderRouterResponseBody setVbrId(String vbrId) {
        this.vbrId = vbrId;
        return this;
    }
    public String getVbrId() {
        return this.vbrId;
    }

}
