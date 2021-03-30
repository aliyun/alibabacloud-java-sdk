// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetOrgAccountResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetOrgAccountResponseBodyData> data;

    @NameInMap("Code")
    public byte[] code;

    @NameInMap("Message")
    public byte[] message;

    @NameInMap("Success")
    public Boolean success;

    public static GetOrgAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrgAccountResponseBody self = new GetOrgAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrgAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOrgAccountResponseBody setData(java.util.List<GetOrgAccountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOrgAccountResponseBodyData> getData() {
        return this.data;
    }

    public GetOrgAccountResponseBody setCode(byte[] code) {
        this.code = code;
        return this;
    }
    public byte[] getCode() {
        return this.code;
    }

    public GetOrgAccountResponseBody setMessage(byte[] message) {
        this.message = message;
        return this;
    }
    public byte[] getMessage() {
        return this.message;
    }

    public GetOrgAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOrgAccountResponseBodyDataCurrentDept extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Code")
        public String code;

        @NameInMap("ParentCode")
        public String parentCode;

        public static GetOrgAccountResponseBodyDataCurrentDept build(java.util.Map<String, ?> map) throws Exception {
            GetOrgAccountResponseBodyDataCurrentDept self = new GetOrgAccountResponseBodyDataCurrentDept();
            return TeaModel.build(map, self);
        }

        public GetOrgAccountResponseBodyDataCurrentDept setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOrgAccountResponseBodyDataCurrentDept setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetOrgAccountResponseBodyDataCurrentDept setParentCode(String parentCode) {
            this.parentCode = parentCode;
            return this;
        }
        public String getParentCode() {
            return this.parentCode;
        }

    }

    public static class GetOrgAccountResponseBodyDataParentDept extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Code")
        public String code;

        @NameInMap("ParentCode")
        public String parentCode;

        public static GetOrgAccountResponseBodyDataParentDept build(java.util.Map<String, ?> map) throws Exception {
            GetOrgAccountResponseBodyDataParentDept self = new GetOrgAccountResponseBodyDataParentDept();
            return TeaModel.build(map, self);
        }

        public GetOrgAccountResponseBodyDataParentDept setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOrgAccountResponseBodyDataParentDept setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetOrgAccountResponseBodyDataParentDept setParentCode(String parentCode) {
            this.parentCode = parentCode;
            return this;
        }
        public String getParentCode() {
            return this.parentCode;
        }

    }

    public static class GetOrgAccountResponseBodyDataSubDept extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Code")
        public String code;

        @NameInMap("ParentCode")
        public String parentCode;

        public static GetOrgAccountResponseBodyDataSubDept build(java.util.Map<String, ?> map) throws Exception {
            GetOrgAccountResponseBodyDataSubDept self = new GetOrgAccountResponseBodyDataSubDept();
            return TeaModel.build(map, self);
        }

        public GetOrgAccountResponseBodyDataSubDept setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOrgAccountResponseBodyDataSubDept setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetOrgAccountResponseBodyDataSubDept setParentCode(String parentCode) {
            this.parentCode = parentCode;
            return this;
        }
        public String getParentCode() {
            return this.parentCode;
        }

    }

    public static class GetOrgAccountResponseBodyDataAccountRoles extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static GetOrgAccountResponseBodyDataAccountRoles build(java.util.Map<String, ?> map) throws Exception {
            GetOrgAccountResponseBodyDataAccountRoles self = new GetOrgAccountResponseBodyDataAccountRoles();
            return TeaModel.build(map, self);
        }

        public GetOrgAccountResponseBodyDataAccountRoles setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetOrgAccountResponseBodyDataAccountRoles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetOrgAccountResponseBodyDataAccount extends TeaModel {
        @NameInMap("Nick")
        public String nick;

        @NameInMap("Name")
        public String name;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("DeptCode")
        public String deptCode;

        @NameInMap("Roles")
        public java.util.List<GetOrgAccountResponseBodyDataAccountRoles> roles;

        public static GetOrgAccountResponseBodyDataAccount build(java.util.Map<String, ?> map) throws Exception {
            GetOrgAccountResponseBodyDataAccount self = new GetOrgAccountResponseBodyDataAccount();
            return TeaModel.build(map, self);
        }

        public GetOrgAccountResponseBodyDataAccount setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public GetOrgAccountResponseBodyDataAccount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOrgAccountResponseBodyDataAccount setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetOrgAccountResponseBodyDataAccount setDeptCode(String deptCode) {
            this.deptCode = deptCode;
            return this;
        }
        public String getDeptCode() {
            return this.deptCode;
        }

        public GetOrgAccountResponseBodyDataAccount setRoles(java.util.List<GetOrgAccountResponseBodyDataAccountRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<GetOrgAccountResponseBodyDataAccountRoles> getRoles() {
            return this.roles;
        }

    }

    public static class GetOrgAccountResponseBodyData extends TeaModel {
        // 当前部门
        @NameInMap("CurrentDept")
        public GetOrgAccountResponseBodyDataCurrentDept currentDept;

        @NameInMap("ParentDept")
        public java.util.List<GetOrgAccountResponseBodyDataParentDept> parentDept;

        @NameInMap("SubDept")
        public java.util.List<GetOrgAccountResponseBodyDataSubDept> subDept;

        @NameInMap("Account")
        public java.util.List<GetOrgAccountResponseBodyDataAccount> account;

        public static GetOrgAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOrgAccountResponseBodyData self = new GetOrgAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOrgAccountResponseBodyData setCurrentDept(GetOrgAccountResponseBodyDataCurrentDept currentDept) {
            this.currentDept = currentDept;
            return this;
        }
        public GetOrgAccountResponseBodyDataCurrentDept getCurrentDept() {
            return this.currentDept;
        }

        public GetOrgAccountResponseBodyData setParentDept(java.util.List<GetOrgAccountResponseBodyDataParentDept> parentDept) {
            this.parentDept = parentDept;
            return this;
        }
        public java.util.List<GetOrgAccountResponseBodyDataParentDept> getParentDept() {
            return this.parentDept;
        }

        public GetOrgAccountResponseBodyData setSubDept(java.util.List<GetOrgAccountResponseBodyDataSubDept> subDept) {
            this.subDept = subDept;
            return this;
        }
        public java.util.List<GetOrgAccountResponseBodyDataSubDept> getSubDept() {
            return this.subDept;
        }

        public GetOrgAccountResponseBodyData setAccount(java.util.List<GetOrgAccountResponseBodyDataAccount> account) {
            this.account = account;
            return this;
        }
        public java.util.List<GetOrgAccountResponseBodyDataAccount> getAccount() {
            return this.account;
        }

    }

}
