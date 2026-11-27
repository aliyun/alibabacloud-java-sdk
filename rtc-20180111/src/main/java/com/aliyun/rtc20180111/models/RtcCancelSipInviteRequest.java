// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RtcCancelSipInviteRequest extends TeaModel {
    /**
     * <p>The application ID. Create and find this ID in the console. Specify only one ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of an existing channel. Specify only one ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>$rtc_channelid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The type of the third-party SIP device:</p>
     * <ul>
     * <li><p>sip_device</p>
     * </li>
     * <li><p>mcu</p>
     * </li>
     * <li><p>phone</p>
     * </li>
     * </ul>
     * <p>Note: Only the phone type is supported at this stage.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>phone</p>
     */
    @NameInMap("DeviceType")
    public String deviceType;

    /**
     * <p>The user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>$rtc_userid</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static RtcCancelSipInviteRequest build(java.util.Map<String, ?> map) throws Exception {
        RtcCancelSipInviteRequest self = new RtcCancelSipInviteRequest();
        return TeaModel.build(map, self);
    }

    public RtcCancelSipInviteRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RtcCancelSipInviteRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public RtcCancelSipInviteRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public RtcCancelSipInviteRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
