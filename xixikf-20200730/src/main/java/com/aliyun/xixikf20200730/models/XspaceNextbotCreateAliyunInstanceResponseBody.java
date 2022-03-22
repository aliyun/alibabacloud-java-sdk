// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class XspaceNextbotCreateAliyunInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public XspaceNextbotCreateAliyunInstanceResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static XspaceNextbotCreateAliyunInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        XspaceNextbotCreateAliyunInstanceResponseBody self = new XspaceNextbotCreateAliyunInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public XspaceNextbotCreateAliyunInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public XspaceNextbotCreateAliyunInstanceResponseBody setData(XspaceNextbotCreateAliyunInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public XspaceNextbotCreateAliyunInstanceResponseBodyData getData() {
        return this.data;
    }

    public XspaceNextbotCreateAliyunInstanceResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public XspaceNextbotCreateAliyunInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public XspaceNextbotCreateAliyunInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public XspaceNextbotCreateAliyunInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class XspaceNextbotCreateAliyunInstanceResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("TenantId")
        public Long tenantId;

        public static XspaceNextbotCreateAliyunInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            XspaceNextbotCreateAliyunInstanceResponseBodyData self = new XspaceNextbotCreateAliyunInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public XspaceNextbotCreateAliyunInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public XspaceNextbotCreateAliyunInstanceResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public XspaceNextbotCreateAliyunInstanceResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
