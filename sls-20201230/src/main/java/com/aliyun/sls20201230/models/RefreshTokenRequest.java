// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class RefreshTokenRequest extends TeaModel {
    /**
     * <ul>
     * <li>The validity period of the access token. Unit: seconds. Default value: 86400, which specifies one day. Valid values: 0 to 86400.</li>
     * <li>The validity period of the access token is the smaller value between accessTokenExpirationTime and expirationTime.</li>
     * <li>If you use a Security Token Service (STS) token to call this operation, the validity period of the access token is the smallest value among accessTokenExpirationTime, expirationTime, and the validity period of the STS token.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("accessTokenExpirationTime")
    public Long accessTokenExpirationTime;

    /**
     * <p>The ticket that is used for logon-free access.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJ***************.eyJ******************.KUT****************</p>
     */
    @NameInMap("ticket")
    public String ticket;

    public static RefreshTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshTokenRequest self = new RefreshTokenRequest();
        return TeaModel.build(map, self);
    }

    public RefreshTokenRequest setAccessTokenExpirationTime(Long accessTokenExpirationTime) {
        this.accessTokenExpirationTime = accessTokenExpirationTime;
        return this;
    }
    public Long getAccessTokenExpirationTime() {
        return this.accessTokenExpirationTime;
    }

    public RefreshTokenRequest setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

}
