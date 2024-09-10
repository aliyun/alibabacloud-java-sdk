// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateSasTrialShrinkRequest extends TeaModel {
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
    public String requestFormShrink;

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

    public static CreateSasTrialShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSasTrialShrinkRequest self = new CreateSasTrialShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSasTrialShrinkRequest setFromEcs(Boolean fromEcs) {
        this.fromEcs = fromEcs;
        return this;
    }
    public Boolean getFromEcs() {
        return this.fromEcs;
    }

    public CreateSasTrialShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateSasTrialShrinkRequest setRequestFormShrink(String requestFormShrink) {
        this.requestFormShrink = requestFormShrink;
        return this;
    }
    public String getRequestFormShrink() {
        return this.requestFormShrink;
    }

    public CreateSasTrialShrinkRequest setTryType(Integer tryType) {
        this.tryType = tryType;
        return this;
    }
    public Integer getTryType() {
        return this.tryType;
    }

    public CreateSasTrialShrinkRequest setTryVersion(Integer tryVersion) {
        this.tryVersion = tryVersion;
        return this;
    }
    public Integer getTryVersion() {
        return this.tryVersion;
    }

}
