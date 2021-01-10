// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationtemplateiterationtemplateResponseBody extends TeaModel {
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
    public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult result;

    public static GetLinkeBahamutIterationtemplateiterationtemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationtemplateiterationtemplateResponseBody self = new GetLinkeBahamutIterationtemplateiterationtemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationtemplateiterationtemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutIterationtemplateiterationtemplateResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutIterationtemplateiterationtemplateResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutIterationtemplateiterationtemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutIterationtemplateiterationtemplateResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutIterationtemplateiterationtemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutIterationtemplateiterationtemplateResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutIterationtemplateiterationtemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutIterationtemplateiterationtemplateResponseBody setResult(GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult extends TeaModel {
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

        public static GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult self = new GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult setFabricBizType(String fabricBizType) {
            this.fabricBizType = fabricBizType;
            return this;
        }
        public String getFabricBizType() {
            return this.fabricBizType;
        }

        public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult setIndependentComplete(Boolean independentComplete) {
            this.independentComplete = independentComplete;
            return this;
        }
        public Boolean getIndependentComplete() {
            return this.independentComplete;
        }

        public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult setNeedProject(Boolean needProject) {
            this.needProject = needProject;
            return this;
        }
        public Boolean getNeedProject() {
            return this.needProject;
        }

        public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult setNeedWorkItem(Boolean needWorkItem) {
            this.needWorkItem = needWorkItem;
            return this;
        }
        public Boolean getNeedWorkItem() {
            return this.needWorkItem;
        }

        public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult setTemplateGroup(String templateGroup) {
            this.templateGroup = templateGroup;
            return this;
        }
        public String getTemplateGroup() {
            return this.templateGroup;
        }

        public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult setXflushCheckEnable(Boolean xflushCheckEnable) {
            this.xflushCheckEnable = xflushCheckEnable;
            return this;
        }
        public Boolean getXflushCheckEnable() {
            return this.xflushCheckEnable;
        }

        public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult setPreSetStageTemplateIds(java.util.List<String> preSetStageTemplateIds) {
            this.preSetStageTemplateIds = preSetStageTemplateIds;
            return this;
        }
        public java.util.List<String> getPreSetStageTemplateIds() {
            return this.preSetStageTemplateIds;
        }

        public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult setStageTemplates(java.util.List<String> stageTemplates) {
            this.stageTemplates = stageTemplates;
            return this;
        }
        public java.util.List<String> getStageTemplates() {
            return this.stageTemplates;
        }

        public GetLinkeBahamutIterationtemplateiterationtemplateResponseBodyResult setTasks(java.util.List<String> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<String> getTasks() {
            return this.tasks;
        }

    }

}
