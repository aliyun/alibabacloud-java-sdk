// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class CnameToken extends TeaModel {
    @NameInMap("Bucket")
    public String bucket;

    @NameInMap("Cname")
    public String cname;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("Token")
    public String token;

    public static CnameToken build(java.util.Map<String, ?> map) throws Exception {
        CnameToken self = new CnameToken();
        return TeaModel.build(map, self);
    }

    public CnameToken setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public CnameToken setCname(String cname) {
        this.cname = cname;
        return this;
    }
    public String getCname() {
        return this.cname;
    }

    public CnameToken setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CnameToken setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
