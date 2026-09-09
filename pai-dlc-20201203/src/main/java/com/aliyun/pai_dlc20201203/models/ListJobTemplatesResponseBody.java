// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListJobTemplatesResponseBody extends TeaModel {
    /**
     * <p>The list of templates.</p>
     */
    @NameInMap("JobTemplates")
    public java.util.List<ListJobTemplatesResponseBodyJobTemplates> jobTemplates;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0D*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
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
         * <p>The default version number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DefaultVersion")
        public Integer defaultVersion;

        /**
         * <p>The template description.</p>
         * 
         * <strong>example:</strong>
         * <p>job description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the template was created.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-23T07:29:06Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The time when the template was last modified.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-03T05:48:02Z</p>
         */
        @NameInMap("GmtModifyTime")
        public String gmtModifyTime;

        /**
         * <p>The most recent time when a task was successfully created by using this template.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-03T11:30:00Z</p>
         */
        @NameInMap("LastUsedTime")
        public String lastUsedTime;

        /**
         * <p>The custom metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The ID of the user who last modified the template.</p>
         * 
         * <strong>example:</strong>
         * <p>20**************26</p>
         */
        @NameInMap("ModifiedBy")
        public String modifiedBy;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tpl1r5g9ait7****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>job-template-1772516653885</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>142388383837****</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The ID of the user who created the template.</p>
         * 
         * <strong>example:</strong>
         * <p>20**************26</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The workspace ID.</p>
         * 
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

        public ListJobTemplatesResponseBodyJobTemplates setLastUsedTime(String lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public String getLastUsedTime() {
            return this.lastUsedTime;
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
