// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktModuleRequest extends TeaModel {
    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Owners")
    public String owners;

    public static UpdateLinkeLinktModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktModuleRequest self = new UpdateLinkeLinktModuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktModuleRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public UpdateLinkeLinktModuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLinkeLinktModuleRequest setOwners(String owners) {
        this.owners = owners;
        return this;
    }
    public String getOwners() {
        return this.owners;
    }

}
