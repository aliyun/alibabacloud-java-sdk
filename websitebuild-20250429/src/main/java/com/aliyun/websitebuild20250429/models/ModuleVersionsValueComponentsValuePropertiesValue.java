// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ModuleVersionsValueComponentsValuePropertiesValue extends TeaModel {
    /**
     * <p>Property code (system internal identity)</p>
     * 
     * <strong>example:</strong>
     * <p>code</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Property display name (user-visible name)</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Attribute value code (system internal value)</p>
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
    public java.util.List<ModuleVersionsValueComponentsValuePropertiesValueValues> values;

    public static ModuleVersionsValueComponentsValuePropertiesValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleVersionsValueComponentsValuePropertiesValue self = new ModuleVersionsValueComponentsValuePropertiesValue();
        return TeaModel.build(map, self);
    }

    public ModuleVersionsValueComponentsValuePropertiesValue setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModuleVersionsValueComponentsValuePropertiesValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModuleVersionsValueComponentsValuePropertiesValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public ModuleVersionsValueComponentsValuePropertiesValue setValues(java.util.List<ModuleVersionsValueComponentsValuePropertiesValueValues> values) {
        this.values = values;
        return this;
    }
    public java.util.List<ModuleVersionsValueComponentsValuePropertiesValueValues> getValues() {
        return this.values;
    }

    public static class ModuleVersionsValueComponentsValuePropertiesValueValues extends TeaModel {
        /**
         * <p>Property code (system internal identity)</p>
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

        public static ModuleVersionsValueComponentsValuePropertiesValueValues build(java.util.Map<String, ?> map) throws Exception {
            ModuleVersionsValueComponentsValuePropertiesValueValues self = new ModuleVersionsValueComponentsValuePropertiesValueValues();
            return TeaModel.build(map, self);
        }

        public ModuleVersionsValueComponentsValuePropertiesValueValues setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModuleVersionsValueComponentsValuePropertiesValueValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ModuleVersionsValueComponentsValuePropertiesValueValues setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
