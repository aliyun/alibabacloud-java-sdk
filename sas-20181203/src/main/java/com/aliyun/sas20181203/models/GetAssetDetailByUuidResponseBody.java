// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetDetailByUuidResponseBody extends TeaModel {
    @NameInMap("AssetDetail")
    public GetAssetDetailByUuidResponseBodyAssetDetail assetDetail;

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
        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("TotalSize")
        public Long totalSize;

        @NameInMap("TotalSizeByte")
        public Long totalSizeByte;

        @NameInMap("UseSize")
        public Long useSize;

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
        @NameInMap("AssetType")
        public String assetType;

        @NameInMap("AuthModifyTime")
        public Long authModifyTime;

        @NameInMap("AuthVersion")
        public Integer authVersion;

        @NameInMap("Bind")
        public Boolean bind;

        @NameInMap("ClientStatus")
        public String clientStatus;

        @NameInMap("ClientVersion")
        public String clientVersion;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("CpuInfo")
        public String cpuInfo;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DiskInfoList")
        public java.util.List<GetAssetDetailByUuidResponseBodyAssetDetailDiskInfoList> diskInfoList;

        @NameInMap("Flag")
        public Integer flag;

        @NameInMap("GroupTrace")
        public String groupTrace;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("IpList")
        public java.util.List<String> ipList;

        @NameInMap("Kernel")
        public String kernel;

        @NameInMap("MacList")
        public java.util.List<String> macList;

        @NameInMap("Mem")
        public Integer mem;

        @NameInMap("Memory")
        public Long memory;

        @NameInMap("Os")
        public String os;

        @NameInMap("OsDetail")
        public String osDetail;

        @NameInMap("OsName")
        public String osName;

        @NameInMap("Region")
        public String region;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("SysInfo")
        public String sysInfo;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Uuid")
        public String uuid;

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
