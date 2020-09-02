// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoRenewalAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyInstanceAutoRenewalAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoRenewalAttributeResponse self = new ModifyInstanceAutoRenewalAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoRenewalAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
