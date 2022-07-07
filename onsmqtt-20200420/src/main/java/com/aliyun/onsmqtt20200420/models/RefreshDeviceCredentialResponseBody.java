// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class RefreshDeviceCredentialResponseBody extends TeaModel {
    @NameInMap("DeviceCredential")
    public RefreshDeviceCredentialResponseBodyDeviceCredential deviceCredential;

    @NameInMap("RequestId")
    public String requestId;

    public static RefreshDeviceCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshDeviceCredentialResponseBody self = new RefreshDeviceCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshDeviceCredentialResponseBody setDeviceCredential(RefreshDeviceCredentialResponseBodyDeviceCredential deviceCredential) {
        this.deviceCredential = deviceCredential;
        return this;
    }
    public RefreshDeviceCredentialResponseBodyDeviceCredential getDeviceCredential() {
        return this.deviceCredential;
    }

    public RefreshDeviceCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RefreshDeviceCredentialResponseBodyDeviceCredential extends TeaModel {
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

        public static RefreshDeviceCredentialResponseBodyDeviceCredential build(java.util.Map<String, ?> map) throws Exception {
            RefreshDeviceCredentialResponseBodyDeviceCredential self = new RefreshDeviceCredentialResponseBodyDeviceCredential();
            return TeaModel.build(map, self);
        }

        public RefreshDeviceCredentialResponseBodyDeviceCredential setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public RefreshDeviceCredentialResponseBodyDeviceCredential setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public RefreshDeviceCredentialResponseBodyDeviceCredential setDeviceAccessKeyId(String deviceAccessKeyId) {
            this.deviceAccessKeyId = deviceAccessKeyId;
            return this;
        }
        public String getDeviceAccessKeyId() {
            return this.deviceAccessKeyId;
        }

        public RefreshDeviceCredentialResponseBodyDeviceCredential setDeviceAccessKeySecret(String deviceAccessKeySecret) {
            this.deviceAccessKeySecret = deviceAccessKeySecret;
            return this;
        }
        public String getDeviceAccessKeySecret() {
            return this.deviceAccessKeySecret;
        }

        public RefreshDeviceCredentialResponseBodyDeviceCredential setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RefreshDeviceCredentialResponseBodyDeviceCredential setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
