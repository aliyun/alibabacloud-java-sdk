// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DeleteWorkflowTemplateVersionResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The current active version number. An empty value indicates that only a draft exists.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("effectiveVersion")
    public String effectiveVersion;

    /**
     * <p>All remaining versions after deletion, sorted in descending order by version number.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("items")
    public java.util.List<DeleteWorkflowTemplateVersionResponseBodyItems> items;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ID of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>tpl_example</p>
     */
    @NameInMap("templateId")
    public String templateId;

    public static DeleteWorkflowTemplateVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkflowTemplateVersionResponseBody self = new DeleteWorkflowTemplateVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWorkflowTemplateVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteWorkflowTemplateVersionResponseBody setEffectiveVersion(String effectiveVersion) {
        this.effectiveVersion = effectiveVersion;
        return this;
    }
    public String getEffectiveVersion() {
        return this.effectiveVersion;
    }

    public DeleteWorkflowTemplateVersionResponseBody setItems(java.util.List<DeleteWorkflowTemplateVersionResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DeleteWorkflowTemplateVersionResponseBodyItems> getItems() {
        return this.items;
    }

    public DeleteWorkflowTemplateVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteWorkflowTemplateVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteWorkflowTemplateVersionResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public static class DeleteWorkflowTemplateVersionResponseBodyItems extends TeaModel {
        /**
         * <p>The ID of the user who created the version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("createdByUserId")
        public Long createdByUserId;

        /**
         * <p>The description of the template for this version. This can be used for display when version v1 has no version description.</p>
         * 
         * <strong>example:</strong>
         * <p>Automatically generate weekly reports</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The time when the version was created. The time is in the ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-19T10:00:00+08:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the version was modified. The time is in the ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-19T10:00:00+08:00</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The time when the version was submitted. The time is in the ISO 8601 format. This is empty for a draft.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-19T10:00:00+08:00</p>
         */
        @NameInMap("gmtSubmitted")
        public String gmtSubmitted;

        /**
         * <p>Indicates whether the version is the only current active version.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isEffective")
        public Boolean isEffective;

        /**
         * <p>The name of the template for this version.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The submitted version number on which this version is based. This is empty for a newly created v1 version. Saving or submitting a draft retains the original source version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("sourceVersion")
        public String sourceVersion;

        /**
         * <p>The version status. Valid values: DRAFT (draft) and SUBMITTED (submitted).</p>
         * 
         * <strong>example:</strong>
         * <p>DRAFT</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The number of steps in this version.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("stepCount")
        public Long stepCount;

        /**
         * <p>The ID of the user who submitted the version. This is empty for a draft.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("submittedByUserId")
        public Long submittedByUserId;

        /**
         * <p>The ID of the user who last modified the version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("updatedByUserId")
        public Long updatedByUserId;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The persisted version change description. An empty value indicates that no description is provided.</p>
         * 
         * <strong>example:</strong>
         * <p>Added an approval step</p>
         */
        @NameInMap("versionDescription")
        public String versionDescription;

        public static DeleteWorkflowTemplateVersionResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DeleteWorkflowTemplateVersionResponseBodyItems self = new DeleteWorkflowTemplateVersionResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DeleteWorkflowTemplateVersionResponseBodyItems setCreatedByUserId(Long createdByUserId) {
            this.createdByUserId = createdByUserId;
            return this;
        }
        public Long getCreatedByUserId() {
            return this.createdByUserId;
        }

        public DeleteWorkflowTemplateVersionResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteWorkflowTemplateVersionResponseBodyItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DeleteWorkflowTemplateVersionResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DeleteWorkflowTemplateVersionResponseBodyItems setGmtSubmitted(String gmtSubmitted) {
            this.gmtSubmitted = gmtSubmitted;
            return this;
        }
        public String getGmtSubmitted() {
            return this.gmtSubmitted;
        }

        public DeleteWorkflowTemplateVersionResponseBodyItems setIsEffective(Boolean isEffective) {
            this.isEffective = isEffective;
            return this;
        }
        public Boolean getIsEffective() {
            return this.isEffective;
        }

        public DeleteWorkflowTemplateVersionResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteWorkflowTemplateVersionResponseBodyItems setSourceVersion(String sourceVersion) {
            this.sourceVersion = sourceVersion;
            return this;
        }
        public String getSourceVersion() {
            return this.sourceVersion;
        }

        public DeleteWorkflowTemplateVersionResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeleteWorkflowTemplateVersionResponseBodyItems setStepCount(Long stepCount) {
            this.stepCount = stepCount;
            return this;
        }
        public Long getStepCount() {
            return this.stepCount;
        }

        public DeleteWorkflowTemplateVersionResponseBodyItems setSubmittedByUserId(Long submittedByUserId) {
            this.submittedByUserId = submittedByUserId;
            return this;
        }
        public Long getSubmittedByUserId() {
            return this.submittedByUserId;
        }

        public DeleteWorkflowTemplateVersionResponseBodyItems setUpdatedByUserId(Long updatedByUserId) {
            this.updatedByUserId = updatedByUserId;
            return this;
        }
        public Long getUpdatedByUserId() {
            return this.updatedByUserId;
        }

        public DeleteWorkflowTemplateVersionResponseBodyItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DeleteWorkflowTemplateVersionResponseBodyItems setVersionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }
        public String getVersionDescription() {
            return this.versionDescription;
        }

    }

}
