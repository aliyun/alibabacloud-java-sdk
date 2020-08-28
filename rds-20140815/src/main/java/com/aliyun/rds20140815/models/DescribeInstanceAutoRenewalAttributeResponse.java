// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceAutoRenewalAttributeResponse extends TeaModel {
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
    public DescribeInstanceAutoRenewalAttributeResponseItems items;

    public static DescribeInstanceAutoRenewalAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAutoRenewalAttributeResponse self = new DescribeInstanceAutoRenewalAttributeResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeInstanceAutoRenewalAttributeResponseItemsItem extends TeaModel {
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Duration")
        @Validation(required = true)
        public Integer duration;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("AutoRenew")
        @Validation(required = true)
        public String autoRenew;

        public static DescribeInstanceAutoRenewalAttributeResponseItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAutoRenewalAttributeResponseItemsItem self = new DescribeInstanceAutoRenewalAttributeResponseItemsItem();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceAutoRenewalAttributeResponseItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<DescribeInstanceAutoRenewalAttributeResponseItemsItem> item;

        public static DescribeInstanceAutoRenewalAttributeResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAutoRenewalAttributeResponseItems self = new DescribeInstanceAutoRenewalAttributeResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
