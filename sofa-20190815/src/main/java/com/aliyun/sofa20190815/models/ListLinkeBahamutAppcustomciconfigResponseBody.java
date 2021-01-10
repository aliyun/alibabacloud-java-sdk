// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutAppcustomciconfigResponseBody extends TeaModel {
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
    public java.util.List<ListLinkeBahamutAppcustomciconfigResponseBodyResult> result;

    public static ListLinkeBahamutAppcustomciconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutAppcustomciconfigResponseBody self = new ListLinkeBahamutAppcustomciconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutAppcustomciconfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeBahamutAppcustomciconfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeBahamutAppcustomciconfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeBahamutAppcustomciconfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLinkeBahamutAppcustomciconfigResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public ListLinkeBahamutAppcustomciconfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLinkeBahamutAppcustomciconfigResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ListLinkeBahamutAppcustomciconfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeBahamutAppcustomciconfigResponseBody setResult(java.util.List<ListLinkeBahamutAppcustomciconfigResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListLinkeBahamutAppcustomciconfigResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListLinkeBahamutAppcustomciconfigResponseBodyResult extends TeaModel {
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

        public static ListLinkeBahamutAppcustomciconfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutAppcustomciconfigResponseBodyResult self = new ListLinkeBahamutAppcustomciconfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutAppcustomciconfigResponseBodyResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListLinkeBahamutAppcustomciconfigResponseBodyResult setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public ListLinkeBahamutAppcustomciconfigResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListLinkeBahamutAppcustomciconfigResponseBodyResult setCrontab(String crontab) {
            this.crontab = crontab;
            return this;
        }
        public String getCrontab() {
            return this.crontab;
        }

        public ListLinkeBahamutAppcustomciconfigResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListLinkeBahamutAppcustomciconfigResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkeBahamutAppcustomciconfigResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public ListLinkeBahamutAppcustomciconfigResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeBahamutAppcustomciconfigResponseBodyResult setPipelineInstanceId(Long pipelineInstanceId) {
            this.pipelineInstanceId = pipelineInstanceId;
            return this;
        }
        public Long getPipelineInstanceId() {
            return this.pipelineInstanceId;
        }

        public ListLinkeBahamutAppcustomciconfigResponseBodyResult setPipelineTemplateId(Long pipelineTemplateId) {
            this.pipelineTemplateId = pipelineTemplateId;
            return this;
        }
        public Long getPipelineTemplateId() {
            return this.pipelineTemplateId;
        }

        public ListLinkeBahamutAppcustomciconfigResponseBodyResult setPipelineTemplateName(String pipelineTemplateName) {
            this.pipelineTemplateName = pipelineTemplateName;
            return this;
        }
        public String getPipelineTemplateName() {
            return this.pipelineTemplateName;
        }

        public ListLinkeBahamutAppcustomciconfigResponseBodyResult setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
