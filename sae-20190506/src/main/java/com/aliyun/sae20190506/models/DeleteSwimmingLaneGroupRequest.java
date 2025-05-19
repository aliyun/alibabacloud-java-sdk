// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteSwimmingLaneGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2074</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing:demo</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static DeleteSwimmingLaneGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSwimmingLaneGroupRequest self = new DeleteSwimmingLaneGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSwimmingLaneGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DeleteSwimmingLaneGroupRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
