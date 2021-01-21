// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class SetAppDomainNamesRequest extends TeaModel {
    @NameInMap("AppID")
    public String appID;

    @NameInMap("AppDomainNames")
    public String appDomainNames;

    public static SetAppDomainNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAppDomainNamesRequest self = new SetAppDomainNamesRequest();
        return TeaModel.build(map, self);
    }

    public SetAppDomainNamesRequest setAppID(String appID) {
        this.appID = appID;
        return this;
    }
    public String getAppID() {
        return this.appID;
    }

    public SetAppDomainNamesRequest setAppDomainNames(String appDomainNames) {
        this.appDomainNames = appDomainNames;
        return this;
    }
    public String getAppDomainNames() {
        return this.appDomainNames;
    }

}
