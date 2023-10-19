// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class BaseRoleMemberResponse extends TeaModel {
    @NameInMap("assignment_list")
    public java.util.List<BaseAssignmentResponse> assignmentList;

    @NameInMap("created_at")
    public String createdAt;

    @NameInMap("creator")
    public String creator;

    @NameInMap("domain_id")
    public String domainId;

    @NameInMap("identity")
    public Identity identity;

    @NameInMap("identity_name")
    public String identityName;

    @NameInMap("is_admin")
    public Boolean isAdmin;

    @NameInMap("subdomain_id")
    public String subdomainId;

    public static BaseRoleMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        BaseRoleMemberResponse self = new BaseRoleMemberResponse();
        return TeaModel.build(map, self);
    }

    public BaseRoleMemberResponse setAssignmentList(java.util.List<BaseAssignmentResponse> assignmentList) {
        this.assignmentList = assignmentList;
        return this;
    }
    public java.util.List<BaseAssignmentResponse> getAssignmentList() {
        return this.assignmentList;
    }

    public BaseRoleMemberResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public BaseRoleMemberResponse setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public BaseRoleMemberResponse setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public BaseRoleMemberResponse setIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }
    public Identity getIdentity() {
        return this.identity;
    }

    public BaseRoleMemberResponse setIdentityName(String identityName) {
        this.identityName = identityName;
        return this;
    }
    public String getIdentityName() {
        return this.identityName;
    }

    public BaseRoleMemberResponse setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public BaseRoleMemberResponse setSubdomainId(String subdomainId) {
        this.subdomainId = subdomainId;
        return this;
    }
    public String getSubdomainId() {
        return this.subdomainId;
    }

}
