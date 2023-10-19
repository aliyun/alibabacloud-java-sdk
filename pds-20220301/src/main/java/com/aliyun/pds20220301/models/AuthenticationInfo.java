// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AuthenticationInfo extends TeaModel {
    @NameInMap("authentication_display_name")
    public String authenticationDisplayName;

    @NameInMap("authentication_type")
    public String authenticationType;

    @NameInMap("extra")
    public String extra;

    @NameInMap("identity")
    public String identity;

    public static AuthenticationInfo build(java.util.Map<String, ?> map) throws Exception {
        AuthenticationInfo self = new AuthenticationInfo();
        return TeaModel.build(map, self);
    }

    public AuthenticationInfo setAuthenticationDisplayName(String authenticationDisplayName) {
        this.authenticationDisplayName = authenticationDisplayName;
        return this;
    }
    public String getAuthenticationDisplayName() {
        return this.authenticationDisplayName;
    }

    public AuthenticationInfo setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    public AuthenticationInfo setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public AuthenticationInfo setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

}
