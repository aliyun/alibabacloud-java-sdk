// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetCrossdomainContentResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-****-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetCrossdomainContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCrossdomainContentResponseBody self = new SetCrossdomainContentResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCrossdomainContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
