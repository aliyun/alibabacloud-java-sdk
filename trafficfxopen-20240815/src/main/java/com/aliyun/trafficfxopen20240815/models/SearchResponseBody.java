// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trafficfxopen20240815.models;

import com.aliyun.tea.*;

public class SearchResponseBody extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorData")
    public SearchResponseBodyErrorData errorData;

    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>71ad3e90-53f8-445b-be9d-df91039cba47</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static SearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchResponseBody self = new SearchResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SearchResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchResponseBody setErrorData(SearchResponseBodyErrorData errorData) {
        this.errorData = errorData;
        return this;
    }
    public SearchResponseBodyErrorData getErrorData() {
        return this.errorData;
    }

    public SearchResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchResponseBodyErrorData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("rawErrorCode")
        public String rawErrorCode;

        @NameInMap("rawErrorMsg")
        public String rawErrorMsg;

        public static SearchResponseBodyErrorData build(java.util.Map<String, ?> map) throws Exception {
            SearchResponseBodyErrorData self = new SearchResponseBodyErrorData();
            return TeaModel.build(map, self);
        }

        public SearchResponseBodyErrorData setRawErrorCode(String rawErrorCode) {
            this.rawErrorCode = rawErrorCode;
            return this;
        }
        public String getRawErrorCode() {
            return this.rawErrorCode;
        }

        public SearchResponseBodyErrorData setRawErrorMsg(String rawErrorMsg) {
            this.rawErrorMsg = rawErrorMsg;
            return this;
        }
        public String getRawErrorMsg() {
            return this.rawErrorMsg;
        }

    }

}
