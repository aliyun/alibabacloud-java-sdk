// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class AddProjectMembersRequest extends TeaModel {
    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pd_061716****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The Yike user IDs to be added. Separate multiple IDs with commas. The users must belong to the current Alibaba Cloud account. By default, the Edit permission is granted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001,10002</p>
     */
    @NameInMap("YikeUserIds")
    public String yikeUserIds;

    public static AddProjectMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProjectMembersRequest self = new AddProjectMembersRequest();
        return TeaModel.build(map, self);
    }

    public AddProjectMembersRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AddProjectMembersRequest setYikeUserIds(String yikeUserIds) {
        this.yikeUserIds = yikeUserIds;
        return this;
    }
    public String getYikeUserIds() {
        return this.yikeUserIds;
    }

}
