// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutBuildconfigregistryRequest extends TeaModel {
    @NameInMap("Host")
    public String host;

    @NameInMap("SecretKeysRepeatList")
    public java.util.List<String> secretKeysRepeatList;

    @NameInMap("Token")
    public String token;

    @NameInMap("User")
    public String user;

    public static SaveLinkeBahamutBuildconfigregistryRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutBuildconfigregistryRequest self = new SaveLinkeBahamutBuildconfigregistryRequest();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutBuildconfigregistryRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public SaveLinkeBahamutBuildconfigregistryRequest setSecretKeysRepeatList(java.util.List<String> secretKeysRepeatList) {
        this.secretKeysRepeatList = secretKeysRepeatList;
        return this;
    }
    public java.util.List<String> getSecretKeysRepeatList() {
        return this.secretKeysRepeatList;
    }

    public SaveLinkeBahamutBuildconfigregistryRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public SaveLinkeBahamutBuildconfigregistryRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
