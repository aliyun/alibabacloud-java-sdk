// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateMemberAccountsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MemberAccountIds")
    public java.util.List<String> memberAccountIds;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

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
