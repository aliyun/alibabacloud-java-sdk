// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeWorkspaceGroupsRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static DescribeWorkspaceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkspaceGroupsRequest self = new DescribeWorkspaceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWorkspaceGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
