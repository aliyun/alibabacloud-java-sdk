// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeCreatenewgroupResponseBody extends TeaModel {
    @NameInMap("Path")
    public String path;

    @NameInMap("Description")
    public String description;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MembersTotal")
    public Long membersTotal;

    @NameInMap("Size")
    public String size;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("WebUrl")
    public String webUrl;

    @NameInMap("Public")
    public Boolean _public;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectsTotal")
    public Long projectsTotal;

    @NameInMap("AvatarUrl")
    public String avatarUrl;

    @NameInMap("Tenant")
    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyTenant tenant;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Permission")
    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyPermission permission;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLinkeantcodeAntcodeCreatenewgroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeCreatenewgroupResponseBody self = new CreateLinkeantcodeAntcodeCreatenewgroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBody setMembersTotal(Long membersTotal) {
        this.membersTotal = membersTotal;
        return this;
    }
    public Long getMembersTotal() {
        return this.membersTotal;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBody setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBody setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }
    public String getWebUrl() {
        return this.webUrl;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBody set_public(Boolean _public) {
        this._public = _public;
        return this;
    }
    public Boolean get_public() {
        return this._public;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBody setProjectsTotal(Long projectsTotal) {
        this.projectsTotal = projectsTotal;
        return this;
    }
    public Long getProjectsTotal() {
        return this.projectsTotal;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBody setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBody setTenant(CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyTenant tenant) {
        this.tenant = tenant;
        return this;
    }
    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyTenant getTenant() {
        return this.tenant;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBody setPermission(CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyPermission permission) {
        this.permission = permission;
        return this;
    }
    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyPermission getPermission() {
        return this.permission;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeCreatenewgroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyTenant extends TeaModel {
        @NameInMap("Permission")
        public String permission;

        @NameInMap("WhileListIp")
        public String whileListIp;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Path")
        public String path;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyTenant build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyTenant self = new CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyTenant();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyTenant setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyTenant setWhileListIp(String whileListIp) {
            this.whileListIp = whileListIp;
            return this;
        }
        public String getWhileListIp() {
            return this.whileListIp;
        }

        public CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyTenant setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyTenant setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyTenant setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyTenant setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyTenant setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyPermission extends TeaModel {
        @NameInMap("ProjectAccess")
        public String projectAccess;

        @NameInMap("ReviewAccess")
        public String reviewAccess;

        @NameInMap("GroupAccess")
        public String groupAccess;

        @NameInMap("TenantAccess")
        public String tenantAccess;

        public static CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyPermission build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyPermission self = new CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyPermission();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyPermission setProjectAccess(String projectAccess) {
            this.projectAccess = projectAccess;
            return this;
        }
        public String getProjectAccess() {
            return this.projectAccess;
        }

        public CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyPermission setReviewAccess(String reviewAccess) {
            this.reviewAccess = reviewAccess;
            return this;
        }
        public String getReviewAccess() {
            return this.reviewAccess;
        }

        public CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyPermission setGroupAccess(String groupAccess) {
            this.groupAccess = groupAccess;
            return this;
        }
        public String getGroupAccess() {
            return this.groupAccess;
        }

        public CreateLinkeantcodeAntcodeCreatenewgroupResponseBodyPermission setTenantAccess(String tenantAccess) {
            this.tenantAccess = tenantAccess;
            return this;
        }
        public String getTenantAccess() {
            return this.tenantAccess;
        }

    }

}
