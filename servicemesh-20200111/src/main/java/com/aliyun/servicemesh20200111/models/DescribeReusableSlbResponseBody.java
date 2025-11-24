// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeReusableSlbResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EDDC0D86-2FC3-56FB-9213-96EB0A3523F1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of SLB instances that can be reused.</p>
     */
    @NameInMap("ReusableSlbList")
    public java.util.List<DescribeReusableSlbResponseBodyReusableSlbList> reusableSlbList;

    public static DescribeReusableSlbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReusableSlbResponseBody self = new DescribeReusableSlbResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReusableSlbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReusableSlbResponseBody setReusableSlbList(java.util.List<DescribeReusableSlbResponseBodyReusableSlbList> reusableSlbList) {
        this.reusableSlbList = reusableSlbList;
        return this;
    }
    public java.util.List<DescribeReusableSlbResponseBodyReusableSlbList> getReusableSlbList() {
        return this.reusableSlbList;
    }

    public static class DescribeReusableSlbResponseBodyReusableSlbList extends TeaModel {
        /**
         * <p>The ID of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp17xygzsxth0bwlz****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The name of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ad6044b015ac54484a20c47241175bb3</p>
         */
        @NameInMap("LoadBalancerName")
        public String loadBalancerName;

        public static DescribeReusableSlbResponseBodyReusableSlbList build(java.util.Map<String, ?> map) throws Exception {
            DescribeReusableSlbResponseBodyReusableSlbList self = new DescribeReusableSlbResponseBodyReusableSlbList();
            return TeaModel.build(map, self);
        }

        public DescribeReusableSlbResponseBodyReusableSlbList setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DescribeReusableSlbResponseBodyReusableSlbList setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

    }

}
