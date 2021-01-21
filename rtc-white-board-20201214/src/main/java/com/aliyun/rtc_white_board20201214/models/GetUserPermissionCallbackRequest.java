// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class GetUserPermissionCallbackRequest extends TeaModel {
    @NameInMap("UserId")
    public String userId;

    @NameInMap("DocKey")
    public String docKey;

    @NameInMap("PermissionType")
    public String permissionType;

    public static GetUserPermissionCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserPermissionCallbackRequest self = new GetUserPermissionCallbackRequest();
        return TeaModel.build(map, self);
    }

    public GetUserPermissionCallbackRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetUserPermissionCallbackRequest setDocKey(String docKey) {
        this.docKey = docKey;
        return this;
    }
    public String getDocKey() {
        return this.docKey;
    }

    public GetUserPermissionCallbackRequest setPermissionType(String permissionType) {
        this.permissionType = permissionType;
        return this;
    }
    public String getPermissionType() {
        return this.permissionType;
    }

}
