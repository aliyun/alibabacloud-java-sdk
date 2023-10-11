// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class LoginModelScopeRequest extends TeaModel {
    @NameInMap("EmpId")
    public String empId;

    @NameInMap("EmpName")
    public String empName;

    @NameInMap("Token")
    public String token;

    @NameInMap("Type")
    public String type;

    public static LoginModelScopeRequest build(java.util.Map<String, ?> map) throws Exception {
        LoginModelScopeRequest self = new LoginModelScopeRequest();
        return TeaModel.build(map, self);
    }

    public LoginModelScopeRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public LoginModelScopeRequest setEmpName(String empName) {
        this.empName = empName;
        return this;
    }
    public String getEmpName() {
        return this.empName;
    }

    public LoginModelScopeRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public LoginModelScopeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
