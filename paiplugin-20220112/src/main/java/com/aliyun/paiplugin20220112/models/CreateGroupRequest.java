// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateGroupRequest extends TeaModel {
    // 关联算法，人群来源为算法。
    @NameInMap("Algorithm")
    public String algorithm;

    // 手机号列名，人群来源为CSV文件，MaxCompute，并且包含手机号时需指定。
    @NameInMap("Column")
    public String column;

    // 过滤条件，人群来源为MaxCompute时可指定。
    @NameInMap("Filter")
    public String filter;

    // 预测任务Id，人群来源为算法。
    @NameInMap("InferenceJobId")
    public String inferenceJobId;

    // 人群名称。
    @NameInMap("Name")
    public String name;

    // 是否包含手机号，包含手机号的人群可用于触达计划。
    @NameInMap("PhoneNumber")
    public Boolean phoneNumber;

    // MaxCompute(ODPS)项目名，人群来源为MaxCompute时需指定。
    @NameInMap("Project")
    public String project;

    // 人群备注。
    @NameInMap("Remark")
    public String remark;

    // 人群来源。
    // - 0: 文本，每行一个手机号，最多100个。
    // - 1: 文本文件，每行一个手机号，可通过控制台上传或指定自定义OSS地址，指定自定义OSS地址前需确保已在控制台完成一键授权。
    // - 2: CSV文件，需指定手机号列名，可通过控制台上传或指定自定义OSS地址，指定自定义OSS地址前需确保已在控制台完成一键授权。
    // - 3: MaxCompute(ODPS)表，需指定手机号列名。
    // - 4: 算法。
    @NameInMap("Source")
    public Integer source;

    // MaxCompute(ODPS)表名，人群来源为MaxCompute时需指定。
    @NameInMap("Table")
    public String table;

    // 文本，人群来源为文本时需指定。
    @NameInMap("Text")
    public String text;

    // 文件地址，人群来源为文本文件，CSV文件，MaxCompute时需指定。
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
