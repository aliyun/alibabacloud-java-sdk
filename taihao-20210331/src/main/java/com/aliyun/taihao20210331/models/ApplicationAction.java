// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ApplicationAction extends TeaModel {
    // componentName
    @NameInMap("componentName")
    public String componentName;

    // description
    @NameInMap("description")
    public String description;

    // name
    @NameInMap("name")
    public String name;

    public static ApplicationAction build(java.util.Map<String, ?> map) throws Exception {
        ApplicationAction self = new ApplicationAction();
        return TeaModel.build(map, self);
    }

    public ApplicationAction setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public ApplicationAction setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApplicationAction setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
