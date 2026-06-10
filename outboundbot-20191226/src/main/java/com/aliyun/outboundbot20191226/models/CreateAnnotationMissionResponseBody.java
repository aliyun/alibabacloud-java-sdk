// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateAnnotationMissionResponseBody extends TeaModel {
    /**
     * <p>The status code of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateAnnotationMissionResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Additional information. If the request is successful, \<code>success\\</code> is returned. If the request fails, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>执行失败：查找元素或操作超时,outTaskId:trademark_regnew_public_cn-uax33hol2uu,flowId:null,nodeUUID:541b6c71-8cce-4ab0-af84-713ca9741821</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. \<code>true\\</code>: The call was successful. \<code>false\\</code>: The call failed.</p>
     * 
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
        /**
         * <p>Additional information. If the request is successful, \<code>success\\</code> is returned. If the request fails, a specific error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>执行失败：查找元素或操作超时,outTaskId:trademark_regnew_public_cn-uax33hol2uu,flowId:null,nodeUUID:541b6c71-8cce-4ab0-af84-713ca9741821</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the operation was successful.</p>
         * 
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
