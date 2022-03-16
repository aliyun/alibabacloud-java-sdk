// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeReusableSlbResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

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
