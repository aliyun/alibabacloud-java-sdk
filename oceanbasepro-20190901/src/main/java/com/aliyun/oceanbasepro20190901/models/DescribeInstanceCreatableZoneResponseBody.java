// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceCreatableZoneResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 可用区列表信息。
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
        // 是否是集群部署的可用区。
        @NameInMap("IsInCluster")
        public Boolean isInCluster;

        // 可用区ID。
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
