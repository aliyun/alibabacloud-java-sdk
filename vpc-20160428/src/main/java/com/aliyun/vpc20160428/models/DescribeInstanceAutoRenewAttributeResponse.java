// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeInstanceAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public String totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public String pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public String pageNumber;

    @NameInMap("InstanceRenewAttributes")
    @Validation(required = true)
    public DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes instanceRenewAttributes;

    public static DescribeInstanceAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAutoRenewAttributeResponse self = new DescribeInstanceAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAutoRenewAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAutoRenewAttributeResponse setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstanceAutoRenewAttributeResponse setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceAutoRenewAttributeResponse setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceAutoRenewAttributeResponse setInstanceRenewAttributes(DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes instanceRenewAttributes) {
        this.instanceRenewAttributes = instanceRenewAttributes;
        return this;
    }
    public DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes getInstanceRenewAttributes() {
        return this.instanceRenewAttributes;
    }

    public static class DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("RenewalStatus")
        @Validation(required = true)
        public String renewalStatus;

        @NameInMap("Duration")
        @Validation(required = true)
        public Integer duration;

        @NameInMap("PricingCycle")
        @Validation(required = true)
        public String pricingCycle;

        public static DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute self = new DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute setRenewalStatus(String renewalStatus) {
            this.renewalStatus = renewalStatus;
            return this;
        }
        public String getRenewalStatus() {
            return this.renewalStatus;
        }

        public DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

    }

    public static class DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes extends TeaModel {
        @NameInMap("InstanceRenewAttribute")
        @Validation(required = true)
        public java.util.List<DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute> instanceRenewAttribute;

        public static DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes self = new DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes setInstanceRenewAttribute(java.util.List<DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute> instanceRenewAttribute) {
            this.instanceRenewAttribute = instanceRenewAttribute;
            return this;
        }
        public java.util.List<DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute> getInstanceRenewAttribute() {
            return this.instanceRenewAttribute;
        }

    }

}
