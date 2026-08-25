// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetTerminalCountResponseBody extends TeaModel {
    /**
     * <p>The status code. 200 is returned if the call is successful. An error code is returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>PARAM_ERROR</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The terminal count statistics information.</p>
     */
    @NameInMap("Data")
    public GetTerminalCountResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message. This parameter is empty if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>parameter error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C5DCE54A-B266-522E-A6ED-468AF45F5AAA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetTerminalCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTerminalCountResponseBody self = new GetTerminalCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTerminalCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTerminalCountResponseBody setData(GetTerminalCountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTerminalCountResponseBodyData getData() {
        return this.data;
    }

    public GetTerminalCountResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTerminalCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTerminalCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTerminalCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTerminalCountResponseBodyData extends TeaModel {
        /**
         * <p>The number of hardware terminals that are bound to users. This parameter is returned only when ClientType is set to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("BindUserCount")
        public Long bindUserCount;

        /**
         * <p>The number of managed terminals.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("InManageCount")
        public Long inManageCount;

        /**
         * <p>The number of unmanaged terminals.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("NotInManageCount")
        public Long notInManageCount;

        /**
         * <p>The total number of terminals.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetTerminalCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTerminalCountResponseBodyData self = new GetTerminalCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTerminalCountResponseBodyData setBindUserCount(Long bindUserCount) {
            this.bindUserCount = bindUserCount;
            return this;
        }
        public Long getBindUserCount() {
            return this.bindUserCount;
        }

        public GetTerminalCountResponseBodyData setInManageCount(Long inManageCount) {
            this.inManageCount = inManageCount;
            return this;
        }
        public Long getInManageCount() {
            return this.inManageCount;
        }

        public GetTerminalCountResponseBodyData setNotInManageCount(Long notInManageCount) {
            this.notInManageCount = notInManageCount;
            return this;
        }
        public Long getNotInManageCount() {
            return this.notInManageCount;
        }

        public GetTerminalCountResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
