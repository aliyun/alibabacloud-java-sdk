// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddDataLevelPermissionRuleUsersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddUserModel")
    public String addUserModel;

    public static AddDataLevelPermissionRuleUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDataLevelPermissionRuleUsersRequest self = new AddDataLevelPermissionRuleUsersRequest();
        return TeaModel.build(map, self);
    }

    public AddDataLevelPermissionRuleUsersRequest setAddUserModel(String addUserModel) {
        this.addUserModel = addUserModel;
        return this;
    }
    public String getAddUserModel() {
        return this.addUserModel;
    }

}
