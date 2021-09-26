// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class DescribeRenewStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Instances")
    public java.util.List<DescribeRenewStatusResponseBodyInstances> instances;

    public static DescribeRenewStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenewStatusResponseBody self = new DescribeRenewStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRenewStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRenewStatusResponseBody setInstances(java.util.List<DescribeRenewStatusResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeRenewStatusResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public static class DescribeRenewStatusResponseBodyInstances extends TeaModel {
        @NameInMap("RenewStatus")
        public String renewStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeRenewStatusResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewStatusResponseBodyInstances self = new DescribeRenewStatusResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeRenewStatusResponseBodyInstances setRenewStatus(String renewStatus) {
            this.renewStatus = renewStatus;
            return this;
        }
        public String getRenewStatus() {
            return this.renewStatus;
        }

        public DescribeRenewStatusResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
