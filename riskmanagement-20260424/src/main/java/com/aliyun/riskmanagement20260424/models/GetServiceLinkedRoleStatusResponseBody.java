// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetServiceLinkedRoleStatusResponseBody extends TeaModel {
    /**
     * <p>The status code. Valid values:</p>
     * <ul>
     * <li><strong>200</strong>: Succeeded.</li>
     * <li><strong>Other (400, 500)</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("Data")
    public GetServiceLinkedRoleStatusResponseBodyData data;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2FBDD713-00A5-5C98-B661-3FD31A349B6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.                                </li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
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
         * <p>The authorization status. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: authorized</li>
         * <li><strong>false</strong>: not authorized</li>
         * </ul>
         * 
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
