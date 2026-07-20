// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class CreateSasTrialRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SdkRequest")
    public CreateSasTrialRequestSdkRequest sdkRequest;

    public static CreateSasTrialRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSasTrialRequest self = new CreateSasTrialRequest();
        return TeaModel.build(map, self);
    }

    public CreateSasTrialRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSasTrialRequest setSdkRequest(CreateSasTrialRequestSdkRequest sdkRequest) {
        this.sdkRequest = sdkRequest;
        return this;
    }
    public CreateSasTrialRequestSdkRequest getSdkRequest() {
        return this.sdkRequest;
    }

    public static class CreateSasTrialRequestSdkRequestRequestForm extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>for poc</p>
         */
        @NameInMap("TryReason")
        public String tryReason;

        public static CreateSasTrialRequestSdkRequestRequestForm build(java.util.Map<String, ?> map) throws Exception {
            CreateSasTrialRequestSdkRequestRequestForm self = new CreateSasTrialRequestSdkRequestRequestForm();
            return TeaModel.build(map, self);
        }

        public CreateSasTrialRequestSdkRequestRequestForm setTryReason(String tryReason) {
            this.tryReason = tryReason;
            return this;
        }
        public String getTryReason() {
            return this.tryReason;
        }

    }

    public static class CreateSasTrialRequestSdkRequest extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FromEcs")
        public Boolean fromEcs;

        /**
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("Lang")
        public String lang;

        @NameInMap("RequestForm")
        public CreateSasTrialRequestSdkRequestRequestForm requestForm;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TryType")
        public Integer tryType;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TryVersion")
        public Integer tryVersion;

        public static CreateSasTrialRequestSdkRequest build(java.util.Map<String, ?> map) throws Exception {
            CreateSasTrialRequestSdkRequest self = new CreateSasTrialRequestSdkRequest();
            return TeaModel.build(map, self);
        }

        public CreateSasTrialRequestSdkRequest setFromEcs(Boolean fromEcs) {
            this.fromEcs = fromEcs;
            return this;
        }
        public Boolean getFromEcs() {
            return this.fromEcs;
        }

        public CreateSasTrialRequestSdkRequest setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public CreateSasTrialRequestSdkRequest setRequestForm(CreateSasTrialRequestSdkRequestRequestForm requestForm) {
            this.requestForm = requestForm;
            return this;
        }
        public CreateSasTrialRequestSdkRequestRequestForm getRequestForm() {
            return this.requestForm;
        }

        public CreateSasTrialRequestSdkRequest setTryType(Integer tryType) {
            this.tryType = tryType;
            return this;
        }
        public Integer getTryType() {
            return this.tryType;
        }

        public CreateSasTrialRequestSdkRequest setTryVersion(Integer tryVersion) {
            this.tryVersion = tryVersion;
            return this;
        }
        public Integer getTryVersion() {
            return this.tryVersion;
        }

    }

}
