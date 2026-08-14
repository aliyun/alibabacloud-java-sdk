// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyReviewRuleRequest extends TeaModel {
    /**
     * <p>The new description of the audit policy. The description can be up to 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID of the bastion host.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-wwo36qbv601</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new name of the audit policy. The name must be 1 to 128 characters in length. It cannot start with a special character and can contain only the following special characters: periods (.), underscores (_), hyphens (-), backslashes (\), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID of the bastion host. </p>
     * <blockquote>
     * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the audit policy.</p>
     * <blockquote>
     * <p>You can invoke the ListReviewRules operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReviewRuleId")
    public Long reviewRuleId;

    /**
     * <p>The type of the auditable asset scope rule after modification. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: All projects.</p>
     * </li>
     * <li><p><strong>2</strong>: Specified projects.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ScopeType")
    public Integer scopeType;

    public static ModifyReviewRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyReviewRuleRequest self = new ModifyReviewRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyReviewRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyReviewRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyReviewRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyReviewRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyReviewRuleRequest setReviewRuleId(Long reviewRuleId) {
        this.reviewRuleId = reviewRuleId;
        return this;
    }
    public Long getReviewRuleId() {
        return this.reviewRuleId;
    }

    public ModifyReviewRuleRequest setScopeType(Integer scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public Integer getScopeType() {
        return this.scopeType;
    }

}
