// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Token extends TeaModel {
    @NameInMap("access_token")
    public String accessToken;

    @NameInMap("avatar")
    public String avatar;

    @NameInMap("default_drive_id")
    public String defaultDriveId;

    @NameInMap("default_sbox_drive_id")
    public String defaultSboxDriveId;

    @NameInMap("device_id")
    public String deviceId;

    @NameInMap("device_name")
    public String deviceName;

    @NameInMap("domain_id")
    public String domainId;

    @NameInMap("exist_link")
    public java.util.List<LinkInfo> existLink;

    @NameInMap("expire_time")
    public String expireTime;

    @NameInMap("expires_in")
    public Long expiresIn;

    @NameInMap("is_first_login")
    public Boolean isFirstLogin;

    @NameInMap("need_link")
    public Boolean needLink;

    @NameInMap("need_rp_verify")
    public Boolean needRpVerify;

    @NameInMap("nick_name")
    public String nickName;

    @NameInMap("pin_setup")
    public Boolean pinSetup;

    @NameInMap("refresh_token")
    public String refreshToken;

    @NameInMap("role")
    public String role;

    @NameInMap("state")
    public String state;

    @NameInMap("status")
    public String status;

    @NameInMap("token_type")
    public String tokenType;

    @NameInMap("user_data")
    public java.util.Map<String, String> userData;

    @NameInMap("user_id")
    public String userId;

    @NameInMap("user_name")
    public String userName;

    public static Token build(java.util.Map<String, ?> map) throws Exception {
        Token self = new Token();
        return TeaModel.build(map, self);
    }

    public Token setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public Token setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public Token setDefaultDriveId(String defaultDriveId) {
        this.defaultDriveId = defaultDriveId;
        return this;
    }
    public String getDefaultDriveId() {
        return this.defaultDriveId;
    }

    public Token setDefaultSboxDriveId(String defaultSboxDriveId) {
        this.defaultSboxDriveId = defaultSboxDriveId;
        return this;
    }
    public String getDefaultSboxDriveId() {
        return this.defaultSboxDriveId;
    }

    public Token setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public Token setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public Token setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public Token setExistLink(java.util.List<LinkInfo> existLink) {
        this.existLink = existLink;
        return this;
    }
    public java.util.List<LinkInfo> getExistLink() {
        return this.existLink;
    }

    public Token setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public Token setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
    public Long getExpiresIn() {
        return this.expiresIn;
    }

    public Token setIsFirstLogin(Boolean isFirstLogin) {
        this.isFirstLogin = isFirstLogin;
        return this;
    }
    public Boolean getIsFirstLogin() {
        return this.isFirstLogin;
    }

    public Token setNeedLink(Boolean needLink) {
        this.needLink = needLink;
        return this;
    }
    public Boolean getNeedLink() {
        return this.needLink;
    }

    public Token setNeedRpVerify(Boolean needRpVerify) {
        this.needRpVerify = needRpVerify;
        return this;
    }
    public Boolean getNeedRpVerify() {
        return this.needRpVerify;
    }

    public Token setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public Token setPinSetup(Boolean pinSetup) {
        this.pinSetup = pinSetup;
        return this;
    }
    public Boolean getPinSetup() {
        return this.pinSetup;
    }

    public Token setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public Token setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public Token setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public Token setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Token setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    public String getTokenType() {
        return this.tokenType;
    }

    public Token setUserData(java.util.Map<String, String> userData) {
        this.userData = userData;
        return this;
    }
    public java.util.Map<String, String> getUserData() {
        return this.userData;
    }

    public Token setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public Token setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
