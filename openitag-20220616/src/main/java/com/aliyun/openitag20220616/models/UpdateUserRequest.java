// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    /**
     * <p>Role. Possible values:</p>
     * <ul>
     * <li>OPERATOR: Annotator.</li>
     * <li>ADMIN: Administrator.</li>
     * <li>LEADER: Annotation team leader.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ADMIN</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>Username.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static UpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserRequest self = new UpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public UpdateUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
