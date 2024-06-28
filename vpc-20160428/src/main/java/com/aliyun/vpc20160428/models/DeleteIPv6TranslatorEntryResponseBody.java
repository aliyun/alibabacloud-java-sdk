// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIPv6TranslatorEntryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8B2F5262-6B57-43F2-xxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIPv6TranslatorEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIPv6TranslatorEntryResponseBody self = new DeleteIPv6TranslatorEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIPv6TranslatorEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
