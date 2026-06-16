// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CheckAppVerifyCodeRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The verification code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The phone number or email address.</p>
     * 
     * <strong>example:</strong>
     * <p>docker.io</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The recipient type: phone or email.</p>
     * 
     * <strong>example:</strong>
     * <p>question</p>
     */
    @NameInMap("Type")
    public String type;

    public static CheckAppVerifyCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAppVerifyCodeRequest self = new CheckAppVerifyCodeRequest();
        return TeaModel.build(map, self);
    }

    public CheckAppVerifyCodeRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CheckAppVerifyCodeRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckAppVerifyCodeRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public CheckAppVerifyCodeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
