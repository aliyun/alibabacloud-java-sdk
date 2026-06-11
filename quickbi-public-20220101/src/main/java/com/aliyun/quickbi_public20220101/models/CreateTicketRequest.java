// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateTicketRequest extends TeaModel {
    /**
     * <p>The user\&quot;s account name.</p>
     * <ul>
     * <li><p>If the user is an Alibaba Cloud primary account <strong>wangwu</strong>, the format is <strong>[Primary Account]</strong>, for example, <strong>wangwu</strong>.</p>
     * </li>
     * <li><p>If the user is a RAM account <strong>zhangsan</strong>@aliyun.cn\<em>\</em>, the format is <strong>[Primary Account: Sub-Account]</strong>, for example, <strong>wangwu:zhangsan</strong>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Only one of UserId and AccountName needs to be filled in. If neither is filled in, it will default to binding the report\&quot;s Owner, and the report will be accessed with that user\&quot;s identity. If you need to configure row-level permissions, please refer to <a href="https://help.aliyun.com/document_detail/322783.html">Row-Level Permissions</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AccountName")
    @Deprecated
    public String accountName;

    /**
     * <p>The type of the user\&quot;s account.</p>
     * <ul>
     * <li><p>1: Alibaba Cloud account</p>
     * </li>
     * <li><p>3: Quick BI self-built account</p>
     * </li>
     * <li><p>4: DingTalk</p>
     * </li>
     * <li><p>5: RAM sub-account</p>
     * </li>
     * <li><p>9: WeCom</p>
     * </li>
     * <li><p>10: Feishu</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If AccountName is not empty, then AccountType must also not be empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AccountType")
    @Deprecated
    public Integer accountType;

    /**
     * <p>Component ID. This is the ID of a component within the above-mentioned dashboard; other types of works do not support this.
     * Refer to <a href="https://next.api.aliyun.com/api/quickbi-public/2022-01-01/QueryWorksBloodRelationship?spm=a2c4g.11186623.0.0.15615d7aWVvWAl%5C&params=%7B%7D%5C&lang=JAVA%5C&tab=DOC%5C&sdkStyle=old">QueryWorksBloodRelationship</a> for the API to get the component ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0fc6a275c7f64f17b1****a306ce0f31</p>
     */
    @NameInMap("CmptId")
    public String cmptId;

    /**
     * <p>Expiration time</p>
     * <ul>
     * <li><p>Unit: minutes</p>
     * </li>
     * <li><p>Default: 240</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
     * <p>Global parameters for the report filter conditions.</p>
     * <ul>
     * <li>A string in JsonArray format.</li>
     * </ul>
     * <blockquote>
     * <p>If you need to use global parameter capabilities, please contact the <a href="https://h5-alimebot.dingtalk.com/intl/index.htm?spm=a2c4g.11186623.0.0.3da14f6chrDv9e%5C&sourceType=ding_talk%5C&from=DEFFB9G5KBByQkwq23wneFIOmaJ">Quick BI Operations Manager</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;paramKey&quot;:&quot;price&quot;,&quot;joinType&quot;:&quot;and&quot;,&quot;conditionList&quot;:[{&quot;operate&quot;:&quot;&gt;&quot;,&quot;value&quot;:&quot;0&quot;}]}]</p>
     */
    @NameInMap("GlobalParam")
    public String globalParam;

    /**
     * <p>The number of tickets. Each time a ticket is used, the number of tickets decreases by 1.</p>
     * <ul>
     * <li><p>Default value: 1</p>
     * </li>
     * <li><p>Recommended value: 1</p>
     * </li>
     * <li><p>Maximum value: 99999</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TicketNum")
    public Integer ticketNum;

    /**
     * <p>Quick BI\&quot;s UserId, which is not your Alibaba Cloud account ID.
     * You can call the <a href="https://next.api.aliyun.com/api/quickbi-public/2022-01-01/QueryUserInfoByAccount?spm=a2c4g.11186623.0.0.15615d7aWVvWAl%5C&params=%7B%7D%5C&tab=DOC%5C&sdkStyle=old">QueryUserInfoByAccount</a> interface to obtain the UserId. An example of a UserId is fe67f61a35a94b7da1a34ba174a7\<em>\</em>\<em>\</em>.</p>
     * <blockquote>
     * <p>Only one of UserId and AccountName needs to be filled in. If neither is filled in, it will default to binding the report\&quot;s Owner, and the report will be accessed with that user\&quot;s identity. If you need to configure row-level permissions, please refer to <a href="https://help.aliyun.com/document_detail/322783.html">Row-Level Permissions</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>46e537466****92704c8</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>Watermark parameters for the report.</p>
     * <ul>
     * <li><p>Must not exceed 50 characters.</p>
     * </li>
     * <li><p>When the report type is a large screen, watermark parameter passing is not supported.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ticket embed</p>
     */
    @NameInMap("WatermarkParam")
    public String watermarkParam;

    /**
     * <p>The ID of the report to be embedded. Currently supports dashboards, spreadsheets, data screens, self-service data retrieval, ad-hoc analysis, and data entry.</p>
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
