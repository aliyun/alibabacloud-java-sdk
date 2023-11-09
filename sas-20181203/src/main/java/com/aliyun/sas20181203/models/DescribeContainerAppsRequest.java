// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerAppsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("FieldValue")
    public String fieldValue;

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
