// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class SetServiceSettingsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceSettings")
    public java.util.List<SetServiceSettingsResponseBodyServiceSettings> serviceSettings;

    public static SetServiceSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetServiceSettingsResponseBody self = new SetServiceSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public SetServiceSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetServiceSettingsResponseBody setServiceSettings(java.util.List<SetServiceSettingsResponseBodyServiceSettings> serviceSettings) {
        this.serviceSettings = serviceSettings;
        return this;
    }
    public java.util.List<SetServiceSettingsResponseBodyServiceSettings> getServiceSettings() {
        return this.serviceSettings;
    }

    public static class SetServiceSettingsResponseBodyServiceSettings extends TeaModel {
        @NameInMap("DeliveryOssBucketName")
        public String deliveryOssBucketName;

        @NameInMap("DeliveryOssKeyPrefix")
        public String deliveryOssKeyPrefix;

        @NameInMap("DeliverySlsEnabled")
        public Boolean deliverySlsEnabled;

        @NameInMap("DeliveryOssEnabled")
        public Boolean deliveryOssEnabled;

        @NameInMap("DeliverySlsProjectName")
        public String deliverySlsProjectName;

        public static SetServiceSettingsResponseBodyServiceSettings build(java.util.Map<String, ?> map) throws Exception {
            SetServiceSettingsResponseBodyServiceSettings self = new SetServiceSettingsResponseBodyServiceSettings();
            return TeaModel.build(map, self);
        }

        public SetServiceSettingsResponseBodyServiceSettings setDeliveryOssBucketName(String deliveryOssBucketName) {
            this.deliveryOssBucketName = deliveryOssBucketName;
            return this;
        }
        public String getDeliveryOssBucketName() {
            return this.deliveryOssBucketName;
        }

        public SetServiceSettingsResponseBodyServiceSettings setDeliveryOssKeyPrefix(String deliveryOssKeyPrefix) {
            this.deliveryOssKeyPrefix = deliveryOssKeyPrefix;
            return this;
        }
        public String getDeliveryOssKeyPrefix() {
            return this.deliveryOssKeyPrefix;
        }

        public SetServiceSettingsResponseBodyServiceSettings setDeliverySlsEnabled(Boolean deliverySlsEnabled) {
            this.deliverySlsEnabled = deliverySlsEnabled;
            return this;
        }
        public Boolean getDeliverySlsEnabled() {
            return this.deliverySlsEnabled;
        }

        public SetServiceSettingsResponseBodyServiceSettings setDeliveryOssEnabled(Boolean deliveryOssEnabled) {
            this.deliveryOssEnabled = deliveryOssEnabled;
            return this;
        }
        public Boolean getDeliveryOssEnabled() {
            return this.deliveryOssEnabled;
        }

        public SetServiceSettingsResponseBodyServiceSettings setDeliverySlsProjectName(String deliverySlsProjectName) {
            this.deliverySlsProjectName = deliverySlsProjectName;
            return this;
        }
        public String getDeliverySlsProjectName() {
            return this.deliverySlsProjectName;
        }

    }

}
