// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateUserGroupRequest extends TeaModel {
    /**
     * <p>The ID of the parent user group. You can add new user groups to this group:</p>
     * <ul>
     * <li>If you enter the ID of a parent user group, the new user group is added to the user group with the ID.</li>
     * <li>If you enter -1, the new user group is added to the root directory.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3d2c23d4-2b41-4af8-a1f5-f6390f32****</p>
     */
    @NameInMap("ParentUserGroupId")
    public String parentUserGroupId;

    /**
     * <p>The description of the user group.</p>
     * <ul>
     * <li>Format verification: Maximum length 255</li>
     * <li>Special format verification: Chinese and English digits_ \ / | () ] [</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>User group description</p>
     */
    @NameInMap("UserGroupDescription")
    public String userGroupDescription;

    /**
     * <p>The unique ID of the user group.</p>
     * <ul>
     * <li>If you specify the UserGroupId parameter, the system automatically generates the UserGroupId parameter. If you specify the UserGroupId parameter, the user ID is used as the user group ID. You must ensure that the user ID is unique within the organization.</li>
     * <li>Format verification: Maximum length 64, cannot be -1,</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pop0001</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    /**
     * <p>The name of the RAM user group.</p>
     * <ul>
     * <li>Format verification: Maximum length 255</li>
     * <li>Special format verification: Chinese and English digits_ \ / | () ] [</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hangzhou Financial Report</p>
     */
    @NameInMap("UserGroupName")
    public String userGroupName;

    public static CreateUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserGroupRequest self = new CreateUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserGroupRequest setParentUserGroupId(String parentUserGroupId) {
        this.parentUserGroupId = parentUserGroupId;
        return this;
    }
    public String getParentUserGroupId() {
        return this.parentUserGroupId;
    }

    public CreateUserGroupRequest setUserGroupDescription(String userGroupDescription) {
        this.userGroupDescription = userGroupDescription;
        return this;
    }
    public String getUserGroupDescription() {
        return this.userGroupDescription;
    }

    public CreateUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public CreateUserGroupRequest setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
        return this;
    }
    public String getUserGroupName() {
        return this.userGroupName;
    }

}
