// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutAppgroupRequest extends TeaModel {
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

    public static CreateLinkeBahamutAppgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutAppgroupRequest self = new CreateLinkeBahamutAppgroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutAppgroupRequest setBahamutTenant(String bahamutTenant) {
        this.bahamutTenant = bahamutTenant;
        return this;
    }
    public String getBahamutTenant() {
        return this.bahamutTenant;
    }

    public CreateLinkeBahamutAppgroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLinkeBahamutAppgroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLinkeBahamutAppgroupRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateLinkeBahamutAppgroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateLinkeBahamutAppgroupRequest setAdminsRepeatList(java.util.List<String> adminsRepeatList) {
        this.adminsRepeatList = adminsRepeatList;
        return this;
    }
    public java.util.List<String> getAdminsRepeatList() {
        return this.adminsRepeatList;
    }

    public CreateLinkeBahamutAppgroupRequest setAppListRepeatList(java.util.List<String> appListRepeatList) {
        this.appListRepeatList = appListRepeatList;
        return this;
    }
    public java.util.List<String> getAppListRepeatList() {
        return this.appListRepeatList;
    }

}
