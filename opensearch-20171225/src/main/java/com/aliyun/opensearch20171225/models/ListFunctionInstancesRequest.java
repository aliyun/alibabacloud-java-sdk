// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListFunctionInstancesRequest extends TeaModel {
    // 功能类型
    @NameInMap("functionType")
    public String functionType;

    // 模型类型
    @NameInMap("modelType")
    public String modelType;

    // 返回信息的丰富度
    @NameInMap("output")
    public String output;

    // 页码
    @NameInMap("pageNumber")
    public Integer pageNumber;

    // 每页大小
    @NameInMap("pageSize")
    public Integer pageSize;

    // 实例来源
    @NameInMap("source")
    public String source;

    public static ListFunctionInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionInstancesRequest self = new ListFunctionInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListFunctionInstancesRequest setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

    public ListFunctionInstancesRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ListFunctionInstancesRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public ListFunctionInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFunctionInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFunctionInstancesRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
