// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BindSlbQuery extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("Internet")
    public String internet;

    @NameInMap("Intranet")
    public String intranet;

    @NameInMap("InternetSlbId")
    public String internetSlbId;

    @NameInMap("IntranetSlbId")
    public String intranetSlbId;

    public static BindSlbQuery build(java.util.Map<String, ?> map) throws Exception {
        BindSlbQuery self = new BindSlbQuery();
        return TeaModel.build(map, self);
    }

    public BindSlbQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BindSlbQuery setInternet(String internet) {
        this.internet = internet;
        return this;
    }
    public String getInternet() {
        return this.internet;
    }

    public BindSlbQuery setIntranet(String intranet) {
        this.intranet = intranet;
        return this;
    }
    public String getIntranet() {
        return this.intranet;
    }

    public BindSlbQuery setInternetSlbId(String internetSlbId) {
        this.internetSlbId = internetSlbId;
        return this;
    }
    public String getInternetSlbId() {
        return this.internetSlbId;
    }

    public BindSlbQuery setIntranetSlbId(String intranetSlbId) {
        this.intranetSlbId = intranetSlbId;
        return this;
    }
    public String getIntranetSlbId() {
        return this.intranetSlbId;
    }

}
