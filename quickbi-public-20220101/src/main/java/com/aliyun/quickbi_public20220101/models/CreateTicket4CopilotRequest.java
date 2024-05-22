// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateTicket4CopilotRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("AccountType")
    public Integer accountType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CopilotId")
    public String copilotId;

    @NameInMap("ExpireTime")
    public Integer expireTime;

    @NameInMap("TicketNum")
    public Integer ticketNum;

    @NameInMap("UserId")
    public String userId;

    public static CreateTicket4CopilotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTicket4CopilotRequest self = new CreateTicket4CopilotRequest();
        return TeaModel.build(map, self);
    }

    public CreateTicket4CopilotRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateTicket4CopilotRequest setAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }
    public Integer getAccountType() {
        return this.accountType;
    }

    public CreateTicket4CopilotRequest setCopilotId(String copilotId) {
        this.copilotId = copilotId;
        return this;
    }
    public String getCopilotId() {
        return this.copilotId;
    }

    public CreateTicket4CopilotRequest setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Integer getExpireTime() {
        return this.expireTime;
    }

    public CreateTicket4CopilotRequest setTicketNum(Integer ticketNum) {
        this.ticketNum = ticketNum;
        return this;
    }
    public Integer getTicketNum() {
        return this.ticketNum;
    }

    public CreateTicket4CopilotRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
