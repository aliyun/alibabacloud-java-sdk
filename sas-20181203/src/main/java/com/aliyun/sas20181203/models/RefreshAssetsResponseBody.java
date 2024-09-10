// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshAssetsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>340D7FC4-D575-1661-8ACD-CFA7BE57B795</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshAssetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshAssetsResponseBody self = new RefreshAssetsResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshAssetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
