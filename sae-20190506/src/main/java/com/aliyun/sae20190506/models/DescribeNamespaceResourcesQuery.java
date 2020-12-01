// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceResourcesQuery extends TeaModel {
    @NameInMap("NamespaceId")
    @Validation(required = true)
    public String namespaceId;

    public static DescribeNamespaceResourcesQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceResourcesQuery self = new DescribeNamespaceResourcesQuery();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceResourcesQuery setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
