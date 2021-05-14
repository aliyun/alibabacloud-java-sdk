// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskListCheckResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("List")
    public java.util.List<DescribeRiskListCheckResultResponseBodyList> list;

    public static DescribeRiskListCheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskListCheckResultResponseBody self = new DescribeRiskListCheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskListCheckResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRiskListCheckResultResponseBody setList(java.util.List<DescribeRiskListCheckResultResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeRiskListCheckResultResponseBodyList> getList() {
        return this.list;
    }

    public static class DescribeRiskListCheckResultResponseBodyList extends TeaModel {
        @NameInMap("riskCount")
        public Long riskCount;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeRiskListCheckResultResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskListCheckResultResponseBodyList self = new DescribeRiskListCheckResultResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeRiskListCheckResultResponseBodyList setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

        public DescribeRiskListCheckResultResponseBodyList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
