// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListImageAnalysisRuleProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<ListImageAnalysisRuleProjectResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TimeCost")
    public Long timeCost;

    public static ListImageAnalysisRuleProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImageAnalysisRuleProjectResponseBody self = new ListImageAnalysisRuleProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImageAnalysisRuleProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListImageAnalysisRuleProjectResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListImageAnalysisRuleProjectResponseBody setData(java.util.List<ListImageAnalysisRuleProjectResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListImageAnalysisRuleProjectResponseBodyData> getData() {
        return this.data;
    }

    public ListImageAnalysisRuleProjectResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListImageAnalysisRuleProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListImageAnalysisRuleProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImageAnalysisRuleProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListImageAnalysisRuleProjectResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static class ListImageAnalysisRuleProjectResponseBodyData extends TeaModel {
        // 规则内容
        @NameInMap("Content")
        public String content;

        // 是否gzip压缩
        @NameInMap("IsCompress")
        public Boolean isCompress;

        // 是否加密
        @NameInMap("IsEncrypt")
        public Boolean isEncrypt;

        // 规则名称
        @NameInMap("Name")
        public String name;

        // 输出配置
        @NameInMap("OutputConfig")
        public String outputConfig;

        // 处理handler
        @NameInMap("OutputHandler")
        public String outputHandler;

        // 项目名称
        @NameInMap("Project")
        public String project;

        // 规则状态
        @NameInMap("Status")
        public Integer status;

        // 规则版本
        @NameInMap("Version")
        public String version;

        public static ListImageAnalysisRuleProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListImageAnalysisRuleProjectResponseBodyData self = new ListImageAnalysisRuleProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListImageAnalysisRuleProjectResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListImageAnalysisRuleProjectResponseBodyData setIsCompress(Boolean isCompress) {
            this.isCompress = isCompress;
            return this;
        }
        public Boolean getIsCompress() {
            return this.isCompress;
        }

        public ListImageAnalysisRuleProjectResponseBodyData setIsEncrypt(Boolean isEncrypt) {
            this.isEncrypt = isEncrypt;
            return this;
        }
        public Boolean getIsEncrypt() {
            return this.isEncrypt;
        }

        public ListImageAnalysisRuleProjectResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListImageAnalysisRuleProjectResponseBodyData setOutputConfig(String outputConfig) {
            this.outputConfig = outputConfig;
            return this;
        }
        public String getOutputConfig() {
            return this.outputConfig;
        }

        public ListImageAnalysisRuleProjectResponseBodyData setOutputHandler(String outputHandler) {
            this.outputHandler = outputHandler;
            return this;
        }
        public String getOutputHandler() {
            return this.outputHandler;
        }

        public ListImageAnalysisRuleProjectResponseBodyData setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListImageAnalysisRuleProjectResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListImageAnalysisRuleProjectResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
