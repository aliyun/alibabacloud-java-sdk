// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogAccountRequest extends TeaModel {
    @NameInMap("EmpId")
    public String empId;

    @NameInMap("Nick")
    public String nick;

    @NameInMap("Role")
    public String role;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("StoreIdsRepeatList")
    public java.util.List<String> storeIdsRepeatList;

    public static GetLinkeLinklogAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogAccountRequest self = new GetLinkeLinklogAccountRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogAccountRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public GetLinkeLinklogAccountRequest setNick(String nick) {
        this.nick = nick;
        return this;
    }
    public String getNick() {
        return this.nick;
    }

    public GetLinkeLinklogAccountRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public GetLinkeLinklogAccountRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public GetLinkeLinklogAccountRequest setStoreIdsRepeatList(java.util.List<String> storeIdsRepeatList) {
        this.storeIdsRepeatList = storeIdsRepeatList;
        return this;
    }
    public java.util.List<String> getStoreIdsRepeatList() {
        return this.storeIdsRepeatList;
    }

}
