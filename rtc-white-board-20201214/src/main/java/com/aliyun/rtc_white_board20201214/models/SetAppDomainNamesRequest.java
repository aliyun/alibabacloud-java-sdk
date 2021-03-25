// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class SetAppDomainNamesRequest extends TeaModel {
    // 白板应用唯一标识符
    @NameInMap("AppID")
    public String appID;

    // 所有会使用到白板应用的客户网站域名，多个使用英文逗号(,)分隔，最多传10个
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
