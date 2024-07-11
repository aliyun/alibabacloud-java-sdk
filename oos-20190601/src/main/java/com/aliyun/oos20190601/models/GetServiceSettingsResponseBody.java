// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetServiceSettingsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9F755DC9-C0CF-4598-B2E3-2CC763F18CB2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of service settings.</p>
     */
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
         * <p>false</p>
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

        public GetServiceSettingsResponseBodyServiceSettings setDeliveryOssEnabled(Boolean deliveryOssEnabled) {
            this.deliveryOssEnabled = deliveryOssEnabled;
            return this;
        }
        public Boolean getDeliveryOssEnabled() {
            return this.deliveryOssEnabled;
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

        public GetServiceSettingsResponseBodyServiceSettings setDeliverySlsProjectName(String deliverySlsProjectName) {
            this.deliverySlsProjectName = deliverySlsProjectName;
            return this;
        }
        public String getDeliverySlsProjectName() {
            return this.deliverySlsProjectName;
        }

        public GetServiceSettingsResponseBodyServiceSettings setRdcEnterpriseId(String rdcEnterpriseId) {
            this.rdcEnterpriseId = rdcEnterpriseId;
            return this;
        }
        public String getRdcEnterpriseId() {
            return this.rdcEnterpriseId;
        }

    }

}
