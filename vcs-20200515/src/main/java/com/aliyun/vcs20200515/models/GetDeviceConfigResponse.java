// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceConfigResponse extends TeaModel {
    @NameInMap("AudioEnable")
    @Validation(required = true)
    public Boolean audioEnable;

    @NameInMap("AudioFormat")
    @Validation(required = true)
    public String audioFormat;

    @NameInMap("BitRate")
    @Validation(required = true)
    public String bitRate;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("DeviceAddress")
    @Validation(required = true)
    public String deviceAddress;

    @NameInMap("DeviceName")
    @Validation(required = true)
    public String deviceName;

    @NameInMap("EncodeFormat")
    @Validation(required = true)
    public String encodeFormat;

    @NameInMap("FrameRate")
    @Validation(required = true)
    public String frameRate;

    @NameInMap("GovLength")
    @Validation(required = true)
    public Integer govLength;

    @NameInMap("Latitude")
    @Validation(required = true)
    public String latitude;

    @NameInMap("Longitude")
    @Validation(required = true)
    public String longitude;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("OSDTimeEnable")
    @Validation(required = true)
    public String OSDTimeEnable;

    @NameInMap("OSDTimeType")
    @Validation(required = true)
    public String OSDTimeType;

    @NameInMap("OSDTimeX")
    @Validation(required = true)
    public String OSDTimeX;

    @NameInMap("OSDTimeY")
    @Validation(required = true)
    public String OSDTimeY;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Resolution")
    @Validation(required = true)
    public String resolution;

    @NameInMap("RetryInterval")
    @Validation(required = true)
    public String retryInterval;

    @NameInMap("DeviceId")
    @Validation(required = true)
    public String deviceId;

    @NameInMap("UserName")
    @Validation(required = true)
    public String userName;

    @NameInMap("PassWord")
    @Validation(required = true)
    public String passWord;

    @NameInMap("Protocol")
    @Validation(required = true)
    public String protocol;

    @NameInMap("ServerId")
    @Validation(required = true)
    public String serverId;

    @NameInMap("ServerPort")
    @Validation(required = true)
    public String serverPort;

    @NameInMap("ServerIp")
    @Validation(required = true)
    public String serverIp;

    @NameInMap("OSDList")
    @Validation(required = true)
    public java.util.List<GetDeviceConfigResponseOSDList> OSDList;

    public static GetDeviceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceConfigResponse self = new GetDeviceConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceConfigResponse setAudioEnable(Boolean audioEnable) {
        this.audioEnable = audioEnable;
        return this;
    }
    public Boolean getAudioEnable() {
        return this.audioEnable;
    }

    public GetDeviceConfigResponse setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }
    public String getAudioFormat() {
        return this.audioFormat;
    }

    public GetDeviceConfigResponse setBitRate(String bitRate) {
        this.bitRate = bitRate;
        return this;
    }
    public String getBitRate() {
        return this.bitRate;
    }

    public GetDeviceConfigResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceConfigResponse setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress;
        return this;
    }
    public String getDeviceAddress() {
        return this.deviceAddress;
    }

    public GetDeviceConfigResponse setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public GetDeviceConfigResponse setEncodeFormat(String encodeFormat) {
        this.encodeFormat = encodeFormat;
        return this;
    }
    public String getEncodeFormat() {
        return this.encodeFormat;
    }

    public GetDeviceConfigResponse setFrameRate(String frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public String getFrameRate() {
        return this.frameRate;
    }

    public GetDeviceConfigResponse setGovLength(Integer govLength) {
        this.govLength = govLength;
        return this;
    }
    public Integer getGovLength() {
        return this.govLength;
    }

    public GetDeviceConfigResponse setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public GetDeviceConfigResponse setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public GetDeviceConfigResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceConfigResponse setOSDTimeEnable(String OSDTimeEnable) {
        this.OSDTimeEnable = OSDTimeEnable;
        return this;
    }
    public String getOSDTimeEnable() {
        return this.OSDTimeEnable;
    }

    public GetDeviceConfigResponse setOSDTimeType(String OSDTimeType) {
        this.OSDTimeType = OSDTimeType;
        return this;
    }
    public String getOSDTimeType() {
        return this.OSDTimeType;
    }

    public GetDeviceConfigResponse setOSDTimeX(String OSDTimeX) {
        this.OSDTimeX = OSDTimeX;
        return this;
    }
    public String getOSDTimeX() {
        return this.OSDTimeX;
    }

    public GetDeviceConfigResponse setOSDTimeY(String OSDTimeY) {
        this.OSDTimeY = OSDTimeY;
        return this;
    }
    public String getOSDTimeY() {
        return this.OSDTimeY;
    }

    public GetDeviceConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceConfigResponse setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public GetDeviceConfigResponse setRetryInterval(String retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public String getRetryInterval() {
        return this.retryInterval;
    }

    public GetDeviceConfigResponse setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetDeviceConfigResponse setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public GetDeviceConfigResponse setPassWord(String passWord) {
        this.passWord = passWord;
        return this;
    }
    public String getPassWord() {
        return this.passWord;
    }

    public GetDeviceConfigResponse setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public GetDeviceConfigResponse setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public GetDeviceConfigResponse setServerPort(String serverPort) {
        this.serverPort = serverPort;
        return this;
    }
    public String getServerPort() {
        return this.serverPort;
    }

    public GetDeviceConfigResponse setServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }
    public String getServerIp() {
        return this.serverIp;
    }

    public GetDeviceConfigResponse setOSDList(java.util.List<GetDeviceConfigResponseOSDList> OSDList) {
        this.OSDList = OSDList;
        return this;
    }
    public java.util.List<GetDeviceConfigResponseOSDList> getOSDList() {
        return this.OSDList;
    }

    public static class GetDeviceConfigResponseOSDList extends TeaModel {
        @NameInMap("Text")
        @Validation(required = true)
        public String text;

        @NameInMap("LeftTopX")
        @Validation(required = true)
        public String leftTopX;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public String leftTopY;

        public static GetDeviceConfigResponseOSDList build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceConfigResponseOSDList self = new GetDeviceConfigResponseOSDList();
            return TeaModel.build(map, self);
        }

        public GetDeviceConfigResponseOSDList setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetDeviceConfigResponseOSDList setLeftTopX(String leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public String getLeftTopX() {
            return this.leftTopX;
        }

        public GetDeviceConfigResponseOSDList setLeftTopY(String leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public String getLeftTopY() {
            return this.leftTopY;
        }

    }

}
