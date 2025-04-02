// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetTokenResponseBody extends TeaModel {
    /**
     * <p>The request ID, which is used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-xxxxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The token of the shared job, which can be used as the value of the Token parameter in the GetJob API operation to view information about the shared job.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9*****</p>
     */
    @NameInMap("Token")
    public String token;

    public static GetTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTokenResponseBody self = new GetTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
