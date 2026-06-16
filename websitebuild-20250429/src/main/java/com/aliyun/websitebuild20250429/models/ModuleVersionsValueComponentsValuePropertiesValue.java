// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ModuleVersionsValueComponentsValuePropertiesValue extends TeaModel {
    /**
     * <p>属性编码（系统内部标识）</p>
     * 
     * <strong>example:</strong>
     * <p>code</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>属性显示名称（用户可见名称）</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>属性值编码（系统内部值）</p>
     * 
     * <strong>example:</strong>
     * <p>value</p>
     */
    @NameInMap("Value")
    public String value;

    /**
     * <p>模块属性值列表</p>
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
         * <p>属性编码（系统内部标识）</p>
         * 
         * <strong>example:</strong>
         * <p>code</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>属性值编码（系统内部值）</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>属性显示名称（用户可见名称）</p>
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
