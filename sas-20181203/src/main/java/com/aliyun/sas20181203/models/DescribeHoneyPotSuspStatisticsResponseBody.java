// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHoneyPotSuspStatisticsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9E3969FA-5ACC-4256-9FDE-BB6918CD0410</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the top 5 VPCs or assets for which alerts are most frequently generated.</p>
     */
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
        /**
         * <p>The total number of alerts that are generated for the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>8793</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The ID of the server.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>StatisticsKeyType</strong> is set to <strong>uuid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-p0whhoba24wd28p8****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>StatisticsKeyType</strong> is set to <strong>uuid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>abc-launch-advisor</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The type of the asset. Valid values:</p>
         * <ul>
         * <li><strong>vpcInstanceId</strong>: VPC</li>
         * <li><strong>uuid</strong>: server</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpcInstanceId</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of the VPC.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>StatisticsKeyType</strong> is set to <strong>vpcInstanceId</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-p0wwdsuutdyu1ygkt****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The name of the VPC.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>StatisticsKeyType</strong> is set to <strong>vpcInstanceId</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>abc01</p>
         */
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
