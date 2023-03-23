// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceResourcesRequest extends TeaModel {
    @NameInMap("NameSpaceShortId")
    public String nameSpaceShortId;

    /**
     * <p>cn-shanghai:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static DescribeNamespaceResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceResourcesRequest self = new DescribeNamespaceResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceResourcesRequest setNameSpaceShortId(String nameSpaceShortId) {
        this.nameSpaceShortId = nameSpaceShortId;
        return this;
    }
    public String getNameSpaceShortId() {
        return this.nameSpaceShortId;
    }

    public DescribeNamespaceResourcesRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
