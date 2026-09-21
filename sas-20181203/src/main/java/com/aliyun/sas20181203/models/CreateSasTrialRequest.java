// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateSasTrialRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. Different requests must use different tokens. The token supports only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run. true: performs only a dry run without performing the actual request. false: performs the actual request. Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether the request is from the ECS console. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
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
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The reason for applying for the trial. This parameter is required for a second trial.</p>
     */
    @NameInMap("RequestForm")
    public CreateSasTrialRequestRequestForm requestForm;

    /**
     * <p>The trial type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Trial is not allowed.</li>
     * <li><strong>1</strong>: First trial.</li>
     * <li><strong>2</strong>: Second trial.</li>
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
     * <p>7</p>
     */
    @NameInMap("TryVersion")
    public Integer tryVersion;

    public static CreateSasTrialRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSasTrialRequest self = new CreateSasTrialRequest();
        return TeaModel.build(map, self);
    }

    public CreateSasTrialRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSasTrialRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateSasTrialRequest setFromEcs(Boolean fromEcs) {
        this.fromEcs = fromEcs;
        return this;
    }
    public Boolean getFromEcs() {
        return this.fromEcs;
    }

    public CreateSasTrialRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateSasTrialRequest setRequestForm(CreateSasTrialRequestRequestForm requestForm) {
        this.requestForm = requestForm;
        return this;
    }
    public CreateSasTrialRequestRequestForm getRequestForm() {
        return this.requestForm;
    }

    public CreateSasTrialRequest setTryType(Integer tryType) {
        this.tryType = tryType;
        return this;
    }
    public Integer getTryType() {
        return this.tryType;
    }

    public CreateSasTrialRequest setTryVersion(Integer tryVersion) {
        this.tryVersion = tryVersion;
        return this;
    }
    public Integer getTryVersion() {
        return this.tryVersion;
    }

    public static class CreateSasTrialRequestRequestForm extends TeaModel {
        /**
         * <p>The reason for applying for the trial.</p>
         * 
         * <strong>example:</strong>
         * <p>for poc</p>
         */
        @NameInMap("TryReason")
        public String tryReason;

        public static CreateSasTrialRequestRequestForm build(java.util.Map<String, ?> map) throws Exception {
            CreateSasTrialRequestRequestForm self = new CreateSasTrialRequestRequestForm();
            return TeaModel.build(map, self);
        }

        public CreateSasTrialRequestRequestForm setTryReason(String tryReason) {
            this.tryReason = tryReason;
            return this;
        }
        public String getTryReason() {
            return this.tryReason;
        }

    }

}
