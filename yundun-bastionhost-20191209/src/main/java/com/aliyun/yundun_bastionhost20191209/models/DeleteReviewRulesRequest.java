// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteReviewRulesRequest extends TeaModel {
    /**
     * <p>The instance ID of the bastion host.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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
     * <p>The array of audit policy IDs to delete.</p>
     * <blockquote>
     * <p>You can invoke the ListReviewRules operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2,3</p>
     */
    @NameInMap("ReviewRuleIds")
    public String reviewRuleIds;

    public static DeleteReviewRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteReviewRulesRequest self = new DeleteReviewRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteReviewRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteReviewRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteReviewRulesRequest setReviewRuleIds(String reviewRuleIds) {
        this.reviewRuleIds = reviewRuleIds;
        return this;
    }
    public String getReviewRuleIds() {
        return this.reviewRuleIds;
    }

}
