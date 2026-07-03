// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeQosPoliciesRequest extends TeaModel {
    /**
     * <p>The description of the quintuple rule instance in the QoS policy.</p>
     * <p>The description must be 1 to 512 characters in length, start with a letter or a Chinese character, and can contain digits, underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>docdesc</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The default value is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of quintuple rules to return on each page.</p>
     * <p>The default value is <strong>10</strong>. The maximum value is <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The priority of the throttling rule to which the quintuple rule in the QoS policy belongs.</p>
     * <p>The priority range is 1 to <strong>3</strong>. A smaller value indicates a higher priority.</p>
     * <blockquote>
     * <p>If you have submitted a ticket and created a priority-4 QoS policy by calling the <a href="https://help.aliyun.com/document_detail/131575.html">CreateQosPolicy</a> operation, you can use this operation to query the configurations of quintuple rules for the priority-4 QoS policy.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ID of the QoS policy instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-xitd8690ucu8ro****</p>
     */
    @NameInMap("QosId")
    public String qosId;

    /**
     * <p>The ID of the quintuple rule instance in the QoS policy.</p>
     * 
     * <strong>example:</strong>
     * <p>qospy-427m9fo6wkh****</p>
     */
    @NameInMap("QosPolicyId")
    public String qosPolicyId;

    /**
     * <p>The ID of the region where the QoS policy instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeQosPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQosPoliciesRequest self = new DescribeQosPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQosPoliciesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeQosPoliciesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeQosPoliciesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeQosPoliciesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeQosPoliciesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeQosPoliciesRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public DescribeQosPoliciesRequest setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public DescribeQosPoliciesRequest setQosPolicyId(String qosPolicyId) {
        this.qosPolicyId = qosPolicyId;
        return this;
    }
    public String getQosPolicyId() {
        return this.qosPolicyId;
    }

    public DescribeQosPoliciesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeQosPoliciesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeQosPoliciesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
