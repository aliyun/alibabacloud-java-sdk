// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVpcListResponseBody extends TeaModel {
    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of VPCs.</p>
     */
    @NameInMap("VpcList")
    public java.util.List<DescribeVpcListResponseBodyVpcList> vpcList;

    public static DescribeVpcListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcListResponseBody self = new DescribeVpcListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcListResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeVpcListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcListResponseBody setVpcList(java.util.List<DescribeVpcListResponseBodyVpcList> vpcList) {
        this.vpcList = vpcList;
        return this;
    }
    public java.util.List<DescribeVpcListResponseBodyVpcList> getVpcList() {
        return this.vpcList;
    }

    public static class DescribeVpcListResponseBodyVpcList extends TeaModel {
        /**
         * <p>The number of Elastic Compute Service (ECS) instances.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("EcsCount")
        public Integer ecsCount;

        /**
         * <p>The information about the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>TestVpcNote</p>
         */
        @NameInMap("InstanceDesc")
        public String instanceDesc;

        /**
         * <p>The ID of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ins_1321_asedb_ada</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The region in which the server resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeVpcListResponseBodyVpcList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcListResponseBodyVpcList self = new DescribeVpcListResponseBodyVpcList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcListResponseBodyVpcList setEcsCount(Integer ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        public DescribeVpcListResponseBodyVpcList setInstanceDesc(String instanceDesc) {
            this.instanceDesc = instanceDesc;
            return this;
        }
        public String getInstanceDesc() {
            return this.instanceDesc;
        }

        public DescribeVpcListResponseBodyVpcList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeVpcListResponseBodyVpcList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeVpcListResponseBodyVpcList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
