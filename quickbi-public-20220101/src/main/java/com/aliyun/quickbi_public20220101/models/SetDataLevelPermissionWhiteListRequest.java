// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SetDataLevelPermissionWhiteListRequest extends TeaModel {
    /**
     * <p>{ "ruleType": "ROW_LEVEL", // The row-level permission type. "usersModel": { "userGroups": [ "0d5fb19b- ***-1248 fc27ca51", // The ID of the user group. "3d2c23d4-***-f6390f325c2d" ], "users": [ "4334 ***358", // Quick BI the UserID of the user. "Huang***3fa822" ] }, "cubeId": "7c7223ae-31d1-4d2f-b11f-3c744528014b" }</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("WhiteListModel")
    public String whiteListModel;

    public static SetDataLevelPermissionWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDataLevelPermissionWhiteListRequest self = new SetDataLevelPermissionWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public SetDataLevelPermissionWhiteListRequest setWhiteListModel(String whiteListModel) {
        this.whiteListModel = whiteListModel;
        return this;
    }
    public String getWhiteListModel() {
        return this.whiteListModel;
    }

}
