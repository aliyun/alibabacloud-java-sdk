// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListApplicationsRequest extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the request was successful.</p>
     * <p>*   **3xx**: indicates that the request was redirected.</p>
     * <p>*   **4xx**: indicates that the request was invalid.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppSource")
    public String appSource;

    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>true</p>
     */
    @NameInMap("FieldType")
    public String fieldType;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>1</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>runnings</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>Indicates whether the application is being deleted. Valid values:</p>
     * <br>
     * <p>*   **true**: The application is being deleted.</p>
     * <p>*   **false**: The application is not being deleted.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>The list of applications.</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static ListApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsRequest self = new ListApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListApplicationsRequest setAppSource(String appSource) {
        this.appSource = appSource;
        return this;
    }
    public String getAppSource() {
        return this.appSource;
    }

    public ListApplicationsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListApplicationsRequest setFieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }
    public String getFieldType() {
        return this.fieldType;
    }

    public ListApplicationsRequest setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
    public String getFieldValue() {
        return this.fieldValue;
    }

    public ListApplicationsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListApplicationsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListApplicationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApplicationsRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public ListApplicationsRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
