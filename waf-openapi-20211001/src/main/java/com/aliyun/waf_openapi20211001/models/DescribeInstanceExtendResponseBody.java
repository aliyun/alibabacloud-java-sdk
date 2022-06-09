// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeInstanceExtendResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<DescribeInstanceExtendResponseBodyInstances> instances;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceExtendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceExtendResponseBody self = new DescribeInstanceExtendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceExtendResponseBody setInstances(java.util.List<DescribeInstanceExtendResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeInstanceExtendResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeInstanceExtendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceExtendResponseBodyInstances extends TeaModel {
        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeInstanceExtendResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceExtendResponseBodyInstances self = new DescribeInstanceExtendResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceExtendResponseBodyInstances setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstanceExtendResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceExtendResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
