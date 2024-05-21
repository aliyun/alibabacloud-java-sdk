// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteDataLevelPermissionRuleUsersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteUserModel")
    public String deleteUserModel;

    public static DeleteDataLevelPermissionRuleUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataLevelPermissionRuleUsersRequest self = new DeleteDataLevelPermissionRuleUsersRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataLevelPermissionRuleUsersRequest setDeleteUserModel(String deleteUserModel) {
        this.deleteUserModel = deleteUserModel;
        return this;
    }
    public String getDeleteUserModel() {
        return this.deleteUserModel;
    }

}
