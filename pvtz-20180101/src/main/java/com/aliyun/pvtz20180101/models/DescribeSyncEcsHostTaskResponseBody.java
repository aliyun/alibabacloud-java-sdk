// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeSyncEcsHostTaskResponseBody extends TeaModel {
    /**
     * <p>The information about regions.</p>
     */
    @NameInMap("EcsRegions")
    public DescribeSyncEcsHostTaskResponseBodyEcsRegions ecsRegions;

    /**
     * <p>The information about the regions within the current account.</p>
     */
    @NameInMap("Regions")
    public DescribeSyncEcsHostTaskResponseBodyRegions regions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75446CC1-FC9A-4595-8D96-089D73D7A63D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of the task. Valid values:</p>
     * <ul>
     * <li>ON</li>
     * <li>OFF</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the task was successful. Valid values:</p>
     * <ul>
     * <li>True</li>
     * <li>False</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pvtz-test-id-2989149d628c56f00e</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeSyncEcsHostTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncEcsHostTaskResponseBody self = new DescribeSyncEcsHostTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSyncEcsHostTaskResponseBody setEcsRegions(DescribeSyncEcsHostTaskResponseBodyEcsRegions ecsRegions) {
        this.ecsRegions = ecsRegions;
        return this;
    }
    public DescribeSyncEcsHostTaskResponseBodyEcsRegions getEcsRegions() {
        return this.ecsRegions;
    }

    public DescribeSyncEcsHostTaskResponseBody setRegions(DescribeSyncEcsHostTaskResponseBodyRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeSyncEcsHostTaskResponseBodyRegions getRegions() {
        return this.regions;
    }

    public DescribeSyncEcsHostTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSyncEcsHostTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSyncEcsHostTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSyncEcsHostTaskResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeSyncEcsHostTaskResponseBodyEcsRegionsEcsRegionRegionIds extends TeaModel {
        @NameInMap("RegionId")
        public java.util.List<String> regionId;

        public static DescribeSyncEcsHostTaskResponseBodyEcsRegionsEcsRegionRegionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyncEcsHostTaskResponseBodyEcsRegionsEcsRegionRegionIds self = new DescribeSyncEcsHostTaskResponseBodyEcsRegionsEcsRegionRegionIds();
            return TeaModel.build(map, self);
        }

        public DescribeSyncEcsHostTaskResponseBodyEcsRegionsEcsRegionRegionIds setRegionId(java.util.List<String> regionId) {
            this.regionId = regionId;
            return this;
        }
        public java.util.List<String> getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeSyncEcsHostTaskResponseBodyEcsRegionsEcsRegion extends TeaModel {
        /**
         * <p>The region IDs.</p>
         */
        @NameInMap("RegionIds")
        public DescribeSyncEcsHostTaskResponseBodyEcsRegionsEcsRegionRegionIds regionIds;

        /**
         * <p>The Alibaba Cloud account to which the region belongs. This parameter is used in cross-account synchronization scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static DescribeSyncEcsHostTaskResponseBodyEcsRegionsEcsRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyncEcsHostTaskResponseBodyEcsRegionsEcsRegion self = new DescribeSyncEcsHostTaskResponseBodyEcsRegionsEcsRegion();
            return TeaModel.build(map, self);
        }

        public DescribeSyncEcsHostTaskResponseBodyEcsRegionsEcsRegion setRegionIds(DescribeSyncEcsHostTaskResponseBodyEcsRegionsEcsRegionRegionIds regionIds) {
            this.regionIds = regionIds;
            return this;
        }
        public DescribeSyncEcsHostTaskResponseBodyEcsRegionsEcsRegionRegionIds getRegionIds() {
            return this.regionIds;
        }

        public DescribeSyncEcsHostTaskResponseBodyEcsRegionsEcsRegion setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

    public static class DescribeSyncEcsHostTaskResponseBodyEcsRegions extends TeaModel {
        @NameInMap("EcsRegion")
        public java.util.List<DescribeSyncEcsHostTaskResponseBodyEcsRegionsEcsRegion> ecsRegion;

        public static DescribeSyncEcsHostTaskResponseBodyEcsRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyncEcsHostTaskResponseBodyEcsRegions self = new DescribeSyncEcsHostTaskResponseBodyEcsRegions();
            return TeaModel.build(map, self);
        }

        public DescribeSyncEcsHostTaskResponseBodyEcsRegions setEcsRegion(java.util.List<DescribeSyncEcsHostTaskResponseBodyEcsRegionsEcsRegion> ecsRegion) {
            this.ecsRegion = ecsRegion;
            return this;
        }
        public java.util.List<DescribeSyncEcsHostTaskResponseBodyEcsRegionsEcsRegion> getEcsRegion() {
            return this.ecsRegion;
        }

    }

    public static class DescribeSyncEcsHostTaskResponseBodyRegions extends TeaModel {
        @NameInMap("RegionId")
        public java.util.List<String> regionId;

        public static DescribeSyncEcsHostTaskResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyncEcsHostTaskResponseBodyRegions self = new DescribeSyncEcsHostTaskResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeSyncEcsHostTaskResponseBodyRegions setRegionId(java.util.List<String> regionId) {
            this.regionId = regionId;
            return this;
        }
        public java.util.List<String> getRegionId() {
            return this.regionId;
        }

    }

}
