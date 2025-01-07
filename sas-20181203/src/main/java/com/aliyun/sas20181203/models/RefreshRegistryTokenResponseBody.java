// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshRegistryTokenResponseBody extends TeaModel {
    /**
     * <p>The returned token.</p>
     * 
     * <strong>example:</strong>
     * <p>77ba3bf5-af95-4b77-aa94-***********</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7BC55C8F-226E-5AF5-9A2C-2EC43864****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshRegistryTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshRegistryTokenResponseBody self = new RefreshRegistryTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshRegistryTokenResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RefreshRegistryTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
