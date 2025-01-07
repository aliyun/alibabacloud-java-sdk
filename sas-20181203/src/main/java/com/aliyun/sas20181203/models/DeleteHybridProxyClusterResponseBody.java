// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHybridProxyClusterResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>414EC213-AD2D-56C3-B140-108773B24405</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteHybridProxyClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHybridProxyClusterResponseBody self = new DeleteHybridProxyClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHybridProxyClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
