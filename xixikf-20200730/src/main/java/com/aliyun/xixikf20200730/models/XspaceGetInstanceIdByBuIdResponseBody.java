// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class XspaceGetInstanceIdByBuIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public XspaceGetInstanceIdByBuIdResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static XspaceGetInstanceIdByBuIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        XspaceGetInstanceIdByBuIdResponseBody self = new XspaceGetInstanceIdByBuIdResponseBody();
        return TeaModel.build(map, self);
    }

    public XspaceGetInstanceIdByBuIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public XspaceGetInstanceIdByBuIdResponseBody setData(XspaceGetInstanceIdByBuIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public XspaceGetInstanceIdByBuIdResponseBodyData getData() {
        return this.data;
    }

    public XspaceGetInstanceIdByBuIdResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public XspaceGetInstanceIdByBuIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public XspaceGetInstanceIdByBuIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public XspaceGetInstanceIdByBuIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class XspaceGetInstanceIdByBuIdResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("TenantId")
        public Long tenantId;

        public static XspaceGetInstanceIdByBuIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            XspaceGetInstanceIdByBuIdResponseBodyData self = new XspaceGetInstanceIdByBuIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public XspaceGetInstanceIdByBuIdResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public XspaceGetInstanceIdByBuIdResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public XspaceGetInstanceIdByBuIdResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
