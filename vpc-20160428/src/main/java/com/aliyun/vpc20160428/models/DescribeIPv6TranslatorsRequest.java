// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Ipv6TranslatorId")
    public String ipv6TranslatorId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("Status")
    public String status;

    @NameInMap("AllocateIpv6Addr")
    public String allocateIpv6Addr;

    @NameInMap("AllocateIpv4Addr")
    public String allocateIpv4Addr;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("BusinessStatus")
    public String businessStatus;

    public static DescribeIPv6TranslatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPv6TranslatorsRequest self = new DescribeIPv6TranslatorsRequest();
        return TeaModel.build(map, self);
    }

}
