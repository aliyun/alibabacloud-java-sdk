// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddDataLevelPermissionRuleUsersRequest extends TeaModel {
    /**
     * <p>{
     * &quot;ruleId&quot;: &quot;a5bb24da-<em><strong>-a891683e14da&quot;, // The ID of the row-level permission rule.
     * &quot;cubeId&quot;: &quot;7c7223ae-</strong></em>-3c744528014b&quot;, // The ID of the dataset.
     * &quot;addModel&quot;: {
     * &quot;userGroups&quot;: [
     * &quot;0d5fb19b-<em><strong>-1248fc27ca51&quot;, // The IDs of the user groups to add.
     * &quot;3d2c23d4-</strong></em>-f6390f325c2d&quot;
     * ],
     * &quot;users&quot;: [
     * &quot;433&#x34;<em><strong>358&quot;, // The user IDs of the users to add.
     * &quot;Huang</strong></em>&#x33;fa822&quot;
     * ]
     * }
     * }</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ruleId&quot;:&quot;a5bb24da-<em><strong>-a891683e14da&quot;,&quot;cubeId&quot;:&quot;7c7223ae-</strong></em>-3c744528014b&quot;,&quot;addModel&quot;:{&quot;userGroups&quot;:[&quot;0d5fb19b-<em><strong>-1248fc27ca51&quot;,&quot;3d2c23d4-</strong></em>-f6390f325c2d&quot;],&quot;users&quot;:[&quot;4334<em><strong>358&quot;,&quot;Huang</strong></em>3fa822&quot;]}}</p>
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
