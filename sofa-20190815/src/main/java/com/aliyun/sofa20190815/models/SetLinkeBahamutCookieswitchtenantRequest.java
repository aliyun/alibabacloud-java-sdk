// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeBahamutCookieswitchtenantRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Key")
    public String key;

    @NameInMap("MaxAge")
    public String maxAge;

    @NameInMap("Value")
    public String value;

    public static SetLinkeBahamutCookieswitchtenantRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeBahamutCookieswitchtenantRequest self = new SetLinkeBahamutCookieswitchtenantRequest();
        return TeaModel.build(map, self);
    }

    public SetLinkeBahamutCookieswitchtenantRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public SetLinkeBahamutCookieswitchtenantRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public SetLinkeBahamutCookieswitchtenantRequest setMaxAge(String maxAge) {
        this.maxAge = maxAge;
        return this;
    }
    public String getMaxAge() {
        return this.maxAge;
    }

    public SetLinkeBahamutCookieswitchtenantRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
