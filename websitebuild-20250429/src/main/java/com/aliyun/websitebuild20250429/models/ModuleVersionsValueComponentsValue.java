// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ModuleVersionsValueComponentsValue extends TeaModel {
    /**
     * <p>Unique component code (system internal identity)</p>
     * 
     * <strong>example:</strong>
     * <p>ComponentCode</p>
     */
    @NameInMap("ComponentCode")
    public String componentCode;

    /**
     * <p>Widget display name (user-visible name)</p>
     * 
     * <strong>example:</strong>
     * <p>ComponentName</p>
     */
    @NameInMap("ComponentName")
    public String componentName;

    /**
     * <p>Component instance attribute configuration</p>
     */
    @NameInMap("InstanceProperty")
    public java.util.List<ModuleVersionsValueComponentsValueInstanceProperty> instanceProperty;

    /**
     * <p>Widget instance attribute configuration</p>
     */
    @NameInMap("Properties")
    public java.util.Map<String, ModuleVersionsValueComponentsValuePropertiesValue> properties;

    /**
     * <p>Module property status</p>
     * 
     * <strong>example:</strong>
     * <p>attr</p>
     */
    @NameInMap("ModuleAttrStatus")
    public Integer moduleAttrStatus;

    public static ModuleVersionsValueComponentsValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleVersionsValueComponentsValue self = new ModuleVersionsValueComponentsValue();
        return TeaModel.build(map, self);
    }

    public ModuleVersionsValueComponentsValue setComponentCode(String componentCode) {
        this.componentCode = componentCode;
        return this;
    }
    public String getComponentCode() {
        return this.componentCode;
    }

    public ModuleVersionsValueComponentsValue setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public ModuleVersionsValueComponentsValue setInstanceProperty(java.util.List<ModuleVersionsValueComponentsValueInstanceProperty> instanceProperty) {
        this.instanceProperty = instanceProperty;
        return this;
    }
    public java.util.List<ModuleVersionsValueComponentsValueInstanceProperty> getInstanceProperty() {
        return this.instanceProperty;
    }

    public ModuleVersionsValueComponentsValue setProperties(java.util.Map<String, ModuleVersionsValueComponentsValuePropertiesValue> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ModuleVersionsValueComponentsValuePropertiesValue> getProperties() {
        return this.properties;
    }

    public ModuleVersionsValueComponentsValue setModuleAttrStatus(Integer moduleAttrStatus) {
        this.moduleAttrStatus = moduleAttrStatus;
        return this;
    }
    public Integer getModuleAttrStatus() {
        return this.moduleAttrStatus;
    }

    public static class ModuleVersionsValueComponentsValueInstancePropertyValues extends TeaModel {
        /**
         * <p>Property encoding (system internal identity)</p>
         * 
         * <strong>example:</strong>
         * <p>code</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Attribute Value encoding (internal System value)</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>Property display name (User-visible name)</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        public static ModuleVersionsValueComponentsValueInstancePropertyValues build(java.util.Map<String, ?> map) throws Exception {
            ModuleVersionsValueComponentsValueInstancePropertyValues self = new ModuleVersionsValueComponentsValueInstancePropertyValues();
            return TeaModel.build(map, self);
        }

        public ModuleVersionsValueComponentsValueInstancePropertyValues setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModuleVersionsValueComponentsValueInstancePropertyValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ModuleVersionsValueComponentsValueInstancePropertyValues setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ModuleVersionsValueComponentsValueInstanceProperty extends TeaModel {
        /**
         * <p>Property encoding (system internal identity)</p>
         * 
         * <strong>example:</strong>
         * <p>code</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Attribute display name (user-visible name)</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Attribute Value encoding (internal System value)</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>List of module Attribute Values</p>
         */
        @NameInMap("Values")
        public java.util.List<ModuleVersionsValueComponentsValueInstancePropertyValues> values;

        public static ModuleVersionsValueComponentsValueInstanceProperty build(java.util.Map<String, ?> map) throws Exception {
            ModuleVersionsValueComponentsValueInstanceProperty self = new ModuleVersionsValueComponentsValueInstanceProperty();
            return TeaModel.build(map, self);
        }

        public ModuleVersionsValueComponentsValueInstanceProperty setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModuleVersionsValueComponentsValueInstanceProperty setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModuleVersionsValueComponentsValueInstanceProperty setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ModuleVersionsValueComponentsValueInstanceProperty setValues(java.util.List<ModuleVersionsValueComponentsValueInstancePropertyValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<ModuleVersionsValueComponentsValueInstancePropertyValues> getValues() {
            return this.values;
        }

    }

}
