// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceQuery extends TeaModel {
    @NameInMap("NamespaceId")
    @Validation(required = true)
    public String namespaceId;

    public static DescribeNamespaceQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceQuery self = new DescribeNamespaceQuery();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceQuery setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
