// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeNodeGroupsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c-718fb04c7112****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The page number for paging. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for paging. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The compute group type. Valid values:</p>
     * <ul>
     * <li>FE</li>
     * <li>BE</li>
     * <li>CN</li>
     * <li>OBSERVER</li>
     * <li>AGENT</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FE</p>
     */
    @NameInMap("componentType")
    public String componentType;

    /**
     * <p><strong>[Deprecated]</strong> The instance ID. This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The list of compute group IDs to query.</p>
     */
    @NameInMap("nodeGroupIds")
    public java.util.List<String> nodeGroupIds;

    /**
     * <p>The compute group name.</p>
     * 
     * <strong>example:</strong>
     * <p>ng_1</p>
     */
    @NameInMap("nodeGroupName")
    public String nodeGroupName;

    /**
     * <p>The compute group status. Valid values:</p>
     * <ul>
     * <li>UNPAID: Unpaid.</li>
     * <li>PAID: Paid.</li>
     * <li>CREATING_FAILED: Creation failed.</li>
     * <li>CREATING: Being created.</li>
     * <li>RUNNING: Running.</li>
     * <li>MODIFYING_CONFIG: Configuration being modified.</li>
     * <li>MODIFYING_TIMEZONE: Time zone being modified.</li>
     * <li>ELASTIC_SCALING_OUT: Elastic scale-out in progress.</li>
     * <li>ELASTIC_SCALING_IN: Elastic scale-in in progress.</li>
     * <li>SCALING_OUT: Scale-out in progress.</li>
     * <li>RESTARTING: Restarting.</li>
     * <li>SCALING_IN: Scale-in in progress.</li>
     * <li>SCALING_UP: Upgrading specifications.</li>
     * <li>SCALING_DOWN: Downgrading specifications.</li>
     * <li>UPGRADING: Upgrading.</li>
     * <li>ENABLE_PUBLIC_NETWORK: Enabling public network access.</li>
     * <li>DISABLE_PUBLIC_NETWORK: Disabling public network access.</li>
     * <li>SWITCH_AZ: Switching zone.</li>
     * <li>DISABLE: Disabled.</li>
     * <li>DELETING: Being deleted.</li>
     * <li>DELETED: Deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("status")
    public String status;

    @NameInMap("tags")
    public java.util.List<DescribeNodeGroupsRequestTags> tags;

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

    public DescribeNodeGroupsRequest setTags(java.util.List<DescribeNodeGroupsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeNodeGroupsRequestTags> getTags() {
        return this.tags;
    }

    public static class DescribeNodeGroupsRequestTags extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static DescribeNodeGroupsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodeGroupsRequestTags self = new DescribeNodeGroupsRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribeNodeGroupsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeNodeGroupsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
