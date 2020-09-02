// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeServerRelatedGlobalAccelerationInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("GlobalAccelerationInstances")
    @Validation(required = true)
    public DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstances globalAccelerationInstances;

    public static DescribeServerRelatedGlobalAccelerationInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerRelatedGlobalAccelerationInstancesResponse self = new DescribeServerRelatedGlobalAccelerationInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServerRelatedGlobalAccelerationInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServerRelatedGlobalAccelerationInstancesResponse setGlobalAccelerationInstances(DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstances globalAccelerationInstances) {
        this.globalAccelerationInstances = globalAccelerationInstances;
        return this;
    }
    public DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstances getGlobalAccelerationInstances() {
        return this.globalAccelerationInstances;
    }

    public static class DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("GlobalAccelerationInstanceId")
        @Validation(required = true)
        public String globalAccelerationInstanceId;

        @NameInMap("IpAddress")
        @Validation(required = true)
        public String ipAddress;

        @NameInMap("ServerIpAddress")
        @Validation(required = true)
        public String serverIpAddress;

        public static DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance self = new DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance();
            return TeaModel.build(map, self);
        }

        public DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
            this.globalAccelerationInstanceId = globalAccelerationInstanceId;
            return this;
        }
        public String getGlobalAccelerationInstanceId() {
            return this.globalAccelerationInstanceId;
        }

        public DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance setServerIpAddress(String serverIpAddress) {
            this.serverIpAddress = serverIpAddress;
            return this;
        }
        public String getServerIpAddress() {
            return this.serverIpAddress;
        }

    }

    public static class DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstances extends TeaModel {
        @NameInMap("GlobalAccelerationInstance")
        @Validation(required = true)
        public java.util.List<DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance> globalAccelerationInstance;

        public static DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstances self = new DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstances();
            return TeaModel.build(map, self);
        }

        public DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstances setGlobalAccelerationInstance(java.util.List<DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance> globalAccelerationInstance) {
            this.globalAccelerationInstance = globalAccelerationInstance;
            return this;
        }
        public java.util.List<DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance> getGlobalAccelerationInstance() {
            return this.globalAccelerationInstance;
        }

    }

}
