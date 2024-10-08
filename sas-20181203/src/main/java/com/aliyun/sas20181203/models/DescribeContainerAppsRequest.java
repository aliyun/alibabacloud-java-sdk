// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerAppsRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>ca0a686115432429ca26cf780f5e9fff5</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The application value that you want to query. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>cas-adad-qeqwe</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty.</p>
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
