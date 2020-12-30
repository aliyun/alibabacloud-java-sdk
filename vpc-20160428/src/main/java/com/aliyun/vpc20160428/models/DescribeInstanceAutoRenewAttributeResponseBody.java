// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeInstanceAutoRenewAttributeResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("InstanceRenewAttributes")
    public DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributes instanceRenewAttributes;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("PageNumber")
    public String pageNumber;

    public static DescribeInstanceAutoRenewAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAutoRenewAttributeResponseBody self = new DescribeInstanceAutoRenewAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAutoRenewAttributeResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstanceAutoRenewAttributeResponseBody setInstanceRenewAttributes(DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributes instanceRenewAttributes) {
        this.instanceRenewAttributes = instanceRenewAttributes;
        return this;
    }
    public DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributes getInstanceRenewAttributes() {
        return this.instanceRenewAttributes;
    }

    public DescribeInstanceAutoRenewAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAutoRenewAttributeResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceAutoRenewAttributeResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute extends TeaModel {
        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RenewalStatus")
        public String renewalStatus;

        @NameInMap("PricingCycle")
        public String pricingCycle;

        public static DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute self = new DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute setRenewalStatus(String renewalStatus) {
            this.renewalStatus = renewalStatus;
            return this;
        }
        public String getRenewalStatus() {
            return this.renewalStatus;
        }

        public DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

    }

    public static class DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributes extends TeaModel {
        @NameInMap("InstanceRenewAttribute")
        public java.util.List<DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute> instanceRenewAttribute;

        public static DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributes self = new DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributes setInstanceRenewAttribute(java.util.List<DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute> instanceRenewAttribute) {
            this.instanceRenewAttribute = instanceRenewAttribute;
            return this;
        }
        public java.util.List<DescribeInstanceAutoRenewAttributeResponseBodyInstanceRenewAttributesInstanceRenewAttribute> getInstanceRenewAttribute() {
            return this.instanceRenewAttribute;
        }

    }

}
