// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIPv6TranslatorAclListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIPv6TranslatorAclListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIPv6TranslatorAclListResponseBody self = new DeleteIPv6TranslatorAclListResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIPv6TranslatorAclListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
