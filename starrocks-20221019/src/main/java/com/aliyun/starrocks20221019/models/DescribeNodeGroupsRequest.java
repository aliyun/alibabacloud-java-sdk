// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeNodeGroupsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c-718fb04c7112****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>FE</p>
     */
    @NameInMap("componentType")
    public String componentType;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("nodeGroupIds")
    public java.util.List<String> nodeGroupIds;

    /**
     * <strong>example:</strong>
     * <p>ng_1</p>
     */
    @NameInMap("nodeGroupName")
    public String nodeGroupName;

    /**
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("status")
    public String status;

    public static DescribeNodeGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeGroupsRequest self = new DescribeNodeGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNodeGroupsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeNodeGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNodeGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNodeGroupsRequest setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }
    public String getComponentType() {
        return this.componentType;
    }

    public DescribeNodeGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeNodeGroupsRequest setNodeGroupIds(java.util.List<String> nodeGroupIds) {
        this.nodeGroupIds = nodeGroupIds;
        return this;
    }
    public java.util.List<String> getNodeGroupIds() {
        return this.nodeGroupIds;
    }

    public DescribeNodeGroupsRequest setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    public DescribeNodeGroupsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
