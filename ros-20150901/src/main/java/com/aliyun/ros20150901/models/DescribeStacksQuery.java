// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class DescribeStacksQuery extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("Name")
    public String name;

    @NameInMap("StackId")
    public String stackId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeStacksQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeStacksQuery self = new DescribeStacksQuery();
        return TeaModel.build(map, self);
    }

}
