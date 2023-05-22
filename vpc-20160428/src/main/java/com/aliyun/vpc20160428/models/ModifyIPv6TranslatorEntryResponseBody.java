// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorEntryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIPv6TranslatorEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorEntryResponseBody self = new ModifyIPv6TranslatorEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIPv6TranslatorEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
