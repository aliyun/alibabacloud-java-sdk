// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ModuleNextPropertiesValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>placeholder</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Values")
    public java.util.List<ModuleNextPropertiesValueValues> values;

    public static ModuleNextPropertiesValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleNextPropertiesValue self = new ModuleNextPropertiesValue();
        return TeaModel.build(map, self);
    }

    public ModuleNextPropertiesValue setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModuleNextPropertiesValue setValues(java.util.List<ModuleNextPropertiesValueValues> values) {
        this.values = values;
        return this;
    }
    public java.util.List<ModuleNextPropertiesValueValues> getValues() {
        return this.values;
    }

    public static class ModuleNextPropertiesValueValues extends TeaModel {
        /**
         * <p>placeholder</p>
         * 
         * <strong>example:</strong>
         * <p>placeholder</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModuleNextPropertiesValueValues build(java.util.Map<String, ?> map) throws Exception {
            ModuleNextPropertiesValueValues self = new ModuleNextPropertiesValueValues();
            return TeaModel.build(map, self);
        }

        public ModuleNextPropertiesValueValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
