// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListFunctionInstancesRequest extends TeaModel {
    /**
     * <p>The feature type.</p>
     * 
     * <strong>example:</strong>
     * <p>PAAS</p>
     */
    @NameInMap("functionType")
    public String functionType;

    /**
     * <p>The model type.</p>
     * 
     * <strong>example:</strong>
     * <p>ai_search</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>The level of detail in the response. Valid values:</p>
     * <ul>
     * <li>simple: displays only basic information</li>
     * <li>normal: displays information such as createParameters and cron (default)</li>
     * <li>detail: returns training task information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>simple</p>
     */
    @NameInMap("output")
    public String output;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The instance source. Valid values:</p>
     * <ul>
     * <li>builtin: system instance</li>
     * <li>user: user instance (default)</li>
     * <li>all: all instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>user</p>
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
