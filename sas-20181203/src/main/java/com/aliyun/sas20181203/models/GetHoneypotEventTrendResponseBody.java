// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotEventTrendResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of entries returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The list of data returned. ￼</p>
     */
    @NameInMap("Data")
    public java.util.List<GetHoneypotEventTrendResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>21637690-9B21-5EEC-94DB-2A732480****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetHoneypotEventTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotEventTrendResponseBody self = new GetHoneypotEventTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHoneypotEventTrendResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHoneypotEventTrendResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public GetHoneypotEventTrendResponseBody setData(java.util.List<GetHoneypotEventTrendResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetHoneypotEventTrendResponseBodyData> getData() {
        return this.data;
    }

    public GetHoneypotEventTrendResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHoneypotEventTrendResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHoneypotEventTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHoneypotEventTrendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHoneypotEventTrendResponseBodyData extends TeaModel {
        /**
         * <p>The number of attacks that occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The name of the attack.</p>
         * 
         * <strong>example:</strong>
         * <p>ATTACK_EVENT</p>
         */
        @NameInMap("KeyName")
        public String keyName;

        /**
         * <p>The timestamp when the attack event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>1686968163644</p>
         */
        @NameInMap("TimeStamp")
        public Long timeStamp;

        public static GetHoneypotEventTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHoneypotEventTrendResponseBodyData self = new GetHoneypotEventTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHoneypotEventTrendResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetHoneypotEventTrendResponseBodyData setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public GetHoneypotEventTrendResponseBodyData setTimeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Long getTimeStamp() {
            return this.timeStamp;
        }

    }

}
