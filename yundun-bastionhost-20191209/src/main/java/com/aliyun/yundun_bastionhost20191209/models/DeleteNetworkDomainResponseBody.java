// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteNetworkDomainResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>66B9D942-E3C8-5068-A479-5A7B7BF3DE35</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNetworkDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkDomainResponseBody self = new DeleteNetworkDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
