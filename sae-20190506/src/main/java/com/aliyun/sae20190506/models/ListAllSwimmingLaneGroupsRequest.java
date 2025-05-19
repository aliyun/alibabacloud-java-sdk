// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAllSwimmingLaneGroupsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static ListAllSwimmingLaneGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllSwimmingLaneGroupsRequest self = new ListAllSwimmingLaneGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListAllSwimmingLaneGroupsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
