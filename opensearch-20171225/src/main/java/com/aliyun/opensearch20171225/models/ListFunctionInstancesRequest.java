// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListFunctionInstancesRequest extends TeaModel {
    /**
     * <p>The type of the feature.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;PAAS&quot;</p>
     */
    @NameInMap("functionType")
    public String functionType;

    /**
     * <p>The type of the model.</p>
     * 
     * <strong>example:</strong>
     * <p>tf_checkpoint</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>The level of detail for the returned information. Valid values:</p>
     * <ul>
     * <li><p>normal: Displays information such as createParameters and cron. This is the default value.</p>
     * </li>
     * <li><p>simple: Displays only basic information.</p>
     * </li>
     * <li><p>detail: Returns the details of the training task.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("output")
    public String output;

    /**
     * <p>The page number. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. The default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The source of the instance. Valid values:</p>
     * <ul>
     * <li><p>builtin: The instance is created by the system.</p>
     * </li>
     * <li><p>user: The instance is created by the user. This is the default value.</p>
     * </li>
     * <li><p>all: All instances.</p>
     * </li>
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
