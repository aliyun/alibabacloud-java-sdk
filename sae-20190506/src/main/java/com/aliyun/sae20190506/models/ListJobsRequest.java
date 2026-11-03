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
     * <p>The current page number. Valid values start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The dimension used to filter job templates. Valid values:</p>
     * <ul>
     * <li><strong>appName</strong>: the job template name</li>
     * <li><strong>appIds</strong>: the job template ID</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>appName</p>
     */
    @NameInMap("FieldType")
    public String fieldType;

    /**
     * <p>The value used to filter job templates based on the dimension specified by the <strong>FieldType</strong> parameter. Enter the job template name or job template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-app</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The ID of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:demo</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The field used to sort job templates. Valid values:</p>
     * <ul>
     * <li><strong>running</strong>: sort by the current number target instances</li>
     * <li><strong>instances</strong>: sort by the target number target instances</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The number of entries per page. Valid values: 0 to 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether to reverse the sort order based on the field specified by the <strong>OrderBy</strong> parameter. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: sort in ascending order</li>
     * <li><strong>false</strong>: sort in descending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>The list of tags. The value is a JSON string that contains the following fields:</p>
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
     * <p>The workload type. Set the value to <code>job</code>.</p>
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
