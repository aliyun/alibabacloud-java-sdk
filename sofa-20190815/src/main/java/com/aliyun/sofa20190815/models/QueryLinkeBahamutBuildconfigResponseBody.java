// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutBuildconfigResponseBody extends TeaModel {
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
    public QueryLinkeBahamutBuildconfigResponseBodyResult result;

    public static QueryLinkeBahamutBuildconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutBuildconfigResponseBody self = new QueryLinkeBahamutBuildconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutBuildconfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutBuildconfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutBuildconfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutBuildconfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutBuildconfigResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutBuildconfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutBuildconfigResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutBuildconfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutBuildconfigResponseBody setResult(QueryLinkeBahamutBuildconfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLinkeBahamutBuildconfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutBuildconfigResponseBodyResult extends TeaModel {
        @NameInMap("DefaultRegistryConfig")
        public String defaultRegistryConfig;

        @NameInMap("OssConfig")
        public String ossConfig;

        @NameInMap("UseCustomProductOss")
        public Boolean useCustomProductOss;

        @NameInMap("RegistryConfigs")
        public java.util.List<String> registryConfigs;

        @NameInMap("SettingsFiles")
        public java.util.List<String> settingsFiles;

        public static QueryLinkeBahamutBuildconfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutBuildconfigResponseBodyResult self = new QueryLinkeBahamutBuildconfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutBuildconfigResponseBodyResult setDefaultRegistryConfig(String defaultRegistryConfig) {
            this.defaultRegistryConfig = defaultRegistryConfig;
            return this;
        }
        public String getDefaultRegistryConfig() {
            return this.defaultRegistryConfig;
        }

        public QueryLinkeBahamutBuildconfigResponseBodyResult setOssConfig(String ossConfig) {
            this.ossConfig = ossConfig;
            return this;
        }
        public String getOssConfig() {
            return this.ossConfig;
        }

        public QueryLinkeBahamutBuildconfigResponseBodyResult setUseCustomProductOss(Boolean useCustomProductOss) {
            this.useCustomProductOss = useCustomProductOss;
            return this;
        }
        public Boolean getUseCustomProductOss() {
            return this.useCustomProductOss;
        }

        public QueryLinkeBahamutBuildconfigResponseBodyResult setRegistryConfigs(java.util.List<String> registryConfigs) {
            this.registryConfigs = registryConfigs;
            return this;
        }
        public java.util.List<String> getRegistryConfigs() {
            return this.registryConfigs;
        }

        public QueryLinkeBahamutBuildconfigResponseBodyResult setSettingsFiles(java.util.List<String> settingsFiles) {
            this.settingsFiles = settingsFiles;
            return this;
        }
        public java.util.List<String> getSettingsFiles() {
            return this.settingsFiles;
        }

    }

}
