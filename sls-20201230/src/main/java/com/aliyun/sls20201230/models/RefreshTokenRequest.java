// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class RefreshTokenRequest extends TeaModel {
    /**
     * <ul>
     * <li><p>The expiration time of the access token in seconds. This specifies the period during which the token is valid for accessing page API operations. The default value is 86400 seconds (one day). The value must be an integer from 0 to 86400.</p>
     * </li>
     * <li><p>The actual expiration time of the access token is the minimum value of accessTokenExpirationTime and expirationTime.</p>
     * </li>
     * <li><p>If you call this operation using Security Token Service (STS), the actual expiration time of the access token is the minimum value of accessTokenExpirationTime, expirationTime, and the STS token expiration time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("accessTokenExpirationTime")
    public Long accessTokenExpirationTime;

    /**
     * <p>The logon-free ticket.</p>
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
