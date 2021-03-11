// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeGroupsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageCount")
    public Long pageCount;

    @NameInMap("Groups")
    public java.util.List<DescribeGroupsResponseBodyGroups> groups;

    public static DescribeGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupsResponseBody self = new DescribeGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeGroupsResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeGroupsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupsResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public DescribeGroupsResponseBody setGroups(java.util.List<DescribeGroupsResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<DescribeGroupsResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public static class DescribeGroupsResponseBodyGroupsStats extends TeaModel {
        @NameInMap("PlatformNum")
        public Long platformNum;

        @NameInMap("DeviceNum")
        public Long deviceNum;

        @NameInMap("IpcNum")
        public Long ipcNum;

        @NameInMap("IedNum")
        public Long iedNum;

        public static DescribeGroupsResponseBodyGroupsStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupsResponseBodyGroupsStats self = new DescribeGroupsResponseBodyGroupsStats();
            return TeaModel.build(map, self);
        }

        public DescribeGroupsResponseBodyGroupsStats setPlatformNum(Long platformNum) {
            this.platformNum = platformNum;
            return this;
        }
        public Long getPlatformNum() {
            return this.platformNum;
        }

        public DescribeGroupsResponseBodyGroupsStats setDeviceNum(Long deviceNum) {
            this.deviceNum = deviceNum;
            return this;
        }
        public Long getDeviceNum() {
            return this.deviceNum;
        }

        public DescribeGroupsResponseBodyGroupsStats setIpcNum(Long ipcNum) {
            this.ipcNum = ipcNum;
            return this;
        }
        public Long getIpcNum() {
            return this.ipcNum;
        }

        public DescribeGroupsResponseBodyGroupsStats setIedNum(Long iedNum) {
            this.iedNum = iedNum;
            return this;
        }
        public Long getIedNum() {
            return this.iedNum;
        }

    }

    public static class DescribeGroupsResponseBodyGroups extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("LazyPull")
        public Boolean lazyPull;

        @NameInMap("Callback")
        public String callback;

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

        @NameInMap("Stats")
        public DescribeGroupsResponseBodyGroupsStats stats;

        @NameInMap("PlayDomain")
        public String playDomain;

        @NameInMap("GbPort")
        public Long gbPort;

        @NameInMap("CaptureInterval")
        public Integer captureInterval;

        @NameInMap("GbTcpPorts")
        public java.util.List<String> gbTcpPorts;

        @NameInMap("GbId")
        public String gbId;

        @NameInMap("GbIp")
        public String gbIp;

        @NameInMap("CaptureImage")
        public Integer captureImage;

        @NameInMap("AliasId")
        public String aliasId;

        @NameInMap("CaptureOssPath")
        public String captureOssPath;

        @NameInMap("CaptureOssBucket")
        public String captureOssBucket;

        @NameInMap("GbUdpPorts")
        public java.util.List<String> gbUdpPorts;

        @NameInMap("Id")
        public String id;

        public static DescribeGroupsResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupsResponseBodyGroups self = new DescribeGroupsResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public DescribeGroupsResponseBodyGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGroupsResponseBodyGroups setLazyPull(Boolean lazyPull) {
            this.lazyPull = lazyPull;
            return this;
        }
        public Boolean getLazyPull() {
            return this.lazyPull;
        }

        public DescribeGroupsResponseBodyGroups setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public DescribeGroupsResponseBodyGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeGroupsResponseBodyGroups setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public DescribeGroupsResponseBodyGroups setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeGroupsResponseBodyGroups setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeGroupsResponseBodyGroups setInProtocol(String inProtocol) {
            this.inProtocol = inProtocol;
            return this;
        }
        public String getInProtocol() {
            return this.inProtocol;
        }

        public DescribeGroupsResponseBodyGroups setOutProtocol(String outProtocol) {
            this.outProtocol = outProtocol;
            return this;
        }
        public String getOutProtocol() {
            return this.outProtocol;
        }

        public DescribeGroupsResponseBodyGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGroupsResponseBodyGroups setPushDomain(String pushDomain) {
            this.pushDomain = pushDomain;
            return this;
        }
        public String getPushDomain() {
            return this.pushDomain;
        }

        public DescribeGroupsResponseBodyGroups setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeGroupsResponseBodyGroups setCaptureVideo(Integer captureVideo) {
            this.captureVideo = captureVideo;
            return this;
        }
        public Integer getCaptureVideo() {
            return this.captureVideo;
        }

        public DescribeGroupsResponseBodyGroups setStats(DescribeGroupsResponseBodyGroupsStats stats) {
            this.stats = stats;
            return this;
        }
        public DescribeGroupsResponseBodyGroupsStats getStats() {
            return this.stats;
        }

        public DescribeGroupsResponseBodyGroups setPlayDomain(String playDomain) {
            this.playDomain = playDomain;
            return this;
        }
        public String getPlayDomain() {
            return this.playDomain;
        }

        public DescribeGroupsResponseBodyGroups setGbPort(Long gbPort) {
            this.gbPort = gbPort;
            return this;
        }
        public Long getGbPort() {
            return this.gbPort;
        }

        public DescribeGroupsResponseBodyGroups setCaptureInterval(Integer captureInterval) {
            this.captureInterval = captureInterval;
            return this;
        }
        public Integer getCaptureInterval() {
            return this.captureInterval;
        }

        public DescribeGroupsResponseBodyGroups setGbTcpPorts(java.util.List<String> gbTcpPorts) {
            this.gbTcpPorts = gbTcpPorts;
            return this;
        }
        public java.util.List<String> getGbTcpPorts() {
            return this.gbTcpPorts;
        }

        public DescribeGroupsResponseBodyGroups setGbId(String gbId) {
            this.gbId = gbId;
            return this;
        }
        public String getGbId() {
            return this.gbId;
        }

        public DescribeGroupsResponseBodyGroups setGbIp(String gbIp) {
            this.gbIp = gbIp;
            return this;
        }
        public String getGbIp() {
            return this.gbIp;
        }

        public DescribeGroupsResponseBodyGroups setCaptureImage(Integer captureImage) {
            this.captureImage = captureImage;
            return this;
        }
        public Integer getCaptureImage() {
            return this.captureImage;
        }

        public DescribeGroupsResponseBodyGroups setAliasId(String aliasId) {
            this.aliasId = aliasId;
            return this;
        }
        public String getAliasId() {
            return this.aliasId;
        }

        public DescribeGroupsResponseBodyGroups setCaptureOssPath(String captureOssPath) {
            this.captureOssPath = captureOssPath;
            return this;
        }
        public String getCaptureOssPath() {
            return this.captureOssPath;
        }

        public DescribeGroupsResponseBodyGroups setCaptureOssBucket(String captureOssBucket) {
            this.captureOssBucket = captureOssBucket;
            return this;
        }
        public String getCaptureOssBucket() {
            return this.captureOssBucket;
        }

        public DescribeGroupsResponseBodyGroups setGbUdpPorts(java.util.List<String> gbUdpPorts) {
            this.gbUdpPorts = gbUdpPorts;
            return this;
        }
        public java.util.List<String> getGbUdpPorts() {
            return this.gbUdpPorts;
        }

        public DescribeGroupsResponseBodyGroups setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
