// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ModuleDataComponentsValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>placeholder</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>placeholder</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("InstanceProperty")
    public java.util.List<ModuleDataComponentsValueInstanceProperty> instanceProperty;

    @NameInMap("Properties")
    public java.util.Map<String, ModuleDataComponentsValuePropertiesValue> properties;

    /**
     * <strong>example:</strong>
     * <p>placeholder</p>
     */
    @NameInMap("ModuleAttrStatus")
    public Integer moduleAttrStatus;

    public static ModuleDataComponentsValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleDataComponentsValue self = new ModuleDataComponentsValue();
        return TeaModel.build(map, self);
    }

    public ModuleDataComponentsValue setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModuleDataComponentsValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModuleDataComponentsValue setInstanceProperty(java.util.List<ModuleDataComponentsValueInstanceProperty> instanceProperty) {
        this.instanceProperty = instanceProperty;
        return this;
    }
    public java.util.List<ModuleDataComponentsValueInstanceProperty> getInstanceProperty() {
        return this.instanceProperty;
    }

    public ModuleDataComponentsValue setProperties(java.util.Map<String, ModuleDataComponentsValuePropertiesValue> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ModuleDataComponentsValuePropertiesValue> getProperties() {
        return this.properties;
    }

    public ModuleDataComponentsValue setModuleAttrStatus(Integer moduleAttrStatus) {
        this.moduleAttrStatus = moduleAttrStatus;
        return this;
    }
    public Integer getModuleAttrStatus() {
        return this.moduleAttrStatus;
    }

    public static class ModuleDataComponentsValueInstancePropertyValues extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>placeholder</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>placeholder</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <strong>example:</strong>
         * <p>placeholder</p>
         */
        @NameInMap("Name")
        public String name;

        public static ModuleDataComponentsValueInstancePropertyValues build(java.util.Map<String, ?> map) throws Exception {
            ModuleDataComponentsValueInstancePropertyValues self = new ModuleDataComponentsValueInstancePropertyValues();
            return TeaModel.build(map, self);
        }

        public ModuleDataComponentsValueInstancePropertyValues setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModuleDataComponentsValueInstancePropertyValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ModuleDataComponentsValueInstancePropertyValues setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ModuleDataComponentsValueInstanceProperty extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>placeholder</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>placeholder</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>placeholder</p>
         */
        @NameInMap("Value")
        public String value;

        @NameInMap("Values")
        public java.util.List<ModuleDataComponentsValueInstancePropertyValues> values;

        public static ModuleDataComponentsValueInstanceProperty build(java.util.Map<String, ?> map) throws Exception {
            ModuleDataComponentsValueInstanceProperty self = new ModuleDataComponentsValueInstanceProperty();
            return TeaModel.build(map, self);
        }

        public ModuleDataComponentsValueInstanceProperty setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModuleDataComponentsValueInstanceProperty setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModuleDataComponentsValueInstanceProperty setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ModuleDataComponentsValueInstanceProperty setValues(java.util.List<ModuleDataComponentsValueInstancePropertyValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<ModuleDataComponentsValueInstancePropertyValues> getValues() {
            return this.values;
        }

    }

}
