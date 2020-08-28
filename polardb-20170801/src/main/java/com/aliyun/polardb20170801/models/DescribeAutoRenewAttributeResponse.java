// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeAutoRenewAttributeResponseItems items;

    public static DescribeAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoRenewAttributeResponse self = new DescribeAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeAutoRenewAttributeResponseItemsAutoRenewAttribute extends TeaModel {
        @NameInMap("DBClusterId")
        @Validation(required = true)
        public String DBClusterId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("AutoRenewEnabled")
        @Validation(required = true)
        public Boolean autoRenewEnabled;

        @NameInMap("Duration")
        @Validation(required = true)
        public Integer duration;

        @NameInMap("PeriodUnit")
        @Validation(required = true)
        public String periodUnit;

        @NameInMap("RenewalStatus")
        @Validation(required = true)
        public String renewalStatus;

        public static DescribeAutoRenewAttributeResponseItemsAutoRenewAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoRenewAttributeResponseItemsAutoRenewAttribute self = new DescribeAutoRenewAttributeResponseItemsAutoRenewAttribute();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAutoRenewAttributeResponseItems extends TeaModel {
        @NameInMap("AutoRenewAttribute")
        @Validation(required = true)
        public java.util.List<DescribeAutoRenewAttributeResponseItemsAutoRenewAttribute> autoRenewAttribute;

        public static DescribeAutoRenewAttributeResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoRenewAttributeResponseItems self = new DescribeAutoRenewAttributeResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
