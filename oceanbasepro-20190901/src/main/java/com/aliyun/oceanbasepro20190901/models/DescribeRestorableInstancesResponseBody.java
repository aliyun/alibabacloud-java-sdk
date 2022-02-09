// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeRestorableInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<DescribeRestorableInstancesResponseBodyInstances> instances;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRestorableInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestorableInstancesResponseBody self = new DescribeRestorableInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRestorableInstancesResponseBody setInstances(java.util.List<DescribeRestorableInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeRestorableInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeRestorableInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRestorableInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRestorableInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        public static DescribeRestorableInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestorableInstancesResponseBodyInstances self = new DescribeRestorableInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeRestorableInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRestorableInstancesResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

}
