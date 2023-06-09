// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListFunctionInstancesRequest extends TeaModel {
    /**
     * <p>The type of the feature.</p>
     */
    @NameInMap("functionType")
    public String functionType;

    /**
     * <p>The type of the model.</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>The richness of the returned information. Valid values:</p>
     * <br>
     * <p>*   normal: displays information such as createParameters and cron. This is the default value.</p>
     * <p>*   simple: displays only the basic information.</p>
     * <p>*   detail: returns the details of the training task.</p>
     */
    @NameInMap("output")
    public String output;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>How the instance is created. Valid values:</p>
     * <br>
     * <p>*   builtin: The instance is created by system.</p>
     * <p>*   user: The instance is created by user. This is the default value.</p>
     * <p>*   all: all instances</p>
     */
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
