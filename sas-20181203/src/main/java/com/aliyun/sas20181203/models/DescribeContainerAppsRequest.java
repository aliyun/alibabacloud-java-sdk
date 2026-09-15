// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerAppsRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster. Note: This parameter is required. If this parameter is not specified, the service returns a 400 error.</p>
     * 
     * <strong>example:</strong>
     * <p>ca0a686115432429ca26cf780f5e9fff5</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The page number for a paged query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The application value to query. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>cas-adad-qeqwe</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The maximum number of entries per page for a paged query. Default value: 20. If you leave this parameter empty, 20 entries are returned.</p>
     * <blockquote>
     * <p>Do not leave PageSize empty.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeContainerAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerAppsRequest self = new DescribeContainerAppsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContainerAppsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeContainerAppsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeContainerAppsRequest setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
    public String getFieldValue() {
        return this.fieldValue;
    }

    public DescribeContainerAppsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
