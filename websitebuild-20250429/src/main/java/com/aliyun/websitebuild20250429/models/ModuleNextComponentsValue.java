// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ModuleNextComponentsValue extends TeaModel {
    /**
     * <p>The unique component code (internal system identifier).</p>
     * 
     * <strong>example:</strong>
     * <p>placeholder</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The display name of the component (user-visible name).</p>
     * 
     * <strong>example:</strong>
     * <p>placeholder</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The instance property configuration of the component.</p>
     */
    @NameInMap("InstanceProperty")
    public java.util.List<ModuleNextComponentsValueInstanceProperty> instanceProperty;

    /**
     * <p>The instance property configuration of the component.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;deploy_area&quot;:{&quot;Code&quot;:&quot;deploy_area&quot;,&quot;Name&quot;:&quot;Deployment region&quot;,&quot;Value&quot;:&quot;HongKong&quot;,&quot;Values&quot;:[{&quot;Value&quot;:&quot;HongKong&quot;,&quot;Name&quot;:&quot;China (Hong Kong)&quot;}]}}</p>
     */
    @NameInMap("Properties")
    public java.util.Map<String, ModuleNextComponentsValuePropertiesValue> properties;

    /**
     * <p>The module property status.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The property code (internal system identifier).</p>
         * 
         * <strong>example:</strong>
         * <p>placeholder</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The property value code (internal system value).</p>
         * 
         * <strong>example:</strong>
         * <p>placeholder</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The display name of the property (user-visible name).</p>
         * 
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
         * <p>The property code (internal system identifier).</p>
         * 
         * <strong>example:</strong>
         * <p>placeholder</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The display name of the property (user-visible name).</p>
         * 
         * <strong>example:</strong>
         * <p>placeholder</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The property value code (internal system value).</p>
         * 
         * <strong>example:</strong>
         * <p>placeholder</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The list of module property values.</p>
         */
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
