// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyIPv6TranslatorAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorAttributeResponse self = new ModifyIPv6TranslatorAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIPv6TranslatorAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
