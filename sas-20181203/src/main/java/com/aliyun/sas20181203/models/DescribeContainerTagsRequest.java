// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerTagsRequest extends TeaModel {
    /**
     * <p>The name of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>node-exporter</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The ID of the cluster to which the container belongs.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c22143730ab6e40b09ec7c1c51d4d****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the attribute that is used for the query. Valid values:</p>
     * <ul>
     * <li><strong>namespace</strong>: the namespace</li>
     * <li><strong>appName</strong>: the application name</li>
     * <li><strong>image</strong>: the image</li>
     * <li><strong>tag</strong>: the tag</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace</p>
     */
    @NameInMap("FieldName")
    public String fieldName;

    /**
     * <p>The value of the attribute that is used for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>demo4</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>test-name-01</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The number of entries to return on each page. Default value: 200.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeContainerTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerTagsRequest self = new DescribeContainerTagsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContainerTagsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeContainerTagsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeContainerTagsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeContainerTagsRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public DescribeContainerTagsRequest setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
    public String getFieldValue() {
        return this.fieldValue;
    }

    public DescribeContainerTagsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeContainerTagsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
