// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DispatchConsoleAPIForPartnerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Module")
    public DispatchConsoleAPIForPartnerResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DispatchConsoleAPIForPartnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DispatchConsoleAPIForPartnerResponseBody self = new DispatchConsoleAPIForPartnerResponseBody();
        return TeaModel.build(map, self);
    }

    public DispatchConsoleAPIForPartnerResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DispatchConsoleAPIForPartnerResponseBody setModule(DispatchConsoleAPIForPartnerResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public DispatchConsoleAPIForPartnerResponseBodyModule getModule() {
        return this.module;
    }

    public DispatchConsoleAPIForPartnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DispatchConsoleAPIForPartnerResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DispatchConsoleAPIForPartnerResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{\&quot;HasCustomRoleAuth\&quot;: False}</p>
         */
        @NameInMap("Data")
        public String data;

        public static DispatchConsoleAPIForPartnerResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            DispatchConsoleAPIForPartnerResponseBodyModule self = new DispatchConsoleAPIForPartnerResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public DispatchConsoleAPIForPartnerResponseBodyModule setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

}
