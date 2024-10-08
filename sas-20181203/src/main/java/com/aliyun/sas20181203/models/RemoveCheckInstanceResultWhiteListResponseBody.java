// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RemoveCheckInstanceResultWhiteListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>F156EA41-8EEF-54B2-908B-EAE071XXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveCheckInstanceResultWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveCheckInstanceResultWhiteListResponseBody self = new RemoveCheckInstanceResultWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveCheckInstanceResultWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
