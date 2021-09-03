// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class AudienceDetailByIdResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public AudienceDetailByIdResponseBodyData data;

    public static AudienceDetailByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AudienceDetailByIdResponseBody self = new AudienceDetailByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public AudienceDetailByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AudienceDetailByIdResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public AudienceDetailByIdResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public AudienceDetailByIdResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AudienceDetailByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AudienceDetailByIdResponseBody setData(AudienceDetailByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AudienceDetailByIdResponseBodyData getData() {
        return this.data;
    }

    public static class AudienceDetailByIdResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("NumberOfAudiences")
        public Long numberOfAudiences;

        @NameInMap("Name")
        public String name;

        public static AudienceDetailByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AudienceDetailByIdResponseBodyData self = new AudienceDetailByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AudienceDetailByIdResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AudienceDetailByIdResponseBodyData setNumberOfAudiences(Long numberOfAudiences) {
            this.numberOfAudiences = numberOfAudiences;
            return this;
        }
        public Long getNumberOfAudiences() {
            return this.numberOfAudiences;
        }

        public AudienceDetailByIdResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
