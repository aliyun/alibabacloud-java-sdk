// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class RegisterDeviceCredentialResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceCredential")
    public RegisterDeviceCredentialResponseBodyDeviceCredential deviceCredential;

    public static RegisterDeviceCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterDeviceCredentialResponseBody self = new RegisterDeviceCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterDeviceCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RegisterDeviceCredentialResponseBody setDeviceCredential(RegisterDeviceCredentialResponseBodyDeviceCredential deviceCredential) {
        this.deviceCredential = deviceCredential;
        return this;
    }
    public RegisterDeviceCredentialResponseBodyDeviceCredential getDeviceCredential() {
        return this.deviceCredential;
    }

    public static class RegisterDeviceCredentialResponseBodyDeviceCredential extends TeaModel {
        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("DeviceAccessKeyId")
        public String deviceAccessKeyId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("DeviceAccessKeySecret")
        public String deviceAccessKeySecret;

        @NameInMap("ClientId")
        public String clientId;

        public static RegisterDeviceCredentialResponseBodyDeviceCredential build(java.util.Map<String, ?> map) throws Exception {
            RegisterDeviceCredentialResponseBodyDeviceCredential self = new RegisterDeviceCredentialResponseBodyDeviceCredential();
            return TeaModel.build(map, self);
        }

        public RegisterDeviceCredentialResponseBodyDeviceCredential setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public RegisterDeviceCredentialResponseBodyDeviceCredential setDeviceAccessKeyId(String deviceAccessKeyId) {
            this.deviceAccessKeyId = deviceAccessKeyId;
            return this;
        }
        public String getDeviceAccessKeyId() {
            return this.deviceAccessKeyId;
        }

        public RegisterDeviceCredentialResponseBodyDeviceCredential setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public RegisterDeviceCredentialResponseBodyDeviceCredential setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RegisterDeviceCredentialResponseBodyDeviceCredential setDeviceAccessKeySecret(String deviceAccessKeySecret) {
            this.deviceAccessKeySecret = deviceAccessKeySecret;
            return this;
        }
        public String getDeviceAccessKeySecret() {
            return this.deviceAccessKeySecret;
        }

        public RegisterDeviceCredentialResponseBodyDeviceCredential setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

    }

}
