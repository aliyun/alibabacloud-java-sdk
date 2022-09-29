// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateGroupRequest extends TeaModel {
    @NameInMap("Algorithm")
    public String algorithm;

    @NameInMap("Column")
    public String column;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("InferenceJobId")
    public String inferenceJobId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PhoneNumber")
    public Boolean phoneNumber;

    @NameInMap("Project")
    public String project;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("Source")
    public Integer source;

    @NameInMap("Table")
    public String table;

    @NameInMap("Text")
    public String text;

    @NameInMap("Uri")
    public String uri;

    public static CreateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupRequest self = new CreateGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateGroupRequest setColumn(String column) {
        this.column = column;
        return this;
    }
    public String getColumn() {
        return this.column;
    }

    public CreateGroupRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public CreateGroupRequest setInferenceJobId(String inferenceJobId) {
        this.inferenceJobId = inferenceJobId;
        return this;
    }
    public String getInferenceJobId() {
        return this.inferenceJobId;
    }

    public CreateGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGroupRequest setPhoneNumber(Boolean phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public Boolean getPhoneNumber() {
        return this.phoneNumber;
    }

    public CreateGroupRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateGroupRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateGroupRequest setSource(Integer source) {
        this.source = source;
        return this;
    }
    public Integer getSource() {
        return this.source;
    }

    public CreateGroupRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

    public CreateGroupRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public CreateGroupRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
