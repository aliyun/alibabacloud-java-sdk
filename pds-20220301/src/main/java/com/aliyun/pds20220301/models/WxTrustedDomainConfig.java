// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class WxTrustedDomainConfig extends TeaModel {
    @NameInMap("content")
    public String content;

    @NameInMap("name")
    public String name;

    @NameInMap("show")
    public Boolean show;

    public static WxTrustedDomainConfig build(java.util.Map<String, ?> map) throws Exception {
        WxTrustedDomainConfig self = new WxTrustedDomainConfig();
        return TeaModel.build(map, self);
    }

    public WxTrustedDomainConfig setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public WxTrustedDomainConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public WxTrustedDomainConfig setShow(Boolean show) {
        this.show = show;
        return this;
    }
    public Boolean getShow() {
        return this.show;
    }

}
