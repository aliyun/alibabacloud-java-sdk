// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceConfigResponseBody extends TeaModel {
    @NameInMap("AudioEnable")
    public String audioEnable;

    @NameInMap("AudioFormat")
    public String audioFormat;

    @NameInMap("BitRate")
    public String bitRate;

    @NameInMap("ChannelList")
    public java.util.List<GetDeviceConfigResponseBodyChannelList> channelList;

    @NameInMap("Code")
    public String code;

    @NameInMap("DeviceAddress")
    public String deviceAddress;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("EncodeFormat")
    public String encodeFormat;

    @NameInMap("FrameRate")
    public String frameRate;

    @NameInMap("GovLength")
    public Long govLength;

    @NameInMap("Latitude")
    public String latitude;

    @NameInMap("Longitude")
    public String longitude;

    @NameInMap("Message")
    public String message;

    @NameInMap("OSDList")
    public java.util.List<GetDeviceConfigResponseBodyOSDList> OSDList;

    @NameInMap("OSDTimeEnable")
    public String OSDTimeEnable;

    @NameInMap("OSDTimeType")
    public String OSDTimeType;

    @NameInMap("OSDTimeX")
    public String OSDTimeX;

    @NameInMap("OSDTimeY")
    public String OSDTimeY;

    @NameInMap("PassWord")
    public String passWord;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resolution")
    public String resolution;

    @NameInMap("RetryInterval")
    public String retryInterval;

    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("ServerIp")
    public String serverIp;

    @NameInMap("ServerPort")
    public String serverPort;

    @NameInMap("UserName")
    public String userName;

    public static GetDeviceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceConfigResponseBody self = new GetDeviceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceConfigResponseBody setAudioEnable(String audioEnable) {
        this.audioEnable = audioEnable;
        return this;
    }
    public String getAudioEnable() {
        return this.audioEnable;
    }

    public GetDeviceConfigResponseBody setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }
    public String getAudioFormat() {
        return this.audioFormat;
    }

    public GetDeviceConfigResponseBody setBitRate(String bitRate) {
        this.bitRate = bitRate;
        return this;
    }
    public String getBitRate() {
        return this.bitRate;
    }

    public GetDeviceConfigResponseBody setChannelList(java.util.List<GetDeviceConfigResponseBodyChannelList> channelList) {
        this.channelList = channelList;
        return this;
    }
    public java.util.List<GetDeviceConfigResponseBodyChannelList> getChannelList() {
        return this.channelList;
    }

    public GetDeviceConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceConfigResponseBody setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress;
        return this;
    }
    public String getDeviceAddress() {
        return this.deviceAddress;
    }

    public GetDeviceConfigResponseBody setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetDeviceConfigResponseBody setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public GetDeviceConfigResponseBody setEncodeFormat(String encodeFormat) {
        this.encodeFormat = encodeFormat;
        return this;
    }
    public String getEncodeFormat() {
        return this.encodeFormat;
    }

    public GetDeviceConfigResponseBody setFrameRate(String frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public String getFrameRate() {
        return this.frameRate;
    }

    public GetDeviceConfigResponseBody setGovLength(Long govLength) {
        this.govLength = govLength;
        return this;
    }
    public Long getGovLength() {
        return this.govLength;
    }

    public GetDeviceConfigResponseBody setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public GetDeviceConfigResponseBody setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public GetDeviceConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceConfigResponseBody setOSDList(java.util.List<GetDeviceConfigResponseBodyOSDList> OSDList) {
        this.OSDList = OSDList;
        return this;
    }
    public java.util.List<GetDeviceConfigResponseBodyOSDList> getOSDList() {
        return this.OSDList;
    }

    public GetDeviceConfigResponseBody setOSDTimeEnable(String OSDTimeEnable) {
        this.OSDTimeEnable = OSDTimeEnable;
        return this;
    }
    public String getOSDTimeEnable() {
        return this.OSDTimeEnable;
    }

    public GetDeviceConfigResponseBody setOSDTimeType(String OSDTimeType) {
        this.OSDTimeType = OSDTimeType;
        return this;
    }
    public String getOSDTimeType() {
        return this.OSDTimeType;
    }

    public GetDeviceConfigResponseBody setOSDTimeX(String OSDTimeX) {
        this.OSDTimeX = OSDTimeX;
        return this;
    }
    public String getOSDTimeX() {
        return this.OSDTimeX;
    }

    public GetDeviceConfigResponseBody setOSDTimeY(String OSDTimeY) {
        this.OSDTimeY = OSDTimeY;
        return this;
    }
    public String getOSDTimeY() {
        return this.OSDTimeY;
    }

    public GetDeviceConfigResponseBody setPassWord(String passWord) {
        this.passWord = passWord;
        return this;
    }
    public String getPassWord() {
        return this.passWord;
    }

    public GetDeviceConfigResponseBody setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public GetDeviceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceConfigResponseBody setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public GetDeviceConfigResponseBody setRetryInterval(String retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public String getRetryInterval() {
        return this.retryInterval;
    }

    public GetDeviceConfigResponseBody setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public GetDeviceConfigResponseBody setServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }
    public String getServerIp() {
        return this.serverIp;
    }

    public GetDeviceConfigResponseBody setServerPort(String serverPort) {
        this.serverPort = serverPort;
        return this;
    }
    public String getServerPort() {
        return this.serverPort;
    }

    public GetDeviceConfigResponseBody setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public static class GetDeviceConfigResponseBodyChannelList extends TeaModel {
        @NameInMap("ChannelGbId")
        public String channelGbId;

        @NameInMap("FridayCaptureStrategy")
        public String fridayCaptureStrategy;

        @NameInMap("MondayCaptureStrategy")
        public String mondayCaptureStrategy;

        @NameInMap("SaturdayCaptureStrategy")
        public String saturdayCaptureStrategy;

        @NameInMap("SundayCaptureStrategy")
        public String sundayCaptureStrategy;

        @NameInMap("ThursdayCaptureStrategy")
        public String thursdayCaptureStrategy;

        @NameInMap("TuesdayCaptureStrategy")
        public String tuesdayCaptureStrategy;

        @NameInMap("WednesdayCaptureStrategy")
        public String wednesdayCaptureStrategy;

        public static GetDeviceConfigResponseBodyChannelList build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceConfigResponseBodyChannelList self = new GetDeviceConfigResponseBodyChannelList();
            return TeaModel.build(map, self);
        }

        public GetDeviceConfigResponseBodyChannelList setChannelGbId(String channelGbId) {
            this.channelGbId = channelGbId;
            return this;
        }
        public String getChannelGbId() {
            return this.channelGbId;
        }

        public GetDeviceConfigResponseBodyChannelList setFridayCaptureStrategy(String fridayCaptureStrategy) {
            this.fridayCaptureStrategy = fridayCaptureStrategy;
            return this;
        }
        public String getFridayCaptureStrategy() {
            return this.fridayCaptureStrategy;
        }

        public GetDeviceConfigResponseBodyChannelList setMondayCaptureStrategy(String mondayCaptureStrategy) {
            this.mondayCaptureStrategy = mondayCaptureStrategy;
            return this;
        }
        public String getMondayCaptureStrategy() {
            return this.mondayCaptureStrategy;
        }

        public GetDeviceConfigResponseBodyChannelList setSaturdayCaptureStrategy(String saturdayCaptureStrategy) {
            this.saturdayCaptureStrategy = saturdayCaptureStrategy;
            return this;
        }
        public String getSaturdayCaptureStrategy() {
            return this.saturdayCaptureStrategy;
        }

        public GetDeviceConfigResponseBodyChannelList setSundayCaptureStrategy(String sundayCaptureStrategy) {
            this.sundayCaptureStrategy = sundayCaptureStrategy;
            return this;
        }
        public String getSundayCaptureStrategy() {
            return this.sundayCaptureStrategy;
        }

        public GetDeviceConfigResponseBodyChannelList setThursdayCaptureStrategy(String thursdayCaptureStrategy) {
            this.thursdayCaptureStrategy = thursdayCaptureStrategy;
            return this;
        }
        public String getThursdayCaptureStrategy() {
            return this.thursdayCaptureStrategy;
        }

        public GetDeviceConfigResponseBodyChannelList setTuesdayCaptureStrategy(String tuesdayCaptureStrategy) {
            this.tuesdayCaptureStrategy = tuesdayCaptureStrategy;
            return this;
        }
        public String getTuesdayCaptureStrategy() {
            return this.tuesdayCaptureStrategy;
        }

        public GetDeviceConfigResponseBodyChannelList setWednesdayCaptureStrategy(String wednesdayCaptureStrategy) {
            this.wednesdayCaptureStrategy = wednesdayCaptureStrategy;
            return this;
        }
        public String getWednesdayCaptureStrategy() {
            return this.wednesdayCaptureStrategy;
        }

    }

    public static class GetDeviceConfigResponseBodyOSDList extends TeaModel {
        @NameInMap("LeftTopX")
        public String leftTopX;

        @NameInMap("LeftTopY")
        public String leftTopY;

        @NameInMap("Text")
        public String text;

        public static GetDeviceConfigResponseBodyOSDList build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceConfigResponseBodyOSDList self = new GetDeviceConfigResponseBodyOSDList();
            return TeaModel.build(map, self);
        }

        public GetDeviceConfigResponseBodyOSDList setLeftTopX(String leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public String getLeftTopX() {
            return this.leftTopX;
        }

        public GetDeviceConfigResponseBodyOSDList setLeftTopY(String leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public String getLeftTopY() {
            return this.leftTopY;
        }

        public GetDeviceConfigResponseBodyOSDList setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

}
