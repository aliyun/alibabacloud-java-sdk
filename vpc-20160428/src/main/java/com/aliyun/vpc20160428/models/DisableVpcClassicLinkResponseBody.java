// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DisableVpcClassicLinkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableVpcClassicLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableVpcClassicLinkResponseBody self = new DisableVpcClassicLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableVpcClassicLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
