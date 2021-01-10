// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAppgroupRequest extends TeaModel {
    @NameInMap("AdminsRepeatList")
    public java.util.List<String> adminsRepeatList;

    @NameInMap("AppListRepeatList")
    public java.util.List<String> appListRepeatList;

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

    public static UpdateLinkeBahamutAppgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAppgroupRequest self = new UpdateLinkeBahamutAppgroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAppgroupRequest setAdminsRepeatList(java.util.List<String> adminsRepeatList) {
        this.adminsRepeatList = adminsRepeatList;
        return this;
    }
    public java.util.List<String> getAdminsRepeatList() {
        return this.adminsRepeatList;
    }

    public UpdateLinkeBahamutAppgroupRequest setAppListRepeatList(java.util.List<String> appListRepeatList) {
        this.appListRepeatList = appListRepeatList;
        return this;
    }
    public java.util.List<String> getAppListRepeatList() {
        return this.appListRepeatList;
    }

    public UpdateLinkeBahamutAppgroupRequest setBahamutTenant(String bahamutTenant) {
        this.bahamutTenant = bahamutTenant;
        return this;
    }
    public String getBahamutTenant() {
        return this.bahamutTenant;
    }

    public UpdateLinkeBahamutAppgroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeBahamutAppgroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLinkeBahamutAppgroupRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateLinkeBahamutAppgroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
