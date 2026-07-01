// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListDeploymentsRequest extends TeaModel {
    /**
     * <p>Creator UID.</p>
     * 
     * <strong>example:</strong>
     * <p>183899668*******</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>Deployment execution mode.</p>
     * 
     * <strong>example:</strong>
     * <p>STREAMING</p>
     */
    @NameInMap("executionMode")
    public String executionMode;

    /**
     * <p>Label name.</p>
     * 
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("labelKey")
    public String labelKey;

    /**
     * <p>Tag values. Multiple values are separated by semicolons.</p>
     * 
     * <strong>example:</strong>
     * <p>value1,value2</p>
     */
    @NameInMap("labelValueArray")
    public String labelValueArray;

    /**
     * <p>Modifier UID.</p>
     * 
     * <strong>example:</strong>
     * <p>183899668*******</p>
     */
    @NameInMap("modifier")
    public String modifier;

    /**
     * <p>Deployment name.</p>
     * 
     * <strong>example:</strong>
     * <p>vvp_ds_0522</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Pagination parameter. Page index indicating the requested page number. Minimum value is 1. Default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>Pagination parameter. Number of elements on the requested page. Maximum value is 100, minimum value is 1, and default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Sorting method. Supports returning data in descending order by creation time or updated time.</p>
     * 
     * <strong>example:</strong>
     * <p>gmt_create</p>
     */
    @NameInMap("sortName")
    public String sortName;

    /**
     * <p>The status of the latest job for the deployment.</p>
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
