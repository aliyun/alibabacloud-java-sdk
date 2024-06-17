// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListInstanceSpecsRequest extends TeaModel {
    /**
     * <p>The node type. Valid values: qrs, search, index, and cluster. qrs indicates a query node, search indicates a data node, index indicates an index node, and cluster indicates a cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>search</p>
     */
    @NameInMap("type")
    public String type;

    public static ListInstanceSpecsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceSpecsRequest self = new ListInstanceSpecsRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceSpecsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
