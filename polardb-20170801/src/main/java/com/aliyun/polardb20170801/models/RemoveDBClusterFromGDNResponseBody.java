// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RemoveDBClusterFromGDNResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>67F2E75F-AE67-4FB2-821F-A81237EACD15</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveDBClusterFromGDNResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveDBClusterFromGDNResponseBody self = new RemoveDBClusterFromGDNResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveDBClusterFromGDNResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
