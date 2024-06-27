// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateUserGroupRequest extends TeaModel {
    /**
     * <p>The description of the user group.</p>
     * <ul>
     * <li>Format verification: Maximum length 255</li>
     * <li>Special format verification: Chinese and English digits_ \ / | () ] [</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Description</p>
     */
    @NameInMap("UserGroupDescription")
    public String userGroupDescription;

    /**
     * <p>The ID of the user group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f5eeb52e-d9c2-4a8b-80e3-47ab55c2****</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    /**
     * <p>The name of the user group.</p>
     * <ul>
     * <li>Format verification: Maximum length 255</li>
     * <li>Special format verification: Chinese and English digits_ \ / | () ] [</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pop0001</p>
     */
    @NameInMap("UserGroupName")
    public String userGroupName;

    public static UpdateUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserGroupRequest self = new UpdateUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserGroupRequest setUserGroupDescription(String userGroupDescription) {
        this.userGroupDescription = userGroupDescription;
        return this;
    }
    public String getUserGroupDescription() {
        return this.userGroupDescription;
    }

    public UpdateUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public UpdateUserGroupRequest setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
        return this;
    }
    public String getUserGroupName() {
        return this.userGroupName;
    }

}
