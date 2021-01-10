// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeCurrenttenantResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("Path")
    public String path;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("WhileListIp")
    public String whileListIp;

    @NameInMap("Permission")
    public UpdateLinkeantcodeAntcodeCurrenttenantResponseBodyPermission permission;

    public static UpdateLinkeantcodeAntcodeCurrenttenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeCurrenttenantResponseBody self = new UpdateLinkeantcodeAntcodeCurrenttenantResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeCurrenttenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeantcodeAntcodeCurrenttenantResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeantcodeAntcodeCurrenttenantResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeantcodeAntcodeCurrenttenantResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public UpdateLinkeantcodeAntcodeCurrenttenantResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeCurrenttenantResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLinkeantcodeAntcodeCurrenttenantResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public UpdateLinkeantcodeAntcodeCurrenttenantResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeantcodeAntcodeCurrenttenantResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public UpdateLinkeantcodeAntcodeCurrenttenantResponseBody setWhileListIp(String whileListIp) {
        this.whileListIp = whileListIp;
        return this;
    }
    public String getWhileListIp() {
        return this.whileListIp;
    }

    public UpdateLinkeantcodeAntcodeCurrenttenantResponseBody setPermission(UpdateLinkeantcodeAntcodeCurrenttenantResponseBodyPermission permission) {
        this.permission = permission;
        return this;
    }
    public UpdateLinkeantcodeAntcodeCurrenttenantResponseBodyPermission getPermission() {
        return this.permission;
    }

    public static class UpdateLinkeantcodeAntcodeCurrenttenantResponseBodyPermission extends TeaModel {
        @NameInMap("GroupAccess")
        public String groupAccess;

        @NameInMap("ProjectAccess")
        public String projectAccess;

        @NameInMap("ReviewAccess")
        public String reviewAccess;

        @NameInMap("TenantAccess")
        public String tenantAccess;

        public static UpdateLinkeantcodeAntcodeCurrenttenantResponseBodyPermission build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeCurrenttenantResponseBodyPermission self = new UpdateLinkeantcodeAntcodeCurrenttenantResponseBodyPermission();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeCurrenttenantResponseBodyPermission setGroupAccess(String groupAccess) {
            this.groupAccess = groupAccess;
            return this;
        }
        public String getGroupAccess() {
            return this.groupAccess;
        }

        public UpdateLinkeantcodeAntcodeCurrenttenantResponseBodyPermission setProjectAccess(String projectAccess) {
            this.projectAccess = projectAccess;
            return this;
        }
        public String getProjectAccess() {
            return this.projectAccess;
        }

        public UpdateLinkeantcodeAntcodeCurrenttenantResponseBodyPermission setReviewAccess(String reviewAccess) {
            this.reviewAccess = reviewAccess;
            return this;
        }
        public String getReviewAccess() {
            return this.reviewAccess;
        }

        public UpdateLinkeantcodeAntcodeCurrenttenantResponseBodyPermission setTenantAccess(String tenantAccess) {
            this.tenantAccess = tenantAccess;
            return this;
        }
        public String getTenantAccess() {
            return this.tenantAccess;
        }

    }

}
