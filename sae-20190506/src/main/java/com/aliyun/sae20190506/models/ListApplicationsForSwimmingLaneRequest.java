// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListApplicationsForSwimmingLaneRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>b2a8a925-477a-eswa-b823-d5e22500****</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;alicloud.service.tag&quot;:&quot;gray&quot;}</p>
     */
    @NameInMap("Tag")
    public String tag;

    public static ListApplicationsForSwimmingLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForSwimmingLaneRequest self = new ListApplicationsForSwimmingLaneRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForSwimmingLaneRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public ListApplicationsForSwimmingLaneRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListApplicationsForSwimmingLaneRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
