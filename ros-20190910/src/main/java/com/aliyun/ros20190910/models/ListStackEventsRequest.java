// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackEventsRequest extends TeaModel {
    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("Status")
    public java.util.List<String> status;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceType")
    public java.util.List<String> resourceType;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("LogicalResourceId")
    public java.util.List<String> logicalResourceId;

    public static ListStackEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStackEventsRequest self = new ListStackEventsRequest();
        return TeaModel.build(map, self);
    }

}
