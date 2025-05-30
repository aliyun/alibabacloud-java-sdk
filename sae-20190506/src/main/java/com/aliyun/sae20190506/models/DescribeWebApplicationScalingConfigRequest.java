// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeWebApplicationScalingConfigRequest extends TeaModel {
    /**
     * <p>The namespace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:sae-test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static DescribeWebApplicationScalingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebApplicationScalingConfigRequest self = new DescribeWebApplicationScalingConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebApplicationScalingConfigRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
