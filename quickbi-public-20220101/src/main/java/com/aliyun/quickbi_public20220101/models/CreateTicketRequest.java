// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateTicketRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("AccountType")
    public Integer accountType;

    @NameInMap("CmptId")
    public String cmptId;

    @NameInMap("ExpireTime")
    public Integer expireTime;

    @NameInMap("GlobalParam")
    public String globalParam;

    @NameInMap("TicketNum")
    public Integer ticketNum;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("WatermarkParam")
    public String watermarkParam;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorksId")
    public String worksId;

    public static CreateTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketRequest self = new CreateTicketRequest();
        return TeaModel.build(map, self);
    }

    public CreateTicketRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateTicketRequest setAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }
    public Integer getAccountType() {
        return this.accountType;
    }

    public CreateTicketRequest setCmptId(String cmptId) {
        this.cmptId = cmptId;
        return this;
    }
    public String getCmptId() {
        return this.cmptId;
    }

    public CreateTicketRequest setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Integer getExpireTime() {
        return this.expireTime;
    }

    public CreateTicketRequest setGlobalParam(String globalParam) {
        this.globalParam = globalParam;
        return this;
    }
    public String getGlobalParam() {
        return this.globalParam;
    }

    public CreateTicketRequest setTicketNum(Integer ticketNum) {
        this.ticketNum = ticketNum;
        return this;
    }
    public Integer getTicketNum() {
        return this.ticketNum;
    }

    public CreateTicketRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateTicketRequest setWatermarkParam(String watermarkParam) {
        this.watermarkParam = watermarkParam;
        return this;
    }
    public String getWatermarkParam() {
        return this.watermarkParam;
    }

    public CreateTicketRequest setWorksId(String worksId) {
        this.worksId = worksId;
        return this;
    }
    public String getWorksId() {
        return this.worksId;
    }

}
