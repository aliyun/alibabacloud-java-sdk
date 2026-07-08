// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDeviceResponseBody extends TeaModel {
    /**
     * <p>Subscribed GB alarm method. Valid values:</p>
     * <ul>
     * <li><p>0 (all)</p>
     * </li>
     * <li><p>5 (video alarm)</p>
     * </li>
     * <li><p>7 (other alarms)</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>An empty value means no subscription.</p>
     * </li>
     * <li><p>Multiple values are supported, separated by commas (,).</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("AlarmMethod")
    public String alarmMethod;

    @NameInMap("AutoDirectory")
    public Boolean autoDirectory;

    /**
     * <p>Indicates whether device location subscription is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPos")
    public Boolean autoPos;

    /**
     * <p>Automatically start the stream.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoStart")
    public Boolean autoStart;

    /**
     * <p>Channel synchronization time.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-02-28T17:01:17Z</p>
     */
    @NameInMap("ChannelSyncTime")
    public String channelSyncTime;

    /**
     * <p>Device creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-02-28T17:00:17Z</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>Device description.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx路口摄像头</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Directory information.</p>
     */
    @NameInMap("Directory")
    public DescribeDeviceResponseBodyDirectory directory;

    /**
     * <p>Directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3238848****092994-cn-qingdao</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>Device serial number.</p>
     * 
     * <strong>example:</strong>
     * <p>7D0*****4C0</p>
     */
    @NameInMap("Dsn")
    public String dsn;

    /**
     * <p>Whether the device is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>GB device ID.</p>
     * <blockquote>
     * <p>This applies only to GB protocols.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>31000000****00000002</p>
     */
    @NameInMap("GbId")
    public String gbId;

    /**
     * <p>Space ID to which the device belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>3238848****092994-cn-qingdao</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Device ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3238848****092996-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Device IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.10</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>Device latitude.</p>
     * 
     * <strong>example:</strong>
     * <p>119.20</p>
     */
    @NameInMap("Latitude")
    public String latitude;

    /**
     * <p>Device longitude.</p>
     * 
     * <strong>example:</strong>
     * <p>45.00</p>
     */
    @NameInMap("Longitude")
    public String longitude;

    /**
     * <p>Device name.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx路口摄像头</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Other device parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>Parent device ID. For example, the platform ID to which a camera belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>3238848****092995-cn-qingdao</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>Device password.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Device port.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("Port")
    public Long port;

    /**
     * <p>Position subscription interval, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("PosInterval")
    public Long posInterval;

    /**
     * <p>Device registration protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>gb28181</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>Device registration time.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-02-28T17:00:17Z</p>
     */
    @NameInMap("RegisteredTime")
    public String registeredTime;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Device stream statistics.</p>
     */
    @NameInMap("Stats")
    public DescribeDeviceResponseBodyStats stats;

    /**
     * <p>Device status. Valid values:</p>
     * <ul>
     * <li><p>on (online)</p>
     * </li>
     * <li><p>off (offline)</p>
     * </li>
     * <li><p>failed (locked)</p>
     * </li>
     * <li><p>new (unregistered)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Device type. Valid values:</p>
     * <ul>
     * <li><p>ipc (camera)</p>
     * </li>
     * <li><p>platform (platform)</p>
     * </li>
     * <li><p>ied (intelligent device)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ipc</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Stream URL on the device.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://xxx/xxx</p>
     */
    @NameInMap("Url")
    public String url;

    /**
     * <p>Device username.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>Device vendor.</p>
     * 
     * <strong>example:</strong>
     * <p>公司A</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static DescribeDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceResponseBody self = new DescribeDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceResponseBody setAlarmMethod(String alarmMethod) {
        this.alarmMethod = alarmMethod;
        return this;
    }
    public String getAlarmMethod() {
        return this.alarmMethod;
    }

    public DescribeDeviceResponseBody setAutoDirectory(Boolean autoDirectory) {
        this.autoDirectory = autoDirectory;
        return this;
    }
    public Boolean getAutoDirectory() {
        return this.autoDirectory;
    }

    public DescribeDeviceResponseBody setAutoPos(Boolean autoPos) {
        this.autoPos = autoPos;
        return this;
    }
    public Boolean getAutoPos() {
        return this.autoPos;
    }

    public DescribeDeviceResponseBody setAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    public DescribeDeviceResponseBody setChannelSyncTime(String channelSyncTime) {
        this.channelSyncTime = channelSyncTime;
        return this;
    }
    public String getChannelSyncTime() {
        return this.channelSyncTime;
    }

    public DescribeDeviceResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeDeviceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDeviceResponseBody setDirectory(DescribeDeviceResponseBodyDirectory directory) {
        this.directory = directory;
        return this;
    }
    public DescribeDeviceResponseBodyDirectory getDirectory() {
        return this.directory;
    }

    public DescribeDeviceResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public DescribeDeviceResponseBody setDsn(String dsn) {
        this.dsn = dsn;
        return this;
    }
    public String getDsn() {
        return this.dsn;
    }

    public DescribeDeviceResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public DescribeDeviceResponseBody setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public DescribeDeviceResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDeviceResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeDeviceResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeDeviceResponseBody setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public DescribeDeviceResponseBody setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public DescribeDeviceResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeDeviceResponseBody setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public DescribeDeviceResponseBody setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public DescribeDeviceResponseBody setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public DescribeDeviceResponseBody setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public DescribeDeviceResponseBody setPosInterval(Long posInterval) {
        this.posInterval = posInterval;
        return this;
    }
    public Long getPosInterval() {
        return this.posInterval;
    }

    public DescribeDeviceResponseBody setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public DescribeDeviceResponseBody setRegisteredTime(String registeredTime) {
        this.registeredTime = registeredTime;
        return this;
    }
    public String getRegisteredTime() {
        return this.registeredTime;
    }

    public DescribeDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceResponseBody setStats(DescribeDeviceResponseBodyStats stats) {
        this.stats = stats;
        return this;
    }
    public DescribeDeviceResponseBodyStats getStats() {
        return this.stats;
    }

    public DescribeDeviceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDeviceResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeDeviceResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public DescribeDeviceResponseBody setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public DescribeDeviceResponseBody setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public static class DescribeDeviceResponseBodyDirectory extends TeaModel {
        /**
         * <p>Directory creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-28T17:00:17Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>Directory description.</p>
         * 
         * <strong>example:</strong>
         * <p>目录1</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Space ID to which the directory belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>3238848****092994-cn-qingdao</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>Directory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3238848****092994-cn-qingdao</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Directory name.</p>
         * 
         * <strong>example:</strong>
         * <p>目录1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Parent directory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3238848****092995-cn-qingdao</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        public static DescribeDeviceResponseBodyDirectory build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceResponseBodyDirectory self = new DescribeDeviceResponseBodyDirectory();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceResponseBodyDirectory setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeDeviceResponseBodyDirectory setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeviceResponseBodyDirectory setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDeviceResponseBodyDirectory setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDeviceResponseBodyDirectory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDeviceResponseBodyDirectory setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

    }

    public static class DescribeDeviceResponseBodyStats extends TeaModel {
        /**
         * <p>Number of channels.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ChannelNum")
        public Long channelNum;

        /**
         * <p>Number of failed streams.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FailedNum")
        public Long failedNum;

        /**
         * <p>Number of offline streams.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OfflineNum")
        public Long offlineNum;

        /**
         * <p>Number of online streams.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OnlineNum")
        public Long onlineNum;

        /**
         * <p>Number of streams.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StreamNum")
        public Long streamNum;

        public static DescribeDeviceResponseBodyStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceResponseBodyStats self = new DescribeDeviceResponseBodyStats();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceResponseBodyStats setChannelNum(Long channelNum) {
            this.channelNum = channelNum;
            return this;
        }
        public Long getChannelNum() {
            return this.channelNum;
        }

        public DescribeDeviceResponseBodyStats setFailedNum(Long failedNum) {
            this.failedNum = failedNum;
            return this;
        }
        public Long getFailedNum() {
            return this.failedNum;
        }

        public DescribeDeviceResponseBodyStats setOfflineNum(Long offlineNum) {
            this.offlineNum = offlineNum;
            return this;
        }
        public Long getOfflineNum() {
            return this.offlineNum;
        }

        public DescribeDeviceResponseBodyStats setOnlineNum(Long onlineNum) {
            this.onlineNum = onlineNum;
            return this;
        }
        public Long getOnlineNum() {
            return this.onlineNum;
        }

        public DescribeDeviceResponseBodyStats setStreamNum(Long streamNum) {
            this.streamNum = streamNum;
            return this;
        }
        public Long getStreamNum() {
            return this.streamNum;
        }

    }

}
