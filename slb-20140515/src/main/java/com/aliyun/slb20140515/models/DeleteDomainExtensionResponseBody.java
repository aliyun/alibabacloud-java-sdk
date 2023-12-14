// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteDomainExtensionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDomainExtensionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainExtensionResponseBody self = new DeleteDomainExtensionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDomainExtensionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
