// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ExportWorkflowTemplateResponseBody extends TeaModel {
    /**
     * <p>业务状态码；成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>可回流导入的精简模板定义</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("template")
    public ExportWorkflowTemplateResponseBodyTemplate template;

    public static ExportWorkflowTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportWorkflowTemplateResponseBody self = new ExportWorkflowTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportWorkflowTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExportWorkflowTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExportWorkflowTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportWorkflowTemplateResponseBody setTemplate(ExportWorkflowTemplateResponseBodyTemplate template) {
        this.template = template;
        return this;
    }
    public ExportWorkflowTemplateResponseBodyTemplate getTemplate() {
        return this.template;
    }

    public static class ExportWorkflowTemplateResponseBodyTemplateSteps extends TeaModel {
        /**
         * <p>模型档位</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("modelMode")
        public String modelMode;

        /**
         * <p>步骤名称</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>智能体负责人名称</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("ownerAgentName")
        public String ownerAgentName;

        /**
         * <p>负责人类型：MEMBER 人工 / AGENT 智能体</p>
         * 
         * <strong>example:</strong>
         * <p>MEMBER</p>
         */
        @NameInMap("ownerType")
        public String ownerType;

        /**
         * <p>人工负责人用户ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ownerUserId")
        public Long ownerUserId;

        /**
         * <p>审核人用户ID列表</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("reviewerUserIds")
        public java.util.List<Long> reviewerUserIds;

        /**
         * <p>步骤顺序</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sortOrder")
        public Long sortOrder;

        /**
         * <p>步骤处理说明</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("specification")
        public String specification;

        /**
         * <p>步骤ID</p>
         * 
         * <strong>example:</strong>
         * <p>collect</p>
         */
        @NameInMap("stepId")
        public String stepId;

        public static ExportWorkflowTemplateResponseBodyTemplateSteps build(java.util.Map<String, ?> map) throws Exception {
            ExportWorkflowTemplateResponseBodyTemplateSteps self = new ExportWorkflowTemplateResponseBodyTemplateSteps();
            return TeaModel.build(map, self);
        }

        public ExportWorkflowTemplateResponseBodyTemplateSteps setModelMode(String modelMode) {
            this.modelMode = modelMode;
            return this;
        }
        public String getModelMode() {
            return this.modelMode;
        }

        public ExportWorkflowTemplateResponseBodyTemplateSteps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExportWorkflowTemplateResponseBodyTemplateSteps setOwnerAgentName(String ownerAgentName) {
            this.ownerAgentName = ownerAgentName;
            return this;
        }
        public String getOwnerAgentName() {
            return this.ownerAgentName;
        }

        public ExportWorkflowTemplateResponseBodyTemplateSteps setOwnerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }
        public String getOwnerType() {
            return this.ownerType;
        }

        public ExportWorkflowTemplateResponseBodyTemplateSteps setOwnerUserId(Long ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public Long getOwnerUserId() {
            return this.ownerUserId;
        }

        public ExportWorkflowTemplateResponseBodyTemplateSteps setReviewerUserIds(java.util.List<Long> reviewerUserIds) {
            this.reviewerUserIds = reviewerUserIds;
            return this;
        }
        public java.util.List<Long> getReviewerUserIds() {
            return this.reviewerUserIds;
        }

        public ExportWorkflowTemplateResponseBodyTemplateSteps setSortOrder(Long sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public Long getSortOrder() {
            return this.sortOrder;
        }

        public ExportWorkflowTemplateResponseBodyTemplateSteps setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public ExportWorkflowTemplateResponseBodyTemplateSteps setStepId(String stepId) {
            this.stepId = stepId;
            return this;
        }
        public String getStepId() {
            return this.stepId;
        }

    }

    public static class ExportWorkflowTemplateResponseBodyTemplate extends TeaModel {
        /**
         * <p>模板描述</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>模板名称</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>规范化步骤</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("steps")
        public java.util.List<ExportWorkflowTemplateResponseBodyTemplateSteps> steps;

        public static ExportWorkflowTemplateResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            ExportWorkflowTemplateResponseBodyTemplate self = new ExportWorkflowTemplateResponseBodyTemplate();
            return TeaModel.build(map, self);
        }

        public ExportWorkflowTemplateResponseBodyTemplate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ExportWorkflowTemplateResponseBodyTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExportWorkflowTemplateResponseBodyTemplate setSteps(java.util.List<ExportWorkflowTemplateResponseBodyTemplateSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<ExportWorkflowTemplateResponseBodyTemplateSteps> getSteps() {
            return this.steps;
        }

    }

}
