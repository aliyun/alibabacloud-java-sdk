// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateUserGroupRequest extends TeaModel {
    /**
     * <p>The description of the user group.</p>
     * <br>
     * <p>*   Format verification: Maximum length 255</p>
     * <p>*   Special format verification: Chinese and English digits\_ \ / | () ] \[</p>
     */
    @NameInMap("UserGroupDescription")
    public String userGroupDescription;

    /**
     * <p>The ID of the user group.</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    /**
     * <p>The name of the user group.</p>
     * <br>
     * <p>*   Format verification: Maximum length 255</p>
     * <p>*   Special format verification: Chinese and English digits\_ \ / | () ] \[</p>
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
