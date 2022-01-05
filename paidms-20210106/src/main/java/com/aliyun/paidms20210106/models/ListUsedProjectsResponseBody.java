// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class ListUsedProjectsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    // project列表
    @NameInMap("Data")
    public java.util.List<ListUsedProjectsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListUsedProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsedProjectsResponseBody self = new ListUsedProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsedProjectsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUsedProjectsResponseBody setData(java.util.List<ListUsedProjectsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUsedProjectsResponseBodyData> getData() {
        return this.data;
    }

    public ListUsedProjectsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUsedProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUsedProjectsResponseBodyData extends TeaModel {
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

        public static ListUsedProjectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUsedProjectsResponseBodyData self = new ListUsedProjectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUsedProjectsResponseBodyData setProjectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
            return this;
        }
        public String getProjectDesc() {
            return this.projectDesc;
        }

        public ListUsedProjectsResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListUsedProjectsResponseBodyData setProjectIdentifier(String projectIdentifier) {
            this.projectIdentifier = projectIdentifier;
            return this;
        }
        public String getProjectIdentifier() {
            return this.projectIdentifier;
        }

        public ListUsedProjectsResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListUsedProjectsResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
