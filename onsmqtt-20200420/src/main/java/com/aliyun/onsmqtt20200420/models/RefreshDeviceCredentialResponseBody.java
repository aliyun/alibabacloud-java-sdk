// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class RefreshDeviceCredentialResponseBody extends TeaModel {
    /**
     * <p>The access credential of the device.</p>
     */
    @NameInMap("DeviceCredential")
    public RefreshDeviceCredentialResponseBodyDeviceCredential deviceCredential;

    /**
     * <p>The request ID. This parameter is a common parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>E4581CCF-62AF-44D9-B5B4-D1DBDC0F****</p>
     */
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
        /**
         * <p>The client ID of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test@@@test</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The timestamp that indicates when the access credential of the device was created. The value of this parameter is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1605541382000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The AccessKey ID of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>DC.Z5fXh9sRRVufyLi6wo****</p>
         */
        @NameInMap("DeviceAccessKeyId")
        public String deviceAccessKeyId;

        /**
         * <p>The AccessKey secret of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>DC.BJMkn4eMQJK2vaApTS****</p>
         */
        @NameInMap("DeviceAccessKeySecret")
        public String deviceAccessKeySecret;

        /**
         * <p>The ID of the ApsaraMQ for MQTT instance.</p>
         * 
         * <strong>example:</strong>
         * <p>post-cn-0pp12gl****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The timestamp that indicates when the access credential of the device was last updated. The value of this parameter is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1605541382000</p>
         */
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
