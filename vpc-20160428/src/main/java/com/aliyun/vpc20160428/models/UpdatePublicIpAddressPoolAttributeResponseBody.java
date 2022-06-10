// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdatePublicIpAddressPoolAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePublicIpAddressPoolAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublicIpAddressPoolAttributeResponseBody self = new UpdatePublicIpAddressPoolAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePublicIpAddressPoolAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
