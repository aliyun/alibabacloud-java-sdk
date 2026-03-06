// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ModuleNextComponentsValue extends TeaModel {
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
    public java.util.List<ModuleNextComponentsValueInstanceProperty> instanceProperty;

    @NameInMap("Properties")
    public java.util.Map<String, ModuleNextComponentsValuePropertiesValue> properties;

    /**
     * <strong>example:</strong>
     * <p>placeholder</p>
     */
    @NameInMap("ModuleAttrStatus")
    public Integer moduleAttrStatus;

    public static ModuleNextComponentsValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleNextComponentsValue self = new ModuleNextComponentsValue();
        return TeaModel.build(map, self);
    }

    public ModuleNextComponentsValue setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModuleNextComponentsValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModuleNextComponentsValue setInstanceProperty(java.util.List<ModuleNextComponentsValueInstanceProperty> instanceProperty) {
        this.instanceProperty = instanceProperty;
        return this;
    }
    public java.util.List<ModuleNextComponentsValueInstanceProperty> getInstanceProperty() {
        return this.instanceProperty;
    }

    public ModuleNextComponentsValue setProperties(java.util.Map<String, ModuleNextComponentsValuePropertiesValue> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ModuleNextComponentsValuePropertiesValue> getProperties() {
        return this.properties;
    }

    public ModuleNextComponentsValue setModuleAttrStatus(Integer moduleAttrStatus) {
        this.moduleAttrStatus = moduleAttrStatus;
        return this;
    }
    public Integer getModuleAttrStatus() {
        return this.moduleAttrStatus;
    }

    public static class ModuleNextComponentsValueInstancePropertyValues extends TeaModel {
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

        public static ModuleNextComponentsValueInstancePropertyValues build(java.util.Map<String, ?> map) throws Exception {
            ModuleNextComponentsValueInstancePropertyValues self = new ModuleNextComponentsValueInstancePropertyValues();
            return TeaModel.build(map, self);
        }

        public ModuleNextComponentsValueInstancePropertyValues setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModuleNextComponentsValueInstancePropertyValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ModuleNextComponentsValueInstancePropertyValues setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ModuleNextComponentsValueInstanceProperty extends TeaModel {
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
        public java.util.List<ModuleNextComponentsValueInstancePropertyValues> values;

        public static ModuleNextComponentsValueInstanceProperty build(java.util.Map<String, ?> map) throws Exception {
            ModuleNextComponentsValueInstanceProperty self = new ModuleNextComponentsValueInstanceProperty();
            return TeaModel.build(map, self);
        }

        public ModuleNextComponentsValueInstanceProperty setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModuleNextComponentsValueInstanceProperty setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModuleNextComponentsValueInstanceProperty setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ModuleNextComponentsValueInstanceProperty setValues(java.util.List<ModuleNextComponentsValueInstancePropertyValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<ModuleNextComponentsValueInstancePropertyValues> getValues() {
            return this.values;
        }

    }

}
