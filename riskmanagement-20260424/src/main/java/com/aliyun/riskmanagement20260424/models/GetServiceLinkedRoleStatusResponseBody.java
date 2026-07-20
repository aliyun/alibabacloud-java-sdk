// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetServiceLinkedRoleStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetServiceLinkedRoleStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2FBDD713-00A5-5C98-B661-3FD31A349B6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetServiceLinkedRoleStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceLinkedRoleStatusResponseBody self = new GetServiceLinkedRoleStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceLinkedRoleStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetServiceLinkedRoleStatusResponseBody setData(GetServiceLinkedRoleStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceLinkedRoleStatusResponseBodyData getData() {
        return this.data;
    }

    public GetServiceLinkedRoleStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceLinkedRoleStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceLinkedRoleStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServiceLinkedRoleStatusResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Status")
        public Boolean status;

        public static GetServiceLinkedRoleStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceLinkedRoleStatusResponseBodyData self = new GetServiceLinkedRoleStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceLinkedRoleStatusResponseBodyData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

}
