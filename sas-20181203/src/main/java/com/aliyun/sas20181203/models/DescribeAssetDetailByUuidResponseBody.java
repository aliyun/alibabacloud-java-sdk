// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetDetailByUuidResponseBody extends TeaModel {
    /**
     * <p>The kernel version of the operating system.</p>
     */
    @NameInMap("AssetDetail")
    public DescribeAssetDetailByUuidResponseBodyAssetDetail assetDetail;

    /**
     * <p>The timestamp when Security Center records the details of the server. Unit: milliseconds.</p>
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
         * <p>The name of the region in which the server resides.</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <p>The operating system information about the server.</p>
         */
        @NameInMap("AuthModifyTime")
        public Long authModifyTime;

        /**
         * <p>The name of the host.</p>
         */
        @NameInMap("AuthVersion")
        public Integer authVersion;

        /**
         * <p>The memory size of the server. Unit: MB.</p>
         */
        @NameInMap("Bind")
        public Boolean bind;

        /**
         * <p>The name of the server.</p>
         */
        @NameInMap("ClientStatus")
        public String clientStatus;

        /**
         * <p>An array that consists of the information about the disk.</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The IP addresses of the server.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>Indicates whether Security Center is authorized to protect the asset. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("CpuInfo")
        public String cpuInfo;

        /**
         * <p>The status of the Security Center agent. Valid values:</p>
         * <br>
         * <p>*   **pause**: The Security Center agent suspends protection for your server.</p>
         * <p>*   **online**: The Security Center agent is protecting your server.</p>
         * <p>*   **offline**: The Security Center agent does not protect your server.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DiskInfoList")
        public java.util.List<String> diskInfoList;

        /**
         * <p>The MAC addresses of the server.</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <p>The ID of the server.</p>
         */
        @NameInMap("GroupTrace")
        public String groupTrace;

        /**
         * <p>The type of the asset. Valid values:</p>
         * <br>
         * <p>*   **0**: ECS instance</p>
         * <p>*   **1**: Server Load Balancer (SLB) instance</p>
         * <p>*   **2**: NAT gateway</p>
         * <p>*   **3**: ApsaraDB RDS database</p>
         * <p>*   **4**: ApsaraDB for MongoDB database</p>
         * <p>*   **5**: ApsaraDB for Redis database</p>
         * <p>*   **6**: image</p>
         * <p>*   **7**: container</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The UUID of the server.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The operating system type of the server.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The name of the operating system.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The number of CPU cores.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The private IP address of the server.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The information about the disk. This parameter contains the following fields:</p>
         * <br>
         * <p>*   **diskName**: the name of the disk.</p>
         * <p>*   **totalSize**: the total amount of the disk space. Unit: GB.</p>
         * <p>*   **useSize**: the amount of the used disk space. Unit: GB.</p>
         * <p>*   **useSizeByte**: the amount of the used disk space. Unit: bytes.</p>
         * <p>*   **totalSizeByte**: the total amount of the disk space. Unit: bytes.</p>
         */
        @NameInMap("IpList")
        public java.util.List<String> ipList;

        /**
         * <p>The memory size of the server. Unit: GB.</p>
         */
        @NameInMap("Kernel")
        public String kernel;

        @NameInMap("MacList")
        public java.util.List<String> macList;

        /**
         * <p>The region in which the server resides.</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>The group to which the server belongs. By default, the servers that are not grouped belong to the **Default** group.</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The ID of the region in which the asset resides.</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The tag that is added to the server.</p>
         */
        @NameInMap("OsDetail")
        public String osDetail;

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the server resides.</p>
         */
        @NameInMap("OsName")
        public String osName;

        /**
         * <p>The timestamp when Security Center is authorized to protect the asset. Unit: milliseconds.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>Indicates whether the asset is provided by Alibaba Cloud. Valid values:</p>
         * <br>
         * <p>*   **0**: yes</p>
         * <p>*   **1**: no</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The media access control (MAC) addresses of the server.</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The version of the Security Center agent.</p>
         */
        @NameInMap("SysInfo")
        public String sysInfo;

        /**
         * <p>The edition of Security Center that is authorized to protect the asset. Valid values:</p>
         * <br>
         * <p>*   **1**: Basic edition (Unauthorized)</p>
         * <p>*   **6**: Anti-virus edition</p>
         * <p>*   **5**: Advanced edition</p>
         * <p>*   **3**: Enterprise edition</p>
         * <p>*   **7**: Ultimate edition</p>
         * <p>*   **10**: Value-added Plan edition</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The IP addresses of the server.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The IP address that is assigned to the Elastic Compute Service (ECS) instance.</p>
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
