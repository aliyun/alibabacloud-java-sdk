// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetDisposalToolStatusResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetDisposalToolStatusResponseBodyData data;

    /**
     * <p>The prompt message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful‌</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6D462855-7835-5F91-835E-A62E44EC01CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.                               </li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDisposalToolStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDisposalToolStatusResponseBody self = new GetDisposalToolStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDisposalToolStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDisposalToolStatusResponseBody setData(GetDisposalToolStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDisposalToolStatusResponseBodyData getData() {
        return this.data;
    }

    public GetDisposalToolStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDisposalToolStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDisposalToolStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDisposalToolStatusResponseBodyData extends TeaModel {
        /**
         * <p>The authorization status. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Authorized.</li>
         * <li><strong>false</strong>: Not authorized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Status")
        public Boolean status;

        public static GetDisposalToolStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDisposalToolStatusResponseBodyData self = new GetDisposalToolStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDisposalToolStatusResponseBodyData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

}
