// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetDetailByUuidResponseBody extends TeaModel {
    // The details of the server.
    @NameInMap("AssetDetail")
    public DescribeAssetDetailByUuidResponseBodyAssetDetail assetDetail;

    // The ID of the request, which is used to locate and troubleshoot issues.
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
        // The type of the asset. Valid values:
        // 
        // *   **0**: ECS instance
        // *   **1**: Server Load Balancer (SLB) instance
        // *   **2**: NAT gateway
        // *   **3**: ApsaraDB RDS database
        // *   **4**: ApsaraDB for MongoDB database
        // *   **5**: ApsaraDB for Redis database
        // *   **6**: image
        // *   **7**: container
        @NameInMap("AssetType")
        public String assetType;

        // The timestamp when Security Center is authorized to protect the asset. Unit: milliseconds.
        @NameInMap("AuthModifyTime")
        public Long authModifyTime;

        // The edition of Security Center that is authorized to protect the asset. Valid values:
        // 
        // *   **1**: Basic edition (Unauthorized)
        // *   **6**: Anti-virus edition
        // *   **5**: Advanced edition
        // *   **3**: Enterprise edition
        // *   **7**: Ultimate edition
        // *   **10**: Value-added Plan edition
        @NameInMap("AuthVersion")
        public Integer authVersion;

        // Indicates whether Security Center is authorized to protect the asset. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("Bind")
        public Boolean bind;

        // The status of the Security Center agent. Valid values:
        // 
        // *   **pause**: The Security Center agent suspends protection for your server.
        // *   **online**: The Security Center agent is protecting your server.
        // *   **offline**: The Security Center agent does not protect your server.
        @NameInMap("ClientStatus")
        public String clientStatus;

        // The version of the Security Center agent.
        @NameInMap("ClientVersion")
        public String clientVersion;

        // The number of CPU cores.
        @NameInMap("Cpu")
        public Integer cpu;

        // The details of the CPU.
        @NameInMap("CpuInfo")
        public String cpuInfo;

        // The timestamp when Security Center records the details of the server. Unit: milliseconds.
        @NameInMap("CreateTime")
        public Long createTime;

        // An array that consists of the information about the disk.
        @NameInMap("DiskInfoList")
        public java.util.List<String> diskInfoList;

        // Indicates whether the asset is provided by Alibaba Cloud. Valid values:
        // 
        // *   **0**: yes
        // *   **1**: no
        @NameInMap("Flag")
        public Integer flag;

        // The group to which the server belongs. By default, the servers that are not grouped belong to the **Default** group.
        @NameInMap("GroupTrace")
        public String groupTrace;

        // The name of the host.
        @NameInMap("HostName")
        public String hostName;

        // The ID of the server.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the server.
        @NameInMap("InstanceName")
        public String instanceName;

        // The public IP address of the server.
        @NameInMap("InternetIp")
        public String internetIp;

        // The private IP address of the server.
        @NameInMap("IntranetIp")
        public String intranetIp;

        // The IP address that is assigned to the Elastic Compute Service (ECS) instance.
        @NameInMap("Ip")
        public String ip;

        // The IP addresses of the server.
        @NameInMap("IpList")
        public java.util.List<String> ipList;

        // The kernel version of the operating system.
        @NameInMap("Kernel")
        public String kernel;

        // The media access control (MAC) addresses of the server.
        @NameInMap("MacList")
        public java.util.List<String> macList;

        // The memory size of the server. Unit: GB.
        @NameInMap("Mem")
        public Integer mem;

        // The memory size of the server. Unit: MB.
        @NameInMap("Memory")
        public Long memory;

        // The operating system type of the server.
        @NameInMap("Os")
        public String os;

        // The operating system version of the server.
        @NameInMap("OsDetail")
        public String osDetail;

        // The name of the operating system.
        @NameInMap("OsName")
        public String osName;

        // The region in which the server resides.
        @NameInMap("Region")
        public String region;

        // The ID of the region in which the asset resides.
        @NameInMap("RegionId")
        public String regionId;

        // The name of the region in which the server resides.
        @NameInMap("RegionName")
        public String regionName;

        // The operating system information about the server.
        @NameInMap("SysInfo")
        public String sysInfo;

        // The tag that is added to the server.
        @NameInMap("Tag")
        public String tag;

        // The UUID of the server.
        @NameInMap("Uuid")
        public String uuid;

        // The ID of the virtual private cloud (VPC) in which the server resides.
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
