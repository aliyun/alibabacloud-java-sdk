// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class JWTPayload extends TeaModel {
    @NameInMap("aud")
    public String aud;

    @NameInMap("auto_create")
    public Boolean autoCreate;

    @NameInMap("exp")
    public Long exp;

    @NameInMap("iat")
    public Long iat;

    @NameInMap("iss")
    public String iss;

    @NameInMap("jti")
    public String jti;

    @NameInMap("nbf")
    public Long nbf;

    @NameInMap("sub")
    public String sub;

    @NameInMap("sub_type")
    public String subType;

    public static JWTPayload build(java.util.Map<String, ?> map) throws Exception {
        JWTPayload self = new JWTPayload();
        return TeaModel.build(map, self);
    }

    public JWTPayload setAud(String aud) {
        this.aud = aud;
        return this;
    }
    public String getAud() {
        return this.aud;
    }

    public JWTPayload setAutoCreate(Boolean autoCreate) {
        this.autoCreate = autoCreate;
        return this;
    }
    public Boolean getAutoCreate() {
        return this.autoCreate;
    }

    public JWTPayload setExp(Long exp) {
        this.exp = exp;
        return this;
    }
    public Long getExp() {
        return this.exp;
    }

    public JWTPayload setIat(Long iat) {
        this.iat = iat;
        return this;
    }
    public Long getIat() {
        return this.iat;
    }

    public JWTPayload setIss(String iss) {
        this.iss = iss;
        return this;
    }
    public String getIss() {
        return this.iss;
    }

    public JWTPayload setJti(String jti) {
        this.jti = jti;
        return this;
    }
    public String getJti() {
        return this.jti;
    }

    public JWTPayload setNbf(Long nbf) {
        this.nbf = nbf;
        return this;
    }
    public Long getNbf() {
        return this.nbf;
    }

    public JWTPayload setSub(String sub) {
        this.sub = sub;
        return this;
    }
    public String getSub() {
        return this.sub;
    }

    public JWTPayload setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

}
