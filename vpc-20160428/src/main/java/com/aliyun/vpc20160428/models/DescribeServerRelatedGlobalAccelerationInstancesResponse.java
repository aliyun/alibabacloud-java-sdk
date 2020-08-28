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

    }

    public static class DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstances extends TeaModel {
        @NameInMap("GlobalAccelerationInstance")
        @Validation(required = true)
        public java.util.List<DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstancesGlobalAccelerationInstance> globalAccelerationInstance;

        public static DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstances self = new DescribeServerRelatedGlobalAccelerationInstancesResponseGlobalAccelerationInstances();
            return TeaModel.build(map, self);
        }

    }

}
