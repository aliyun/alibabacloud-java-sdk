// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult> result;

    public static GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBody self = new GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBody setResult(java.util.List<GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult extends TeaModel {
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

        public static GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult self = new GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult setFabricBizType(String fabricBizType) {
            this.fabricBizType = fabricBizType;
            return this;
        }
        public String getFabricBizType() {
            return this.fabricBizType;
        }

        public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult setIndependentComplete(Boolean independentComplete) {
            this.independentComplete = independentComplete;
            return this;
        }
        public Boolean getIndependentComplete() {
            return this.independentComplete;
        }

        public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult setNeedProject(Boolean needProject) {
            this.needProject = needProject;
            return this;
        }
        public Boolean getNeedProject() {
            return this.needProject;
        }

        public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult setNeedWorkItem(Boolean needWorkItem) {
            this.needWorkItem = needWorkItem;
            return this;
        }
        public Boolean getNeedWorkItem() {
            return this.needWorkItem;
        }

        public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult setTemplateGroup(String templateGroup) {
            this.templateGroup = templateGroup;
            return this;
        }
        public String getTemplateGroup() {
            return this.templateGroup;
        }

        public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult setXflushCheckEnable(Boolean xflushCheckEnable) {
            this.xflushCheckEnable = xflushCheckEnable;
            return this;
        }
        public Boolean getXflushCheckEnable() {
            return this.xflushCheckEnable;
        }

        public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult setPreSetStageTemplateIds(java.util.List<String> preSetStageTemplateIds) {
            this.preSetStageTemplateIds = preSetStageTemplateIds;
            return this;
        }
        public java.util.List<String> getPreSetStageTemplateIds() {
            return this.preSetStageTemplateIds;
        }

        public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult setStageTemplates(java.util.List<String> stageTemplates) {
            this.stageTemplates = stageTemplates;
            return this;
        }
        public java.util.List<String> getStageTemplates() {
            return this.stageTemplates;
        }

        public GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseBodyResult setTasks(java.util.List<String> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<String> getTasks() {
            return this.tasks;
        }

    }

}
