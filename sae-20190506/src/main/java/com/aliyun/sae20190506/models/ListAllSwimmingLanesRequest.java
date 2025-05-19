// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAllSwimmingLanesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2074</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static ListAllSwimmingLanesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllSwimmingLanesRequest self = new ListAllSwimmingLanesRequest();
        return TeaModel.build(map, self);
    }

    public ListAllSwimmingLanesRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public ListAllSwimmingLanesRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
