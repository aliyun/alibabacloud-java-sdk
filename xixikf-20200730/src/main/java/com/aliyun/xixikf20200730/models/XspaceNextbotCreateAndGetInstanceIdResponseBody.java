// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class XspaceNextbotCreateAndGetInstanceIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public XspaceNextbotCreateAndGetInstanceIdResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static XspaceNextbotCreateAndGetInstanceIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        XspaceNextbotCreateAndGetInstanceIdResponseBody self = new XspaceNextbotCreateAndGetInstanceIdResponseBody();
        return TeaModel.build(map, self);
    }

    public XspaceNextbotCreateAndGetInstanceIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public XspaceNextbotCreateAndGetInstanceIdResponseBody setData(XspaceNextbotCreateAndGetInstanceIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public XspaceNextbotCreateAndGetInstanceIdResponseBodyData getData() {
        return this.data;
    }

    public XspaceNextbotCreateAndGetInstanceIdResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public XspaceNextbotCreateAndGetInstanceIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public XspaceNextbotCreateAndGetInstanceIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public XspaceNextbotCreateAndGetInstanceIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class XspaceNextbotCreateAndGetInstanceIdResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("TenantId")
        public Long tenantId;

        public static XspaceNextbotCreateAndGetInstanceIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            XspaceNextbotCreateAndGetInstanceIdResponseBodyData self = new XspaceNextbotCreateAndGetInstanceIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public XspaceNextbotCreateAndGetInstanceIdResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public XspaceNextbotCreateAndGetInstanceIdResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public XspaceNextbotCreateAndGetInstanceIdResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
