// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktDynamiccustomfieldoptionsRequest extends TeaModel {
    @NameInMap("DependentParamMap")
    public String dependentParamMap;

    @NameInMap("FieldId")
    public Long fieldId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Value")
    public String value;

    public static ListLinkeLinktDynamiccustomfieldoptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktDynamiccustomfieldoptionsRequest self = new ListLinkeLinktDynamiccustomfieldoptionsRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktDynamiccustomfieldoptionsRequest setDependentParamMap(String dependentParamMap) {
        this.dependentParamMap = dependentParamMap;
        return this;
    }
    public String getDependentParamMap() {
        return this.dependentParamMap;
    }

    public ListLinkeLinktDynamiccustomfieldoptionsRequest setFieldId(Long fieldId) {
        this.fieldId = fieldId;
        return this;
    }
    public Long getFieldId() {
        return this.fieldId;
    }

    public ListLinkeLinktDynamiccustomfieldoptionsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListLinkeLinktDynamiccustomfieldoptionsRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
