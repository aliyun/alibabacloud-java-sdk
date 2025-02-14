// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetDetailByUuidResponseBody extends TeaModel {
    /**
     * <p>The details of the server.</p>
     */
    @NameInMap("AssetDetail")
    public GetAssetDetailByUuidResponseBodyAssetDetail assetDetail;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4892B68B-47BC-5E56-B327-9C2ACC6C1C09</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAssetDetailByUuidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAssetDetailByUuidResponseBody self = new GetAssetDetailByUuidResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAssetDetailByUuidResponseBody setAssetDetail(GetAssetDetailByUuidResponseBodyAssetDetail assetDetail) {
        this.assetDetail = assetDetail;
        return this;
    }
    public GetAssetDetailByUuidResponseBodyAssetDetail getAssetDetail() {
        return this.assetDetail;
    }

    public GetAssetDetailByUuidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAssetDetailByUuidResponseBodyAssetDetailDiskInfoList extends TeaModel {
        /**
         * <p>The name of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/vda1</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The total disk space. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        /**
         * <p>The total disk space. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>42140479488</p>
         */
        @NameInMap("TotalSizeByte")
        public Long totalSizeByte;

        /**
         * <p>The amount of the used disk space. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UseSize")
        public Long useSize;

        /**
         * <p>The amount of the used disk space. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2998996992</p>
         */
        @NameInMap("UseSizeByte")
        public Long useSizeByte;

        public static GetAssetDetailByUuidResponseBodyAssetDetailDiskInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetAssetDetailByUuidResponseBodyAssetDetailDiskInfoList self = new GetAssetDetailByUuidResponseBodyAssetDetailDiskInfoList();
            return TeaModel.build(map, self);
        }

        public GetAssetDetailByUuidResponseBodyAssetDetailDiskInfoList setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetailDiskInfoList setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetailDiskInfoList setTotalSizeByte(Long totalSizeByte) {
            this.totalSizeByte = totalSizeByte;
            return this;
        }
        public Long getTotalSizeByte() {
            return this.totalSizeByte;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetailDiskInfoList setUseSize(Long useSize) {
            this.useSize = useSize;
            return this;
        }
        public Long getUseSize() {
            return this.useSize;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetailDiskInfoList setUseSizeByte(Long useSizeByte) {
            this.useSizeByte = useSizeByte;
            return this;
        }
        public Long getUseSizeByte() {
            return this.useSizeByte;
        }

    }

    public static class GetAssetDetailByUuidResponseBodyAssetDetail extends TeaModel {
        /**
         * <p>The type of the server. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: ECS instance</li>
         * <li><strong>1</strong>: Server Load Balancer (SLB) instance</li>
         * <li><strong>2</strong>: NAT gateway</li>
         * <li><strong>3</strong>: ApsaraDB RDS instance</li>
         * <li><strong>4</strong>: ApsaraDB for MongoDB instance</li>
         * <li><strong>5</strong>: ApsaraDB for Redis instance</li>
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
         * <p>The edition of Security Center that is authorized to protect the server. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Basic (Unauthorized).</li>
         * <li><strong>6</strong>: Anti-virus.</li>
         * <li><strong>5</strong>: Advanced.</li>
         * <li><strong>3</strong>: Enterprise.</li>
         * <li><strong>7</strong>: Ultimate.</li>
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
         * <li><strong>true</strong>: Security Center is authorized to protect the asset.</li>
         * <li><strong>false</strong>: Security Center is not authorized to protect the asset.</li>
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
         * <li><strong>pause</strong>: The Security Center agent stops protecting your server.</li>
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
         * <p>The sub-status of the Security Center agent on the server. Valid values:</p>
         * <ul>
         * <li><strong>online</strong>: The Security Center agent on the asset is <strong>enabled</strong>.</li>
         * <li><strong>offline</strong>: The Security Center agent on the asset is <strong>disabled</strong>.</li>
         * <li><strong>pause</strong>: The Security Center agent is <strong>suspended</strong>.</li>
         * <li><strong>uninstalled</strong>: The Security Center agent is <strong>not installed</strong>.</li>
         * <li><strong>stopped</strong>: The asset is <strong>shut down</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("ClientSubStatus")
        public String clientSubStatus;

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
         * <p>The list of information about the disk.</p>
         */
        @NameInMap("DiskInfoList")
        public java.util.List<GetAssetDetailByUuidResponseBodyAssetDetailDiskInfoList> diskInfoList;

        /**
         * <p>Indicates whether the asset is provided by Alibaba Cloud. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The server is provided by Alibaba Cloud.</li>
         * <li><strong>1</strong>: The server is not provided by Alibaba Cloud.</li>
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
         * <p>120.47.XX.XX</p>
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
         * <p>120.47.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>An array that consists of the IP addresses of the server.</p>
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
         * <p>An array that consists of the media access control (MAC) addresses of the server.</p>
         */
        @NameInMap("MacList")
        public java.util.List<String> macList;

        /**
         * <p>The memory size of the server. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>The memory size of the server. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>16384</p>
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
         * <p>The name of the operating system that the server runs.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS  7.4 64bit</p>
         */
        @NameInMap("OsName")
        public String osName;

        /**
         * <p>The region in which the server resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
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
         * <p>The account to which the AccessKey pair belongs.</p>
         * <blockquote>
         * <p> This parameter is returned only by third-party cloud servers. If the parameter value is empty, it will not be returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("VendorAuthAlias")
        public String vendorAuthAlias;

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the server resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1fs3bwonlfq503w****</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static GetAssetDetailByUuidResponseBodyAssetDetail build(java.util.Map<String, ?> map) throws Exception {
            GetAssetDetailByUuidResponseBodyAssetDetail self = new GetAssetDetailByUuidResponseBodyAssetDetail();
            return TeaModel.build(map, self);
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setAuthModifyTime(Long authModifyTime) {
            this.authModifyTime = authModifyTime;
            return this;
        }
        public Long getAuthModifyTime() {
            return this.authModifyTime;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setAuthVersion(Integer authVersion) {
            this.authVersion = authVersion;
            return this;
        }
        public Integer getAuthVersion() {
            return this.authVersion;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setBind(Boolean bind) {
            this.bind = bind;
            return this;
        }
        public Boolean getBind() {
            return this.bind;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setClientStatus(String clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }
        public String getClientStatus() {
            return this.clientStatus;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setClientSubStatus(String clientSubStatus) {
            this.clientSubStatus = clientSubStatus;
            return this;
        }
        public String getClientSubStatus() {
            return this.clientSubStatus;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setCpuInfo(String cpuInfo) {
            this.cpuInfo = cpuInfo;
            return this;
        }
        public String getCpuInfo() {
            return this.cpuInfo;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setDiskInfoList(java.util.List<GetAssetDetailByUuidResponseBodyAssetDetailDiskInfoList> diskInfoList) {
            this.diskInfoList = diskInfoList;
            return this;
        }
        public java.util.List<GetAssetDetailByUuidResponseBodyAssetDetailDiskInfoList> getDiskInfoList() {
            return this.diskInfoList;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setFlag(Integer flag) {
            this.flag = flag;
            return this;
        }
        public Integer getFlag() {
            return this.flag;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setGroupTrace(String groupTrace) {
            this.groupTrace = groupTrace;
            return this;
        }
        public String getGroupTrace() {
            return this.groupTrace;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setIpList(java.util.List<String> ipList) {
            this.ipList = ipList;
            return this;
        }
        public java.util.List<String> getIpList() {
            return this.ipList;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setKernel(String kernel) {
            this.kernel = kernel;
            return this;
        }
        public String getKernel() {
            return this.kernel;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setMacList(java.util.List<String> macList) {
            this.macList = macList;
            return this;
        }
        public java.util.List<String> getMacList() {
            return this.macList;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setOsDetail(String osDetail) {
            this.osDetail = osDetail;
            return this;
        }
        public String getOsDetail() {
            return this.osDetail;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setOsName(String osName) {
            this.osName = osName;
            return this;
        }
        public String getOsName() {
            return this.osName;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setSysInfo(String sysInfo) {
            this.sysInfo = sysInfo;
            return this;
        }
        public String getSysInfo() {
            return this.sysInfo;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setVendorAuthAlias(String vendorAuthAlias) {
            this.vendorAuthAlias = vendorAuthAlias;
            return this;
        }
        public String getVendorAuthAlias() {
            return this.vendorAuthAlias;
        }

        public GetAssetDetailByUuidResponseBodyAssetDetail setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

}
