// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceResourcesRequest extends TeaModel {
    /**
     * <p>The short namespace ID. The region ID is not required. This parameter is recommended.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("NameSpaceShortId")
    public String nameSpaceShortId;

    /**
     * <p>The long namespace ID. If this parameter is specified, it takes effect and NameSpaceShortId is ignored. This parameter is retained for compatibility. Use the short namespace ID to simplify parameters.</p>
     * 
     * <strong>example:</strong>
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
