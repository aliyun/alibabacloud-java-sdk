// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeGroupsResponseBody extends TeaModel {
    @NameInMap("Groups")
    public java.util.List<DescribeGroupsResponseBodyGroups> groups;

    @NameInMap("PageCount")
    public Long pageCount;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupsResponseBody self = new DescribeGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupsResponseBody setGroups(java.util.List<DescribeGroupsResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<DescribeGroupsResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public DescribeGroupsResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
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

    public DescribeGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeGroupsResponseBodyGroupsStats extends TeaModel {
        @NameInMap("DeviceNum")
        public Long deviceNum;

        @NameInMap("IedNum")
        public Long iedNum;

        @NameInMap("IpcNum")
        public Long ipcNum;

        @NameInMap("PlatformNum")
        public Long platformNum;

        public static DescribeGroupsResponseBodyGroupsStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupsResponseBodyGroupsStats self = new DescribeGroupsResponseBodyGroupsStats();
            return TeaModel.build(map, self);
        }

        public DescribeGroupsResponseBodyGroupsStats setDeviceNum(Long deviceNum) {
            this.deviceNum = deviceNum;
            return this;
        }
        public Long getDeviceNum() {
            return this.deviceNum;
        }

        public DescribeGroupsResponseBodyGroupsStats setIedNum(Long iedNum) {
            this.iedNum = iedNum;
            return this;
        }
        public Long getIedNum() {
            return this.iedNum;
        }

        public DescribeGroupsResponseBodyGroupsStats setIpcNum(Long ipcNum) {
            this.ipcNum = ipcNum;
            return this;
        }
        public Long getIpcNum() {
            return this.ipcNum;
        }

        public DescribeGroupsResponseBodyGroupsStats setPlatformNum(Long platformNum) {
            this.platformNum = platformNum;
            return this;
        }
        public Long getPlatformNum() {
            return this.platformNum;
        }

    }

    public static class DescribeGroupsResponseBodyGroups extends TeaModel {
        @NameInMap("AliasId")
        public String aliasId;

        @NameInMap("App")
        public String app;

        @NameInMap("Callback")
        public String callback;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("GbId")
        public String gbId;

        @NameInMap("GbIp")
        public String gbIp;

        @NameInMap("GbPort")
        public Long gbPort;

        @NameInMap("GbTcpPorts")
        public java.util.List<String> gbTcpPorts;

        @NameInMap("GbUdpPorts")
        public java.util.List<String> gbUdpPorts;

        @NameInMap("Id")
        public String id;

        @NameInMap("InProtocol")
        public String inProtocol;

        @NameInMap("LazyPull")
        public Boolean lazyPull;

        @NameInMap("Name")
        public String name;

        @NameInMap("OutProtocol")
        public String outProtocol;

        @NameInMap("PlayDomain")
        public String playDomain;

        @NameInMap("PushDomain")
        public String pushDomain;

        @NameInMap("Region")
        public String region;

        @NameInMap("Stats")
        public DescribeGroupsResponseBodyGroupsStats stats;

        @NameInMap("Status")
        public String status;

        public static DescribeGroupsResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupsResponseBodyGroups self = new DescribeGroupsResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public DescribeGroupsResponseBodyGroups setAliasId(String aliasId) {
            this.aliasId = aliasId;
            return this;
        }
        public String getAliasId() {
            return this.aliasId;
        }

        public DescribeGroupsResponseBodyGroups setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public DescribeGroupsResponseBodyGroups setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public DescribeGroupsResponseBodyGroups setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeGroupsResponseBodyGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeGroupsResponseBodyGroups setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
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

        public DescribeGroupsResponseBodyGroups setGbPort(Long gbPort) {
            this.gbPort = gbPort;
            return this;
        }
        public Long getGbPort() {
            return this.gbPort;
        }

        public DescribeGroupsResponseBodyGroups setGbTcpPorts(java.util.List<String> gbTcpPorts) {
            this.gbTcpPorts = gbTcpPorts;
            return this;
        }
        public java.util.List<String> getGbTcpPorts() {
            return this.gbTcpPorts;
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

        public DescribeGroupsResponseBodyGroups setInProtocol(String inProtocol) {
            this.inProtocol = inProtocol;
            return this;
        }
        public String getInProtocol() {
            return this.inProtocol;
        }

        public DescribeGroupsResponseBodyGroups setLazyPull(Boolean lazyPull) {
            this.lazyPull = lazyPull;
            return this;
        }
        public Boolean getLazyPull() {
            return this.lazyPull;
        }

        public DescribeGroupsResponseBodyGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGroupsResponseBodyGroups setOutProtocol(String outProtocol) {
            this.outProtocol = outProtocol;
            return this;
        }
        public String getOutProtocol() {
            return this.outProtocol;
        }

        public DescribeGroupsResponseBodyGroups setPlayDomain(String playDomain) {
            this.playDomain = playDomain;
            return this;
        }
        public String getPlayDomain() {
            return this.playDomain;
        }

        public DescribeGroupsResponseBodyGroups setPushDomain(String pushDomain) {
            this.pushDomain = pushDomain;
            return this;
        }
        public String getPushDomain() {
            return this.pushDomain;
        }

        public DescribeGroupsResponseBodyGroups setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeGroupsResponseBodyGroups setStats(DescribeGroupsResponseBodyGroupsStats stats) {
            this.stats = stats;
            return this;
        }
        public DescribeGroupsResponseBodyGroupsStats getStats() {
            return this.stats;
        }

        public DescribeGroupsResponseBodyGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
