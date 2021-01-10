// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeLinktProjectroleforuserRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("Role")
    public String role;

    @NameInMap("Uid")
    public String uid;

    public static RemoveLinkeLinktProjectroleforuserRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeLinktProjectroleforuserRequest self = new RemoveLinkeLinktProjectroleforuserRequest();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeLinktProjectroleforuserRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public RemoveLinkeLinktProjectroleforuserRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public RemoveLinkeLinktProjectroleforuserRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
