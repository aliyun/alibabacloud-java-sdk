// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIPv6TranslatorResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIPv6TranslatorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIPv6TranslatorResponseBody self = new DeleteIPv6TranslatorResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIPv6TranslatorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
