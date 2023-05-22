// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIPv6TranslatorAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorAttributeResponseBody self = new ModifyIPv6TranslatorAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIPv6TranslatorAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
