// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class CreateTicketRequest extends TeaModel {
    /**
     * <ul>
     * <li><p>The expiration time (in seconds) of the access token, which specifies how long the user can access page operations. Default value: 86400 (one day). Valid values: 0 to 86400 (one day).</p>
     * </li>
     * <li><p>The actual access token expiration time is the minimum value of accessTokenExpirationTime and expirationTime.</p>
     * </li>
     * <li><p>If you call this operation by using Security Token Service (STS), the actual access token expiration time is the minimum value of accessTokenExpirationTime, expirationTime, and the STS token expiration time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("accessTokenExpirationTime")
    public Long accessTokenExpirationTime;

    /**
     * <ul>
     * <li>The expiration time (in seconds) of the embedded page URL. Default value: 86400 (one day). Valid values: 0 to 2592000 (30 days).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("expirationTime")
    public Long expirationTime;

    public static CreateTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketRequest self = new CreateTicketRequest();
        return TeaModel.build(map, self);
    }

    public CreateTicketRequest setAccessTokenExpirationTime(Long accessTokenExpirationTime) {
        this.accessTokenExpirationTime = accessTokenExpirationTime;
        return this;
    }
    public Long getAccessTokenExpirationTime() {
        return this.accessTokenExpirationTime;
    }

    public CreateTicketRequest setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    public Long getExpirationTime() {
        return this.expirationTime;
    }

}
