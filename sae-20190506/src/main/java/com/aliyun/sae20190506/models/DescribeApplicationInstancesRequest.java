// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationInstancesRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d700e680-aa4d-4ec1-afc2-6566b5ff****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the application group. Call the <a href="https://help.aliyun.com/document_detail/126249.html">DescribeApplicationGroups</a> operation to get the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b2a8a925-477a-4ed7-b825-d5e22500****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The application instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-faaca66c-5959-45cc-b3bf-d26093b2e9c0******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>10</strong>. The value must be in the range (0, 1000000000).</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The batch ID. Call the <a href="https://help.aliyun.com/document_detail/126617.html">DescribeChangeOrder</a> operation to get the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>85750d48-6cfc-4dbf-8ea0-840397******</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>Specifies the sort order of the application instances. Instances are sorted first by running status, and then by instance ID. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The instances are sorted in descending order.</p>
     * </li>
     * <li><p><strong>false</strong>: The instances are sorted in ascending order.</p>
     * </li>
     * </ul>
     * <p>Instance statuses in ascending order:</p>
     * <ol>
     * <li><p><strong>Error</strong>: An error occurred during instance startup.</p>
     * </li>
     * <li><p><strong>CrashLoopBackOff</strong>: The container fails to start and enters a crash-restart loop.</p>
     * </li>
     * <li><p><strong>ErrImagePull</strong>: An error occurred while pulling the container image for the instance.</p>
     * </li>
     * <li><p><strong>ImagePullBackOff</strong>: The system is repeatedly trying and failing to pull the container image.</p>
     * </li>
     * <li><p><strong>Pending</strong>: The instance is waiting to be scheduled.</p>
     * </li>
     * <li><p><strong>Unknown</strong>: An unknown exception occurred.</p>
     * </li>
     * <li><p><strong>Terminating</strong>: The instance is being terminated.</p>
     * </li>
     * <li><p><strong>NotFound</strong>: The instance cannot be found.</p>
     * </li>
     * <li><p><strong>PodInitializing</strong>: The instance is being initialized.</p>
     * </li>
     * <li><p><strong>Init:0/1</strong>: The instance is being initialized.</p>
     * </li>
     * <li><p><strong>Running</strong>: The instance is running.</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    public static DescribeApplicationInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationInstancesRequest self = new DescribeApplicationInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationInstancesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeApplicationInstancesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeApplicationInstancesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApplicationInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeApplicationInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApplicationInstancesRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public DescribeApplicationInstancesRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

}
