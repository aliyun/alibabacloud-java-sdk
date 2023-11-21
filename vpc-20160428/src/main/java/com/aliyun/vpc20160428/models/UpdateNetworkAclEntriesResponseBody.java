// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateNetworkAclEntriesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateNetworkAclEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkAclEntriesResponseBody self = new UpdateNetworkAclEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkAclEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
