// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ModifyClriskDataNodeRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    public static ModifyClriskDataNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClriskDataNodeRequest self = new ModifyClriskDataNodeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClriskDataNodeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyClriskDataNodeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyClriskDataNodeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
