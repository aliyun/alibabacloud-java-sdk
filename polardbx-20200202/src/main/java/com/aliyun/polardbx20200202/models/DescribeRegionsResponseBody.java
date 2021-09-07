// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Regions")
    public DescribeRegionsResponseBodyRegions regions;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeRegionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRegionsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeRegionsResponseBody setRegions(DescribeRegionsResponseBodyRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeRegionsResponseBodyRegions getRegions() {
        return this.regions;
    }

    public static class DescribeRegionsResponseBodyRegionsRegionZonesZone extends TeaModel {
        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("VpcEnabled")
        public Boolean vpcEnabled;

        public static DescribeRegionsResponseBodyRegionsRegionZonesZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionsRegionZonesZone self = new DescribeRegionsResponseBodyRegionsRegionZonesZone();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionsRegionZonesZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeRegionsResponseBodyRegionsRegionZonesZone setVpcEnabled(Boolean vpcEnabled) {
            this.vpcEnabled = vpcEnabled;
            return this;
        }
        public Boolean getVpcEnabled() {
            return this.vpcEnabled;
        }

    }

    public static class DescribeRegionsResponseBodyRegionsRegionZones extends TeaModel {
        @NameInMap("Zone")
        public java.util.List<DescribeRegionsResponseBodyRegionsRegionZonesZone> zone;

        public static DescribeRegionsResponseBodyRegionsRegionZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionsRegionZones self = new DescribeRegionsResponseBodyRegionsRegionZones();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionsRegionZones setZone(java.util.List<DescribeRegionsResponseBodyRegionsRegionZonesZone> zone) {
            this.zone = zone;
            return this;
        }
        public java.util.List<DescribeRegionsResponseBodyRegionsRegionZonesZone> getZone() {
            return this.zone;
        }

    }

    public static class DescribeRegionsResponseBodyRegionsRegion extends TeaModel {
        @NameInMap("SupportPolarx10")
        public Boolean supportPolarx10;

        @NameInMap("SupportPolarx20")
        public Boolean supportPolarx20;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Zones")
        public DescribeRegionsResponseBodyRegionsRegionZones zones;

        public static DescribeRegionsResponseBodyRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionsRegion self = new DescribeRegionsResponseBodyRegionsRegion();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionsRegion setSupportPolarx10(Boolean supportPolarx10) {
            this.supportPolarx10 = supportPolarx10;
            return this;
        }
        public Boolean getSupportPolarx10() {
            return this.supportPolarx10;
        }

        public DescribeRegionsResponseBodyRegionsRegion setSupportPolarx20(Boolean supportPolarx20) {
            this.supportPolarx20 = supportPolarx20;
            return this;
        }
        public Boolean getSupportPolarx20() {
            return this.supportPolarx20;
        }

        public DescribeRegionsResponseBodyRegionsRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionsResponseBodyRegionsRegion setZones(DescribeRegionsResponseBodyRegionsRegionZones zones) {
            this.zones = zones;
            return this;
        }
        public DescribeRegionsResponseBodyRegionsRegionZones getZones() {
            return this.zones;
        }

    }

    public static class DescribeRegionsResponseBodyRegions extends TeaModel {
        @NameInMap("Region")
        public java.util.List<DescribeRegionsResponseBodyRegionsRegion> region;

        public static DescribeRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegions self = new DescribeRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegions setRegion(java.util.List<DescribeRegionsResponseBodyRegionsRegion> region) {
            this.region = region;
            return this;
        }
        public java.util.List<DescribeRegionsResponseBodyRegionsRegion> getRegion() {
            return this.region;
        }

    }

}
