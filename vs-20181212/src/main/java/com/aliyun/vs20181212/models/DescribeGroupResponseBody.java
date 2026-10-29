// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeGroupResponseBody extends TeaModel {
    /**
     * <p>The alias of the workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>337639*****24964-cn-qingdao</p>
     */
    @NameInMap("AliasId")
    public String aliasId;

    /**
     * <p>The name of the application used by the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>live</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The callback triggered when the device status in the workspace is updated.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
     */
    @NameInMap("Callback")
    public String callback;

    /**
     * <p>The time when the workspace was created. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-02-28T17:00:17Z</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The workspace description.</p>
     * 
     * <strong>example:</strong>
     * <p>Shanghai Expressway Monitoring</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether the workspace is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The GB/T 28181 ID associated with the workspace.</p>
     * <blockquote>
     * <p>This parameter is applicable only to workspaces that are accessed by using the GB/T 28181 protocol.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3100000*****0000001</p>
     */
    @NameInMap("GbId")
    public String gbId;

    /**
     * <p>The IP address of the GB/T 28181 signaling server associated with the workspace.</p>
     * <blockquote>
     * <p>This parameter is applicable only to workspaces that are accessed by using the GB/T 28181 protocol.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.10</p>
     */
    @NameInMap("GbIp")
    public String gbIp;

    /**
     * <p>The server port of the GB/T 28181 signaling server associated with the workspace.</p>
     * <blockquote>
     * <p>This parameter is applicable only to workspaces that are accessed by using the GB/T 28181 protocol.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5060</p>
     */
    @NameInMap("GbPort")
    public Long gbPort;

    /**
     * <p>The TCP port of the GB/T 28181 signaling server provided by the workspace.</p>
     * <blockquote>
     * <p>This parameter is applicable only to workspaces that are accessed by using the GB/T 28181 protocol.</p>
     * </blockquote>
     */
    @NameInMap("GbTcpPorts")
    public java.util.List<String> gbTcpPorts;

    /**
     * <p>The UDP port of the GB/T 28181 signaling server provided by the workspace.</p>
     * <blockquote>
     * <p>This parameter is applicable only to workspaces that are accessed by using the GB/T 28181 protocol.</p>
     * </blockquote>
     */
    @NameInMap("GbUdpPorts")
    public java.util.List<String> gbUdpPorts;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>337639****224964-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The access protocol used by the workspace. Valid values:</p>
     * <ul>
     * <li>gb28181</li>
     * <li>rtmp</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>gb28181</p>
     */
    @NameInMap("InProtocol")
    public String inProtocol;

    /**
     * <p>Indicates whether on-demand stream pulling is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LazyPull")
    public Boolean lazyPull;

    /**
     * <p>The workspace name.</p>
     * 
     * <strong>example:</strong>
     * <p>Shanghai Expressway Monitoring</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The playback protocol used by the workspace. Valid values:</p>
     * <ul>
     * <li>flv</li>
     * <li>hls</li>
     * <li>rtmp<blockquote>
     * <p>You can specify multiple values. Separate multiple values with commas (,).</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>flv,hls,rtmp</p>
     */
    @NameInMap("OutProtocol")
    public String outProtocol;

    /**
     * <p>The streaming domain name used by the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("PlayDomain")
    public String playDomain;

    /**
     * <p>The ingest domain name used by the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com</p>
     */
    @NameInMap("PushDomain")
    public String pushDomain;

    /**
     * <p>The region to which the workspace belongs, which is the service center.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistics information of the devices in the workspace.</p>
     */
    @NameInMap("Stats")
    public DescribeGroupResponseBodyStats stats;

    /**
     * <p>The workspace status.</p>
     * 
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
         * <p>The total number of devices in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("DeviceNum")
        public Long deviceNum;

        /**
         * <p>The number of intelligent devices in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IedNum")
        public Long iedNum;

        /**
         * <p>The number of cameras in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("IpcNum")
        public Long ipcNum;

        /**
         * <p>The number of platforms in the workspace.</p>
         * 
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
