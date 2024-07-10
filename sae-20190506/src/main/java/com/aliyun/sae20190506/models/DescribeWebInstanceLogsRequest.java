// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeWebInstanceLogsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static DescribeWebInstanceLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebInstanceLogsRequest self = new DescribeWebInstanceLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebInstanceLogsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
