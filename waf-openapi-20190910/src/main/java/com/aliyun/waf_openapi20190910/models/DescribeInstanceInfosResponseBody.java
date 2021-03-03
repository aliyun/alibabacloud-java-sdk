// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeInstanceInfosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceInfos")
    public java.util.List<DescribeInstanceInfosResponseBodyInstanceInfos> instanceInfos;

    public static DescribeInstanceInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceInfosResponseBody self = new DescribeInstanceInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceInfosResponseBody setInstanceInfos(java.util.List<DescribeInstanceInfosResponseBodyInstanceInfos> instanceInfos) {
        this.instanceInfos = instanceInfos;
        return this;
    }
    public java.util.List<DescribeInstanceInfosResponseBodyInstanceInfos> getInstanceInfos() {
        return this.instanceInfos;
    }

    public static class DescribeInstanceInfosResponseBodyInstanceInfos extends TeaModel {
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

        @NameInMap("SubscriptionType")
        public String subscriptionType;

        @NameInMap("Trial")
        public Integer trial;

        public static DescribeInstanceInfosResponseBodyInstanceInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceInfosResponseBodyInstanceInfos self = new DescribeInstanceInfosResponseBodyInstanceInfos();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceInfosResponseBodyInstanceInfos setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeInstanceInfosResponseBodyInstanceInfos setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public DescribeInstanceInfosResponseBodyInstanceInfos setRemainDay(Integer remainDay) {
            this.remainDay = remainDay;
            return this;
        }
        public Integer getRemainDay() {
            return this.remainDay;
        }

        public DescribeInstanceInfosResponseBodyInstanceInfos setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeInstanceInfosResponseBodyInstanceInfos setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public DescribeInstanceInfosResponseBodyInstanceInfos setInDebt(Integer inDebt) {
            this.inDebt = inDebt;
            return this;
        }
        public Integer getInDebt() {
            return this.inDebt;
        }

        public DescribeInstanceInfosResponseBodyInstanceInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceInfosResponseBodyInstanceInfos setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public DescribeInstanceInfosResponseBodyInstanceInfos setTrial(Integer trial) {
            this.trial = trial;
            return this;
        }
        public Integer getTrial() {
            return this.trial;
        }

    }

}
