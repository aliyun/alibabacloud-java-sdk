// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceResourcesRequest extends TeaModel {
    /**
     * <p>The ID of the namespace. The region ID is not included. We recommend that you use this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("NameSpaceShortId")
    public String nameSpaceShortId;

    /**
     * <p>The ID of the namespace. The format is <code>Region ID:Namespace name</code>. This parameter is retained for backward compatibility. If you specify this parameter, <code>NameSpaceShortId</code> is ignored. We recommend that you use <code>NameSpaceShortId</code> to simplify the request.</p>
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
