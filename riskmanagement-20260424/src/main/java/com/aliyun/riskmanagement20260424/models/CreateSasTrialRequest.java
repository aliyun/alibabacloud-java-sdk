// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class CreateSasTrialRequest extends TeaModel {
    /**
     * <p>The region ID of the access control instance. You can call the DescribeRegions operation to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Security Center SDK request.</p>
     */
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
         * <p>The reason for applying for the trial.</p>
         * 
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
         * <p>Specifies whether the request is from the ECS console. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is from the ECS console.</li>
         * <li><strong>false</strong>: The request is not from the ECS console.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FromEcs")
        public Boolean fromEcs;

        /**
         * <p>The language of the request and response. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (default): Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The reason for applying for the trial.</p>
         */
        @NameInMap("RequestForm")
        public CreateSasTrialRequestSdkRequestRequestForm requestForm;

        /**
         * <p>The trial type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: trial not allowed</li>
         * <li><strong>1</strong>: first trial</li>
         * <li><strong>2</strong>: second trial</li>
         * </ul>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/2623574.html">GetCanTrySas</a> operation to obtain this parameter. The trial can be started only when the value is not 0.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TryType")
        public Integer tryType;

        /**
         * <p>The trial edition. Valid values:</p>
         * <ul>
         * <li><strong>3</strong>: Enterprise Edition.</li>
         * <li><strong>7</strong>: Ultimate Edition.</li>
         * </ul>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/2623574.html">GetCanTrySas</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
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
