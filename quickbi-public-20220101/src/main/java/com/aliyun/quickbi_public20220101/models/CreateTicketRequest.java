// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateTicketRequest extends TeaModel {
    /**
     * <p>The account name of the user.</p>
     * <ul>
     * <li>If the user is an Alibaba Cloud account <strong>wangwu</strong>, the format is <strong>[primary account]</strong>, for example, <strong>wangwu</strong>.</li>
     * <li>If the user is a Resource Access Management (RAM) users account <strong>zhangsan</strong>@aliyun.cn**, the format is <strong>[primary account:RAM user]</strong>, for example, <strong>wangwu:zhangsan</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>Specify either UserId or AccountName. If neither is specified, the report owner is attached by default, and the report is accessed under that user\&quot;s identity. To configure row-level permissions for data, see <a href="https://help.aliyun.com/document_detail/322783.html">Row-level permissions</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AccountName")
    @Deprecated
    public String accountName;

    /**
     * <p>The account type of the user. Valid values:</p>
     * <ul>
     * <li>1: Alibaba Cloud account</li>
     * <li>3: Quick BI custom account</li>
     * <li>4: DingTalk</li>
     * <li>5: RAM user</li>
     * <li>9: WeCom</li>
     * <li>10: Lark<blockquote>
     * <p>If AccountName is specified, AccountType must also be specified.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AccountType")
    @Deprecated
    public Integer accountType;

    /**
     * <p>The component ID. This is the ID of a specific component in the dashboard. Other report types are not supported.
     * To obtain the component ID, see <a href="https://next.api.aliyun.com/api/quickbi-public/2022-01-01/QueryWorksBloodRelationship?spm=a2c4g.11186623.0.0.15615d7aWVvWAl&params=%7B%7D&lang=JAVA&tab=DOC&sdkStyle=old">QueryWorksBloodRelationship</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0fc6a275c7f64f17b1****a306ce0f31</p>
     */
    @NameInMap("CmptId")
    public String cmptId;

    /**
     * <p>The expiration time.</p>
     * <ul>
     * <li>Unit: minutes.</li>
     * <li>Default value: 240.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
     * <p>The global parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;paramKey&quot;:&quot;price&quot;,&quot;joinType&quot;:&quot;and&quot;,&quot;conditionList&quot;:[{&quot;operate&quot;:&quot;&gt;&quot;,&quot;value&quot;:&quot;0&quot;}]}]</p>
     */
    @NameInMap("GlobalParam")
    public String globalParam;

    /**
     * <p>The number of times the ticket can be used. Each time the ticket is used for access, the count decreases by 1.</p>
     * <ul>
     * <li>Default value: 1.</li>
     * <li>Recommended value: 1.</li>
     * <li>Maximum value: 99999.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TicketNum")
    public Integer ticketNum;

    /**
     * <p>The Quick BI user ID, not your Alibaba Cloud account ID.
     * You can call the <a href="https://next.api.aliyun.com/api/quickbi-public/2022-01-01/QueryUserInfoByAccount?spm=a2c4g.11186623.0.0.15615d7aWVvWAl&params=%7B%7D&tab=DOC&sdkStyle=old">QueryUserInfoByAccount</a> operation to obtain the user ID. Example: fe67f61a35a94b7da1a34ba174a7****.</p>
     * <blockquote>
     * <p>Specify either UserId or AccountName. If neither is specified, the report owner is used by default, and the report is accessed under that user\&quot;s identity. To configure row-level permissions for data, see <a href="https://help.aliyun.com/document_detail/322783.html">Row-level permissions</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>46e537466****92704c8</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The watermark parameter for the report.</p>
     * <ul>
     * <li>The value cannot exceed 50 characters.</li>
     * <li>Watermark parameters are not supported when the report type is data screen.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ticket embed</p>
     */
    @NameInMap("WatermarkParam")
    public String watermarkParam;

    /**
     * <p>The ID of the report for which embedding is enabled. Dashboards, workbooks, data screens, ad hoc queries, ad hoc analyses, and data entry forms are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a206f5f3-****-e9b17c835b03</p>
     */
    @NameInMap("WorksId")
    public String worksId;

    public static CreateTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketRequest self = new CreateTicketRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public CreateTicketRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    @Deprecated
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
