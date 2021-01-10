// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutAppcustomciconfigResponseBody extends TeaModel {
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
    public SaveLinkeBahamutAppcustomciconfigResponseBodyResult result;

    public static SaveLinkeBahamutAppcustomciconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutAppcustomciconfigResponseBody self = new SaveLinkeBahamutAppcustomciconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutAppcustomciconfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveLinkeBahamutAppcustomciconfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveLinkeBahamutAppcustomciconfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public SaveLinkeBahamutAppcustomciconfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SaveLinkeBahamutAppcustomciconfigResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public SaveLinkeBahamutAppcustomciconfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveLinkeBahamutAppcustomciconfigResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public SaveLinkeBahamutAppcustomciconfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SaveLinkeBahamutAppcustomciconfigResponseBody setResult(SaveLinkeBahamutAppcustomciconfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SaveLinkeBahamutAppcustomciconfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class SaveLinkeBahamutAppcustomciconfigResponseBodyResult extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Branch")
        public String branch;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Crontab")
        public String crontab;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("PipelineInstanceId")
        public Long pipelineInstanceId;

        @NameInMap("PipelineTemplateId")
        public Long pipelineTemplateId;

        @NameInMap("PipelineTemplateName")
        public String pipelineTemplateName;

        @NameInMap("TenantId")
        public String tenantId;

        public static SaveLinkeBahamutAppcustomciconfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SaveLinkeBahamutAppcustomciconfigResponseBodyResult self = new SaveLinkeBahamutAppcustomciconfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SaveLinkeBahamutAppcustomciconfigResponseBodyResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public SaveLinkeBahamutAppcustomciconfigResponseBodyResult setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public SaveLinkeBahamutAppcustomciconfigResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public SaveLinkeBahamutAppcustomciconfigResponseBodyResult setCrontab(String crontab) {
            this.crontab = crontab;
            return this;
        }
        public String getCrontab() {
            return this.crontab;
        }

        public SaveLinkeBahamutAppcustomciconfigResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public SaveLinkeBahamutAppcustomciconfigResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SaveLinkeBahamutAppcustomciconfigResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public SaveLinkeBahamutAppcustomciconfigResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SaveLinkeBahamutAppcustomciconfigResponseBodyResult setPipelineInstanceId(Long pipelineInstanceId) {
            this.pipelineInstanceId = pipelineInstanceId;
            return this;
        }
        public Long getPipelineInstanceId() {
            return this.pipelineInstanceId;
        }

        public SaveLinkeBahamutAppcustomciconfigResponseBodyResult setPipelineTemplateId(Long pipelineTemplateId) {
            this.pipelineTemplateId = pipelineTemplateId;
            return this;
        }
        public Long getPipelineTemplateId() {
            return this.pipelineTemplateId;
        }

        public SaveLinkeBahamutAppcustomciconfigResponseBodyResult setPipelineTemplateName(String pipelineTemplateName) {
            this.pipelineTemplateName = pipelineTemplateName;
            return this;
        }
        public String getPipelineTemplateName() {
            return this.pipelineTemplateName;
        }

        public SaveLinkeBahamutAppcustomciconfigResponseBodyResult setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
