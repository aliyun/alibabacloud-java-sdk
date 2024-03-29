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
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The total disk space. Unit: GB.</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        /**
         * <p>The total disk space. Unit: bytes.</p>
         */
        @NameInMap("TotalSizeByte")
        public Long totalSizeByte;

        /**
         * <p>The amount of the used disk space. Unit: GB.</p>
         */
        @NameInMap("UseSize")
        public Long useSize;

        /**
         * <p>The amount of the used disk space. Unit: bytes.</p>
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
         * <br>
         * <p>*   **0**: ECS instance</p>
         * <p>*   **1**: Server Load Balancer (SLB) instance</p>
         * <p>*   **2**: NAT gateway</p>
         * <p>*   **3**: ApsaraDB RDS instance</p>
         * <p>*   **4**: ApsaraDB for MongoDB instance</p>
         * <p>*   **5**: ApsaraDB for Redis instance</p>
         * <p>*   **6**: image</p>
         * <p>*   **7**: container</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <p>The timestamp when Security Center is authorized to protect the asset. Unit: milliseconds.</p>
         */
        @NameInMap("AuthModifyTime")
        public Long authModifyTime;

        /**
         * <p>The edition of Security Center that is authorized to protect the asset. Valid values:</p>
         * <br>
         * <p>*   **1**: Basic edition</p>
         * <p>*   **6**: Anti-virus edition</p>
         * <p>*   **5**: Advanced edition</p>
         * <p>*   **3**: Enterprise edition</p>
         * <p>*   **7**: Ultimate edition</p>
         * <p>*   **10**: Value-added Plan edition</p>
         */
        @NameInMap("AuthVersion")
        public Integer authVersion;

        /**
         * <p>Indicates whether Security Center is authorized to protect the asset. Valid values:</p>
         * <br>
         * <p>*   **true**: Security Center is authorized to protect the asset.</p>
         * <p>*   **false**: Security Center is not authorized to protect the asset.</p>
         */
        @NameInMap("Bind")
        public Boolean bind;

        /**
         * <p>The status of the Security Center agent. Valid values:</p>
         * <br>
         * <p>*   **pause**: The Security Center agent stops protecting your server.</p>
         * <p>*   **online**: The Security Center agent is protecting your server.</p>
         * <p>*   **offline**: The Security Center agent does not protect your server.</p>
         */
        @NameInMap("ClientStatus")
        public String clientStatus;

        /**
         * <p>The version of the Security Center agent.</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The number of CPU cores.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The details of the CPU.</p>
         */
        @NameInMap("CpuInfo")
        public String cpuInfo;

        /**
         * <p>The timestamp when Security Center records the details of the server. Unit: milliseconds.</p>
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
         * <br>
         * <p>*   **0**: The server is provided by Alibaba Cloud.</p>
         * <p>*   **1**: The server is not provided by Alibaba Cloud.</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <p>The group to which the server belongs. By default, the servers that are not grouped belong to the **Default** group.</p>
         */
        @NameInMap("GroupTrace")
        public String groupTrace;

        /**
         * <p>The name of the host.</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The ID of the server.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The IP address that is assigned to the Elastic Compute Service (ECS) instance.</p>
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
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>The memory size of the server. Unit: MB.</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The operating system type of the server.</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The operating system version of the server.</p>
         */
        @NameInMap("OsDetail")
        public String osDetail;

        /**
         * <p>The name of the operating system that the server runs.</p>
         */
        @NameInMap("OsName")
        public String osName;

        /**
         * <p>The region in which the server resides.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the region in which the asset resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the region in which the server resides.</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The operating system information about the server.</p>
         */
        @NameInMap("SysInfo")
        public String sysInfo;

        /**
         * <p>The tag that is added to the server.</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The UUID of the server.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the server resides.</p>
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

        public GetAssetDetailByUuidResponseBodyAssetDetail setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

}
