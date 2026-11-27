// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RtcSipInviteMemberRequest extends TeaModel {
    /**
     * <p>The application ID. You can create and query the ID in the console. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The meeting token. For code generation, refer to <a href="https://help.aliyun.com/document_detail/2689025.html">https://help.aliyun.com/document_detail/2689025.html</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>000qaaasas……b</p>
     */
    @NameInMap("AppToken")
    public String appToken;

    /**
     * <p>The custom line number in PSTN scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>055112345678</p>
     */
    @NameInMap("CallNumber")
    public String callNumber;

    /**
     * <p>The channel ID. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>$rtc_channelid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The type of the device used to call the third-party SIP endpoint. Valid values:</p>
     * <ul>
     * <li>sip_device</li>
     * <li>mcu</li>
     * <li>phone</li>
     * </ul>
     * <p>Note: Currently, only the phone type is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>phone</p>
     */
    @NameInMap("DeviceType")
    public String deviceType;

    /**
     * <p>Specifies whether the third-party meeting system requires registration for inbound calls.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Registered")
    public Boolean registered;

    /**
     * <ol>
     * <li>The IP address of the nearest RTC SIP server.</li>
     * <li>You can resolve the domain name rtcsip.dingtalk.com locally to obtain the nearest access address.
     * For example, run dig rtcsip.dingtalk.com to obtain the address.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>39.101.232.13</p>
     */
    @NameInMap("ServerAddress")
    public String serverAddress;

    /**
     * <p>The username displayed on the third-party system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testdevice</p>
     */
    @NameInMap("SipDisplayName")
    public String sipDisplayName;

    /**
     * <ol>
     * <li>When the device is mcu, it indicates the channel number of the third-party meeting system to be called.</li>
     * <li>When the device is sip_device, it indicates the registration number of the registered device to be invited.</li>
     * <li>When the device is phone, it indicates the called phone number.</li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>18512514528</p>
     */
    @NameInMap("SipRoomId")
    public String sipRoomId;

    /**
     * <ol>
     * <li>When the device is mcu, it indicates the address information of the third-party meeting system in the format of ip:port;transport=tcp/udp/tls.
     * Example: &quot;30.240.160.66:5060;transport=tcp&quot;</li>
     * <li>When the device is sip_device, it indicates the registration address of the registered device to be invited.
     * Example: 39.101.232.13</li>
     * <li>When the device is phone, it indicates the address information of the telephone gateway.
     * Example: &quot;30.240.160.66:5060;transport=tcp&quot;</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>30.240.160.66:5060;transport=tcp</p>
     */
    @NameInMap("SipUri")
    public String sipUri;

    /**
     * <p>The brand and model of the third-party SIP endpoint being called, such as polycom, cisco, tencent, zoom, or pstn.</p>
     * 
     * <strong>example:</strong>
     * <p>pstn</p>
     */
    @NameInMap("SipUserAgent")
    public String sipUserAgent;

    /**
     * <ol>
     * <li>When DeviceType is mcu, it represents the third-party meeting system.</li>
     * <li>When DeviceType is sip_device, it represents the registered device.</li>
     * <li>If the third-party meeting system requires registration for inbound calls, it is the account provided by the third-party system to create an account.</li>
     * <li>If registration is not required, it is the SIP username or RTC user ID for calling the third-party system.</li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>$reg_userid</p>
     */
    @NameInMap("SipUserId")
    public String sipUserId;

    /**
     * <p>The registration password that matches the SipUserId if the third-party system requires registration for inbound calls.</p>
     * 
     * <strong>example:</strong>
     * <p>654321</p>
     */
    @NameInMap("SipUserPassword")
    public String sipUserPassword;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>taskId</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>$rtc_userid</p>
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

    public RtcSipInviteMemberRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RtcSipInviteMemberRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
