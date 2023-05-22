// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorAclAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIPv6TranslatorAclAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorAclAttributeResponseBody self = new ModifyIPv6TranslatorAclAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIPv6TranslatorAclAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
