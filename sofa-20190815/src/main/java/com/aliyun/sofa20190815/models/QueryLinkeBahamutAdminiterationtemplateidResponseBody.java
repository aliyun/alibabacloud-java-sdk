// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAdminiterationtemplateidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult result;

    public static QueryLinkeBahamutAdminiterationtemplateidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAdminiterationtemplateidResponseBody self = new QueryLinkeBahamutAdminiterationtemplateidResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAdminiterationtemplateidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutAdminiterationtemplateidResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutAdminiterationtemplateidResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutAdminiterationtemplateidResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutAdminiterationtemplateidResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutAdminiterationtemplateidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutAdminiterationtemplateidResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutAdminiterationtemplateidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutAdminiterationtemplateidResponseBody setResult(QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult extends TeaModel {
        @NameInMap("Created")
        public Long created;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Description")
        public String description;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("FabricBizType")
        public String fabricBizType;

        @NameInMap("Id")
        public String id;

        @NameInMap("IndependentComplete")
        public Boolean independentComplete;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("NeedProject")
        public Boolean needProject;

        @NameInMap("NeedWorkItem")
        public Boolean needWorkItem;

        @NameInMap("TemplateGroup")
        public String templateGroup;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("Type")
        public String type;

        @NameInMap("XflushCheckEnable")
        public Boolean xflushCheckEnable;

        @NameInMap("PreSetStageTemplateIds")
        public java.util.List<String> preSetStageTemplateIds;

        @NameInMap("StageTemplates")
        public java.util.List<String> stageTemplates;

        @NameInMap("Tasks")
        public java.util.List<String> tasks;

        public static QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult self = new QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult setFabricBizType(String fabricBizType) {
            this.fabricBizType = fabricBizType;
            return this;
        }
        public String getFabricBizType() {
            return this.fabricBizType;
        }

        public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult setIndependentComplete(Boolean independentComplete) {
            this.independentComplete = independentComplete;
            return this;
        }
        public Boolean getIndependentComplete() {
            return this.independentComplete;
        }

        public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult setNeedProject(Boolean needProject) {
            this.needProject = needProject;
            return this;
        }
        public Boolean getNeedProject() {
            return this.needProject;
        }

        public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult setNeedWorkItem(Boolean needWorkItem) {
            this.needWorkItem = needWorkItem;
            return this;
        }
        public Boolean getNeedWorkItem() {
            return this.needWorkItem;
        }

        public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult setTemplateGroup(String templateGroup) {
            this.templateGroup = templateGroup;
            return this;
        }
        public String getTemplateGroup() {
            return this.templateGroup;
        }

        public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult setXflushCheckEnable(Boolean xflushCheckEnable) {
            this.xflushCheckEnable = xflushCheckEnable;
            return this;
        }
        public Boolean getXflushCheckEnable() {
            return this.xflushCheckEnable;
        }

        public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult setPreSetStageTemplateIds(java.util.List<String> preSetStageTemplateIds) {
            this.preSetStageTemplateIds = preSetStageTemplateIds;
            return this;
        }
        public java.util.List<String> getPreSetStageTemplateIds() {
            return this.preSetStageTemplateIds;
        }

        public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult setStageTemplates(java.util.List<String> stageTemplates) {
            this.stageTemplates = stageTemplates;
            return this;
        }
        public java.util.List<String> getStageTemplates() {
            return this.stageTemplates;
        }

        public QueryLinkeBahamutAdminiterationtemplateidResponseBodyResult setTasks(java.util.List<String> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<String> getTasks() {
            return this.tasks;
        }

    }

}
