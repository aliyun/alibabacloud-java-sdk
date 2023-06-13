// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class LoginInstanceResponseBody extends TeaModel {
    /**
     * <p>The URL that you use to log on to the server.</p>
     */
    @NameInMap("RedirectUrl")
    public String redirectUrl;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static LoginInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LoginInstanceResponseBody self = new LoginInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public LoginInstanceResponseBody setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public LoginInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
