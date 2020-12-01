// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UnbindSlbQuery extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("Internet")
    @Validation(required = true)
    public Boolean internet;

    @NameInMap("Intranet")
    @Validation(required = true)
    public Boolean intranet;

    public static UnbindSlbQuery build(java.util.Map<String, ?> map) throws Exception {
        UnbindSlbQuery self = new UnbindSlbQuery();
        return TeaModel.build(map, self);
    }

    public UnbindSlbQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UnbindSlbQuery setInternet(Boolean internet) {
        this.internet = internet;
        return this;
    }
    public Boolean getInternet() {
        return this.internet;
    }

    public UnbindSlbQuery setIntranet(Boolean intranet) {
        this.intranet = intranet;
        return this;
    }
    public Boolean getIntranet() {
        return this.intranet;
    }

}
