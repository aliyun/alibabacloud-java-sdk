// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListDeploymentsRequest extends TeaModel {
    /**
     * <p>The ID of the user who creates the deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>183899668*******</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>The execution mode of the deployment.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>BATCH</li>
     * <li>STREAMING</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>STREAMING</p>
     */
    @NameInMap("executionMode")
    public String executionMode;

    /**
     * <p>The tag key.</p>
     * 
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("labelKey")
    public String labelKey;

    /**
     * <p>The tag value. Separate multiple values with semicolon (;).</p>
     * 
     * <strong>example:</strong>
     * <p>value1,value2</p>
     */
    @NameInMap("labelValueArray")
    public String labelValueArray;

    /**
     * <p>The ID of the user who modifies the deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>183899668*******</p>
     */
    @NameInMap("modifier")
    public String modifier;

    /**
     * <p>The name of the deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>vvp_ds_0522</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("sortName")
    public String sortName;

    /**
     * <p>The latest status of the deployment.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CANCELLED</li>
     * <li>FAILED</li>
     * <li>RUNNING</li>
     * <li>TRANSITIONING</li>
     * <li>FINISHED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("status")
    public String status;

    public static ListDeploymentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentsRequest self = new ListDeploymentsRequest();
        return TeaModel.build(map, self);
    }

    public ListDeploymentsRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ListDeploymentsRequest setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
    }

    public ListDeploymentsRequest setLabelKey(String labelKey) {
        this.labelKey = labelKey;
        return this;
    }
    public String getLabelKey() {
        return this.labelKey;
    }

    public ListDeploymentsRequest setLabelValueArray(String labelValueArray) {
        this.labelValueArray = labelValueArray;
        return this;
    }
    public String getLabelValueArray() {
        return this.labelValueArray;
    }

    public ListDeploymentsRequest setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public ListDeploymentsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDeploymentsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListDeploymentsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDeploymentsRequest setSortName(String sortName) {
        this.sortName = sortName;
        return this;
    }
    public String getSortName() {
        return this.sortName;
    }

    public ListDeploymentsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
