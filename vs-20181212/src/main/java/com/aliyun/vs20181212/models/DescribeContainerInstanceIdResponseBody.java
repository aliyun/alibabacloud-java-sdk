// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeContainerInstanceIdResponseBody extends TeaModel {
    @NameInMap("InstanceDetail")
    public DescribeContainerInstanceIdResponseBodyInstanceDetail instanceDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContainerInstanceIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerInstanceIdResponseBody self = new DescribeContainerInstanceIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerInstanceIdResponseBody setInstanceDetail(DescribeContainerInstanceIdResponseBodyInstanceDetail instanceDetail) {
        this.instanceDetail = instanceDetail;
        return this;
    }
    public DescribeContainerInstanceIdResponseBodyInstanceDetail getInstanceDetail() {
        return this.instanceDetail;
    }

    public DescribeContainerInstanceIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContainerInstanceIdResponseBodyInstanceDetail extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeContainerInstanceIdResponseBodyInstanceDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerInstanceIdResponseBodyInstanceDetail self = new DescribeContainerInstanceIdResponseBodyInstanceDetail();
            return TeaModel.build(map, self);
        }

        public DescribeContainerInstanceIdResponseBodyInstanceDetail setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
