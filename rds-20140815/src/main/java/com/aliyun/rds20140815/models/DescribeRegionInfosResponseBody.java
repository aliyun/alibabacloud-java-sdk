// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRegionInfosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Regions")
    public DescribeRegionInfosResponseBodyRegions regions;

    public static DescribeRegionInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionInfosResponseBody self = new DescribeRegionInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionInfosResponseBody setRegions(DescribeRegionInfosResponseBodyRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeRegionInfosResponseBodyRegions getRegions() {
        return this.regions;
    }

    public static class DescribeRegionInfosResponseBodyRegionsRDSRegion extends TeaModel {
        @NameInMap("CnLocalName")
        public String cnLocalName;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("Avz")
        public String avz;

        @NameInMap("AvzStatus")
        public String avzStatus;

        @NameInMap("RegionEndpoint")
        public String regionEndpoint;

        @NameInMap("Category")
        public String category;

        @NameInMap("EnLocalName")
        public String enLocalName;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeRegionInfosResponseBodyRegionsRDSRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionInfosResponseBodyRegionsRDSRegion self = new DescribeRegionInfosResponseBodyRegionsRDSRegion();
            return TeaModel.build(map, self);
        }

        public DescribeRegionInfosResponseBodyRegionsRDSRegion setCnLocalName(String cnLocalName) {
            this.cnLocalName = cnLocalName;
            return this;
        }
        public String getCnLocalName() {
            return this.cnLocalName;
        }

        public DescribeRegionInfosResponseBodyRegionsRDSRegion setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeRegionInfosResponseBodyRegionsRDSRegion setAvz(String avz) {
            this.avz = avz;
            return this;
        }
        public String getAvz() {
            return this.avz;
        }

        public DescribeRegionInfosResponseBodyRegionsRDSRegion setAvzStatus(String avzStatus) {
            this.avzStatus = avzStatus;
            return this;
        }
        public String getAvzStatus() {
            return this.avzStatus;
        }

        public DescribeRegionInfosResponseBodyRegionsRDSRegion setRegionEndpoint(String regionEndpoint) {
            this.regionEndpoint = regionEndpoint;
            return this;
        }
        public String getRegionEndpoint() {
            return this.regionEndpoint;
        }

        public DescribeRegionInfosResponseBodyRegionsRDSRegion setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeRegionInfosResponseBodyRegionsRDSRegion setEnLocalName(String enLocalName) {
            this.enLocalName = enLocalName;
            return this;
        }
        public String getEnLocalName() {
            return this.enLocalName;
        }

        public DescribeRegionInfosResponseBodyRegionsRDSRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeRegionInfosResponseBodyRegions extends TeaModel {
        @NameInMap("RDSRegion")
        public java.util.List<DescribeRegionInfosResponseBodyRegionsRDSRegion> RDSRegion;

        public static DescribeRegionInfosResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionInfosResponseBodyRegions self = new DescribeRegionInfosResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionInfosResponseBodyRegions setRDSRegion(java.util.List<DescribeRegionInfosResponseBodyRegionsRDSRegion> RDSRegion) {
            this.RDSRegion = RDSRegion;
            return this;
        }
        public java.util.List<DescribeRegionInfosResponseBodyRegionsRDSRegion> getRDSRegion() {
            return this.RDSRegion;
        }

    }

}
