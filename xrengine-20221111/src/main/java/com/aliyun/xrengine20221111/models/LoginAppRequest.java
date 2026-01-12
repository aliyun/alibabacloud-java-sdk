// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class LoginAppRequest extends TeaModel {
    @NameInMap("EmpId")
    public String empId;

    @NameInMap("EmpName")
    public String empName;

    @NameInMap("Token")
    public String token;

    @NameInMap("Type")
    public String type;

    public static LoginAppRequest build(java.util.Map<String, ?> map) throws Exception {
        LoginAppRequest self = new LoginAppRequest();
        return TeaModel.build(map, self);
    }

    public LoginAppRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public LoginAppRequest setEmpName(String empName) {
        this.empName = empName;
        return this;
    }
    public String getEmpName() {
        return this.empName;
    }

    public LoginAppRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public LoginAppRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
