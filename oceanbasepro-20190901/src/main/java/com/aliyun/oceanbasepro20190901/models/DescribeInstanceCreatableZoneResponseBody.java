// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceCreatableZoneResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the cluster is deployed in the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The operation that you want to perform.<br>Set the value to <strong>DescribeInstanceCreatableZone</strong>.</p>
     */
    @NameInMap("ZoneList")
    public java.util.List<DescribeInstanceCreatableZoneResponseBodyZoneList> zoneList;

    public static DescribeInstanceCreatableZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceCreatableZoneResponseBody self = new DescribeInstanceCreatableZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceCreatableZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceCreatableZoneResponseBody setZoneList(java.util.List<DescribeInstanceCreatableZoneResponseBodyZoneList> zoneList) {
        this.zoneList = zoneList;
        return this;
    }
    public java.util.List<DescribeInstanceCreatableZoneResponseBodyZoneList> getZoneList() {
        return this.zoneList;
    }

    public static class DescribeInstanceCreatableZoneResponseBodyZoneList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsInCluster")
        public Boolean isInCluster;

        /**
         * <p>DescribeInstanceCreatableZone</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("Zone")
        public String zone;

        public static DescribeInstanceCreatableZoneResponseBodyZoneList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceCreatableZoneResponseBodyZoneList self = new DescribeInstanceCreatableZoneResponseBodyZoneList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceCreatableZoneResponseBodyZoneList setIsInCluster(Boolean isInCluster) {
            this.isInCluster = isInCluster;
            return this;
        }
        public Boolean getIsInCluster() {
            return this.isInCluster;
        }

        public DescribeInstanceCreatableZoneResponseBodyZoneList setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
