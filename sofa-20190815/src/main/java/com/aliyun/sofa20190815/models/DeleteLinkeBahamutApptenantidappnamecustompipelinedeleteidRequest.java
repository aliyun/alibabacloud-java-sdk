// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Id")
    public String id;

    @NameInMap("TenantId")
    public String tenantId;

    public static DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidRequest self = new DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
