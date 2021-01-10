// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("FormJsonStr")
    public String formJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    public static SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigRequest self = new SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigRequest setFormJsonStr(String formJsonStr) {
        this.formJsonStr = formJsonStr;
        return this;
    }
    public String getFormJsonStr() {
        return this.formJsonStr;
    }

    public SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
