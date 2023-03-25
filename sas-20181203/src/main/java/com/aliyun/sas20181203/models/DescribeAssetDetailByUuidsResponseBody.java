// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetDetailByUuidsResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details of the ECS instances.</p>
     */
    @NameInMap("AssetList")
    public java.util.List<DescribeAssetDetailByUuidsResponseBodyAssetList> assetList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
        /**
         * <p>The type of the asset.</p>
         * <br>
         * <p>The value is fixed as **0**, which indicates ECS instances.</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <p>The status of the Security Center agent. Valid values:</p>
         * <br>
         * <p>*   **online**</p>
         * <p>*   **offline**</p>
         */
        @NameInMap("ClientStatus")
        public String clientStatus;

        /**
         * <p>The type of the asset by source. Valid values:</p>
         * <br>
         * <p>*   **0**: The asset is provided by Alibaba Cloud.</p>
         * <p>*   **1**: The asset is not provided by Alibaba Cloud.</p>
         * <p>*   **2**: The asset resides in a data center.</p>
         * <p>*   **3**, **4**, **5**, and **7**: other cloud asset.</p>
         * <p>*   **8**: light-weight assets.</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <p>The ID of the ECS instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the ECS instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the ECS instance.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the ECS instance.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The IP address of the ECS instance.</p>
         * <br>
         * <p>>  If the ECS instance has a public IP address, the value of this parameter is the public IP address of the ECS instance. If the ECS instance does not have a public IP address, the value of this parameter is the private IP address of the ECS instance.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The operating system of the ECS instance.</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The name of the operating system run by the ECS instance.</p>
         */
        @NameInMap("OsName")
        public String osName;

        /**
         * <p>The region in which the ECS instance resides.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The region in which the ECS instance resides.</p>
         * <br>
         * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the region in which the ECS instance resides.</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The UUID of the ECS instance.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
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
