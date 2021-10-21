// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryIntentionDetailResponseBody extends TeaModel {
    @NameInMap("Status")
    public Integer status;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("UpdateTime")
    public Long updateTime;

    @NameInMap("RelationBizId")
    public String relationBizId;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("PartnerMobile")
    public String partnerMobile;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("RegisterNumber")
    public String registerNumber;

    @NameInMap("Classification")
    public String classification;

    @NameInMap("UserName")
    public String userName;

    public static QueryIntentionDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIntentionDetailResponseBody self = new QueryIntentionDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIntentionDetailResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryIntentionDetailResponseBody setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public QueryIntentionDetailResponseBody setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public QueryIntentionDetailResponseBody setRelationBizId(String relationBizId) {
        this.relationBizId = relationBizId;
        return this;
    }
    public String getRelationBizId() {
        return this.relationBizId;
    }

    public QueryIntentionDetailResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public QueryIntentionDetailResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryIntentionDetailResponseBody setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryIntentionDetailResponseBody setPartnerMobile(String partnerMobile) {
        this.partnerMobile = partnerMobile;
        return this;
    }
    public String getPartnerMobile() {
        return this.partnerMobile;
    }

    public QueryIntentionDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIntentionDetailResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public QueryIntentionDetailResponseBody setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryIntentionDetailResponseBody setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
        return this;
    }
    public String getRegisterNumber() {
        return this.registerNumber;
    }

    public QueryIntentionDetailResponseBody setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public QueryIntentionDetailResponseBody setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
