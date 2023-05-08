// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ConfirmConfigurationOrderRequest extends TeaModel {
    /**
     * <p>aliyunKp</p>
     */
    @NameInMap("AliyunKp")
    public String aliyunKp;

    /**
     * <p>aliyunKpLong</p>
     */
    @NameInMap("AliyunKpLong")
    public Long aliyunKpLong;

    /**
     * <p>bid</p>
     */
    @NameInMap("Bid")
    public String bid;

    /**
     * <p>callerParentId</p>
     */
    @NameInMap("CallerParentId")
    public Long callerParentId;

    /**
     * <p>callerSecurityTransport</p>
     */
    @NameInMap("CallerSecurityTransport")
    public Boolean callerSecurityTransport;

    /**
     * <p>callerType</p>
     */
    @NameInMap("CallerType")
    public String callerType;

    /**
     * <p>clientIp</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <p>configurationId</p>
     */
    @NameInMap("ConfigurationId")
    public Long configurationId;

    /**
     * <p>lang</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>mfaPresent</p>
     */
    @NameInMap("MfaPresent")
    public Boolean mfaPresent;

    /**
     * <p>originalRequest</p>
     */
    @NameInMap("OriginalRequest")
    public String originalRequest;

    /**
     * <p>popAction</p>
     */
    @NameInMap("PopAction")
    public String popAction;

    /**
     * <p>proxyCallerIp</p>
     */
    @NameInMap("ProxyCallerIp")
    public String proxyCallerIp;

    /**
     * <p>proxyCallerSecurityTransport</p>
     */
    @NameInMap("ProxyCallerSecurityTransport")
    public Boolean proxyCallerSecurityTransport;

    /**
     * <p>proxyTrustTransportInfo</p>
     */
    @NameInMap("ProxyTrustTransportInfo")
    public Boolean proxyTrustTransportInfo;

    /**
     * <p>requestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>stsTokenCallerBid</p>
     */
    @NameInMap("StsTokenCallerBid")
    public Long stsTokenCallerBid;

    /**
     * <p>stsTokenCallerUid</p>
     */
    @NameInMap("StsTokenCallerUid")
    public Long stsTokenCallerUid;

    /**
     * <p>userBid</p>
     */
    @NameInMap("UserBid")
    public String userBid;

    /**
     * <p>userCallerParentId</p>
     */
    @NameInMap("UserCallerParentId")
    public Long userCallerParentId;

    /**
     * <p>userCallerSecurityTransport</p>
     */
    @NameInMap("UserCallerSecurityTransport")
    public Boolean userCallerSecurityTransport;

    /**
     * <p>userCallerType</p>
     */
    @NameInMap("UserCallerType")
    public String userCallerType;

    /**
     * <p>userClientIp</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>userKp</p>
     */
    @NameInMap("UserKp")
    public String userKp;

    /**
     * <p>userMfaPresent</p>
     */
    @NameInMap("UserMfaPresent")
    public Boolean userMfaPresent;

    /**
     * <p>userSecurityToken</p>
     */
    @NameInMap("UserSecurityToken")
    public String userSecurityToken;

    public static ConfirmConfigurationOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmConfigurationOrderRequest self = new ConfirmConfigurationOrderRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmConfigurationOrderRequest setAliyunKp(String aliyunKp) {
        this.aliyunKp = aliyunKp;
        return this;
    }
    public String getAliyunKp() {
        return this.aliyunKp;
    }

    public ConfirmConfigurationOrderRequest setAliyunKpLong(Long aliyunKpLong) {
        this.aliyunKpLong = aliyunKpLong;
        return this;
    }
    public Long getAliyunKpLong() {
        return this.aliyunKpLong;
    }

    public ConfirmConfigurationOrderRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public ConfirmConfigurationOrderRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public ConfirmConfigurationOrderRequest setCallerSecurityTransport(Boolean callerSecurityTransport) {
        this.callerSecurityTransport = callerSecurityTransport;
        return this;
    }
    public Boolean getCallerSecurityTransport() {
        return this.callerSecurityTransport;
    }

    public ConfirmConfigurationOrderRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public ConfirmConfigurationOrderRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public ConfirmConfigurationOrderRequest setConfigurationId(Long configurationId) {
        this.configurationId = configurationId;
        return this;
    }
    public Long getConfigurationId() {
        return this.configurationId;
    }

    public ConfirmConfigurationOrderRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ConfirmConfigurationOrderRequest setMfaPresent(Boolean mfaPresent) {
        this.mfaPresent = mfaPresent;
        return this;
    }
    public Boolean getMfaPresent() {
        return this.mfaPresent;
    }

    public ConfirmConfigurationOrderRequest setOriginalRequest(String originalRequest) {
        this.originalRequest = originalRequest;
        return this;
    }
    public String getOriginalRequest() {
        return this.originalRequest;
    }

    public ConfirmConfigurationOrderRequest setPopAction(String popAction) {
        this.popAction = popAction;
        return this;
    }
    public String getPopAction() {
        return this.popAction;
    }

    public ConfirmConfigurationOrderRequest setProxyCallerIp(String proxyCallerIp) {
        this.proxyCallerIp = proxyCallerIp;
        return this;
    }
    public String getProxyCallerIp() {
        return this.proxyCallerIp;
    }

    public ConfirmConfigurationOrderRequest setProxyCallerSecurityTransport(Boolean proxyCallerSecurityTransport) {
        this.proxyCallerSecurityTransport = proxyCallerSecurityTransport;
        return this;
    }
    public Boolean getProxyCallerSecurityTransport() {
        return this.proxyCallerSecurityTransport;
    }

    public ConfirmConfigurationOrderRequest setProxyTrustTransportInfo(Boolean proxyTrustTransportInfo) {
        this.proxyTrustTransportInfo = proxyTrustTransportInfo;
        return this;
    }
    public Boolean getProxyTrustTransportInfo() {
        return this.proxyTrustTransportInfo;
    }

    public ConfirmConfigurationOrderRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfirmConfigurationOrderRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ConfirmConfigurationOrderRequest setStsTokenCallerBid(Long stsTokenCallerBid) {
        this.stsTokenCallerBid = stsTokenCallerBid;
        return this;
    }
    public Long getStsTokenCallerBid() {
        return this.stsTokenCallerBid;
    }

    public ConfirmConfigurationOrderRequest setStsTokenCallerUid(Long stsTokenCallerUid) {
        this.stsTokenCallerUid = stsTokenCallerUid;
        return this;
    }
    public Long getStsTokenCallerUid() {
        return this.stsTokenCallerUid;
    }

    public ConfirmConfigurationOrderRequest setUserBid(String userBid) {
        this.userBid = userBid;
        return this;
    }
    public String getUserBid() {
        return this.userBid;
    }

    public ConfirmConfigurationOrderRequest setUserCallerParentId(Long userCallerParentId) {
        this.userCallerParentId = userCallerParentId;
        return this;
    }
    public Long getUserCallerParentId() {
        return this.userCallerParentId;
    }

    public ConfirmConfigurationOrderRequest setUserCallerSecurityTransport(Boolean userCallerSecurityTransport) {
        this.userCallerSecurityTransport = userCallerSecurityTransport;
        return this;
    }
    public Boolean getUserCallerSecurityTransport() {
        return this.userCallerSecurityTransport;
    }

    public ConfirmConfigurationOrderRequest setUserCallerType(String userCallerType) {
        this.userCallerType = userCallerType;
        return this;
    }
    public String getUserCallerType() {
        return this.userCallerType;
    }

    public ConfirmConfigurationOrderRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public ConfirmConfigurationOrderRequest setUserKp(String userKp) {
        this.userKp = userKp;
        return this;
    }
    public String getUserKp() {
        return this.userKp;
    }

    public ConfirmConfigurationOrderRequest setUserMfaPresent(Boolean userMfaPresent) {
        this.userMfaPresent = userMfaPresent;
        return this;
    }
    public Boolean getUserMfaPresent() {
        return this.userMfaPresent;
    }

    public ConfirmConfigurationOrderRequest setUserSecurityToken(String userSecurityToken) {
        this.userSecurityToken = userSecurityToken;
        return this;
    }
    public String getUserSecurityToken() {
        return this.userSecurityToken;
    }

}
