// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RtcSendSipDtmfRequest extends TeaModel {
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
     * <p>The ID of an existing channel. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The user ID (sipUserId) in the target OneRTC SIP call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ChannelUserId")
    public String channelUserId;

    /**
     * <p>The device type of the third-party Session Initiation Protocol (SIP) device. Valid values:</p>
     * <ul>
     * <li>sip_device</li>
     * <li>mcu</li>
     * <li>phone</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mcu</p>
     */
    @NameInMap("DeviceType")
    public String deviceType;

    /**
     * <p>The keys to be sent. Supported keys include 0-9, A-D, a-d, *, #, W or w (wait), and F or f (flash). The keys are sent in the original order and case.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12#W3f</p>
     */
    @NameInMap("Digits")
    public String digits;

    public static RtcSendSipDtmfRequest build(java.util.Map<String, ?> map) throws Exception {
        RtcSendSipDtmfRequest self = new RtcSendSipDtmfRequest();
        return TeaModel.build(map, self);
    }

    public RtcSendSipDtmfRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RtcSendSipDtmfRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public RtcSendSipDtmfRequest setChannelUserId(String channelUserId) {
        this.channelUserId = channelUserId;
        return this;
    }
    public String getChannelUserId() {
        return this.channelUserId;
    }

    public RtcSendSipDtmfRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public RtcSendSipDtmfRequest setDigits(String digits) {
        this.digits = digits;
        return this;
    }
    public String getDigits() {
        return this.digits;
    }

}
