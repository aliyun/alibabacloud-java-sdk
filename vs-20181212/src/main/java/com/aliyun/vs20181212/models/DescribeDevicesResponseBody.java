// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDevicesResponseBody extends TeaModel {
    @NameInMap("Devices")
    public java.util.List<DescribeDevicesResponseBodyDevices> devices;

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

    public static DescribeDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDevicesResponseBody self = new DescribeDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDevicesResponseBody setDevices(java.util.List<DescribeDevicesResponseBodyDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<DescribeDevicesResponseBodyDevices> getDevices() {
        return this.devices;
    }

    public DescribeDevicesResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public DescribeDevicesResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeDevicesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDevicesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDevicesResponseBodyDevicesDirectory extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentId")
        public String parentId;

        public static DescribeDevicesResponseBodyDevicesDirectory build(java.util.Map<String, ?> map) throws Exception {
            DescribeDevicesResponseBodyDevicesDirectory self = new DescribeDevicesResponseBodyDevicesDirectory();
            return TeaModel.build(map, self);
        }

        public DescribeDevicesResponseBodyDevicesDirectory setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeDevicesResponseBodyDevicesDirectory setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDevicesResponseBodyDevicesDirectory setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDevicesResponseBodyDevicesDirectory setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDevicesResponseBodyDevicesDirectory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDevicesResponseBodyDevicesDirectory setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

    }

    public static class DescribeDevicesResponseBodyDevicesStats extends TeaModel {
        @NameInMap("ChannelNum")
        public Long channelNum;

        @NameInMap("FailedNum")
        public Long failedNum;

        @NameInMap("OfflineNum")
        public Long offlineNum;

        @NameInMap("OnlineNum")
        public Long onlineNum;

        @NameInMap("StreamNum")
        public Long streamNum;

        public static DescribeDevicesResponseBodyDevicesStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeDevicesResponseBodyDevicesStats self = new DescribeDevicesResponseBodyDevicesStats();
            return TeaModel.build(map, self);
        }

        public DescribeDevicesResponseBodyDevicesStats setChannelNum(Long channelNum) {
            this.channelNum = channelNum;
            return this;
        }
        public Long getChannelNum() {
            return this.channelNum;
        }

        public DescribeDevicesResponseBodyDevicesStats setFailedNum(Long failedNum) {
            this.failedNum = failedNum;
            return this;
        }
        public Long getFailedNum() {
            return this.failedNum;
        }

        public DescribeDevicesResponseBodyDevicesStats setOfflineNum(Long offlineNum) {
            this.offlineNum = offlineNum;
            return this;
        }
        public Long getOfflineNum() {
            return this.offlineNum;
        }

        public DescribeDevicesResponseBodyDevicesStats setOnlineNum(Long onlineNum) {
            this.onlineNum = onlineNum;
            return this;
        }
        public Long getOnlineNum() {
            return this.onlineNum;
        }

        public DescribeDevicesResponseBodyDevicesStats setStreamNum(Long streamNum) {
            this.streamNum = streamNum;
            return this;
        }
        public Long getStreamNum() {
            return this.streamNum;
        }

    }

    public static class DescribeDevicesResponseBodyDevices extends TeaModel {
        @NameInMap("AlarmMethod")
        public String alarmMethod;

        @NameInMap("AutoDirectory")
        public Boolean autoDirectory;

        @NameInMap("AutoPos")
        public Boolean autoPos;

        @NameInMap("AutoStart")
        public Boolean autoStart;

        @NameInMap("ChannelSyncTime")
        public String channelSyncTime;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Directory")
        public DescribeDevicesResponseBodyDevicesDirectory directory;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("Dsn")
        public String dsn;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("GbId")
        public String gbId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Latitude")
        public String latitude;

        @NameInMap("Longitude")
        public String longitude;

        @NameInMap("Name")
        public String name;

        @NameInMap("Params")
        public String params;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("Password")
        public String password;

        @NameInMap("Port")
        public Long port;

        @NameInMap("PosInterval")
        public Long posInterval;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("RegisteredTime")
        public String registeredTime;

        @NameInMap("Stats")
        public DescribeDevicesResponseBodyDevicesStats stats;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        @NameInMap("Username")
        public String username;

        @NameInMap("Vendor")
        public String vendor;

        public static DescribeDevicesResponseBodyDevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeDevicesResponseBodyDevices self = new DescribeDevicesResponseBodyDevices();
            return TeaModel.build(map, self);
        }

        public DescribeDevicesResponseBodyDevices setAlarmMethod(String alarmMethod) {
            this.alarmMethod = alarmMethod;
            return this;
        }
        public String getAlarmMethod() {
            return this.alarmMethod;
        }

        public DescribeDevicesResponseBodyDevices setAutoDirectory(Boolean autoDirectory) {
            this.autoDirectory = autoDirectory;
            return this;
        }
        public Boolean getAutoDirectory() {
            return this.autoDirectory;
        }

        public DescribeDevicesResponseBodyDevices setAutoPos(Boolean autoPos) {
            this.autoPos = autoPos;
            return this;
        }
        public Boolean getAutoPos() {
            return this.autoPos;
        }

        public DescribeDevicesResponseBodyDevices setAutoStart(Boolean autoStart) {
            this.autoStart = autoStart;
            return this;
        }
        public Boolean getAutoStart() {
            return this.autoStart;
        }

        public DescribeDevicesResponseBodyDevices setChannelSyncTime(String channelSyncTime) {
            this.channelSyncTime = channelSyncTime;
            return this;
        }
        public String getChannelSyncTime() {
            return this.channelSyncTime;
        }

        public DescribeDevicesResponseBodyDevices setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeDevicesResponseBodyDevices setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDevicesResponseBodyDevices setDirectory(DescribeDevicesResponseBodyDevicesDirectory directory) {
            this.directory = directory;
            return this;
        }
        public DescribeDevicesResponseBodyDevicesDirectory getDirectory() {
            return this.directory;
        }

        public DescribeDevicesResponseBodyDevices setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeDevicesResponseBodyDevices setDsn(String dsn) {
            this.dsn = dsn;
            return this;
        }
        public String getDsn() {
            return this.dsn;
        }

        public DescribeDevicesResponseBodyDevices setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeDevicesResponseBodyDevices setGbId(String gbId) {
            this.gbId = gbId;
            return this;
        }
        public String getGbId() {
            return this.gbId;
        }

        public DescribeDevicesResponseBodyDevices setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDevicesResponseBodyDevices setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDevicesResponseBodyDevices setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeDevicesResponseBodyDevices setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public DescribeDevicesResponseBodyDevices setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public DescribeDevicesResponseBodyDevices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDevicesResponseBodyDevices setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public DescribeDevicesResponseBodyDevices setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeDevicesResponseBodyDevices setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeDevicesResponseBodyDevices setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public DescribeDevicesResponseBodyDevices setPosInterval(Long posInterval) {
            this.posInterval = posInterval;
            return this;
        }
        public Long getPosInterval() {
            return this.posInterval;
        }

        public DescribeDevicesResponseBodyDevices setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeDevicesResponseBodyDevices setRegisteredTime(String registeredTime) {
            this.registeredTime = registeredTime;
            return this;
        }
        public String getRegisteredTime() {
            return this.registeredTime;
        }

        public DescribeDevicesResponseBodyDevices setStats(DescribeDevicesResponseBodyDevicesStats stats) {
            this.stats = stats;
            return this;
        }
        public DescribeDevicesResponseBodyDevicesStats getStats() {
            return this.stats;
        }

        public DescribeDevicesResponseBodyDevices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDevicesResponseBodyDevices setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDevicesResponseBodyDevices setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeDevicesResponseBodyDevices setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public DescribeDevicesResponseBodyDevices setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
