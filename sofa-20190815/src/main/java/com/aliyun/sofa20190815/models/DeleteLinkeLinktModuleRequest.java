// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktModuleRequest extends TeaModel {
    @NameInMap("ModuleId")
    public String moduleId;

    public static DeleteLinkeLinktModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktModuleRequest self = new DeleteLinkeLinktModuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktModuleRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

}
