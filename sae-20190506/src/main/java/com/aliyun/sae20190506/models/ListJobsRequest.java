// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListJobsRequest extends TeaModel {
    /**
     * <p>The name of the job template.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The number of the page to return. The parameter value is a positive integer that is greater than or equal to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The dimension by which applications are filtered. Valid values:</p>
     * <ul>
     * <li><strong>appName</strong>: Applications are filtered by job template name.</li>
     * <li><strong>appIds</strong>: Applications are filtered by job template ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>appName</p>
     */
    @NameInMap("FieldType")
    public String fieldType;

    /**
     * <p>Enter the name and ID of the job template.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-app</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The namespace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:demo</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>Specifies how applications are sorted. Valid values:</p>
     * <ul>
     * <li><strong>running</strong>: The applications are sorted based on the number of running instances.</li>
     * <li><strong>instances</strong>: The applications are sorted based on the number of destination instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The number of entries to return on each page. Valid value: 0 to 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether to sort the field names that are passed by <strong>OrderBy</strong> in ascending order. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: in ascending order</li>
     * <li><strong>false</strong>: in descending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>The tags that are displayed in a JSON string. Valid values:</p>
     * <ul>
     * <li><strong>key</strong>: the tag key</li>
     * <li><strong>value</strong>: the tag value</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;:&quot;key&quot;,&quot;value&quot;:&quot;value&quot;}]</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>Set the value to <code>job</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>job</p>
     */
    @NameInMap("Workload")
    public String workload;

    public static ListJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobsRequest self = new ListJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListJobsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListJobsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListJobsRequest setFieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }
    public String getFieldType() {
        return this.fieldType;
    }

    public ListJobsRequest setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
    public String getFieldValue() {
        return this.fieldValue;
    }

    public ListJobsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListJobsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobsRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public ListJobsRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public ListJobsRequest setWorkload(String workload) {
        this.workload = workload;
        return this;
    }
    public String getWorkload() {
        return this.workload;
    }

}
