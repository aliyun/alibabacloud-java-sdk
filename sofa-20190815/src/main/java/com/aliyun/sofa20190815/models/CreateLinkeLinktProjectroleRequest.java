// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktProjectroleRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("Role")
    public String role;

    public static CreateLinkeLinktProjectroleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktProjectroleRequest self = new CreateLinkeLinktProjectroleRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktProjectroleRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public CreateLinkeLinktProjectroleRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
