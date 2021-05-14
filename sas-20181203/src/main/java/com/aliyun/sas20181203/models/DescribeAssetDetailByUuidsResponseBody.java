// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetDetailByUuidsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AssetList")
    public java.util.List<DescribeAssetDetailByUuidsResponseBodyAssetList> assetList;

    public static DescribeAssetDetailByUuidsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetDetailByUuidsResponseBody self = new DescribeAssetDetailByUuidsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAssetDetailByUuidsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAssetDetailByUuidsResponseBody setAssetList(java.util.List<DescribeAssetDetailByUuidsResponseBodyAssetList> assetList) {
        this.assetList = assetList;
        return this;
    }
    public java.util.List<DescribeAssetDetailByUuidsResponseBodyAssetList> getAssetList() {
        return this.assetList;
    }

    public static class DescribeAssetDetailByUuidsResponseBodyAssetList extends TeaModel {
        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("OsName")
        public String osName;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Os")
        public String os;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ClientStatus")
        public String clientStatus;

        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("AssetType")
        public String assetType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Region")
        public String region;

        public static DescribeAssetDetailByUuidsResponseBodyAssetList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAssetDetailByUuidsResponseBodyAssetList self = new DescribeAssetDetailByUuidsResponseBodyAssetList();
            return TeaModel.build(map, self);
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setOsName(String osName) {
            this.osName = osName;
            return this;
        }
        public String getOsName() {
            return this.osName;
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

        public DescribeAssetDetailByUuidsResponseBodyAssetList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setClientStatus(String clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }
        public String getClientStatus() {
            return this.clientStatus;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAssetDetailByUuidsResponseBodyAssetList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
