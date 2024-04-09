// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class RefreshTokenRequest extends TeaModel {
    @NameInMap("accessTokenExpirationTime")
    public Long accessTokenExpirationTime;

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
