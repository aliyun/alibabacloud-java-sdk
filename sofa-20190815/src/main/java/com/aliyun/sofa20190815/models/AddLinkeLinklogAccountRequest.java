// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeLinklogAccountRequest extends TeaModel {
    @NameInMap("EmpId")
    public String empId;

    @NameInMap("Nick")
    public String nick;

    @NameInMap("Role")
    public Long role;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("StoreIdsRepeatList")
    public java.util.List<Integer> storeIdsRepeatList;

    public static AddLinkeLinklogAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeLinklogAccountRequest self = new AddLinkeLinklogAccountRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeLinklogAccountRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public AddLinkeLinklogAccountRequest setNick(String nick) {
        this.nick = nick;
        return this;
    }
    public String getNick() {
        return this.nick;
    }

    public AddLinkeLinklogAccountRequest setRole(Long role) {
        this.role = role;
        return this;
    }
    public Long getRole() {
        return this.role;
    }

    public AddLinkeLinklogAccountRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public AddLinkeLinklogAccountRequest setStoreIdsRepeatList(java.util.List<Integer> storeIdsRepeatList) {
        this.storeIdsRepeatList = storeIdsRepeatList;
        return this;
    }
    public java.util.List<Integer> getStoreIdsRepeatList() {
        return this.storeIdsRepeatList;
    }

}
