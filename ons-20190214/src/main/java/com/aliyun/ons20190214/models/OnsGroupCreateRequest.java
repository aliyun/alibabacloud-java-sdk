// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupCreateRequest extends TeaModel {
    /**
     * <p>The ID of the consumer group that you want to create. The group ID must meet the following rules:</p>
     * <ul>
     * <li>The group ID must be 2 to 64 characters in length and can contain only letters, digits, hyphens (-), and underscores (_).</li>
     * <li>If the ApsaraMQ for RocketMQ instance in which you want to create the consumer group uses a namespace, the group ID must be unique in the instance. The group ID cannot be the same as an existing group ID or a topic name in the instance. The group ID can be the same as a group ID or a topic name in another instance that uses a different namespace. For example, if Instance A and Instance B use different namespaces, a group ID in Instance A can be the same as a group ID or a topic name in Instance B.</li>
     * <li>If the instance does not use a namespace, the group ID must be globally unique across instances and regions. The group ID cannot be the same as an existing group ID or topic name in ApsaraMQ for RocketMQ instances that belong to your Alibaba Cloud account.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>After the consumer group is created, the group ID cannot be changed.</p>
     * </li>
     * <li><p>To check whether an instance uses a namespace, log on to the ApsaraMQ for RocketMQ console, go to the <strong>Instance Details</strong> page, and then view the value of the Namespace field in the <strong>Basic Information</strong> section.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GID_test_groupId</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The protocol over which clients in the consumer group communicate with the ApsaraMQ for RocketMQ broker. All clients in a consumer group communicate with the ApsaraMQ for RocketMQ broker over the same protocol. You must create different groups for TCP clients and HTTP clients. Valid values:</p>
     * <ul>
     * <li><strong>tcp</strong>: Clients in the consumer group consume messages over TCP. This is the default value.</li>
     * <li><strong>http</strong>: Clients in the consumer group consume messages over HTTP.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The ID of the instance in which you want to create the consumer group.</p>
     * 
     * <strong>example:</strong>
     * <p>MQ_INST_111111111111_DOxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The description of the consumer group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static OnsGroupCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsGroupCreateRequest self = new OnsGroupCreateRequest();
        return TeaModel.build(map, self);
    }

    public OnsGroupCreateRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsGroupCreateRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public OnsGroupCreateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsGroupCreateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
