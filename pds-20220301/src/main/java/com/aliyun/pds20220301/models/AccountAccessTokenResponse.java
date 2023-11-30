// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AccountAccessTokenResponse extends TeaModel {
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

    @NameInMap("path_status")
    public String pathStatus;

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

    public static AccountAccessTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        AccountAccessTokenResponse self = new AccountAccessTokenResponse();
        return TeaModel.build(map, self);
    }

    public AccountAccessTokenResponse setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public AccountAccessTokenResponse setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public AccountAccessTokenResponse setDefaultDriveId(String defaultDriveId) {
        this.defaultDriveId = defaultDriveId;
        return this;
    }
    public String getDefaultDriveId() {
        return this.defaultDriveId;
    }

    public AccountAccessTokenResponse setDefaultSboxDriveId(String defaultSboxDriveId) {
        this.defaultSboxDriveId = defaultSboxDriveId;
        return this;
    }
    public String getDefaultSboxDriveId() {
        return this.defaultSboxDriveId;
    }

    public AccountAccessTokenResponse setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public AccountAccessTokenResponse setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public AccountAccessTokenResponse setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public AccountAccessTokenResponse setExistLink(java.util.List<LinkInfo> existLink) {
        this.existLink = existLink;
        return this;
    }
    public java.util.List<LinkInfo> getExistLink() {
        return this.existLink;
    }

    public AccountAccessTokenResponse setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public AccountAccessTokenResponse setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
    public Long getExpiresIn() {
        return this.expiresIn;
    }

    public AccountAccessTokenResponse setIsFirstLogin(Boolean isFirstLogin) {
        this.isFirstLogin = isFirstLogin;
        return this;
    }
    public Boolean getIsFirstLogin() {
        return this.isFirstLogin;
    }

    public AccountAccessTokenResponse setNeedLink(Boolean needLink) {
        this.needLink = needLink;
        return this;
    }
    public Boolean getNeedLink() {
        return this.needLink;
    }

    public AccountAccessTokenResponse setNeedRpVerify(Boolean needRpVerify) {
        this.needRpVerify = needRpVerify;
        return this;
    }
    public Boolean getNeedRpVerify() {
        return this.needRpVerify;
    }

    public AccountAccessTokenResponse setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public AccountAccessTokenResponse setPathStatus(String pathStatus) {
        this.pathStatus = pathStatus;
        return this;
    }
    public String getPathStatus() {
        return this.pathStatus;
    }

    public AccountAccessTokenResponse setPinSetup(Boolean pinSetup) {
        this.pinSetup = pinSetup;
        return this;
    }
    public Boolean getPinSetup() {
        return this.pinSetup;
    }

    public AccountAccessTokenResponse setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public AccountAccessTokenResponse setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public AccountAccessTokenResponse setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public AccountAccessTokenResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AccountAccessTokenResponse setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    public String getTokenType() {
        return this.tokenType;
    }

    public AccountAccessTokenResponse setUserData(java.util.Map<String, String> userData) {
        this.userData = userData;
        return this;
    }
    public java.util.Map<String, String> getUserData() {
        return this.userData;
    }

    public AccountAccessTokenResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public AccountAccessTokenResponse setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
