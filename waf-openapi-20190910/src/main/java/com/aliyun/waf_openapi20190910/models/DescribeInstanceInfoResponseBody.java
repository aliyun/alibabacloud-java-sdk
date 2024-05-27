// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeInstanceInfoResponseBody extends TeaModel {
    /**
     * <p>The information about the WAF instance.</p>
     */
    @NameInMap("InstanceInfo")
    public DescribeInstanceInfoResponseBodyInstanceInfo instanceInfo;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceInfoResponseBody self = new DescribeInstanceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceInfoResponseBody setInstanceInfo(DescribeInstanceInfoResponseBodyInstanceInfo instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }
    public DescribeInstanceInfoResponseBodyInstanceInfo getInstanceInfo() {
        return this.instanceInfo;
    }

    public DescribeInstanceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceInfoResponseBodyInstanceInfo extends TeaModel {
        /**
         * <p>The expiration time of the WAF instance. This value is a UNIX timestamp. Unit: seconds.</p>
         * <br>
         * <p>>  If the value of **PayType** is **0**, this parameter is not returned. The value 0 indicates that no WAF instances are purchased.</p>
         */
        @NameInMap("EndDate")
        public Long endDate;

        /**
         * <p>Indicates whether the WAF instance has overdue payments. Valid values:</p>
         * <br>
         * <p>*   **0**: The instance has overdue payments.</p>
         * <p>*   **1**: The instance does not have overdue payments.</p>
         * <br>
         * <p>>  If the value of **PayType** is **0**, this parameter is not returned. The value 0 indicates that no WAF instances are purchased.</p>
         */
        @NameInMap("InDebt")
        public Integer inDebt;

        /**
         * <p>The ID of the WAF instance.</p>
         * <br>
         * <p>>  If the value of **PayType** is **0**, this parameter is not returned. The value 0 indicates that no WAF instances are purchased.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The activation status of WAF. Valid values:</p>
         * <br>
         * <p>*   **0**: No WAF instances are purchased within the Alibaba Cloud account.</p>
         * <p>*   **1**: A subscription WAF instance is purchased within the Alibaba Cloud account.</p>
         */
        @NameInMap("PayType")
        public Integer payType;

        /**
         * <p>The region in which the WAF instance resides. Valid values:</p>
         * <br>
         * <p>*   **cn**: a region in the Chinese mainland</p>
         * <p>*   **cn-hongkong**: a region outside the Chinese mainland</p>
         * <br>
         * <p>>  If the value of **PayType** is **0**, this parameter is not returned. The value 0 indicates that no WAF instances are purchased.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The number of remaining days before the trial period of the WAF instance ends.</p>
         * <br>
         * <p>>  This parameter is returned only if the value of **Trial** is **1**. The value 1 indicates that the free trial of a WAF instance is activated.</p>
         */
        @NameInMap("RemainDay")
        public Integer remainDay;

        /**
         * <p>Indicates whether the WAF instance expires. Valid values:</p>
         * <br>
         * <p>*   **0**: The instance expires.</p>
         * <p>*   **1**: The instance does not expire.</p>
         * <br>
         * <p>>  If the value of **PayType** is **0**, this parameter is not returned. The value 0 indicates that no WAF instances are purchased.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The billing method of the WAF instance: The value is fixed as **Subscription**.</p>
         * <br>
         * <p>>  If the value of **PayType** is **0**, this parameter is not returned. The value 0 indicates that no WAF instances are purchased.</p>
         */
        @NameInMap("SubscriptionType")
        public String subscriptionType;

        /**
         * <p>Indicates whether a WAF instance of the free trial edition is activated within the Alibaba Cloud account. Valid values:</p>
         * <br>
         * <p>*   **0**: no</p>
         * <p>*   **1**: yes</p>
         * <br>
         * <p>>  This parameter is returned only if a WAF instance of the free trial edition is activated within the Alibaba Cloud account.</p>
         */
        @NameInMap("Trial")
        public Integer trial;

        /**
         * <p>The edition of the WAF instance. Valid values:</p>
         * <br>
         * <p>*   **version_pro_china**: a WAF Pro instance in the Chinese mainland</p>
         * <p>*   **version_business_china**: a WAF Business instance in the Chinese mainland</p>
         * <p>*   **version_enterprise_china**: a WAF Enterprise instance in the Chinese mainland</p>
         * <p>*   **version_exclusive_china**: a WAF Exclusive instance in the Chinese mainland</p>
         * <p>*   **version_hybrid_cloud_standard_china**: a Hybrid Cloud WAF instance in the Chinese mainland</p>
         * <p>*   **version_pro_china**: a WAF Pro instance outside the Chinese mainland</p>
         * <p>*   **version_business**: a WAF Business instance outside the Chinese mainland</p>
         * <p>*   **version_enterprise**: a WAF Enterprise instance outside the Chinese mainland</p>
         * <p>*   **version_exclusive**: a WAF Exclusive instance outside the Chinese mainland</p>
         * <p>*   **version_hybrid_cloud_standard**: a Hybrid Cloud WAF instance outside the Chinese mainland</p>
         * <br>
         * <p>The preceding list contains all the editions of WAF instances within accounts that are created at the International site. If the returned version is not in the list, check whether your account is created at the International site.</p>
         * <br>
         * <p>>  If the value of **PayType** is **0**, this parameter is not returned. The value 0 indicates that no WAF instances are purchased.</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeInstanceInfoResponseBodyInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceInfoResponseBodyInstanceInfo self = new DescribeInstanceInfoResponseBodyInstanceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceInfoResponseBodyInstanceInfo setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public DescribeInstanceInfoResponseBodyInstanceInfo setInDebt(Integer inDebt) {
            this.inDebt = inDebt;
            return this;
        }
        public Integer getInDebt() {
            return this.inDebt;
        }

        public DescribeInstanceInfoResponseBodyInstanceInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceInfoResponseBodyInstanceInfo setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public DescribeInstanceInfoResponseBodyInstanceInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeInstanceInfoResponseBodyInstanceInfo setRemainDay(Integer remainDay) {
            this.remainDay = remainDay;
            return this;
        }
        public Integer getRemainDay() {
            return this.remainDay;
        }

        public DescribeInstanceInfoResponseBodyInstanceInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeInstanceInfoResponseBodyInstanceInfo setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public DescribeInstanceInfoResponseBodyInstanceInfo setTrial(Integer trial) {
            this.trial = trial;
            return this;
        }
        public Integer getTrial() {
            return this.trial;
        }

        public DescribeInstanceInfoResponseBodyInstanceInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
