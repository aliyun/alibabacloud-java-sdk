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

    }

    public static class DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes extends TeaModel {
        @NameInMap("InstanceRenewAttribute")
        @Validation(required = true)
        public java.util.List<DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributesInstanceRenewAttribute> instanceRenewAttribute;

        public static DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes self = new DescribeInstanceAutoRenewAttributeResponseInstanceRenewAttributes();
            return TeaModel.build(map, self);
        }

    }

}
