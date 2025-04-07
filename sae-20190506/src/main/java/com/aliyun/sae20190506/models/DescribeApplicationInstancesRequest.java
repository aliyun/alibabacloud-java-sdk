// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationInstancesRequest extends TeaModel {
    /**
     * <p>d700e680-aa4d-4ec1-afc2-6566b5ff\<em>\</em>\<em>\</em></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d700e680-aa4d-4ec1-afc2-6566b5ff****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>b2a8a925-477a-4ed7-b825-d5e22500\<em>\</em>\<em>\</em></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b2a8a925-477a-4ed7-b825-d5e22500****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>true</p>
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
