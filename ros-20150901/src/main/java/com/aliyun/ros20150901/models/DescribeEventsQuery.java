// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class DescribeEventsQuery extends TeaModel {
    @NameInMap("ResourceStatus")
    public String resourceStatus;

    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeEventsQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsQuery self = new DescribeEventsQuery();
        return TeaModel.build(map, self);
    }

}
