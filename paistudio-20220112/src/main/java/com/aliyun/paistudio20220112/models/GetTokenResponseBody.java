// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetTokenResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F2D0392B-D749-5C48-A98A-3FAE5C9444A6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The job sharing token. You can use this token as the Token parameter of the GetJob API to view information about the shared job.</p>
     * 
     * <strong>example:</strong>
     * <p>ql4OU830nJaF17LP6KTry4a9DvnjIXHP</p>
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
