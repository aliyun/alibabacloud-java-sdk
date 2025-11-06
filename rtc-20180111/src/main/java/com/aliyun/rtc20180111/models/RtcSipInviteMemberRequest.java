// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RtcSipInviteMemberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>000qaaasas……b</p>
     */
    @NameInMap("AppToken")
    public String appToken;

    /**
     * <strong>example:</strong>
     * <p>055112345678</p>
     */
    @NameInMap("CallNumber")
    public String callNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mcu</p>
     */
    @NameInMap("DeviceType")
    public String deviceType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Registered")
    public Boolean registered;

    /**
     * <strong>example:</strong>
     * <p>47.116.80.180</p>
     */
    @NameInMap("ServerAddress")
    public String serverAddress;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ceo</p>
     */
    @NameInMap("SipDisplayName")
    public String sipDisplayName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("SipRoomId")
    public String sipRoomId;

    /**
     * <strong>example:</strong>
     * <p>30.240.160.66:5060;transport=tcp</p>
     */
    @NameInMap("SipUri")
    public String sipUri;

    /**
     * <strong>example:</strong>
     * <p>pstn</p>
     */
    @NameInMap("SipUserAgent")
    public String sipUserAgent;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("SipUserId")
    public String sipUserId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("SipUserPassword")
    public String sipUserPassword;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Uid")
    public String uid;

    public static RtcSipInviteMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        RtcSipInviteMemberRequest self = new RtcSipInviteMemberRequest();
        return TeaModel.build(map, self);
    }

    public RtcSipInviteMemberRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RtcSipInviteMemberRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public RtcSipInviteMemberRequest setCallNumber(String callNumber) {
        this.callNumber = callNumber;
        return this;
    }
    public String getCallNumber() {
        return this.callNumber;
    }

    public RtcSipInviteMemberRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public RtcSipInviteMemberRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public RtcSipInviteMemberRequest setRegistered(Boolean registered) {
        this.registered = registered;
        return this;
    }
    public Boolean getRegistered() {
        return this.registered;
    }

    public RtcSipInviteMemberRequest setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
        return this;
    }
    public String getServerAddress() {
        return this.serverAddress;
    }

    public RtcSipInviteMemberRequest setSipDisplayName(String sipDisplayName) {
        this.sipDisplayName = sipDisplayName;
        return this;
    }
    public String getSipDisplayName() {
        return this.sipDisplayName;
    }

    public RtcSipInviteMemberRequest setSipRoomId(String sipRoomId) {
        this.sipRoomId = sipRoomId;
        return this;
    }
    public String getSipRoomId() {
        return this.sipRoomId;
    }

    public RtcSipInviteMemberRequest setSipUri(String sipUri) {
        this.sipUri = sipUri;
        return this;
    }
    public String getSipUri() {
        return this.sipUri;
    }

    public RtcSipInviteMemberRequest setSipUserAgent(String sipUserAgent) {
        this.sipUserAgent = sipUserAgent;
        return this;
    }
    public String getSipUserAgent() {
        return this.sipUserAgent;
    }

    public RtcSipInviteMemberRequest setSipUserId(String sipUserId) {
        this.sipUserId = sipUserId;
        return this;
    }
    public String getSipUserId() {
        return this.sipUserId;
    }

    public RtcSipInviteMemberRequest setSipUserPassword(String sipUserPassword) {
        this.sipUserPassword = sipUserPassword;
        return this;
    }
    public String getSipUserPassword() {
        return this.sipUserPassword;
    }

    public RtcSipInviteMemberRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
