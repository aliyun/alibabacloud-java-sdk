// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    /**
     * <p>An array of regions.</p>
     */
    @NameInMap("RegionModelList")
    public java.util.List<DescribeRegionsResponseBodyRegionModelList> regionModelList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8900A96-67F7-5274-A41B-7722E1ECF8C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setRegionModelList(java.util.List<DescribeRegionsResponseBodyRegionModelList> regionModelList) {
        this.regionModelList = regionModelList;
        return this;
    }
    public java.util.List<DescribeRegionsResponseBodyRegionModelList> getRegionModelList() {
        return this.regionModelList;
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRegionsResponseBodyRegionModelListZones extends TeaModel {
        /**
         * <p>The zone description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the VPC is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The label.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The zone name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The subdomain.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-h-aliyun</p>
         */
        @NameInMap("SubDomain")
        public String subDomain;

        /**
         * <p>Indicates whether the VPC is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("VpcEnabled")
        public Boolean vpcEnabled;

        /**
         * <p>Indicates whether the virtual private cloud (VPC) is available.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeRegionsResponseBodyRegionModelListZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionModelListZones self = new DescribeRegionsResponseBodyRegionModelListZones();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionModelListZones setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRegionsResponseBodyRegionModelListZones setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeRegionsResponseBodyRegionModelListZones setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeRegionsResponseBodyRegionModelListZones setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRegionsResponseBodyRegionModelListZones setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionsResponseBodyRegionModelListZones setSubDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }
        public String getSubDomain() {
            return this.subDomain;
        }

        public DescribeRegionsResponseBodyRegionModelListZones setVpcEnabled(Boolean vpcEnabled) {
            this.vpcEnabled = vpcEnabled;
            return this;
        }
        public Boolean getVpcEnabled() {
            return this.vpcEnabled;
        }

        public DescribeRegionsResponseBodyRegionModelListZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeRegionsResponseBodyRegionModelList extends TeaModel {
        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>An array of zones.</p>
         */
        @NameInMap("Zones")
        public java.util.List<DescribeRegionsResponseBodyRegionModelListZones> zones;

        public static DescribeRegionsResponseBodyRegionModelList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionModelList self = new DescribeRegionsResponseBodyRegionModelList();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionModelList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionsResponseBodyRegionModelList setZones(java.util.List<DescribeRegionsResponseBodyRegionModelListZones> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<DescribeRegionsResponseBodyRegionModelListZones> getZones() {
            return this.zones;
        }

    }

}
