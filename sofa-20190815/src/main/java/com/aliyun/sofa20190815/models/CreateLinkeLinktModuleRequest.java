// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktModuleRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Owners")
    public String owners;

    @NameInMap("ProjectSign")
    public String projectSign;

    public static CreateLinkeLinktModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktModuleRequest self = new CreateLinkeLinktModuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktModuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLinkeLinktModuleRequest setOwners(String owners) {
        this.owners = owners;
        return this;
    }
    public String getOwners() {
        return this.owners;
    }

    public CreateLinkeLinktModuleRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
