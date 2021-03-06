// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeGroupResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("LazyPull")
    public Boolean lazyPull;

    @NameInMap("Callback")
    public String callback;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Description")
    public String description;

    @NameInMap("App")
    public String app;

    @NameInMap("Region")
    public String region;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("InProtocol")
    public String inProtocol;

    @NameInMap("OutProtocol")
    public String outProtocol;

    @NameInMap("Name")
    public String name;

    @NameInMap("PushDomain")
    public String pushDomain;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("CaptureVideo")
    public Integer captureVideo;

    @NameInMap("PlayDomain")
    public String playDomain;

    @NameInMap("CaptureInterval")
    public Integer captureInterval;

    @NameInMap("GbPort")
    public Long gbPort;

    @NameInMap("GbId")
    public String gbId;

    @NameInMap("GbIp")
    public String gbIp;

    @NameInMap("CaptureImage")
    public Integer captureImage;

    @NameInMap("AliasId")
    public String aliasId;

    @NameInMap("CaptureOssBucket")
    public String captureOssBucket;

    @NameInMap("CaptureOssPath")
    public String captureOssPath;

    @NameInMap("Id")
    public String id;

    @NameInMap("GbTcpPorts")
    public java.util.List<String> gbTcpPorts;

    @NameInMap("GbUdpPorts")
    public java.util.List<String> gbUdpPorts;

    @NameInMap("Stats")
    public DescribeGroupResponseBodyStats stats;

    public static DescribeGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupResponseBody self = new DescribeGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeGroupResponseBody setLazyPull(Boolean lazyPull) {
        this.lazyPull = lazyPull;
        return this;
    }
    public Boolean getLazyPull() {
        return this.lazyPull;
    }

    public DescribeGroupResponseBody setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public DescribeGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeGroupResponseBody setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DescribeGroupResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeGroupResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public DescribeGroupResponseBody setInProtocol(String inProtocol) {
        this.inProtocol = inProtocol;
        return this;
    }
    public String getInProtocol() {
        return this.inProtocol;
    }

    public DescribeGroupResponseBody setOutProtocol(String outProtocol) {
        this.outProtocol = outProtocol;
        return this;
    }
    public String getOutProtocol() {
        return this.outProtocol;
    }

    public DescribeGroupResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeGroupResponseBody setPushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
        return this;
    }
    public String getPushDomain() {
        return this.pushDomain;
    }

    public DescribeGroupResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeGroupResponseBody setCaptureVideo(Integer captureVideo) {
        this.captureVideo = captureVideo;
        return this;
    }
    public Integer getCaptureVideo() {
        return this.captureVideo;
    }

    public DescribeGroupResponseBody setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }
    public String getPlayDomain() {
        return this.playDomain;
    }

    public DescribeGroupResponseBody setCaptureInterval(Integer captureInterval) {
        this.captureInterval = captureInterval;
        return this;
    }
    public Integer getCaptureInterval() {
        return this.captureInterval;
    }

    public DescribeGroupResponseBody setGbPort(Long gbPort) {
        this.gbPort = gbPort;
        return this;
    }
    public Long getGbPort() {
        return this.gbPort;
    }

    public DescribeGroupResponseBody setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public DescribeGroupResponseBody setGbIp(String gbIp) {
        this.gbIp = gbIp;
        return this;
    }
    public String getGbIp() {
        return this.gbIp;
    }

    public DescribeGroupResponseBody setCaptureImage(Integer captureImage) {
        this.captureImage = captureImage;
        return this;
    }
    public Integer getCaptureImage() {
        return this.captureImage;
    }

    public DescribeGroupResponseBody setAliasId(String aliasId) {
        this.aliasId = aliasId;
        return this;
    }
    public String getAliasId() {
        return this.aliasId;
    }

    public DescribeGroupResponseBody setCaptureOssBucket(String captureOssBucket) {
        this.captureOssBucket = captureOssBucket;
        return this;
    }
    public String getCaptureOssBucket() {
        return this.captureOssBucket;
    }

    public DescribeGroupResponseBody setCaptureOssPath(String captureOssPath) {
        this.captureOssPath = captureOssPath;
        return this;
    }
    public String getCaptureOssPath() {
        return this.captureOssPath;
    }

    public DescribeGroupResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeGroupResponseBody setGbTcpPorts(java.util.List<String> gbTcpPorts) {
        this.gbTcpPorts = gbTcpPorts;
        return this;
    }
    public java.util.List<String> getGbTcpPorts() {
        return this.gbTcpPorts;
    }

    public DescribeGroupResponseBody setGbUdpPorts(java.util.List<String> gbUdpPorts) {
        this.gbUdpPorts = gbUdpPorts;
        return this;
    }
    public java.util.List<String> getGbUdpPorts() {
        return this.gbUdpPorts;
    }

    public DescribeGroupResponseBody setStats(DescribeGroupResponseBodyStats stats) {
        this.stats = stats;
        return this;
    }
    public DescribeGroupResponseBodyStats getStats() {
        return this.stats;
    }

    public static class DescribeGroupResponseBodyStats extends TeaModel {
        @NameInMap("PlatformNum")
        public Long platformNum;

        @NameInMap("DeviceNum")
        public Long deviceNum;

        @NameInMap("IpcNum")
        public Long ipcNum;

        @NameInMap("IedNum")
        public Long iedNum;

        public static DescribeGroupResponseBodyStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupResponseBodyStats self = new DescribeGroupResponseBodyStats();
            return TeaModel.build(map, self);
        }

        public DescribeGroupResponseBodyStats setPlatformNum(Long platformNum) {
            this.platformNum = platformNum;
            return this;
        }
        public Long getPlatformNum() {
            return this.platformNum;
        }

        public DescribeGroupResponseBodyStats setDeviceNum(Long deviceNum) {
            this.deviceNum = deviceNum;
            return this;
        }
        public Long getDeviceNum() {
            return this.deviceNum;
        }

        public DescribeGroupResponseBodyStats setIpcNum(Long ipcNum) {
            this.ipcNum = ipcNum;
            return this;
        }
        public Long getIpcNum() {
            return this.ipcNum;
        }

        public DescribeGroupResponseBodyStats setIedNum(Long iedNum) {
            this.iedNum = iedNum;
            return this;
        }
        public Long getIedNum() {
            return this.iedNum;
        }

    }

}
