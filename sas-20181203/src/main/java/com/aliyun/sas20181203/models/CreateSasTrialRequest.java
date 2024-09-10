// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateSasTrialRequest extends TeaModel {
    /**
     * <p>Specifies whether the request is redirected from the Elastic Compute Service (ECS) console. Valid values:</p>
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
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The reason why you apply for the trial. You must specify the reason for the second trial.</p>
     */
    @NameInMap("RequestForm")
    public CreateSasTrialRequestRequestForm requestForm;

    /**
     * <p>The trial type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: trial prohibited</li>
     * <li><strong>1</strong>: first trial</li>
     * <li><strong>2</strong>: second trial</li>
     * </ul>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2623574.html">GetCanTrySas</a> operation to obtain the trial type. You can start a trial only if this parameter is not set to 0.</p>
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
     * <li><strong>3</strong>: Enterprise</li>
     * <li><strong>7</strong>: Ultimate</li>
     * </ul>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2623574.html">GetCanTrySas</a> operation to obtain the trial edition.</p>
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
         * <p>The reason why you apply for the trial.</p>
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
