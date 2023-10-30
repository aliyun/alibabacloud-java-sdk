// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RemoveUsersFromGroupRequest extends TeaModel {
    /**
     * <p>The ID of the user who you want to remove. The value is a JSON string. You can add up to 100 user IDs. If you specify multiple IDs, separate the IDs with commas (,).</p>
     * <br>
     * <p>>  You can call the [ListUsers](~~204522~~) operation to query the IDs of users.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the user.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The return code that indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   **OK**: The call was successful.</p>
     * <br>
     * <p>*   **UNEXPECTED**: An unknown error occurred.</p>
     * <br>
     * <p>*   **INVALID_ARGUMENT**: A request parameter is invalid.</p>
     * <br>
     * <p>> Make sure that the request parameters are valid and call the operation again.</p>
     * <br>
     * <p>*   **OBJECT_NOT_FOUND**: The specified object on which you want to perform the operation does not exist.</p>
     * <br>
     * <p>> Check whether the specified ID of the bastion host exists, whether the specified hosts exist, and whether the specified host IDs are valid. Then, call the operation again.</p>
     * <br>
     * <p>*   **OBJECT_AlREADY_EXISTS**: The specified object on which you want to perform the operation already exists.</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("UserIds")
    public String userIds;

    public static RemoveUsersFromGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUsersFromGroupRequest self = new RemoveUsersFromGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUsersFromGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveUsersFromGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveUsersFromGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public RemoveUsersFromGroupRequest setUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }
    public String getUserIds() {
        return this.userIds;
    }

}
