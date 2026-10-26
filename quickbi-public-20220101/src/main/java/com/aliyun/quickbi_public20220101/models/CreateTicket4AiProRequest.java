// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateTicket4AiProRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AccountType")
    public Integer accountType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AiProId")
    public String aiProId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("CustomParam")
    public String customParam;

    /**
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("QuickBIUserId")
    public String quickBIUserId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SystemUid")
    public String systemUid;

    /**
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
