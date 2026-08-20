// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateMemberAccountsRequest extends TeaModel {
    /**
     * <p>Instance ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of your current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of WAF member account IDs to manage. You can add up to 10 member accounts at a time.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MemberAccountIds")
    public java.util.List<String> memberAccountIds;

    /**
     * <p>The region where the WAF instance is deployed. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The source IP address of the request. You do not need to specify this parameter. The system automatically obtains the value.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.X.X</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static CreateMemberAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemberAccountsRequest self = new CreateMemberAccountsRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemberAccountsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateMemberAccountsRequest setMemberAccountIds(java.util.List<String> memberAccountIds) {
        this.memberAccountIds = memberAccountIds;
        return this;
    }
    public java.util.List<String> getMemberAccountIds() {
        return this.memberAccountIds;
    }

    public CreateMemberAccountsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMemberAccountsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public CreateMemberAccountsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
