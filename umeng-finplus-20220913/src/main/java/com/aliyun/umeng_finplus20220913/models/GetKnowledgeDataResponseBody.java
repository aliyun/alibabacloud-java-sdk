// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class GetKnowledgeDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetKnowledgeDataResponseBodyData> data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetKnowledgeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeDataResponseBody self = new GetKnowledgeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetKnowledgeDataResponseBody setData(java.util.List<GetKnowledgeDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetKnowledgeDataResponseBodyData> getData() {
        return this.data;
    }

    public GetKnowledgeDataResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetKnowledgeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKnowledgeDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetKnowledgeDataResponseBodyData extends TeaModel {
        @NameInMap("appId")
        public String appId;

        @NameInMap("internalKnowledgeId")
        public String internalKnowledgeId;

        @NameInMap("knowledgeName")
        public String knowledgeName;

        @NameInMap("message")
        public String message;

        @NameInMap("status")
        public String status;

        public static GetKnowledgeDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeDataResponseBodyData self = new GetKnowledgeDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeDataResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetKnowledgeDataResponseBodyData setInternalKnowledgeId(String internalKnowledgeId) {
            this.internalKnowledgeId = internalKnowledgeId;
            return this;
        }
        public String getInternalKnowledgeId() {
            return this.internalKnowledgeId;
        }

        public GetKnowledgeDataResponseBodyData setKnowledgeName(String knowledgeName) {
            this.knowledgeName = knowledgeName;
            return this;
        }
        public String getKnowledgeName() {
            return this.knowledgeName;
        }

        public GetKnowledgeDataResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetKnowledgeDataResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
