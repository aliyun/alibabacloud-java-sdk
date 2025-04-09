// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateAnnotationMissionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateAnnotationMissionResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateAnnotationMissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAnnotationMissionResponseBody self = new CreateAnnotationMissionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAnnotationMissionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAnnotationMissionResponseBody setData(CreateAnnotationMissionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAnnotationMissionResponseBodyData getData() {
        return this.data;
    }

    public CreateAnnotationMissionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateAnnotationMissionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAnnotationMissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAnnotationMissionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAnnotationMissionResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static CreateAnnotationMissionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAnnotationMissionResponseBodyData self = new CreateAnnotationMissionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAnnotationMissionResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateAnnotationMissionResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
