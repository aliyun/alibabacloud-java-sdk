// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeServerRelatedGlobalAccelerationInstancesResponseBody extends TeaModel {
    /**
     * <p>The list of GA instances.</p>
     */
    @NameInMap("GlobalAccelerationInstances")
    public DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances globalAccelerationInstances;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeServerRelatedGlobalAccelerationInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerRelatedGlobalAccelerationInstancesResponseBody self = new DescribeServerRelatedGlobalAccelerationInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServerRelatedGlobalAccelerationInstancesResponseBody setGlobalAccelerationInstances(DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances globalAccelerationInstances) {
        this.globalAccelerationInstances = globalAccelerationInstances;
        return this;
    }
    public DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances getGlobalAccelerationInstances() {
        return this.globalAccelerationInstances;
    }

    public DescribeServerRelatedGlobalAccelerationInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance extends TeaModel {
        /**
         * <p>The ID of the GA instance.</p>
         */
        @NameInMap("GlobalAccelerationInstanceId")
        public String globalAccelerationInstanceId;

        /**
         * <p>The public IP address of the GA instance.</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The region ID of the GA instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The IP address of the backend service.</p>
         */
        @NameInMap("ServerIpAddress")
        public String serverIpAddress;

        public static DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance self = new DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance();
            return TeaModel.build(map, self);
        }

        public DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
            this.globalAccelerationInstanceId = globalAccelerationInstanceId;
            return this;
        }
        public String getGlobalAccelerationInstanceId() {
            return this.globalAccelerationInstanceId;
        }

        public DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeServerRelatedGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setServerIpAddress(String serverIpAddress) {
            this.serverIpAddress = serverIpAddress;
            return this;
        }
        public String getServerIpAddress() {
            return this.serverIpAddress;
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
