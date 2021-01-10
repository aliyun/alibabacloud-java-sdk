// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutAdminworkspacecheckdataRequest extends TeaModel {
    @NameInMap("BahamutTenant")
    public String bahamutTenant;

    public static CheckLinkeBahamutAdminworkspacecheckdataRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutAdminworkspacecheckdataRequest self = new CheckLinkeBahamutAdminworkspacecheckdataRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutAdminworkspacecheckdataRequest setBahamutTenant(String bahamutTenant) {
        this.bahamutTenant = bahamutTenant;
        return this;
    }
    public String getBahamutTenant() {
        return this.bahamutTenant;
    }

}
