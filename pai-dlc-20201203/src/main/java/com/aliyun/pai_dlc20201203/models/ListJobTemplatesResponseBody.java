// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListJobTemplatesResponseBody extends TeaModel {
    @NameInMap("JobTemplates")
    public java.util.List<ListJobTemplatesResponseBodyJobTemplates> jobTemplates;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>本次请求的 ID，用于诊断和答疑。</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0D*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListJobTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobTemplatesResponseBody self = new ListJobTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobTemplatesResponseBody setJobTemplates(java.util.List<ListJobTemplatesResponseBodyJobTemplates> jobTemplates) {
        this.jobTemplates = jobTemplates;
        return this;
    }
    public java.util.List<ListJobTemplatesResponseBodyJobTemplates> getJobTemplates() {
        return this.jobTemplates;
    }

    public ListJobTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListJobTemplatesResponseBodyJobTemplates extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DefaultVersion")
        public Integer defaultVersion;

        /**
         * <strong>example:</strong>
         * <p>job description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-23T07:29:06Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-03T05:48:02Z</p>
         */
        @NameInMap("GmtModifyTime")
        public String gmtModifyTime;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <strong>example:</strong>
         * <p>20**************26</p>
         */
        @NameInMap("ModifiedBy")
        public String modifiedBy;

        /**
         * <strong>example:</strong>
         * <p>tpl1r5g9ait7****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <strong>example:</strong>
         * <p>job-template-1772516653885</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <strong>example:</strong>
         * <p>142388383837****</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <strong>example:</strong>
         * <p>20**************26</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>88****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListJobTemplatesResponseBodyJobTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListJobTemplatesResponseBodyJobTemplates self = new ListJobTemplatesResponseBodyJobTemplates();
            return TeaModel.build(map, self);
        }

        public ListJobTemplatesResponseBodyJobTemplates setDefaultVersion(Integer defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public Integer getDefaultVersion() {
            return this.defaultVersion;
        }

        public ListJobTemplatesResponseBodyJobTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListJobTemplatesResponseBodyJobTemplates setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListJobTemplatesResponseBodyJobTemplates setGmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }
        public String getGmtModifyTime() {
            return this.gmtModifyTime;
        }

        public ListJobTemplatesResponseBodyJobTemplates setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public ListJobTemplatesResponseBodyJobTemplates setModifiedBy(String modifiedBy) {
            this.modifiedBy = modifiedBy;
            return this;
        }
        public String getModifiedBy() {
            return this.modifiedBy;
        }

        public ListJobTemplatesResponseBodyJobTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListJobTemplatesResponseBodyJobTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListJobTemplatesResponseBodyJobTemplates setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListJobTemplatesResponseBodyJobTemplates setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListJobTemplatesResponseBodyJobTemplates setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
