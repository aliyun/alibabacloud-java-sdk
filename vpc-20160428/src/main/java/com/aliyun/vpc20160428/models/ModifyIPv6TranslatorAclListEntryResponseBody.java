// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorAclListEntryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIPv6TranslatorAclListEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorAclListEntryResponseBody self = new ModifyIPv6TranslatorAclListEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIPv6TranslatorAclListEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
