// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class CloseTicketRequest extends TeaModel {
    /**
     * <p>Work Order Number</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>G2BKRWG</p>
     */
    @NameInMap("TicketId")
    public String ticketId;

    /**
     * <p>The UID of the Alibaba Cloud account. You can view your UID in the profile picture in the upper-right corner of the DMS console.</p>
     * 
     * <strong>example:</strong>
     * <p>1139477549527134</p>
     */
    @NameInMap("Uid")
    public String uid;

    public static CloseTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseTicketRequest self = new CloseTicketRequest();
        return TeaModel.build(map, self);
    }

    public CloseTicketRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

    public CloseTicketRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
