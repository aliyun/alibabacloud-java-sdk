// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    /**
     * <p>The value of the **RegionIds** parameter is an array. Each element in the array contains the **RegionId** and **ZoneIds** parameters.</p>
     */
    @NameInMap("RegionIds")
    public DescribeRegionsResponseBodyRegionIds regionIds;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setRegionIds(DescribeRegionsResponseBodyRegionIds regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public DescribeRegionsResponseBodyRegionIds getRegionIds() {
        return this.regionIds;
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRegionsResponseBodyRegionIdsKVStoreRegionZoneIdList extends TeaModel {
        @NameInMap("ZoneId")
        public java.util.List<String> zoneId;

        public static DescribeRegionsResponseBodyRegionIdsKVStoreRegionZoneIdList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionIdsKVStoreRegionZoneIdList self = new DescribeRegionsResponseBodyRegionIdsKVStoreRegionZoneIdList();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionIdsKVStoreRegionZoneIdList setZoneId(java.util.List<String> zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public java.util.List<String> getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeRegionsResponseBodyRegionIdsKVStoreRegion extends TeaModel {
        /**
         * <p>The name of the region.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The endpoint of the region.</p>
         */
        @NameInMap("RegionEndpoint")
        public String regionEndpoint;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The IDs of the zones in the region. The zone IDs are separated by commas (,).</p>
         */
        @NameInMap("ZoneIdList")
        public DescribeRegionsResponseBodyRegionIdsKVStoreRegionZoneIdList zoneIdList;

        /**
         * <p>The ID of the zone.</p>
         */
        @NameInMap("ZoneIds")
        public String zoneIds;

        public static DescribeRegionsResponseBodyRegionIdsKVStoreRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionIdsKVStoreRegion self = new DescribeRegionsResponseBodyRegionIdsKVStoreRegion();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionIdsKVStoreRegion setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeRegionsResponseBodyRegionIdsKVStoreRegion setRegionEndpoint(String regionEndpoint) {
            this.regionEndpoint = regionEndpoint;
            return this;
        }
        public String getRegionEndpoint() {
            return this.regionEndpoint;
        }

        public DescribeRegionsResponseBodyRegionIdsKVStoreRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionsResponseBodyRegionIdsKVStoreRegion setZoneIdList(DescribeRegionsResponseBodyRegionIdsKVStoreRegionZoneIdList zoneIdList) {
            this.zoneIdList = zoneIdList;
            return this;
        }
        public DescribeRegionsResponseBodyRegionIdsKVStoreRegionZoneIdList getZoneIdList() {
            return this.zoneIdList;
        }

        public DescribeRegionsResponseBodyRegionIdsKVStoreRegion setZoneIds(String zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }
        public String getZoneIds() {
            return this.zoneIds;
        }

    }

    public static class DescribeRegionsResponseBodyRegionIds extends TeaModel {
        @NameInMap("KVStoreRegion")
        public java.util.List<DescribeRegionsResponseBodyRegionIdsKVStoreRegion> KVStoreRegion;

        public static DescribeRegionsResponseBodyRegionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionIds self = new DescribeRegionsResponseBodyRegionIds();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionIds setKVStoreRegion(java.util.List<DescribeRegionsResponseBodyRegionIdsKVStoreRegion> KVStoreRegion) {
            this.KVStoreRegion = KVStoreRegion;
            return this;
        }
        public java.util.List<DescribeRegionsResponseBodyRegionIdsKVStoreRegion> getKVStoreRegion() {
            return this.KVStoreRegion;
        }

    }

}
