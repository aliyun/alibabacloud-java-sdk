// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateGreyTagRouteResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: Success.</li>
     * <li><strong>3xx</strong>: Redirection.</li>
     * <li><strong>4xx</strong>: Client error.</li>
     * <li><strong>5xx</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The canary release rule information.</p>
     */
    @NameInMap("Data")
    public CreateGreyTagRouteResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>Successful request: The <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>Failed request: The <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter.NotEmpty</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information about the call result.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9D29CBD0-45D3-410B-9826-52F86F90****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the change order information was queried successfully. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The query was successful.</li>
     * <li><strong>false</strong>: The query failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID, which is used to accurately query call information.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static CreateGreyTagRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGreyTagRouteResponseBody self = new CreateGreyTagRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGreyTagRouteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateGreyTagRouteResponseBody setData(CreateGreyTagRouteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateGreyTagRouteResponseBodyData getData() {
        return this.data;
    }

    public CreateGreyTagRouteResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateGreyTagRouteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGreyTagRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGreyTagRouteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateGreyTagRouteResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CreateGreyTagRouteResponseBodyData extends TeaModel {
        /**
         * <p>The canary release rule ID, which is globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("GreyTagRouteId")
        public Long greyTagRouteId;

        public static CreateGreyTagRouteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateGreyTagRouteResponseBodyData self = new CreateGreyTagRouteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateGreyTagRouteResponseBodyData setGreyTagRouteId(Long greyTagRouteId) {
            this.greyTagRouteId = greyTagRouteId;
            return this;
        }
        public Long getGreyTagRouteId() {
            return this.greyTagRouteId;
        }

    }

}
