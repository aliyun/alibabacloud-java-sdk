// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetShareLinkTokenResponseBody extends TeaModel {
    /**
     * <p>The validity period of the token. Unit: seconds. For example, a value of 7200 indicates two hours.</p>
     */
    @NameInMap("expires_in")
    public Long expiresIn;

    /**
     * <p>The JSON Web Token (JWT).</p>
     */
    @NameInMap("share_token")
    public String shareToken;

    public static GetShareLinkTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetShareLinkTokenResponseBody self = new GetShareLinkTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetShareLinkTokenResponseBody setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
    public Long getExpiresIn() {
        return this.expiresIn;
    }

    public GetShareLinkTokenResponseBody setShareToken(String shareToken) {
        this.shareToken = shareToken;
        return this;
    }
    public String getShareToken() {
        return this.shareToken;
    }

}
