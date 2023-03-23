// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UnbindSlbRequest extends TeaModel {
    /**
     * <p>0099b7be-5f5b-4512-a7fc-56049ef1\*\*\*\*</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>true</p>
     */
    @NameInMap("Internet")
    public Boolean internet;

    /**
     * <p>true</p>
     */
    @NameInMap("Intranet")
    public Boolean intranet;

    public static UnbindSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindSlbRequest self = new UnbindSlbRequest();
        return TeaModel.build(map, self);
    }

    public UnbindSlbRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UnbindSlbRequest setInternet(Boolean internet) {
        this.internet = internet;
        return this;
    }
    public Boolean getInternet() {
        return this.internet;
    }

    public UnbindSlbRequest setIntranet(Boolean intranet) {
        this.intranet = intranet;
        return this;
    }
    public Boolean getIntranet() {
        return this.intranet;
    }

}
