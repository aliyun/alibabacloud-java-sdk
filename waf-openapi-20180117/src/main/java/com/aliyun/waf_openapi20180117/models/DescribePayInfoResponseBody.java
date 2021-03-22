// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class DescribePayInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribePayInfoResponseBodyResult result;

    public static DescribePayInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePayInfoResponseBody self = new DescribePayInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePayInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePayInfoResponseBody setResult(DescribePayInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribePayInfoResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribePayInfoResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("EndDate")
        public Long endDate;

        @NameInMap("RemainDay")
        public Integer remainDay;

        @NameInMap("Region")
        public String region;

        @NameInMap("PayType")
        public Integer payType;

        @NameInMap("InDebt")
        public Integer inDebt;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Trial")
        public Integer trial;

        public static DescribePayInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribePayInfoResponseBodyResult self = new DescribePayInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribePayInfoResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribePayInfoResponseBodyResult setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public DescribePayInfoResponseBodyResult setRemainDay(Integer remainDay) {
            this.remainDay = remainDay;
            return this;
        }
        public Integer getRemainDay() {
            return this.remainDay;
        }

        public DescribePayInfoResponseBodyResult setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribePayInfoResponseBodyResult setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public DescribePayInfoResponseBodyResult setInDebt(Integer inDebt) {
            this.inDebt = inDebt;
            return this;
        }
        public Integer getInDebt() {
            return this.inDebt;
        }

        public DescribePayInfoResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePayInfoResponseBodyResult setTrial(Integer trial) {
            this.trial = trial;
            return this;
        }
        public Integer getTrial() {
            return this.trial;
        }

    }

}
