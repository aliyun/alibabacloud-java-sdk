// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateGroupRequest extends TeaModel {
    // 算法
    @NameInMap("Algorithm")
    public String algorithm;

    // 手机号列名
    @NameInMap("Column")
    public String column;

    // ODPS过滤语句
    @NameInMap("Filter")
    public String filter;

    // 预测任务Id
    @NameInMap("InferenceJobId")
    public String inferenceJobId;

    // 人群名称
    @NameInMap("Name")
    public String name;

    // ODPS项目名
    @NameInMap("Project")
    public String project;

    // 备注
    @NameInMap("Remark")
    public String remark;

    // 人群来源
    // - 0: Text，每行一个手机号
    // - 1: 无header的csv文件，每行一个手机号
    // - 2: 带header的csv文件，需指定手机号列名
    // - 3: Odps，需指定手机号列名
    // - 4: Algorithm，由算法预测生成
    @NameInMap("Source")
    public Integer source;

    // ODPS表名
    @NameInMap("Table")
    public String table;

    // 文本
    @NameInMap("Text")
    public String text;

    // 文件地址
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
