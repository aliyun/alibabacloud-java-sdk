// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceTarsServiceInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeInstanceTarsServiceInfoResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceTarsServiceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTarsServiceInfoResponseBody self = new DescribeInstanceTarsServiceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTarsServiceInfoResponseBody setData(DescribeInstanceTarsServiceInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeInstanceTarsServiceInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeInstanceTarsServiceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceTarsServiceInfoResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Status")
        public String status;

        public static DescribeInstanceTarsServiceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTarsServiceInfoResponseBodyData self = new DescribeInstanceTarsServiceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTarsServiceInfoResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceTarsServiceInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
