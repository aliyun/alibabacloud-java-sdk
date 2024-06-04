// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteMemberAccountRequest extends TeaModel {
    /**
     * <p>The ID of the WAF instance.</p>
     * <br>
     * <p>>  You can call the [DescribeInstance](https://help.aliyun.com/document_detail/433756.html) operation to query the ID of the WAF instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The Alibaba Cloud account ID of the managed member.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MemberAccountId")
    public String memberAccountId;

    /**
     * <p>The region in which the WAF instance is deployed. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou**: Chinese mainland.</p>
     * <p>*   **ap-southeast-1**: outside the Chinese mainland.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The source IP address of the request. The system automatically obtains the value of this parameter.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DeleteMemberAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemberAccountRequest self = new DeleteMemberAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMemberAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteMemberAccountRequest setMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
        return this;
    }
    public String getMemberAccountId() {
        return this.memberAccountId;
    }

    public DeleteMemberAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteMemberAccountRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DeleteMemberAccountRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
