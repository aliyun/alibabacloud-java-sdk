// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdminiterationtemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public AddLinkeBahamutAdminiterationtemplateResponseBodyResult result;

    public static AddLinkeBahamutAdminiterationtemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdminiterationtemplateResponseBody self = new AddLinkeBahamutAdminiterationtemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdminiterationtemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLinkeBahamutAdminiterationtemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddLinkeBahamutAdminiterationtemplateResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public AddLinkeBahamutAdminiterationtemplateResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public AddLinkeBahamutAdminiterationtemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddLinkeBahamutAdminiterationtemplateResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddLinkeBahamutAdminiterationtemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddLinkeBahamutAdminiterationtemplateResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddLinkeBahamutAdminiterationtemplateResponseBody setResult(AddLinkeBahamutAdminiterationtemplateResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddLinkeBahamutAdminiterationtemplateResponseBodyResult getResult() {
        return this.result;
    }

    public static class AddLinkeBahamutAdminiterationtemplateResponseBodyResult extends TeaModel {
        @NameInMap("PreSetStageTemplateIds")
        public java.util.List<String> preSetStageTemplateIds;

        @NameInMap("Type")
        public String type;

        @NameInMap("TemplateGroup")
        public String templateGroup;

        @NameInMap("NeedProject")
        public Boolean needProject;

        @NameInMap("XflushCheckEnable")
        public Boolean xflushCheckEnable;

        @NameInMap("FabricBizType")
        public String fabricBizType;

        @NameInMap("NeedWorkItem")
        public Boolean needWorkItem;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Tasks")
        public java.util.List<String> tasks;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("StageTemplates")
        public java.util.List<String> stageTemplates;

        @NameInMap("Description")
        public String description;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Name")
        public String name;

        @NameInMap("IndependentComplete")
        public Boolean independentComplete;

        @NameInMap("Id")
        public String id;

        @NameInMap("Enable")
        public Boolean enable;

        public static AddLinkeBahamutAdminiterationtemplateResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddLinkeBahamutAdminiterationtemplateResponseBodyResult self = new AddLinkeBahamutAdminiterationtemplateResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddLinkeBahamutAdminiterationtemplateResponseBodyResult setPreSetStageTemplateIds(java.util.List<String> preSetStageTemplateIds) {
            this.preSetStageTemplateIds = preSetStageTemplateIds;
            return this;
        }
        public java.util.List<String> getPreSetStageTemplateIds() {
            return this.preSetStageTemplateIds;
        }

        public AddLinkeBahamutAdminiterationtemplateResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddLinkeBahamutAdminiterationtemplateResponseBodyResult setTemplateGroup(String templateGroup) {
            this.templateGroup = templateGroup;
            return this;
        }
        public String getTemplateGroup() {
            return this.templateGroup;
        }

        public AddLinkeBahamutAdminiterationtemplateResponseBodyResult setNeedProject(Boolean needProject) {
            this.needProject = needProject;
            return this;
        }
        public Boolean getNeedProject() {
            return this.needProject;
        }

        public AddLinkeBahamutAdminiterationtemplateResponseBodyResult setXflushCheckEnable(Boolean xflushCheckEnable) {
            this.xflushCheckEnable = xflushCheckEnable;
            return this;
        }
        public Boolean getXflushCheckEnable() {
            return this.xflushCheckEnable;
        }

        public AddLinkeBahamutAdminiterationtemplateResponseBodyResult setFabricBizType(String fabricBizType) {
            this.fabricBizType = fabricBizType;
            return this;
        }
        public String getFabricBizType() {
            return this.fabricBizType;
        }

        public AddLinkeBahamutAdminiterationtemplateResponseBodyResult setNeedWorkItem(Boolean needWorkItem) {
            this.needWorkItem = needWorkItem;
            return this;
        }
        public Boolean getNeedWorkItem() {
            return this.needWorkItem;
        }

        public AddLinkeBahamutAdminiterationtemplateResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public AddLinkeBahamutAdminiterationtemplateResponseBodyResult setTasks(java.util.List<String> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<String> getTasks() {
            return this.tasks;
        }

        public AddLinkeBahamutAdminiterationtemplateResponseBodyResult setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public AddLinkeBahamutAdminiterationtemplateResponseBodyResult setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public AddLinkeBahamutAdminiterationtemplateResponseBodyResult setStageTemplates(java.util.List<String> stageTemplates) {
            this.stageTemplates = stageTemplates;
            return this;
        }
        public java.util.List<String> getStageTemplates() {
            return this.stageTemplates;
        }

        public AddLinkeBahamutAdminiterationtemplateResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddLinkeBahamutAdminiterationtemplateResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public AddLinkeBahamutAdminiterationtemplateResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public AddLinkeBahamutAdminiterationtemplateResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddLinkeBahamutAdminiterationtemplateResponseBodyResult setIndependentComplete(Boolean independentComplete) {
            this.independentComplete = independentComplete;
            return this;
        }
        public Boolean getIndependentComplete() {
            return this.independentComplete;
        }

        public AddLinkeBahamutAdminiterationtemplateResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddLinkeBahamutAdminiterationtemplateResponseBodyResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
