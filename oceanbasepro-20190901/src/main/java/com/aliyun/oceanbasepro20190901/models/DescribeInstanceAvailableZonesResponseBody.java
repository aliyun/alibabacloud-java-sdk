// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceAvailableZonesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E3D924FB-52****B253-0C1A7EFB778C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ZoneList")
    public java.util.List<DescribeInstanceAvailableZonesResponseBodyZoneList> zoneList;

    public static DescribeInstanceAvailableZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAvailableZonesResponseBody self = new DescribeInstanceAvailableZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAvailableZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAvailableZonesResponseBody setZoneList(java.util.List<DescribeInstanceAvailableZonesResponseBodyZoneList> zoneList) {
        this.zoneList = zoneList;
        return this;
    }
    public java.util.List<DescribeInstanceAvailableZonesResponseBodyZoneList> getZoneList() {
        return this.zoneList;
    }

    public static class DescribeInstanceAvailableZonesResponseBodyZoneList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsInCluster")
        public Boolean isInCluster;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai-g-z0,cn-shanghai-g-z1, cn-shanghai-g-z2</p>
         */
        @NameInMap("LogicalZoneName")
        public String logicalZoneName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReplicateZoneIndex")
        public String replicateZoneIndex;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("Zone")
        public String zone;

        public static DescribeInstanceAvailableZonesResponseBodyZoneList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAvailableZonesResponseBodyZoneList self = new DescribeInstanceAvailableZonesResponseBodyZoneList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAvailableZonesResponseBodyZoneList setIsInCluster(Boolean isInCluster) {
            this.isInCluster = isInCluster;
            return this;
        }
        public Boolean getIsInCluster() {
            return this.isInCluster;
        }

        public DescribeInstanceAvailableZonesResponseBodyZoneList setLogicalZoneName(String logicalZoneName) {
            this.logicalZoneName = logicalZoneName;
            return this;
        }
        public String getLogicalZoneName() {
            return this.logicalZoneName;
        }

        public DescribeInstanceAvailableZonesResponseBodyZoneList setReplicateZoneIndex(String replicateZoneIndex) {
            this.replicateZoneIndex = replicateZoneIndex;
            return this;
        }
        public String getReplicateZoneIndex() {
            return this.replicateZoneIndex;
        }

        public DescribeInstanceAvailableZonesResponseBodyZoneList setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
