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
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The application group ID. You can call the <a href="https://help.aliyun.com/document_detail/126249.html">DescribeApplicationGroups</a> operation to obtain the ID.</p>
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
     * <p>The paging Settings for the number of entries per page in a paged query. Default value: <strong>10</strong>. Valid values: (0, 1000000000).</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The batch ID. You can call the <a href="https://help.aliyun.com/document_detail/126617.html">DescribeChangeOrder</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>85750d48-6cfc-4dbf-8ea0-840397******</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>Specifies the sorting order of application instances based on their running status. If the status is the same, the instances are sorted by instance ID. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Descending order.</li>
     * <li><strong>false</strong>: Ascending order.</li>
     * </ul>
     * <p>The following list shows the instance statuses in ascending order:</p>
     * <ol>
     * <li><strong>Error</strong>: An error occurred during instance startup.</li>
     * <li><strong>CrashLoopBackOff</strong>: The container failed to start. An error occurred during startup, and the error persisted after a restart.</li>
     * <li><strong>ErrImagePull</strong>: An error occurred while pulling the container image for the instance.</li>
     * <li><strong>ImagePullBackOff</strong>: The container image cannot be retrieved.</li>
     * <li><strong>Pending</strong>: The instance is waiting to be scheduled.</li>
     * <li><strong>Unknown</strong>: An unknown exception occurred.</li>
     * <li><strong>Terminating</strong>: The instance is being terminated.</li>
     * <li><strong>NotFound</strong>: The instance cannot be found.</li>
     * <li><strong>PodInitializing</strong>: The instance is being initialized.</li>
     * <li><strong>Init:0/1</strong>: The instance is initializing.</li>
     * <li><strong>Running</strong>: The instance is running.</li>
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
