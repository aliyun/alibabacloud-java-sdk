// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktAdmincustomfieldRequest extends TeaModel {
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

    @NameInMap("PossibleValuesRepeatList")
    public java.util.List<String> possibleValuesRepeatList;

    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("Type")
    public String type;

    public static UpdateLinkeLinktAdmincustomfieldRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktAdmincustomfieldRequest self = new UpdateLinkeLinktAdmincustomfieldRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktAdmincustomfieldRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLinkeLinktAdmincustomfieldRequest setFieldFormat(String fieldFormat) {
        this.fieldFormat = fieldFormat;
        return this;
    }
    public String getFieldFormat() {
        return this.fieldFormat;
    }

    public UpdateLinkeLinktAdmincustomfieldRequest setFieldLabel(String fieldLabel) {
        this.fieldLabel = fieldLabel;
        return this;
    }
    public String getFieldLabel() {
        return this.fieldLabel;
    }

    public UpdateLinkeLinktAdmincustomfieldRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeLinktAdmincustomfieldRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLinkeLinktAdmincustomfieldRequest setPossibleValuesRepeatList(java.util.List<String> possibleValuesRepeatList) {
        this.possibleValuesRepeatList = possibleValuesRepeatList;
        return this;
    }
    public java.util.List<String> getPossibleValuesRepeatList() {
        return this.possibleValuesRepeatList;
    }

    public UpdateLinkeLinktAdmincustomfieldRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public UpdateLinkeLinktAdmincustomfieldRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
