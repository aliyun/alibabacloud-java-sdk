// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchFromThirdPartyItem extends TeaModel {
    @NameInMap("authentication_type")
    public String authenticationType;

    @NameInMap("extra")
    public String extra;

    @NameInMap("identity")
    public String identity;

    @NameInMap("others")
    public java.util.Map<String, ?> others;

    public static SearchFromThirdPartyItem build(java.util.Map<String, ?> map) throws Exception {
        SearchFromThirdPartyItem self = new SearchFromThirdPartyItem();
        return TeaModel.build(map, self);
    }

    public SearchFromThirdPartyItem setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    public SearchFromThirdPartyItem setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public SearchFromThirdPartyItem setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public SearchFromThirdPartyItem setOthers(java.util.Map<String, ?> others) {
        this.others = others;
        return this;
    }
    public java.util.Map<String, ?> getOthers() {
        return this.others;
    }

}
