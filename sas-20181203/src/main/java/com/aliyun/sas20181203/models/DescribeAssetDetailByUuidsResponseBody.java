// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetDetailByUuidsResponseBody extends TeaModel {
    @NameInMap("AssetList")
    public java.util.List<DescribeAssetDetailByUuidsResponseBodyAssetList> assetList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAssetDetailByUuidsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetDetailByUuidsResponseBody self = new DescribeAssetDetailByUuidsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAssetDetailByUuidsResponseBody setAssetList(java.util.List<DescribeAssetDetailByUuidsResponseBodyAssetList> assetList) {
        this.assetList = assetList;
        return this;
    }
    public java.util.List<DescribeAssetDetailByUuidsResponseBodyAssetList> getAssetList() {
        return this.assetList;
    }

    public DescribeAssetDetailByUuidsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAssetDetailByUuidsResponseBodyAssetList extends TeaModel {
        @NameInMap("AssetType")
        public String assetType;

        @NameInMap("ClientStatus")
        public String clientStatus;

        @NameInMap("Flag")
        public Integer flag;

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

        @NameInMap("Os")
        public String os;

        @NameInMap("OsName")
        public String osName;

        @NameInMap("Region")
        public String region;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static DescribeAssetDetailByUuidsResponseBodyAssetList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAssetDetailByUuidsResponseBodyAssetList self = new DescribeAssetDetailByUuidsResponseBodyAssetList();
            return TeaModel.build(map, self);
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setClientStatus(String clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }
        public String getClientStatus() {
            return this.clientStatus;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setFlag(Integer flag) {
            this.flag = flag;
            return this;
        }
        public Integer getFlag() {
            return this.flag;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setOsName(String osName) {
            this.osName = osName;
            return this;
        }
        public String getOsName() {
            return this.osName;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

}
