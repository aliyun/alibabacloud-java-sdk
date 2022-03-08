// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeBillingsResponseBody extends TeaModel {
    @NameInMap("Billings")
    public java.util.List<DescribeBillingsResponseBodyBillings> billings;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBillingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBillingsResponseBody self = new DescribeBillingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBillingsResponseBody setBillings(java.util.List<DescribeBillingsResponseBodyBillings> billings) {
        this.billings = billings;
        return this;
    }
    public java.util.List<DescribeBillingsResponseBodyBillings> getBillings() {
        return this.billings;
    }

    public DescribeBillingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBillingsResponseBodyBillings extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("BillingStatus")
        public String billingStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ResourceType")
        public String resourceType;

        public static DescribeBillingsResponseBodyBillings build(java.util.Map<String, ?> map) throws Exception {
            DescribeBillingsResponseBodyBillings self = new DescribeBillingsResponseBodyBillings();
            return TeaModel.build(map, self);
        }

        public DescribeBillingsResponseBodyBillings setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeBillingsResponseBodyBillings setBillingStatus(String billingStatus) {
            this.billingStatus = billingStatus;
            return this;
        }
        public String getBillingStatus() {
            return this.billingStatus;
        }

        public DescribeBillingsResponseBodyBillings setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeBillingsResponseBodyBillings setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
