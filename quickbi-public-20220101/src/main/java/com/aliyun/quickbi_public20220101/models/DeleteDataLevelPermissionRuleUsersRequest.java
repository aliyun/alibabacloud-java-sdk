// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteDataLevelPermissionRuleUsersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ruleId&quot;:&quot;a5bb24da-<em><strong>-a891683e14da&quot;,&quot;cubeId&quot;:&quot;7c7223ae-</strong></em>-3c744528014b&quot;,&quot;delModel&quot;:{&quot;userGroups&quot;:[&quot;0d5fb19b-<em><strong>-1248fc27ca51&quot;,&quot;3d2c23d4-</strong></em>-f6390f325c2d&quot;],&quot;users&quot;:[&quot;4334<em><strong>358&quot;,&quot;Huang</strong></em>3fa822&quot;]}}</p>
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
