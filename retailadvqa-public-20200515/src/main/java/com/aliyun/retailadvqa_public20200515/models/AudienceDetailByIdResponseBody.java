// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class AudienceDetailByIdResponseBody extends TeaModel {
    @NameInMap("Data")
    public AudienceDetailByIdResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static AudienceDetailByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AudienceDetailByIdResponseBody self = new AudienceDetailByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public AudienceDetailByIdResponseBody setData(AudienceDetailByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AudienceDetailByIdResponseBodyData getData() {
        return this.data;
    }

    public AudienceDetailByIdResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AudienceDetailByIdResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public AudienceDetailByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AudienceDetailByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AudienceDetailByIdResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class AudienceDetailByIdResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NumberOfAudiences")
        public Long numberOfAudiences;

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

        public AudienceDetailByIdResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AudienceDetailByIdResponseBodyData setNumberOfAudiences(Long numberOfAudiences) {
            this.numberOfAudiences = numberOfAudiences;
            return this;
        }
        public Long getNumberOfAudiences() {
            return this.numberOfAudiences;
        }

    }

}
