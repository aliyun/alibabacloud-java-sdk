// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktProjectroleRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("Role")
    public String role;

    public static DeleteLinkeLinktProjectroleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktProjectroleRequest self = new DeleteLinkeLinktProjectroleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktProjectroleRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public DeleteLinkeLinktProjectroleRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
