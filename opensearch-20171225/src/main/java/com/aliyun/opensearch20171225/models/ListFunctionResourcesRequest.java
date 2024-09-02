// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListFunctionResourcesRequest extends TeaModel {
    /**
     * <p>The output level.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>simple</li>
     * <li>normal</li>
     * <li>detail</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>detail</p>
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
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The type of the resource.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>feature_generator</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>raw_file</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>feature_generator</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static ListFunctionResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionResourcesRequest self = new ListFunctionResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListFunctionResourcesRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public ListFunctionResourcesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFunctionResourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFunctionResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
