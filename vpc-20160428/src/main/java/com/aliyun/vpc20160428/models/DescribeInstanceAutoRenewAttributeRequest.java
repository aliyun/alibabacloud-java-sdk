// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeInstanceAutoRenewAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    @Validation(required = true)
    public String instanceType;

    @NameInMap("RenewalStatus")
    public String renewalStatus;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeInstanceAutoRenewAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAutoRenewAttributeRequest self = new DescribeInstanceAutoRenewAttributeRequest();
        return TeaModel.build(map, self);
    }

}
