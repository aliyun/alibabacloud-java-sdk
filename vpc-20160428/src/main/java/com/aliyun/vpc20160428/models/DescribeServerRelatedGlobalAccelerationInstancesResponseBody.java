// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeServerRelatedGlobalAccelerationInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GlobalAccelerationInstances")
    public DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances globalAccelerationInstances;

    public static DescribeServerRelatedGlobalAccelerationInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerRelatedGlobalAccelerationInstancesResponseBody self = new DescribeServerRelatedGlobalAccelerationInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServerRelatedGlobalAccelerationInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServerRelatedGlobalAccelerationInstancesResponseBody setGlobalAccelerationInstances(DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances globalAccelerationInstances) {
        this.globalAccelerationInstances = globalAccelerationInstances;
        return this;
    }
    public DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances getGlobalAccelerationInstances() {
        return this.globalAccelerationInstances;
    }

    public static class DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance extends TeaModel {
        @NameInMap("ServerIpAddress")
        public String serverIpAddress;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("GlobalAccelerationInstanceId")
        public String globalAccelerationInstanceId;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance self = new DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance();
            return TeaModel.build(map, self);
        }

        public DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setServerIpAddress(String serverIpAddress) {
            this.serverIpAddress = serverIpAddress;
            return this;
        }
        public String getServerIpAddress() {
            return this.serverIpAddress;
        }

        public DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
            this.globalAccelerationInstanceId = globalAccelerationInstanceId;
            return this;
        }
        public String getGlobalAccelerationInstanceId() {
            return this.globalAccelerationInstanceId;
        }

        public DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances extends TeaModel {
        @NameInMap("GlobalAccelerationInstance")
        public java.util.List<DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance> globalAccelerationInstance;

        public static DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances self = new DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances();
            return TeaModel.build(map, self);
        }

        public DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances setGlobalAccelerationInstance(java.util.List<DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance> globalAccelerationInstance) {
            this.globalAccelerationInstance = globalAccelerationInstance;
            return this;
        }
        public java.util.List<DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance> getGlobalAccelerationInstance() {
            return this.globalAccelerationInstance;
        }

    }

}
