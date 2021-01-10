// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SwitchLinkeBahamutAdminswitchlinkqRequest extends TeaModel {
    @NameInMap("AppNamesRepeatList")
    public java.util.List<String> appNamesRepeatList;

    @NameInMap("OpoType")
    public String opoType;

    @NameInMap("TenantPath")
    public String tenantPath;

    public static SwitchLinkeBahamutAdminswitchlinkqRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchLinkeBahamutAdminswitchlinkqRequest self = new SwitchLinkeBahamutAdminswitchlinkqRequest();
        return TeaModel.build(map, self);
    }

    public SwitchLinkeBahamutAdminswitchlinkqRequest setAppNamesRepeatList(java.util.List<String> appNamesRepeatList) {
        this.appNamesRepeatList = appNamesRepeatList;
        return this;
    }
    public java.util.List<String> getAppNamesRepeatList() {
        return this.appNamesRepeatList;
    }

    public SwitchLinkeBahamutAdminswitchlinkqRequest setOpoType(String opoType) {
        this.opoType = opoType;
        return this;
    }
    public String getOpoType() {
        return this.opoType;
    }

    public SwitchLinkeBahamutAdminswitchlinkqRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
