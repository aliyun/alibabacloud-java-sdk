// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyIPv6TranslatorEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorEntryResponse self = new ModifyIPv6TranslatorEntryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIPv6TranslatorEntryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
