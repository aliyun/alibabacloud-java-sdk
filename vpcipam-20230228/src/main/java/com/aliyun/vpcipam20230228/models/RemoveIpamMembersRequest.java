// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class RemoveIpamMembersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Members")
    public java.util.List<RemoveIpamMembersRequestMembers> members;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
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

    public static RemoveIpamMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveIpamMembersRequest self = new RemoveIpamMembersRequest();
        return TeaModel.build(map, self);
    }

    public RemoveIpamMembersRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveIpamMembersRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RemoveIpamMembersRequest setMembers(java.util.List<RemoveIpamMembersRequestMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<RemoveIpamMembersRequestMembers> getMembers() {
        return this.members;
    }

    public RemoveIpamMembersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RemoveIpamMembersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RemoveIpamMembersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveIpamMembersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RemoveIpamMembersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class RemoveIpamMembersRequestMembers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Folder</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        /**
         * <strong>example:</strong>
         * <p>fd-ccccncASqa</p>
         */
        @NameInMap("MemberType")
        public String memberType;

        public static RemoveIpamMembersRequestMembers build(java.util.Map<String, ?> map) throws Exception {
            RemoveIpamMembersRequestMembers self = new RemoveIpamMembersRequestMembers();
            return TeaModel.build(map, self);
        }

        public RemoveIpamMembersRequestMembers setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public RemoveIpamMembersRequestMembers setMemberType(String memberType) {
            this.memberType = memberType;
            return this;
        }
        public String getMemberType() {
            return this.memberType;
        }

    }

}
