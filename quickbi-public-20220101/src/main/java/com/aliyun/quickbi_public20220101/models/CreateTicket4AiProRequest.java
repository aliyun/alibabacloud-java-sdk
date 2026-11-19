// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateTicket4AiProRequest extends TeaModel {
    /**
     * <p>The account of the access user to bind. Use this parameter together with AccountType when QuickBIUserId is not specified.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The account type of the user. Valid values:</p>
     * <ul>
     * <li>1: Alibaba Cloud account.</li>
     * <li>3: Quick BI custom account.</li>
     * <li>4: DingTalk.</li>
     * <li>5: RAM user.</li>
     * <li>9: WeCom.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AccountType")
    public Integer accountType;

    /**
     * <p>The ID of the AIPro embedding configuration. The configuration must exist, belong to the current organization, and have a status of 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AiProId")
    public String aiProId;

    /**
     * <p>The custom pass-through parameter. If specified, it must be a valid JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("CustomParam")
    public String customParam;

    /**
     * <p>The validity period of the ticket, in minutes. Default value: 240. The value must be greater than 0.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
     * <p>The QuickBI user ID of the access user to bind. Specify either this parameter or the combination of AccountName and AccountType.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("QuickBIUserId")
    public String quickBIUserId;

    /**
     * <p>The custom system identifier. The length must be less than 150 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SystemUid")
    public String systemUid;

    /**
     * <p>The number of times the ticket can be used. Default value: 1. Valid values: 1 to 99999.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TicketNum")
    public Integer ticketNum;

    public static CreateTicket4AiProRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTicket4AiProRequest self = new CreateTicket4AiProRequest();
        return TeaModel.build(map, self);
    }

    public CreateTicket4AiProRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateTicket4AiProRequest setAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }
    public Integer getAccountType() {
        return this.accountType;
    }

    public CreateTicket4AiProRequest setAiProId(String aiProId) {
        this.aiProId = aiProId;
        return this;
    }
    public String getAiProId() {
        return this.aiProId;
    }

    public CreateTicket4AiProRequest setCustomParam(String customParam) {
        this.customParam = customParam;
        return this;
    }
    public String getCustomParam() {
        return this.customParam;
    }

    public CreateTicket4AiProRequest setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Integer getExpireTime() {
        return this.expireTime;
    }

    public CreateTicket4AiProRequest setQuickBIUserId(String quickBIUserId) {
        this.quickBIUserId = quickBIUserId;
        return this;
    }
    public String getQuickBIUserId() {
        return this.quickBIUserId;
    }

    public CreateTicket4AiProRequest setSystemUid(String systemUid) {
        this.systemUid = systemUid;
        return this;
    }
    public String getSystemUid() {
        return this.systemUid;
    }

    public CreateTicket4AiProRequest setTicketNum(Integer ticketNum) {
        this.ticketNum = ticketNum;
        return this;
    }
    public Integer getTicketNum() {
        return this.ticketNum;
    }

}
