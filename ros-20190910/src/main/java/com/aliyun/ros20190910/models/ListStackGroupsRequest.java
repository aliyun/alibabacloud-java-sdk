// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Status")
    public String status;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNumber")
    public Long pageNumber;

    public static ListStackGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupsRequest self = new ListStackGroupsRequest();
        return TeaModel.build(map, self);
    }

}
