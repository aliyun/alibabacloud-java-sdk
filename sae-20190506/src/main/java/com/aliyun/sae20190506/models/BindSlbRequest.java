// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BindSlbRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Internet")
    public String internet;

    @NameInMap("InternetSlbId")
    public String internetSlbId;

    @NameInMap("Intranet")
    public String intranet;

    @NameInMap("IntranetSlbId")
    public String intranetSlbId;

    public static BindSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        BindSlbRequest self = new BindSlbRequest();
        return TeaModel.build(map, self);
    }

    public BindSlbRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BindSlbRequest setInternet(String internet) {
        this.internet = internet;
        return this;
    }
    public String getInternet() {
        return this.internet;
    }

    public BindSlbRequest setInternetSlbId(String internetSlbId) {
        this.internetSlbId = internetSlbId;
        return this;
    }
    public String getInternetSlbId() {
        return this.internetSlbId;
    }

    public BindSlbRequest setIntranet(String intranet) {
        this.intranet = intranet;
        return this;
    }
    public String getIntranet() {
        return this.intranet;
    }

    public BindSlbRequest setIntranetSlbId(String intranetSlbId) {
        this.intranetSlbId = intranetSlbId;
        return this;
    }
    public String getIntranetSlbId() {
        return this.intranetSlbId;
    }

}
