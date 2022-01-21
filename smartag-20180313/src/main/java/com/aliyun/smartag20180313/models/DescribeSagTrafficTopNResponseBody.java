// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagTrafficTopNResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficTopN")
    public java.util.List<DescribeSagTrafficTopNResponseBodyTrafficTopN> trafficTopN;

    public static DescribeSagTrafficTopNResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagTrafficTopNResponseBody self = new DescribeSagTrafficTopNResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagTrafficTopNResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagTrafficTopNResponseBody setTrafficTopN(java.util.List<DescribeSagTrafficTopNResponseBodyTrafficTopN> trafficTopN) {
        this.trafficTopN = trafficTopN;
        return this;
    }
    public java.util.List<DescribeSagTrafficTopNResponseBodyTrafficTopN> getTrafficTopN() {
        return this.trafficTopN;
    }

    public static class DescribeSagTrafficTopNResponseBodyTrafficTopN extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("TrafficRate")
        public String trafficRate;

        public static DescribeSagTrafficTopNResponseBodyTrafficTopN build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagTrafficTopNResponseBodyTrafficTopN self = new DescribeSagTrafficTopNResponseBodyTrafficTopN();
            return TeaModel.build(map, self);
        }

        public DescribeSagTrafficTopNResponseBodyTrafficTopN setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSagTrafficTopNResponseBodyTrafficTopN setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSagTrafficTopNResponseBodyTrafficTopN setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSagTrafficTopNResponseBodyTrafficTopN setTrafficRate(String trafficRate) {
            this.trafficRate = trafficRate;
            return this;
        }
        public String getTrafficRate() {
            return this.trafficRate;
        }

    }

}
