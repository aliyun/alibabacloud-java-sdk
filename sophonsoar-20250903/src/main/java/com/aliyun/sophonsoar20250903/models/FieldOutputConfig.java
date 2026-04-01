// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class FieldOutputConfig extends TeaModel {
    /**
     * <p>Field default value.</p>
     * 
     * <strong>example:</strong>
     * <p>11.**.*.11</p>
     */
    @NameInMap("DefaultValue")
    public String defaultValue;

    /**
     * <p>Field description information.</p>
     * 
     * <strong>example:</strong>
     * <p>Single IP to be blocked</p>
     */
    @NameInMap("FieldDescription")
    public String fieldDescription;

    /**
     * <p>Field example.</p>
     * 
     * <strong>example:</strong>
     * <p>2.<em>.</em>.2</p>
     */
    @NameInMap("FieldExample")
    public String fieldExample;

    /**
     * <p>Field name.</p>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("FieldName")
    public String fieldName;

    /**
     * <p>Field type, with the following values:</p>
     * <ul>
     * <li><strong>String</strong>: String.</li>
     * <li><strong>Long</strong>: Long integer.</li>
     * <li><strong>Integer</strong>: Integer.</li>
     * <li><strong>Double</strong>: Double.</li>
     * <li><strong>Boolean</strong>: Boolean.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>String</p>
     */
    @NameInMap("FieldType")
    public String fieldType;

    public static FieldOutputConfig build(java.util.Map<String, ?> map) throws Exception {
        FieldOutputConfig self = new FieldOutputConfig();
        return TeaModel.build(map, self);
    }

    public FieldOutputConfig setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public FieldOutputConfig setFieldDescription(String fieldDescription) {
        this.fieldDescription = fieldDescription;
        return this;
    }
    public String getFieldDescription() {
        return this.fieldDescription;
    }

    public FieldOutputConfig setFieldExample(String fieldExample) {
        this.fieldExample = fieldExample;
        return this;
    }
    public String getFieldExample() {
        return this.fieldExample;
    }

    public FieldOutputConfig setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public FieldOutputConfig setFieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }
    public String getFieldType() {
        return this.fieldType;
    }

}
