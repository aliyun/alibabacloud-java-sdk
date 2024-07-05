// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>337639*****24964-cn-qingdao</p>
     */
    @NameInMap("AliasId")
    public String aliasId;

    /**
     * <strong>example:</strong>
     * <p>live</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <strong>example:</strong>
     * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
     */
    @NameInMap("Callback")
    public String callback;

    /**
     * <strong>example:</strong>
     * <p>2019-02-28T17:00:17Z</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <strong>example:</strong>
     * <p>3100000*****0000001</p>
     */
    @NameInMap("GbId")
    public String gbId;

    /**
     * <strong>example:</strong>
     * <p>10.10.10.10</p>
     */
    @NameInMap("GbIp")
    public String gbIp;

    /**
     * <strong>example:</strong>
     * <p>5060</p>
     */
    @NameInMap("GbPort")
    public Long gbPort;

    @NameInMap("GbTcpPorts")
    public java.util.List<String> gbTcpPorts;

    @NameInMap("GbUdpPorts")
    public java.util.List<String> gbUdpPorts;

    /**
     * <strong>example:</strong>
     * <p>337639****224964-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>gb28181</p>
     */
    @NameInMap("InProtocol")
    public String inProtocol;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LazyPull")
    public Boolean lazyPull;

    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>flv,hls,rtmp</p>
     */
    @NameInMap("OutProtocol")
    public String outProtocol;

    /**
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("PlayDomain")
    public String playDomain;

    /**
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com</p>
     */
    @NameInMap("PushDomain")
    public String pushDomain;

    /**
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Stats")
    public DescribeGroupResponseBodyStats stats;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupResponseBody self = new DescribeGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupResponseBody setAliasId(String aliasId) {
        this.aliasId = aliasId;
        return this;
    }
    public String getAliasId() {
        return this.aliasId;
    }

    public DescribeGroupResponseBody setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DescribeGroupResponseBody setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public DescribeGroupResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeGroupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeGroupResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
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

    public DescribeGroupResponseBody setGbPort(Long gbPort) {
        this.gbPort = gbPort;
        return this;
    }
    public Long getGbPort() {
        return this.gbPort;
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

    public DescribeGroupResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeGroupResponseBody setInProtocol(String inProtocol) {
        this.inProtocol = inProtocol;
        return this;
    }
    public String getInProtocol() {
        return this.inProtocol;
    }

    public DescribeGroupResponseBody setLazyPull(Boolean lazyPull) {
        this.lazyPull = lazyPull;
        return this;
    }
    public Boolean getLazyPull() {
        return this.lazyPull;
    }

    public DescribeGroupResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeGroupResponseBody setOutProtocol(String outProtocol) {
        this.outProtocol = outProtocol;
        return this;
    }
    public String getOutProtocol() {
        return this.outProtocol;
    }

    public DescribeGroupResponseBody setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }
    public String getPlayDomain() {
        return this.playDomain;
    }

    public DescribeGroupResponseBody setPushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
        return this;
    }
    public String getPushDomain() {
        return this.pushDomain;
    }

    public DescribeGroupResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupResponseBody setStats(DescribeGroupResponseBodyStats stats) {
        this.stats = stats;
        return this;
    }
    public DescribeGroupResponseBodyStats getStats() {
        return this.stats;
    }

    public DescribeGroupResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeGroupResponseBodyStats extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("DeviceNum")
        public Long deviceNum;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IedNum")
        public Long iedNum;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("IpcNum")
        public Long ipcNum;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PlatformNum")
        public Long platformNum;

        public static DescribeGroupResponseBodyStats build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupResponseBodyStats self = new DescribeGroupResponseBodyStats();
            return TeaModel.build(map, self);
        }

        public DescribeGroupResponseBodyStats setDeviceNum(Long deviceNum) {
            this.deviceNum = deviceNum;
            return this;
        }
        public Long getDeviceNum() {
            return this.deviceNum;
        }

        public DescribeGroupResponseBodyStats setIedNum(Long iedNum) {
            this.iedNum = iedNum;
            return this;
        }
        public Long getIedNum() {
            return this.iedNum;
        }

        public DescribeGroupResponseBodyStats setIpcNum(Long ipcNum) {
            this.ipcNum = ipcNum;
            return this;
        }
        public Long getIpcNum() {
            return this.ipcNum;
        }

        public DescribeGroupResponseBodyStats setPlatformNum(Long platformNum) {
            this.platformNum = platformNum;
            return this;
        }
        public Long getPlatformNum() {
            return this.platformNum;
        }

    }

}
