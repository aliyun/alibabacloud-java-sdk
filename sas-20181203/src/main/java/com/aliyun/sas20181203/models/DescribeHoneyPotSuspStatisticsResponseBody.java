// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHoneyPotSuspStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuspHoneyPotStatisticsResponse")
    public java.util.List<DescribeHoneyPotSuspStatisticsResponseBodySuspHoneyPotStatisticsResponse> suspHoneyPotStatisticsResponse;

    public static DescribeHoneyPotSuspStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHoneyPotSuspStatisticsResponseBody self = new DescribeHoneyPotSuspStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHoneyPotSuspStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHoneyPotSuspStatisticsResponseBody setSuspHoneyPotStatisticsResponse(java.util.List<DescribeHoneyPotSuspStatisticsResponseBodySuspHoneyPotStatisticsResponse> suspHoneyPotStatisticsResponse) {
        this.suspHoneyPotStatisticsResponse = suspHoneyPotStatisticsResponse;
        return this;
    }
    public java.util.List<DescribeHoneyPotSuspStatisticsResponseBodySuspHoneyPotStatisticsResponse> getSuspHoneyPotStatisticsResponse() {
        return this.suspHoneyPotStatisticsResponse;
    }

    public static class DescribeHoneyPotSuspStatisticsResponseBodySuspHoneyPotStatisticsResponse extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Type")
        public String type;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeHoneyPotSuspStatisticsResponseBodySuspHoneyPotStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
            DescribeHoneyPotSuspStatisticsResponseBodySuspHoneyPotStatisticsResponse self = new DescribeHoneyPotSuspStatisticsResponseBodySuspHoneyPotStatisticsResponse();
            return TeaModel.build(map, self);
        }

        public DescribeHoneyPotSuspStatisticsResponseBodySuspHoneyPotStatisticsResponse setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeHoneyPotSuspStatisticsResponseBodySuspHoneyPotStatisticsResponse setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeHoneyPotSuspStatisticsResponseBodySuspHoneyPotStatisticsResponse setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeHoneyPotSuspStatisticsResponseBodySuspHoneyPotStatisticsResponse setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeHoneyPotSuspStatisticsResponseBodySuspHoneyPotStatisticsResponse setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeHoneyPotSuspStatisticsResponseBodySuspHoneyPotStatisticsResponse setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

}
