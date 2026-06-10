// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InitialSysomResponseBody extends TeaModel {
    /**
     * <p>Request ID, which can be used for end-to-end diagnosis</p>
     * 
     * <strong>example:</strong>
     * <p>3FCA2E38-2A8E-5501-93BD-5CE1BA58F2EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Status code  </p>
     * <ul>
     * <li>If <code>code == Success</code>, authorization succeeded.  </li>
     * <li>Any other status code indicates a failed authorization. In such cases, view the <code>message</code> field for detailed error information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Return Result.</p>
     */
    @NameInMap("data")
    public InitialSysomResponseBodyData data;

    /**
     * <p>Error message  </p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.  </li>
     * <li>Otherwise, this field contains the error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SysomOpenAPIException: SysomOpenAPI.InvalidParameter Invalid params, should be json string or dict</p>
     */
    @NameInMap("message")
    public String message;

    public static InitialSysomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitialSysomResponseBody self = new InitialSysomResponseBody();
        return TeaModel.build(map, self);
    }

    public InitialSysomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitialSysomResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitialSysomResponseBody setData(InitialSysomResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InitialSysomResponseBodyData getData() {
        return this.data;
    }

    public InitialSysomResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class InitialSysomResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the service role exists</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("role_exist")
        public Boolean roleExist;

        public static InitialSysomResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InitialSysomResponseBodyData self = new InitialSysomResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InitialSysomResponseBodyData setRoleExist(Boolean roleExist) {
            this.roleExist = roleExist;
            return this;
        }
        public Boolean getRoleExist() {
            return this.roleExist;
        }

    }

}
