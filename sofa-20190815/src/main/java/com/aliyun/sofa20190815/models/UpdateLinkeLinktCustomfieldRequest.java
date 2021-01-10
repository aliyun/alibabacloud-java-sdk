// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktCustomfieldRequest extends TeaModel {
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

    public static UpdateLinkeLinktCustomfieldRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktCustomfieldRequest self = new UpdateLinkeLinktCustomfieldRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktCustomfieldRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLinkeLinktCustomfieldRequest setFieldFormat(String fieldFormat) {
        this.fieldFormat = fieldFormat;
        return this;
    }
    public String getFieldFormat() {
        return this.fieldFormat;
    }

    public UpdateLinkeLinktCustomfieldRequest setFieldLabel(String fieldLabel) {
        this.fieldLabel = fieldLabel;
        return this;
    }
    public String getFieldLabel() {
        return this.fieldLabel;
    }

    public UpdateLinkeLinktCustomfieldRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeLinktCustomfieldRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLinkeLinktCustomfieldRequest setPossibleValuesRepeatList(java.util.List<String> possibleValuesRepeatList) {
        this.possibleValuesRepeatList = possibleValuesRepeatList;
        return this;
    }
    public java.util.List<String> getPossibleValuesRepeatList() {
        return this.possibleValuesRepeatList;
    }

    public UpdateLinkeLinktCustomfieldRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public UpdateLinkeLinktCustomfieldRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
