// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class ListUsedProjectsByOwnerResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    // project列表
    @NameInMap("Data")
    public java.util.List<ListUsedProjectsByOwnerResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListUsedProjectsByOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsedProjectsByOwnerResponseBody self = new ListUsedProjectsByOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsedProjectsByOwnerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUsedProjectsByOwnerResponseBody setData(java.util.List<ListUsedProjectsByOwnerResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUsedProjectsByOwnerResponseBodyData> getData() {
        return this.data;
    }

    public ListUsedProjectsByOwnerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUsedProjectsByOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUsedProjectsByOwnerResponseBodyData extends TeaModel {
        @NameInMap("ProjectDesc")
        public String projectDesc;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ProjectIdentifier")
        public String projectIdentifier;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("TenantId")
        public Long tenantId;

        public static ListUsedProjectsByOwnerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUsedProjectsByOwnerResponseBodyData self = new ListUsedProjectsByOwnerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUsedProjectsByOwnerResponseBodyData setProjectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
            return this;
        }
        public String getProjectDesc() {
            return this.projectDesc;
        }

        public ListUsedProjectsByOwnerResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListUsedProjectsByOwnerResponseBodyData setProjectIdentifier(String projectIdentifier) {
            this.projectIdentifier = projectIdentifier;
            return this;
        }
        public String getProjectIdentifier() {
            return this.projectIdentifier;
        }

        public ListUsedProjectsByOwnerResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListUsedProjectsByOwnerResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
