// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DisableVpcClassicLinkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DisableVpcClassicLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableVpcClassicLinkResponse self = new DisableVpcClassicLinkResponse();
        return TeaModel.build(map, self);
    }

    public DisableVpcClassicLinkResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
