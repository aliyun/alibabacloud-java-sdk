// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class FieldInputConfig extends TeaModel {
    /**
     * <p>Is the field arrayed? Possible values are:</p>
     * <ul>
     * <li>true: Arrayed.</li>
     * <li>false: Not Arrayed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Arrayed")
    public Boolean arrayed;

    /**
     * <p>Field default value.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DefaultValue")
    public String defaultValue;

    /**
     * <p>Field check regex.</p>
     * 
     * <strong>example:</strong>
     * <p>[a-zA-Z0-9\u4e00-\u9fa5_-]{2,128}</p>
     */
    @NameInMap("FieldCheckRegex")
    public String fieldCheckRegex;

    /**
     * <p>Field types, with the following values:</p>
     * <ul>
     * <li><strong>normal</strong>: Normal type.</li>
     * <li><strong>custom</strong>: Complex type; in this mode, FieldConfigs can be configured.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("FieldClass")
    public String fieldClass;

    /**
     * <p>Supports configuring nested input parameters in complex-type scenarios.</p>
     */
    @NameInMap("FieldConfigs")
    public java.util.List<FieldInputConfig> fieldConfigs;

    /**
     * <p>Field description.</p>
     * 
     * <strong>example:</strong>
     * <p>app name</p>
     */
    @NameInMap("FieldDescription")
    public String fieldDescription;

    /**
     * <p>Field example.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("FieldExample")
    public String fieldExample;

    /**
     * <p>Field name.</p>
     * 
     * <strong>example:</strong>
     * <p>appName</p>
     */
    @NameInMap("FieldName")
    public String fieldName;

    /**
     * <p>Field path.</p>
     * 
     * <strong>example:</strong>
     * <p>xx.appName</p>
     */
    @NameInMap("FieldPath")
    public String fieldPath;

    /**
     * <p>The field type. The value is as follows:</p>
     * <ul>
     * <li><strong>String</strong>: String.</li>
     * <li><strong>Long</strong>: Long integer.</li>
     * <li><strong>Integer</strong>: Integer.</li>
     * <li><strong>Double</strong>: Floating-point type.</li>
     * <li><strong>Boolean</strong>: Boolean.</li>
     * <li><strong>ip</strong>: The IP entity.</li>
     * <li><strong>file</strong>: file entity.</li>
     * <li><strong>process</strong>: process entity.</li>
     * <li><strong>incident</strong>: event entity.</li>
     * <li><strong>alert</strong>: alert entity.</li>
     * <li><strong>host</strong>: host entity.</li>
     * <li><strong>domain</strong>: The domain name entity.</li>
     * <li><strong>container</strong>: container entity.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>String</p>
     */
    @NameInMap("FieldType")
    public String fieldType;

    /**
     * <p>Is the field mandatory? Possible values are:</p>
     * <ul>
     * <li><strong>true</strong>: Required.</li>
     * <li><strong>false</strong>: Optional.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Required")
    public Boolean required;

    public static FieldInputConfig build(java.util.Map<String, ?> map) throws Exception {
        FieldInputConfig self = new FieldInputConfig();
        return TeaModel.build(map, self);
    }

    public FieldInputConfig setArrayed(Boolean arrayed) {
        this.arrayed = arrayed;
        return this;
    }
    public Boolean getArrayed() {
        return this.arrayed;
    }

    public FieldInputConfig setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public FieldInputConfig setFieldCheckRegex(String fieldCheckRegex) {
        this.fieldCheckRegex = fieldCheckRegex;
        return this;
    }
    public String getFieldCheckRegex() {
        return this.fieldCheckRegex;
    }

    public FieldInputConfig setFieldClass(String fieldClass) {
        this.fieldClass = fieldClass;
        return this;
    }
    public String getFieldClass() {
        return this.fieldClass;
    }

    public FieldInputConfig setFieldConfigs(java.util.List<FieldInputConfig> fieldConfigs) {
        this.fieldConfigs = fieldConfigs;
        return this;
    }
    public java.util.List<FieldInputConfig> getFieldConfigs() {
        return this.fieldConfigs;
    }

    public FieldInputConfig setFieldDescription(String fieldDescription) {
        this.fieldDescription = fieldDescription;
        return this;
    }
    public String getFieldDescription() {
        return this.fieldDescription;
    }

    public FieldInputConfig setFieldExample(String fieldExample) {
        this.fieldExample = fieldExample;
        return this;
    }
    public String getFieldExample() {
        return this.fieldExample;
    }

    public FieldInputConfig setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public FieldInputConfig setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
        return this;
    }
    public String getFieldPath() {
        return this.fieldPath;
    }

    public FieldInputConfig setFieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }
    public String getFieldType() {
        return this.fieldType;
    }

    public FieldInputConfig setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

}
