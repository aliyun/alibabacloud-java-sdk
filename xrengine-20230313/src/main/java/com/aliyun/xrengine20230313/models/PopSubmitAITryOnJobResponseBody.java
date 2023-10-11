// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopSubmitAITryOnJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PopSubmitAITryOnJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PopSubmitAITryOnJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopSubmitAITryOnJobResponseBody self = new PopSubmitAITryOnJobResponseBody();
        return TeaModel.build(map, self);
    }

    public PopSubmitAITryOnJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopSubmitAITryOnJobResponseBody setData(PopSubmitAITryOnJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PopSubmitAITryOnJobResponseBodyData getData() {
        return this.data;
    }

    public PopSubmitAITryOnJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopSubmitAITryOnJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopSubmitAITryOnJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PopSubmitAITryOnJobResponseBodyData extends TeaModel {
        @NameInMap("ProjectId")
        public String projectId;

        public static PopSubmitAITryOnJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopSubmitAITryOnJobResponseBodyData self = new PopSubmitAITryOnJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopSubmitAITryOnJobResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

}
