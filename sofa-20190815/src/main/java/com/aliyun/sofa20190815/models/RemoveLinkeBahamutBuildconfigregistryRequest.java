// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeBahamutBuildconfigregistryRequest extends TeaModel {
    @NameInMap("Host")
    public String host;

    @NameInMap("SecretKeysRepeatList")
    public java.util.List<String> secretKeysRepeatList;

    @NameInMap("Token")
    public String token;

    @NameInMap("User")
    public String user;

    public static RemoveLinkeBahamutBuildconfigregistryRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeBahamutBuildconfigregistryRequest self = new RemoveLinkeBahamutBuildconfigregistryRequest();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeBahamutBuildconfigregistryRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public RemoveLinkeBahamutBuildconfigregistryRequest setSecretKeysRepeatList(java.util.List<String> secretKeysRepeatList) {
        this.secretKeysRepeatList = secretKeysRepeatList;
        return this;
    }
    public java.util.List<String> getSecretKeysRepeatList() {
        return this.secretKeysRepeatList;
    }

    public RemoveLinkeBahamutBuildconfigregistryRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public RemoveLinkeBahamutBuildconfigregistryRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
