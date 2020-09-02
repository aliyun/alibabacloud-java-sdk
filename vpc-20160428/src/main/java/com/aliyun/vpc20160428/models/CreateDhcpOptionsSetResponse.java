// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateDhcpOptionsSetResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DhcpOptionsSetId")
    @Validation(required = true)
    public String dhcpOptionsSetId;

    public static CreateDhcpOptionsSetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDhcpOptionsSetResponse self = new CreateDhcpOptionsSetResponse();
        return TeaModel.build(map, self);
    }

    public CreateDhcpOptionsSetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDhcpOptionsSetResponse setDhcpOptionsSetId(String dhcpOptionsSetId) {
        this.dhcpOptionsSetId = dhcpOptionsSetId;
        return this;
    }
    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

}
