// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ModuleDataPropertiesValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>placeholder</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Values")
    public java.util.List<ModuleDataPropertiesValueValues> values;

    public static ModuleDataPropertiesValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleDataPropertiesValue self = new ModuleDataPropertiesValue();
        return TeaModel.build(map, self);
    }

    public ModuleDataPropertiesValue setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModuleDataPropertiesValue setValues(java.util.List<ModuleDataPropertiesValueValues> values) {
        this.values = values;
        return this;
    }
    public java.util.List<ModuleDataPropertiesValueValues> getValues() {
        return this.values;
    }

    public static class ModuleDataPropertiesValueValues extends TeaModel {
        /**
         * <p>placeholder</p>
         * 
         * <strong>example:</strong>
         * <p>placeholder</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModuleDataPropertiesValueValues build(java.util.Map<String, ?> map) throws Exception {
            ModuleDataPropertiesValueValues self = new ModuleDataPropertiesValueValues();
            return TeaModel.build(map, self);
        }

        public ModuleDataPropertiesValueValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
