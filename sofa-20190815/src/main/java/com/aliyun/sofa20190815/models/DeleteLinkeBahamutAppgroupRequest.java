// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutAppgroupRequest extends TeaModel {
    @NameInMap("BahamutTenant")
    public String bahamutTenant;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("Type")
    public String type;

    @NameInMap("AdminsRepeatList")
    public java.util.List<String> adminsRepeatList;

    @NameInMap("AppListRepeatList")
    public java.util.List<String> appListRepeatList;

    public static DeleteLinkeBahamutAppgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutAppgroupRequest self = new DeleteLinkeBahamutAppgroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutAppgroupRequest setBahamutTenant(String bahamutTenant) {
        this.bahamutTenant = bahamutTenant;
        return this;
    }
    public String getBahamutTenant() {
        return this.bahamutTenant;
    }

    public DeleteLinkeBahamutAppgroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeBahamutAppgroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteLinkeBahamutAppgroupRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DeleteLinkeBahamutAppgroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DeleteLinkeBahamutAppgroupRequest setAdminsRepeatList(java.util.List<String> adminsRepeatList) {
        this.adminsRepeatList = adminsRepeatList;
        return this;
    }
    public java.util.List<String> getAdminsRepeatList() {
        return this.adminsRepeatList;
    }

    public DeleteLinkeBahamutAppgroupRequest setAppListRepeatList(java.util.List<String> appListRepeatList) {
        this.appListRepeatList = appListRepeatList;
        return this;
    }
    public java.util.List<String> getAppListRepeatList() {
        return this.appListRepeatList;
    }

}
