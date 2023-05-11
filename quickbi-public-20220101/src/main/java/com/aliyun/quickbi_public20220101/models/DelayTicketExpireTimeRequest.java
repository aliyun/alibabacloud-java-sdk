// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DelayTicketExpireTimeRequest extends TeaModel {
    /**
     * <p>The time to postpone.</p>
     * <br>
     * <p>*   Unit: minutes. Valid values: 0 to 240. Unit: minutes. Valid values: 4 hours.</p>
     * <p>*   Expired bills cannot be extended.</p>
     */
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
     * <p>The value of the third-party embedded ticket, that is, the accessTicket value in the URL.</p>
     */
    @NameInMap("Ticket")
    public String ticket;

    public static DelayTicketExpireTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        DelayTicketExpireTimeRequest self = new DelayTicketExpireTimeRequest();
        return TeaModel.build(map, self);
    }

    public DelayTicketExpireTimeRequest setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Integer getExpireTime() {
        return this.expireTime;
    }

    public DelayTicketExpireTimeRequest setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

}
