// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetServiceSettingsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceSettings")
    public java.util.List<GetServiceSettingsResponseBodyServiceSettings> serviceSettings;

    public static GetServiceSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceSettingsResponseBody self = new GetServiceSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceSettingsResponseBody setServiceSettings(java.util.List<GetServiceSettingsResponseBodyServiceSettings> serviceSettings) {
        this.serviceSettings = serviceSettings;
        return this;
    }
    public java.util.List<GetServiceSettingsResponseBodyServiceSettings> getServiceSettings() {
        return this.serviceSettings;
    }

    public static class GetServiceSettingsResponseBodyServiceSettings extends TeaModel {
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

        public static GetServiceSettingsResponseBodyServiceSettings build(java.util.Map<String, ?> map) throws Exception {
            GetServiceSettingsResponseBodyServiceSettings self = new GetServiceSettingsResponseBodyServiceSettings();
            return TeaModel.build(map, self);
        }

        public GetServiceSettingsResponseBodyServiceSettings setDeliveryOssBucketName(String deliveryOssBucketName) {
            this.deliveryOssBucketName = deliveryOssBucketName;
            return this;
        }
        public String getDeliveryOssBucketName() {
            return this.deliveryOssBucketName;
        }

        public GetServiceSettingsResponseBodyServiceSettings setDeliveryOssKeyPrefix(String deliveryOssKeyPrefix) {
            this.deliveryOssKeyPrefix = deliveryOssKeyPrefix;
            return this;
        }
        public String getDeliveryOssKeyPrefix() {
            return this.deliveryOssKeyPrefix;
        }

        public GetServiceSettingsResponseBodyServiceSettings setDeliverySlsEnabled(Boolean deliverySlsEnabled) {
            this.deliverySlsEnabled = deliverySlsEnabled;
            return this;
        }
        public Boolean getDeliverySlsEnabled() {
            return this.deliverySlsEnabled;
        }

        public GetServiceSettingsResponseBodyServiceSettings setDeliveryOssEnabled(Boolean deliveryOssEnabled) {
            this.deliveryOssEnabled = deliveryOssEnabled;
            return this;
        }
        public Boolean getDeliveryOssEnabled() {
            return this.deliveryOssEnabled;
        }

        public GetServiceSettingsResponseBodyServiceSettings setDeliverySlsProjectName(String deliverySlsProjectName) {
            this.deliverySlsProjectName = deliverySlsProjectName;
            return this;
        }
        public String getDeliverySlsProjectName() {
            return this.deliverySlsProjectName;
        }

    }

}
