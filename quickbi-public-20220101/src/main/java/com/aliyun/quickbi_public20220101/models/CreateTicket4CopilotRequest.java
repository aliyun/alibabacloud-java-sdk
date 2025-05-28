// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateTicket4CopilotRequest extends TeaModel {
    /**
     * <p>User\&quot;s account name.
     * <notice>Note: Only one of userId and accountName needs to be filled in. If neither is provided, it will default to the report owner, and the report will be accessed with that user\&quot;s identity.</notice></p>
     * 
     * <strong>example:</strong>
     * <p>Test user</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>User\&quot;s account type:</p>
     * <ul>
     * <li><p>1: Alibaba Cloud Primary Account</p>
     * </li>
     * <li><p>3: QuickBI Self-built Account</p>
     * </li>
     * <li><p>4: DingTalk</p>
     * </li>
     * <li><p>5: Alibaba Cloud RAM Account</p>
     * </li>
     * <li><p>6: Third-party Account (SAML, OAuth, etc.)</p>
     * </li>
     * <li><p>9: WeCom</p>
     * </li>
     * <li><p>10: Feishu</p>
     * </li>
     * </ul>
     * <p><notice>Note: If accountName is not empty, then accountType must also be provided.</notice></p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AccountType")
    public Integer accountType;

    /**
     * <p>ID of the Smart Q module to be embedded.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccd3*********ae29dffee</p>
     */
    @NameInMap("CopilotId")
    public String copilotId;

    /**
     * <p>Expiration time.</p>
     * <ul>
     * <li><p>Unit: minutes, maximum 240 (4 hours).</p>
     * </li>
     * <li><p>Default: 240.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
     * <p>Range of ticket quantity:</p>
     * <ul>
     * <li><p>Default value is 1.</p>
     * </li>
     * <li><p>Recommended value is 1.</p>
     * </li>
     * <li><p>Maximum value is 99999.</p>
     * </li>
     * </ul>
     * <p>Each time a ticket is used, the ticket count decreases by 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TicketNum")
    public Integer ticketNum;

    /**
     * <p>Quick BI\&quot;s UserId.</p>
     * <ul>
     * <li>You can obtain this by calling [3.1.7 Get User Details Based on Third-Party Account] or other relevant APIs.</li>
     * </ul>
     * <p><notice>Note: Only one of userId and accountName needs to be filled in. If neither is provided, it will default to the report owner, and the report will be accessed with that user\&quot;s identity.</notice></p>
     * 
     * <strong>example:</strong>
     * <p>9c-asd*****asd-asdasd</p>
     */
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
