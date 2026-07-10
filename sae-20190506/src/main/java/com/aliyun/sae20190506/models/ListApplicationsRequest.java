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
     * <p>The Serverless App Engine (SAE) application type.</p>
     * <ul>
     * <li><strong>micro_service.</strong></li>
     * <li><strong>web.</strong></li>
     * <li><strong>job.</strong></li>
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
     * <p>The dimension by which to filter applications. Valid values:</p>
     * <ul>
     * <li><strong>appName</strong>: application name.</li>
     * <li><strong>appIds</strong>: application ID.</li>
     * <li><strong>slbIps</strong>: SLB IP address.</li>
     * <li><strong>instanceIps</strong>: instance IP address.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>appName</p>
     */
    @NameInMap("FieldType")
    public String fieldType;

    /**
     * <p>The application name, application ID, SLB IP address, or instance IP address of the target application.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-app</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>Specifies whether the application is stateful.</p>
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
     * <p>The application version. Valid values:</p>
     * <ul>
     * <li>lite: Lite Edition</li>
     * <li>std: Standard Edition</li>
     * <li>pro: Professional Edition</li>
     * </ul>
     */
    @NameInMap("NewSaeVersion")
    public String newSaeVersion;

    /**
     * <p>The field by which to sort applications. Valid values:</p>
     * <ul>
     * <li><strong>runnings</strong>: sorts by the current number target instances.</li>
     * <li><strong>instances</strong>: sorts by the target number target instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>runnings</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The number of entries per page in a paging query. Valid values: [0,10000].</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProgrammingLanguage")
    public String programmingLanguage;

    /**
     * <p>Specifies whether to sort application instances by running status. If instances have the same status, they are sorted by instance ID. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: sorts in ascending order. Instances are arranged based on the startup sequence. For example, to reach the running state, an instance must go through steps such as starting the container, pulling the image, and initializing the instance.</li>
     * <li><strong>false</strong>: sorts in descending order.</li>
     * </ul>
     * <p>The ascending order of instances is as follows:</p>
     * <ol>
     * <li><strong>Error</strong>: an error occurred during instance startup.</li>
     * <li><strong>CrashLoopBackOff</strong>: the container failed to start, encountered an error during startup, and encountered an error again after restart.</li>
     * <li><strong>ErrImagePull</strong>: an error occurred while pulling the container image for the instance.</li>
     * <li><strong>ImagePullBackOff</strong>: the container image cannot be obtained.</li>
     * <li><strong>Pending</strong>: the instance is waiting to be scheduled.</li>
     * <li><strong>Unknown</strong>: an unknown exception occurred.</li>
     * <li><strong>Terminating</strong>: the instance is being terminated.</li>
     * <li><strong>NotFound</strong>: the instance cannot be found.</li>
     * <li><strong>PodInitializing</strong>: the instance is being initialized.</li>
     * <li><strong>Init:0/1</strong>: the instance is initializing.</li>
     * <li><strong>Running</strong>: the instance is running.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>The tag key-value pairs. Valid values:</p>
     * <ul>
     * <li><strong>key</strong>: the tag key. The length must be in the range of [1,128].</li>
     * <li><strong>value</strong>: the tag value. The length must be in the range of [1,128].</li>
     * </ul>
     * <p>Tags are case-sensitive. If you specify multiple tags, all specified tags are created and attached to the resource. Each tag key on the same resource can have only one tag value. If you add a tag key that already exists, the corresponding tag value is updated to the new value.</p>
     * <p>Tags cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
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

    public ListApplicationsRequest setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
        return this;
    }
    public String getProgrammingLanguage() {
        return this.programmingLanguage;
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
