// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateTicket4CopilotRequest extends TeaModel {
    /**
     * <p>The name of the user account.</p>
     * <blockquote>
     * <p>Notice: Note: Specify either UserId or AccountName. If you leave both parameters empty, the ticket is bound to the API caller by default. Access is then granted based on the caller\&quot;s identity.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>测试用户</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The type of the user account:</p>
     * <ul>
     * <li><p>1: Alibaba Cloud account</p>
     * </li>
     * <li><p>3: Quick BI user</p>
     * </li>
     * <li><p>4: DingTalk</p>
     * </li>
     * <li><p>5: RAM user</p>
     * </li>
     * <li><p>6: Third-party account (an account integrated using protocols such as SAML or OAuth)</p>
     * </li>
     * <li><p>9: WeCom</p>
     * </li>
     * <li><p>10: Lark</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>Note: This parameter is required if you specify AccountName.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AccountType")
    public Integer accountType;

    /**
     * <p>The ID of the embedded Copilot module.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccd3428c-dd23-460c-a608-26bae29dffee</p>
     */
    @NameInMap("CopilotId")
    public String copilotId;

    /**
     * <p>The expiration time of the ticket.</p>
     * <ul>
     * <li><p>Unit: minutes. The maximum validity period is 240 minutes (4 hours).</p>
     * </li>
     * <li><p>Default: 240 minutes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
     * <p>The number of times the ticket can be used. The value can range from 1 to 99,999.</p>
     * <ul>
     * <li><p>Default: 1.</p>
     * </li>
     * <li><p>Recommended: 1.</p>
     * </li>
     * <li><p>Maximum: 99,999.</p>
     * </li>
     * </ul>
     * <p>Each access decrements the ticket\&quot;s usage count by one.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TicketNum")
    public Integer ticketNum;

    /**
     * <p>The ID of the Quick BI user. This is not your Alibaba Cloud account ID. Call the QueryUserInfoByAccount operation to obtain the user ID. Example: <code>fe67f61a35a94b7da1a34ba174a7****</code>.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>Note: Specify either UserId or AccountName. If you leave both parameters empty, the ticket is bound to the API caller by default. Access is then granted based on the caller\&quot;s identity.</p>
     * 
     * <strong>example:</strong>
     * <p>9c-asdawf-casxcasd-asdasd</p>
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
