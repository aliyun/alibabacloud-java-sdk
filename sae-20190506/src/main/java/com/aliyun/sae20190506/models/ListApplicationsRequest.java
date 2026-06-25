// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListApplicationsRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The type of the SAE application.</p>
     * <ul>
     * <li><p><strong>micro_service</strong></p>
     * </li>
     * <li><p><strong>web</strong></p>
     * </li>
     * <li><p><strong>job</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>micro_service</p>
     */
    @NameInMap("AppSource")
    public String appSource;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The field to filter applications by. Valid values:</p>
     * <ul>
     * <li><p><strong>appName</strong>: The application name.</p>
     * </li>
     * <li><p><strong>appIds</strong>: The application ID.</p>
     * </li>
     * <li><p><strong>slbIps</strong>: The SLB IP address.</p>
     * </li>
     * <li><p><strong>instanceIps</strong>: The instance IP address.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>appName</p>
     */
    @NameInMap("FieldType")
    public String fieldType;

    /**
     * <p>The value for the field specified by <code>FieldType</code>. This can be an application name, application ID, SLB IP address, or instance IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-app</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>Filters applications by whether they are stateful. Set this parameter to <code>true</code> to return only stateful applications, or to <code>false</code> to return only stateless applications.</p>
     */
    @NameInMap("IsStateful")
    public String isStateful;

    /**
     * <p>The namespace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:demo</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The edition of the application:</p>
     * <ul>
     * <li><p><code>lite</code>: Lite</p>
     * </li>
     * <li><p><code>std</code>: Standard</p>
     * </li>
     * <li><p><code>pro</code>: Pro</p>
     * </li>
     * </ul>
     */
    @NameInMap("NewSaeVersion")
    public String newSaeVersion;

    /**
     * <p>The field to sort the applications by. Valid values:</p>
     * <ul>
     * <li><p><strong>runnings</strong>: Sorts the applications by the current instance count.</p>
     * </li>
     * <li><p><strong>instances</strong>: Sorts the applications by the target instance count.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>runnings</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The number of entries to return per page. Valid values: 0 to 10000.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Sorts the results in ascending order.</p>
     * </li>
     * <li><p><strong>false</strong>: Sorts the results in descending order.</p>
     * </li>
     * </ul>
     * <ol>
     * <li><hr>
     * </li>
     * <li><hr>
     * </li>
     * <li><hr>
     * </li>
     * <li><hr>
     * </li>
     * <li><hr>
     * </li>
     * <li><hr>
     * </li>
     * <li><hr>
     * </li>
     * <li><hr>
     * </li>
     * <li><hr>
     * </li>
     * <li><hr>
     * </li>
     * <li><hr>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>Filters applications by tags. The tags are specified as a JSON string that contains an array of key-value pairs.</p>
     * <ul>
     * <li><p><strong>key</strong>: The tag key, which can be 1 to 128 characters in length.</p>
     * </li>
     * <li><p><strong>value</strong>: The tag value, which can be 1 to 128 characters in length.</p>
     * </li>
     * </ul>
     * <p>This parameter is case-sensitive. An application is returned only if it matches all specified tags. On a resource, a tag key can have only one tag value.</p>
     * <p>The tag key and tag value cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;:&quot;key&quot;,&quot;value&quot;:&quot;value&quot;}]</p>
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

    public ListApplicationsRequest setIsStateful(String isStateful) {
        this.isStateful = isStateful;
        return this;
    }
    public String getIsStateful() {
        return this.isStateful;
    }

    public ListApplicationsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListApplicationsRequest setNewSaeVersion(String newSaeVersion) {
        this.newSaeVersion = newSaeVersion;
        return this;
    }
    public String getNewSaeVersion() {
        return this.newSaeVersion;
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
