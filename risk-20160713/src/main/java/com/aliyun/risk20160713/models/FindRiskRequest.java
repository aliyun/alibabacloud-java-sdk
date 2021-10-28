// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class FindRiskRequest extends TeaModel {
    @NameInMap("CodeType")
    public String codeType;

    @NameInMap("Collina")
    public String collina;

    @NameInMap("Email")
    public String email;

    @NameInMap("Extend")
    public java.util.Map<String, ?> extend;

    @NameInMap("IdType")
    public String idType;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("MteeCode")
    public String mteeCode;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("Umid")
    public String umid;

    @NameInMap("UmidToken")
    public String umidToken;

    @NameInMap("UserId")
    public String userId;

    public static FindRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        FindRiskRequest self = new FindRiskRequest();
        return TeaModel.build(map, self);
    }

    public FindRiskRequest setCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }
    public String getCodeType() {
        return this.codeType;
    }

    public FindRiskRequest setCollina(String collina) {
        this.collina = collina;
        return this;
    }
    public String getCollina() {
        return this.collina;
    }

    public FindRiskRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public FindRiskRequest setExtend(java.util.Map<String, ?> extend) {
        this.extend = extend;
        return this;
    }
    public java.util.Map<String, ?> getExtend() {
        return this.extend;
    }

    public FindRiskRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public FindRiskRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public FindRiskRequest setMteeCode(String mteeCode) {
        this.mteeCode = mteeCode;
        return this;
    }
    public String getMteeCode() {
        return this.mteeCode;
    }

    public FindRiskRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public FindRiskRequest setUmid(String umid) {
        this.umid = umid;
        return this;
    }
    public String getUmid() {
        return this.umid;
    }

    public FindRiskRequest setUmidToken(String umidToken) {
        this.umidToken = umidToken;
        return this;
    }
    public String getUmidToken() {
        return this.umidToken;
    }

    public FindRiskRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
