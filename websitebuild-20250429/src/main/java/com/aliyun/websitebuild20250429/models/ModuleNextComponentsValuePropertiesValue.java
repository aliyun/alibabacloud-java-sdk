// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ModuleNextComponentsValuePropertiesValue extends TeaModel {
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
    public java.util.List<ModuleNextComponentsValuePropertiesValueValues> values;

    public static ModuleNextComponentsValuePropertiesValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleNextComponentsValuePropertiesValue self = new ModuleNextComponentsValuePropertiesValue();
        return TeaModel.build(map, self);
    }

    public ModuleNextComponentsValuePropertiesValue setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModuleNextComponentsValuePropertiesValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModuleNextComponentsValuePropertiesValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public ModuleNextComponentsValuePropertiesValue setValues(java.util.List<ModuleNextComponentsValuePropertiesValueValues> values) {
        this.values = values;
        return this;
    }
    public java.util.List<ModuleNextComponentsValuePropertiesValueValues> getValues() {
        return this.values;
    }

    public static class ModuleNextComponentsValuePropertiesValueValues extends TeaModel {
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

        public static ModuleNextComponentsValuePropertiesValueValues build(java.util.Map<String, ?> map) throws Exception {
            ModuleNextComponentsValuePropertiesValueValues self = new ModuleNextComponentsValuePropertiesValueValues();
            return TeaModel.build(map, self);
        }

        public ModuleNextComponentsValuePropertiesValueValues setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ModuleNextComponentsValuePropertiesValueValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ModuleNextComponentsValuePropertiesValueValues setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
