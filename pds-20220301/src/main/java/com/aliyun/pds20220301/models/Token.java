// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Token extends TeaModel {
    /**
     * <p>The access token.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOiJjOWI3YTVhYTA0ZDE0YWUzODY3ZmRjODg2ZmEwMWRhNCIsImN1c3RvbUpzb24iOiJ7XCJjbGllbnRJZFwiOlwiMjVkelgzdmJZcWt0Vnh5WFwiLFwiZG9tYWluSWRcIjpcImJqMjlcIixcInNjb3BlXCI6W1wiRFJJVkUuQUxMXCIsXCJTSEFSRS5BTExcIixcIkZJTEUuQUxMXCIsXCJVU0VSLkFMTFwiLFwiVklFVy5BTExcIixcIlNUT1JBR0UuQUxMXCIsXCJTVE9SQUdFRklMRS5MSVNUXCIsXCJCQVRDSFwiLFwiT0FVVEguQUxMXCIsXCJJTUFHRS5BTExcIixcIklOVklURS5BTExcIixcIkFDQ09VTlQuQUxMXCJdLFwicm9sZVwiOlwidXNlclwiLFwicmVmXCI6XCJodHRwczovL3d3dy5hbGl5dW5kcml2ZS5jb20vXCIsXCJkZXZpY2VfaWRcIjpcImIyODIwNWU1YzU5NzRjY2JiODI3MDNiNjhkYjhjNDUxXCJ9IiwiZXhwIjoxNjQ4NjE0NDkzLCJpYXQiOjE2NDg2MDcyMzN9.d3HVLvv_LFw2QhPrhvjH_kICWQJX9sKKt7NjQEqI_xE2JO_b7D8rPsFTZz93PLvZ7MhCmudTjGImUpd-ehFnI4Go-1S7BGaKaHFILvP-sWy18Wpikowjxx9mSbzBM_cO6D1LI-kyYhXKWHgVdADfVIPniTDA7-ffhUpi7cAebEs</p>
     */
    @NameInMap("access_token")
    public String accessToken;

    /**
     * <p>The profile picture of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyunpds.com/a.jpg</p>
     */
    @NameInMap("avatar")
    public String avatar;

    /**
     * <p>The ID of the default space of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("default_drive_id")
    public String defaultDriveId;

    @NameInMap("default_sbox_drive_id")
    public String defaultSboxDriveId;

    /**
     * <p>The name of the device that is bound to OAuth 2.0 Device Authorization Grant.</p>
     * 
     * <strong>example:</strong>
     * <p>4683C25F</p>
     */
    @NameInMap("device_name")
    public String deviceName;

    /**
     * <p>The domain ID.</p>
     * 
     * <strong>example:</strong>
     * <p>bj1</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    @NameInMap("exist_link")
    public java.util.List<LinkInfo> existLink;

    /**
     * <p>The time when the credential expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-01T06:57:48.813Z</p>
     */
    @NameInMap("expire_time")
    public String expireTime;

    /**
     * <p>The validity period of the token.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("expires_in")
    public Long expiresIn;

    /**
     * <p>Indicates whether this is the first logon of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("is_first_login")
    public Boolean isFirstLogin;

    @NameInMap("need_link")
    public Boolean needLink;

    @NameInMap("need_rp_verify")
    public Boolean needRpVerify;

    /**
     * <p>The nickname of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>pdsuser</p>
     */
    @NameInMap("nick_name")
    public String nickName;

    @NameInMap("pin_setup")
    public Boolean pinSetup;

    /**
     * <p>The refresh token.</p>
     * 
     * <strong>example:</strong>
     * <p>060e78d36afb4879b51e4264e9541c16</p>
     */
    @NameInMap("refresh_token")
    public String refreshToken;

    /**
     * <p>The role of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("role")
    public String role;

    @NameInMap("state")
    public String state;

    /**
     * <p>The status of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The type of the token.</p>
     * <ul>
     * <li>Only Bearer is supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Bearer</p>
     */
    @NameInMap("token_type")
    public String tokenType;

    @NameInMap("user_data")
    public java.util.Map<String, String> userData;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DING-xxxxx</p>
     */
    @NameInMap("user_id")
    public String userId;

    /**
     * <p>The name of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>pdsuser</p>
     */
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
