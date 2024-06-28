// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVirtualBorderRouterResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the VBR.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-bp1jcg5cmxjbl9xgc****</p>
     */
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
