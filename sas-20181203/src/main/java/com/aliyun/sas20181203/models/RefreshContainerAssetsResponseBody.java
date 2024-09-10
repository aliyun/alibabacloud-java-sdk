// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshContainerAssetsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>2090F329-3658-49AF-820B-C4157FC31BCB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshContainerAssetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshContainerAssetsResponseBody self = new RefreshContainerAssetsResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshContainerAssetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
