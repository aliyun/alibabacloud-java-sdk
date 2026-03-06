// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ModuleDataComponentsValuePropertiesValue extends TeaModel {
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
    public java.util.List<ModuleDataComponentsValuePropertiesValueValues> values;

    public static ModuleDataComponentsValuePropertiesValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleDataComponentsValuePropertiesValue self = new ModuleDataComponentsValuePropertiesValue();
        return TeaModel.build(map, self);
    }

    public ModuleDataComponentsValuePropertiesValue setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModuleDataComponentsValuePropertiesValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModuleDataComponentsValuePropertiesValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public ModuleDataComponentsValuePropertiesValue setValues(java.util.List<ModuleDataComponentsValuePropertiesValueValues> values) {
        this.values = values;
        return this;
    }
    public java.util.List<ModuleDataComponentsValuePropertiesValueValues> getValues() {
        return this.values;
    }

    public static class ModuleDataComponentsValuePropertiesValueValues extends TeaModel {
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

        public static ModuleDataComponentsValuePropertiesValueValues build(java.util.Map<String, ?> map) throws Exception {
            ModuleDataComponentsValuePropertiesValueValues self = new ModuleDataComponentsValuePropertiesValueValues();
            return TeaModel.build(map, self);
        }

        public ModuleDataComponentsValuePropertiesValueValues setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModuleDataComponentsValuePropertiesValueValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ModuleDataComponentsValuePropertiesValueValues setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
