// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.partnerintl20181227.models;

import com.aliyun.tea.*;

public class DescribeProductRequest extends TeaModel {
    @NameInMap("CallerBid")
    public String callerBid;

    @NameInMap("CallerParentId")
    public Long callerParentId;

    @NameInMap("CallerType")
    public String callerType;

    @NameInMap("CallerUid")
    public Long callerUid;

    @NameInMap("ClientIp")
    public String clientIp;

    @NameInMap("Code")
    public String code;

    @NameInMap("EagleEyeRpcId")
    public String eagleEyeRpcId;

    @NameInMap("EagleEyeTraceId")
    public String eagleEyeTraceId;

    @NameInMap("EagleEyeUserData")
    public String eagleEyeUserData;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("QueryDraft")
    public Boolean queryDraft;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("StsTokenCallerBid")
    public Long stsTokenCallerBid;

    @NameInMap("StsTokenCallerUid")
    public Long stsTokenCallerUid;

    @NameInMap("StsTokenPrincipalId")
    public String stsTokenPrincipalId;

    @NameInMap("StsTokenRoleId")
    public Long stsTokenRoleId;

    @NameInMap("StsTokenUserId")
    public Long stsTokenUserId;

    @NameInMap("UserId")
    public Long userId;

    public static DescribeProductRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductRequest self = new DescribeProductRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProductRequest setCallerBid(String callerBid) {
        this.callerBid = callerBid;
        return this;
    }
    public String getCallerBid() {
        return this.callerBid;
    }

    public DescribeProductRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public DescribeProductRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public DescribeProductRequest setCallerUid(Long callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public Long getCallerUid() {
        return this.callerUid;
    }

    public DescribeProductRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public DescribeProductRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeProductRequest setEagleEyeRpcId(String eagleEyeRpcId) {
        this.eagleEyeRpcId = eagleEyeRpcId;
        return this;
    }
    public String getEagleEyeRpcId() {
        return this.eagleEyeRpcId;
    }

    public DescribeProductRequest setEagleEyeTraceId(String eagleEyeTraceId) {
        this.eagleEyeTraceId = eagleEyeTraceId;
        return this;
    }
    public String getEagleEyeTraceId() {
        return this.eagleEyeTraceId;
    }

    public DescribeProductRequest setEagleEyeUserData(String eagleEyeUserData) {
        this.eagleEyeUserData = eagleEyeUserData;
        return this;
    }
    public String getEagleEyeUserData() {
        return this.eagleEyeUserData;
    }

    public DescribeProductRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeProductRequest setQueryDraft(Boolean queryDraft) {
        this.queryDraft = queryDraft;
        return this;
    }
    public Boolean getQueryDraft() {
        return this.queryDraft;
    }

    public DescribeProductRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProductRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeProductRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeProductRequest setStsTokenCallerBid(Long stsTokenCallerBid) {
        this.stsTokenCallerBid = stsTokenCallerBid;
        return this;
    }
    public Long getStsTokenCallerBid() {
        return this.stsTokenCallerBid;
    }

    public DescribeProductRequest setStsTokenCallerUid(Long stsTokenCallerUid) {
        this.stsTokenCallerUid = stsTokenCallerUid;
        return this;
    }
    public Long getStsTokenCallerUid() {
        return this.stsTokenCallerUid;
    }

    public DescribeProductRequest setStsTokenPrincipalId(String stsTokenPrincipalId) {
        this.stsTokenPrincipalId = stsTokenPrincipalId;
        return this;
    }
    public String getStsTokenPrincipalId() {
        return this.stsTokenPrincipalId;
    }

    public DescribeProductRequest setStsTokenRoleId(Long stsTokenRoleId) {
        this.stsTokenRoleId = stsTokenRoleId;
        return this;
    }
    public Long getStsTokenRoleId() {
        return this.stsTokenRoleId;
    }

    public DescribeProductRequest setStsTokenUserId(Long stsTokenUserId) {
        this.stsTokenUserId = stsTokenUserId;
        return this;
    }
    public Long getStsTokenUserId() {
        return this.stsTokenUserId;
    }

    public DescribeProductRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
