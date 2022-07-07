// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class RegisterDeviceCredentialResponseBody extends TeaModel {
    @NameInMap("DeviceCredential")
    public RegisterDeviceCredentialResponseBodyDeviceCredential deviceCredential;

    @NameInMap("RequestId")
    public String requestId;

    public static RegisterDeviceCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterDeviceCredentialResponseBody self = new RegisterDeviceCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterDeviceCredentialResponseBody setDeviceCredential(RegisterDeviceCredentialResponseBodyDeviceCredential deviceCredential) {
        this.deviceCredential = deviceCredential;
        return this;
    }
    public RegisterDeviceCredentialResponseBodyDeviceCredential getDeviceCredential() {
        return this.deviceCredential;
    }

    public RegisterDeviceCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RegisterDeviceCredentialResponseBodyDeviceCredential extends TeaModel {
        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DeviceAccessKeyId")
        public String deviceAccessKeyId;

        @NameInMap("DeviceAccessKeySecret")
        public String deviceAccessKeySecret;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static RegisterDeviceCredentialResponseBodyDeviceCredential build(java.util.Map<String, ?> map) throws Exception {
            RegisterDeviceCredentialResponseBodyDeviceCredential self = new RegisterDeviceCredentialResponseBodyDeviceCredential();
            return TeaModel.build(map, self);
        }

        public RegisterDeviceCredentialResponseBodyDeviceCredential setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public RegisterDeviceCredentialResponseBodyDeviceCredential setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public RegisterDeviceCredentialResponseBodyDeviceCredential setDeviceAccessKeyId(String deviceAccessKeyId) {
            this.deviceAccessKeyId = deviceAccessKeyId;
            return this;
        }
        public String getDeviceAccessKeyId() {
            return this.deviceAccessKeyId;
        }

        public RegisterDeviceCredentialResponseBodyDeviceCredential setDeviceAccessKeySecret(String deviceAccessKeySecret) {
            this.deviceAccessKeySecret = deviceAccessKeySecret;
            return this;
        }
        public String getDeviceAccessKeySecret() {
            return this.deviceAccessKeySecret;
        }

        public RegisterDeviceCredentialResponseBodyDeviceCredential setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RegisterDeviceCredentialResponseBodyDeviceCredential setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
