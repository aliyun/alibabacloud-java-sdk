// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class SetServiceSettingsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CBEC8072-BEC2-478E-8EAE-E723BA79CF19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of service settings.</p>
     */
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
        /**
         * <p>The name of OSS bucket to deliver.</p>
         * 
         * <strong>example:</strong>
         * <p>OssBucketName</p>
         */
        @NameInMap("DeliveryOssBucketName")
        public String deliveryOssBucketName;

        /**
         * <p>Whether to enable OSS delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeliveryOssEnabled")
        public Boolean deliveryOssEnabled;

        /**
         * <p>The key prefix of OSS to deliver.</p>
         * 
         * <strong>example:</strong>
         * <p>oos/execution</p>
         */
        @NameInMap("DeliveryOssKeyPrefix")
        public String deliveryOssKeyPrefix;

        /**
         * <p>Whether to enable SLS delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DeliverySlsEnabled")
        public Boolean deliverySlsEnabled;

        /**
         * <p>The name of SLS project to deliver.</p>
         * 
         * <strong>example:</strong>
         * <p>SlsProjectName</p>
         */
        @NameInMap("DeliverySlsProjectName")
        public String deliverySlsProjectName;

        /**
         * <p>The id of RDC Enterprise.</p>
         * 
         * <strong>example:</strong>
         * <p>RdcEnterpriseId</p>
         */
        @NameInMap("RdcEnterpriseId")
        public String rdcEnterpriseId;

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

        public SetServiceSettingsResponseBodyServiceSettings setDeliveryOssEnabled(Boolean deliveryOssEnabled) {
            this.deliveryOssEnabled = deliveryOssEnabled;
            return this;
        }
        public Boolean getDeliveryOssEnabled() {
            return this.deliveryOssEnabled;
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

        public SetServiceSettingsResponseBodyServiceSettings setDeliverySlsProjectName(String deliverySlsProjectName) {
            this.deliverySlsProjectName = deliverySlsProjectName;
            return this;
        }
        public String getDeliverySlsProjectName() {
            return this.deliverySlsProjectName;
        }

        public SetServiceSettingsResponseBodyServiceSettings setRdcEnterpriseId(String rdcEnterpriseId) {
            this.rdcEnterpriseId = rdcEnterpriseId;
            return this;
        }
        public String getRdcEnterpriseId() {
            return this.rdcEnterpriseId;
        }

    }

}
