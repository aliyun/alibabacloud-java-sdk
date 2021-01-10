// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycorePipelinesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<QueryLinkedeploycoreDeploycorePipelinesResponseBodyData> data;

    public static QueryLinkedeploycoreDeploycorePipelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycorePipelinesResponseBody self = new QueryLinkedeploycoreDeploycorePipelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycorePipelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkedeploycoreDeploycorePipelinesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkedeploycoreDeploycorePipelinesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkedeploycoreDeploycorePipelinesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkedeploycoreDeploycorePipelinesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkedeploycoreDeploycorePipelinesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkedeploycoreDeploycorePipelinesResponseBody setData(java.util.List<QueryLinkedeploycoreDeploycorePipelinesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkedeploycoreDeploycorePipelinesResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkedeploycoreDeploycorePipelinesResponseBodyData extends TeaModel {
        @NameInMap("EnvType")
        public String envType;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("PipelineDesc")
        public String pipelineDesc;

        @NameInMap("PipelineId")
        public Long pipelineId;

        @NameInMap("PipelineName")
        public String pipelineName;

        public static QueryLinkedeploycoreDeploycorePipelinesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkedeploycoreDeploycorePipelinesResponseBodyData self = new QueryLinkedeploycoreDeploycorePipelinesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkedeploycoreDeploycorePipelinesResponseBodyData setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public QueryLinkedeploycoreDeploycorePipelinesResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryLinkedeploycoreDeploycorePipelinesResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryLinkedeploycoreDeploycorePipelinesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkedeploycoreDeploycorePipelinesResponseBodyData setPipelineDesc(String pipelineDesc) {
            this.pipelineDesc = pipelineDesc;
            return this;
        }
        public String getPipelineDesc() {
            return this.pipelineDesc;
        }

        public QueryLinkedeploycoreDeploycorePipelinesResponseBodyData setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

        public QueryLinkedeploycoreDeploycorePipelinesResponseBodyData setPipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }
        public String getPipelineName() {
            return this.pipelineName;
        }

    }

}
