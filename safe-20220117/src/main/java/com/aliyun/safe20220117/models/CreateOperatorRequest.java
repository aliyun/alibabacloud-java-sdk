// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class CreateOperatorRequest extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSign")
    public String authSign;

    @NameInMap("BgObject")
    public String bgObject;

    @NameInMap("BgSystem")
    public String bgSystem;

    @NameInMap("Code")
    public String code;

    @NameInMap("CurEmpId")
    public String curEmpId;

    @NameInMap("Name")
    public String name;

    @NameInMap("NoCheck")
    public Boolean noCheck;

    @NameInMap("NoRisk")
    public Boolean noRisk;

    @NameInMap("ReqTimestamp")
    public Long reqTimestamp;

    public static CreateOperatorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOperatorRequest self = new CreateOperatorRequest();
        return TeaModel.build(map, self);
    }

    public CreateOperatorRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public CreateOperatorRequest setAuthSign(String authSign) {
        this.authSign = authSign;
        return this;
    }
    public String getAuthSign() {
        return this.authSign;
    }

    public CreateOperatorRequest setBgObject(String bgObject) {
        this.bgObject = bgObject;
        return this;
    }
    public String getBgObject() {
        return this.bgObject;
    }

    public CreateOperatorRequest setBgSystem(String bgSystem) {
        this.bgSystem = bgSystem;
        return this;
    }
    public String getBgSystem() {
        return this.bgSystem;
    }

    public CreateOperatorRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOperatorRequest setCurEmpId(String curEmpId) {
        this.curEmpId = curEmpId;
        return this;
    }
    public String getCurEmpId() {
        return this.curEmpId;
    }

    public CreateOperatorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOperatorRequest setNoCheck(Boolean noCheck) {
        this.noCheck = noCheck;
        return this;
    }
    public Boolean getNoCheck() {
        return this.noCheck;
    }

    public CreateOperatorRequest setNoRisk(Boolean noRisk) {
        this.noRisk = noRisk;
        return this;
    }
    public Boolean getNoRisk() {
        return this.noRisk;
    }

    public CreateOperatorRequest setReqTimestamp(Long reqTimestamp) {
        this.reqTimestamp = reqTimestamp;
        return this;
    }
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

}
