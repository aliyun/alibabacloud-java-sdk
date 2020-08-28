// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackInstancesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StackGroupName")
    @Validation(required = true)
    public String stackGroupName;

    @NameInMap("StackInstanceAccountId")
    public String stackInstanceAccountId;

    @NameInMap("StackInstanceRegionId")
    public String stackInstanceRegionId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNumber")
    public Long pageNumber;

    public static ListStackInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStackInstancesRequest self = new ListStackInstancesRequest();
        return TeaModel.build(map, self);
    }

}
