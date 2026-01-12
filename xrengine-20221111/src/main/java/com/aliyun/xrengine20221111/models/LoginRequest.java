// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class LoginRequest extends TeaModel {
    @NameInMap("EmpId")
    public String empId;

    @NameInMap("EmpName")
    public String empName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static LoginRequest build(java.util.Map<String, ?> map) throws Exception {
        LoginRequest self = new LoginRequest();
        return TeaModel.build(map, self);
    }

    public LoginRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public LoginRequest setEmpName(String empName) {
        this.empName = empName;
        return this;
    }
    public String getEmpName() {
        return this.empName;
    }

    public LoginRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public LoginRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
