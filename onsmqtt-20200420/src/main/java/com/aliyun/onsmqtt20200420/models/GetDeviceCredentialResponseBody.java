// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class GetDeviceCredentialResponseBody extends TeaModel {
    /**
     * <p>The information about the access credential of the device.</p>
     */
    @NameInMap("DeviceCredential")
    public GetDeviceCredentialResponseBodyDeviceCredential deviceCredential;

    /**
     * <p>The request ID. This parameter is a common parameter.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceCredentialResponseBody self = new GetDeviceCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceCredentialResponseBody setDeviceCredential(GetDeviceCredentialResponseBodyDeviceCredential deviceCredential) {
        this.deviceCredential = deviceCredential;
        return this;
    }
    public GetDeviceCredentialResponseBodyDeviceCredential getDeviceCredential() {
        return this.deviceCredential;
    }

    public GetDeviceCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeviceCredentialResponseBodyDeviceCredential extends TeaModel {
        /**
         * <p>The client ID of the device.</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The timestamp that indicates when the access credential of the device was created. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The AccessKey ID of the device.</p>
         */
        @NameInMap("DeviceAccessKeyId")
        public String deviceAccessKeyId;

        /**
         * <p>The AccessKey secret of the device.</p>
         */
        @NameInMap("DeviceAccessKeySecret")
        public String deviceAccessKeySecret;

        /**
         * <p>The ID of the ApsaraMQ for MQTT instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The timestamp that indicates when the access credential of the device was last updated. The value of this parameter is a UNIX timestamp in milliseconds.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetDeviceCredentialResponseBodyDeviceCredential build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceCredentialResponseBodyDeviceCredential self = new GetDeviceCredentialResponseBodyDeviceCredential();
            return TeaModel.build(map, self);
        }

        public GetDeviceCredentialResponseBodyDeviceCredential setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetDeviceCredentialResponseBodyDeviceCredential setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDeviceCredentialResponseBodyDeviceCredential setDeviceAccessKeyId(String deviceAccessKeyId) {
            this.deviceAccessKeyId = deviceAccessKeyId;
            return this;
        }
        public String getDeviceAccessKeyId() {
            return this.deviceAccessKeyId;
        }

        public GetDeviceCredentialResponseBodyDeviceCredential setDeviceAccessKeySecret(String deviceAccessKeySecret) {
            this.deviceAccessKeySecret = deviceAccessKeySecret;
            return this;
        }
        public String getDeviceAccessKeySecret() {
            return this.deviceAccessKeySecret;
        }

        public GetDeviceCredentialResponseBodyDeviceCredential setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetDeviceCredentialResponseBodyDeviceCredential setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
