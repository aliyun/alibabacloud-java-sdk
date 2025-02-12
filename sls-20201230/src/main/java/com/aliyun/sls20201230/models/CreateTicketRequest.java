// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateTicketRequest extends TeaModel {
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
     * <ul>
     * <li>You must use the Simple Log Service endpoint for the China (Shanghai) or Singapore region to call the CreateTicket operation. After you obtain the ticket, you can use the ticket regardless of the region.</li>
     * <li>The validity period for the URL of the console page that you want to embed. Unit: seconds. Default value: 86400, which specifies one day. Valid values: 0 to 2592000. The value 2592000 specifies 30 days.</li>
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
