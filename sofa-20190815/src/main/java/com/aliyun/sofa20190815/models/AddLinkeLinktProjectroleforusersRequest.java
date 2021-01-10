// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeLinktProjectroleforusersRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("Role")
    public String role;

    @NameInMap("Uids")
    public String uids;

    public static AddLinkeLinktProjectroleforusersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeLinktProjectroleforusersRequest self = new AddLinkeLinktProjectroleforusersRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeLinktProjectroleforusersRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public AddLinkeLinktProjectroleforusersRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public AddLinkeLinktProjectroleforusersRequest setUids(String uids) {
        this.uids = uids;
        return this;
    }
    public String getUids() {
        return this.uids;
    }

}
