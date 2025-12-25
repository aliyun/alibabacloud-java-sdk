// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class GetTicketRequest extends TeaModel {
    /**
     * <p>Work Order Number</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>001571BTXC</p>
     */
    @NameInMap("TicketId")
    public String ticketId;

    /**
     * <p>UID</p>
     * 
     * <strong>example:</strong>
     * <p>1604499804113750</p>
     */
    @NameInMap("Uid")
    public String uid;

    public static GetTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTicketRequest self = new GetTicketRequest();
        return TeaModel.build(map, self);
    }

    public GetTicketRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

    public GetTicketRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
