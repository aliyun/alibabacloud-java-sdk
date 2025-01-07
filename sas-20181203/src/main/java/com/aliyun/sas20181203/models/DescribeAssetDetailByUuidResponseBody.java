// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetDetailByUuidResponseBody extends TeaModel {
    /**
     * <p>The details of the server.</p>
     */
    @NameInMap("AssetDetail")
    public DescribeAssetDetailByUuidResponseBodyAssetDetail assetDetail;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>39031E31-6BBA-5C99-A870-D807E78918CD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAssetDetailByUuidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetDetailByUuidResponseBody self = new DescribeAssetDetailByUuidResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAssetDetailByUuidResponseBody setAssetDetail(DescribeAssetDetailByUuidResponseBodyAssetDetail assetDetail) {
        this.assetDetail = assetDetail;
        return this;
    }
    public DescribeAssetDetailByUuidResponseBodyAssetDetail getAssetDetail() {
        return this.assetDetail;
    }

    public DescribeAssetDetailByUuidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAssetDetailByUuidResponseBodyAssetDetail extends TeaModel {
        /**
         * <p>The type of the asset. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: ECS instance</li>
         * <li><strong>1</strong>: Server Load Balancer (SLB) instance</li>
         * <li><strong>2</strong>: NAT gateway</li>
         * <li><strong>3</strong>: ApsaraDB RDS database</li>
         * <li><strong>4</strong>: ApsaraDB for MongoDB database</li>
         * <li><strong>5</strong>: ApsaraDB for Redis database</li>
         * <li><strong>6</strong>: image</li>
         * <li><strong>7</strong>: container</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <p>The timestamp when Security Center is authorized to protect the asset. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1627974044000</p>
         */
        @NameInMap("AuthModifyTime")
        public Long authModifyTime;

        /**
         * <p>The edition of Security Center that is authorized to protect the asset. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Basic edition (Unauthorized)</li>
         * <li><strong>6</strong>: Anti-virus edition</li>
         * <li><strong>5</strong>: Advanced edition</li>
         * <li><strong>3</strong>: Enterprise edition</li>
         * <li><strong>7</strong>: Ultimate edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("AuthVersion")
        public Integer authVersion;

        /**
         * <p>Indicates whether Security Center is authorized to protect the asset. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Bind")
        public Boolean bind;

        /**
         * <p>The status of the Security Center agent. Valid values:</p>
         * <ul>
         * <li><strong>pause</strong>: The Security Center agent suspends protection for your server.</li>
         * <li><strong>online</strong>: The Security Center agent is protecting your server.</li>
         * <li><strong>offline</strong>: The Security Center agent does not protect your server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("ClientStatus")
        public String clientStatus;

        /**
         * <p>The version of the Security Center agent.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The details of the CPU.</p>
         * 
         * <strong>example:</strong>
         * <p>Intel(R) Xeon(R) Platinum 8163 CPU @ 2.50GHz</p>
         */
        @NameInMap("CpuInfo")
        public String cpuInfo;

        /**
         * <p>The timestamp when Security Center records the details of the server. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1603863599000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>An array that consists of the information about the disk.</p>
         */
        @NameInMap("DiskInfoList")
        public java.util.List<String> diskInfoList;

        /**
         * <p>Indicates whether the asset is provided by Alibaba Cloud. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: yes</li>
         * <li><strong>1</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <p>The group to which the server belongs. By default, the servers that are not grouped belong to the <strong>Default</strong> group.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("GroupTrace")
        public String groupTrace;

        /**
         * <p>The name of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>qewrqwerqs****</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf6h7p2fgk6rkk0g****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-fasdfasdfadfafa****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The IP address that is assigned to the Elastic Compute Service (ECS) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The IP addresses of the server.</p>
         */
        @NameInMap("IpList")
        public java.util.List<String> ipList;

        /**
         * <p>The kernel version of the operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>4.18.0-80.11.2.el8_0.x86_64</p>
         */
        @NameInMap("Kernel")
        public String kernel;

        /**
         * <p>The media access control (MAC) addresses of the server.</p>
         */
        @NameInMap("MacList")
        public java.util.List<String> macList;

        /**
         * <p>The memory size of the server. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>The memory size of the server. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The operating system type of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The operating system version of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>Linux 64bit</p>
         */
        @NameInMap("OsDetail")
        public String osDetail;

        /**
         * <p>The name of the operating system.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("OsName")
        public String osName;

        /**
         * <p>The region in which the server resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-dg-a01</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the region in which the asset resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hanghzou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the region in which the server resides.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Hohhot)</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The operating system information about the server.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS Linux 8.0.1905</p>
         */
        @NameInMap("SysInfo")
        public String sysInfo;

        /**
         * <p>The tag that is added to the server.</p>
         * 
         * <strong>example:</strong>
         * <p>InternetIp</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>9e6cad93-a379-46fd-a701-9bbf02f4****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the server resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1fs3bwonlfq503w****</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static DescribeAssetDetailByUuidResponseBodyAssetDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeAssetDetailByUuidResponseBodyAssetDetail self = new DescribeAssetDetailByUuidResponseBodyAssetDetail();
            return TeaModel.build(map, self);
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setAuthModifyTime(Long authModifyTime) {
            this.authModifyTime = authModifyTime;
            return this;
        }
        public Long getAuthModifyTime() {
            return this.authModifyTime;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setAuthVersion(Integer authVersion) {
            this.authVersion = authVersion;
            return this;
        }
        public Integer getAuthVersion() {
            return this.authVersion;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setBind(Boolean bind) {
            this.bind = bind;
            return this;
        }
        public Boolean getBind() {
            return this.bind;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setClientStatus(String clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }
        public String getClientStatus() {
            return this.clientStatus;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setCpuInfo(String cpuInfo) {
            this.cpuInfo = cpuInfo;
            return this;
        }
        public String getCpuInfo() {
            return this.cpuInfo;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setDiskInfoList(java.util.List<String> diskInfoList) {
            this.diskInfoList = diskInfoList;
            return this;
        }
        public java.util.List<String> getDiskInfoList() {
            return this.diskInfoList;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setFlag(Integer flag) {
            this.flag = flag;
            return this;
        }
        public Integer getFlag() {
            return this.flag;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setGroupTrace(String groupTrace) {
            this.groupTrace = groupTrace;
            return this;
        }
        public String getGroupTrace() {
            return this.groupTrace;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setIpList(java.util.List<String> ipList) {
            this.ipList = ipList;
            return this;
        }
        public java.util.List<String> getIpList() {
            return this.ipList;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setKernel(String kernel) {
            this.kernel = kernel;
            return this;
        }
        public String getKernel() {
            return this.kernel;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setMacList(java.util.List<String> macList) {
            this.macList = macList;
            return this;
        }
        public java.util.List<String> getMacList() {
            return this.macList;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setOsDetail(String osDetail) {
            this.osDetail = osDetail;
            return this;
        }
        public String getOsDetail() {
            return this.osDetail;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setOsName(String osName) {
            this.osName = osName;
            return this;
        }
        public String getOsName() {
            return this.osName;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setSysInfo(String sysInfo) {
            this.sysInfo = sysInfo;
            return this;
        }
        public String getSysInfo() {
            return this.sysInfo;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeAssetDetailByUuidResponseBodyAssetDetail setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

}
