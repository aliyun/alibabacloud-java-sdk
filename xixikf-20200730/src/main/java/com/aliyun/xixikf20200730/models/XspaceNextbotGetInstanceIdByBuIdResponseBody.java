// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class XspaceNextbotGetInstanceIdByBuIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public XspaceNextbotGetInstanceIdByBuIdResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static XspaceNextbotGetInstanceIdByBuIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        XspaceNextbotGetInstanceIdByBuIdResponseBody self = new XspaceNextbotGetInstanceIdByBuIdResponseBody();
        return TeaModel.build(map, self);
    }

    public XspaceNextbotGetInstanceIdByBuIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public XspaceNextbotGetInstanceIdByBuIdResponseBody setData(XspaceNextbotGetInstanceIdByBuIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public XspaceNextbotGetInstanceIdByBuIdResponseBodyData getData() {
        return this.data;
    }

    public XspaceNextbotGetInstanceIdByBuIdResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public XspaceNextbotGetInstanceIdByBuIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public XspaceNextbotGetInstanceIdByBuIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public XspaceNextbotGetInstanceIdByBuIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class XspaceNextbotGetInstanceIdByBuIdResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("TenantId")
        public Long tenantId;

        public static XspaceNextbotGetInstanceIdByBuIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            XspaceNextbotGetInstanceIdByBuIdResponseBodyData self = new XspaceNextbotGetInstanceIdByBuIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public XspaceNextbotGetInstanceIdByBuIdResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public XspaceNextbotGetInstanceIdByBuIdResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public XspaceNextbotGetInstanceIdByBuIdResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
