// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupOperationsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StackGroupName")
    @Validation(required = true)
    public String stackGroupName;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNumber")
    public Long pageNumber;

    public static ListStackGroupOperationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupOperationsRequest self = new ListStackGroupOperationsRequest();
        return TeaModel.build(map, self);
    }

}
