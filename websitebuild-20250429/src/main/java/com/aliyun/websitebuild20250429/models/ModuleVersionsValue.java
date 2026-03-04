// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ModuleVersionsValue extends TeaModel {
    /**
     * <p>code</p>
     * 
     * <strong>example:</strong>
     * <p>code</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>name</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>components</p>
     */
    @NameInMap("Components")
    public java.util.Map<String, ModuleVersionsValueComponentsValue> components;

    public static ModuleVersionsValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleVersionsValue self = new ModuleVersionsValue();
        return TeaModel.build(map, self);
    }

    public ModuleVersionsValue setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModuleVersionsValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModuleVersionsValue setComponents(java.util.Map<String, ModuleVersionsValueComponentsValue> components) {
        this.components = components;
        return this;
    }
    public java.util.Map<String, ModuleVersionsValueComponentsValue> getComponents() {
        return this.components;
    }

}
