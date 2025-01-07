// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UnBindHybridProxyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>3956048F-9D73-5EDB-834B-4827BB483977</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnBindHybridProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnBindHybridProxyResponseBody self = new UnBindHybridProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public UnBindHybridProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
