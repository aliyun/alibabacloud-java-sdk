// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktCustomfieldRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("FieldFormat")
    public String fieldFormat;

    @NameInMap("FieldLabel")
    public String fieldLabel;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("Type")
    public String type;

    @NameInMap("PossibleValuesRepeatList")
    public java.util.List<String> possibleValuesRepeatList;

    public static CreateLinkeLinktCustomfieldRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktCustomfieldRequest self = new CreateLinkeLinktCustomfieldRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktCustomfieldRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLinkeLinktCustomfieldRequest setFieldFormat(String fieldFormat) {
        this.fieldFormat = fieldFormat;
        return this;
    }
    public String getFieldFormat() {
        return this.fieldFormat;
    }

    public CreateLinkeLinktCustomfieldRequest setFieldLabel(String fieldLabel) {
        this.fieldLabel = fieldLabel;
        return this;
    }
    public String getFieldLabel() {
        return this.fieldLabel;
    }

    public CreateLinkeLinktCustomfieldRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateLinkeLinktCustomfieldRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLinkeLinktCustomfieldRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public CreateLinkeLinktCustomfieldRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateLinkeLinktCustomfieldRequest setPossibleValuesRepeatList(java.util.List<String> possibleValuesRepeatList) {
        this.possibleValuesRepeatList = possibleValuesRepeatList;
        return this;
    }
    public java.util.List<String> getPossibleValuesRepeatList() {
        return this.possibleValuesRepeatList;
    }

}
