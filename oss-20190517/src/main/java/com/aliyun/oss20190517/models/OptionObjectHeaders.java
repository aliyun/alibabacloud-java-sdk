// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class OptionObjectHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("Access-Control-Request-Headers")
    public String accessControlRequestHeaders;

    @NameInMap("Access-Control-Request-Method")
    public String accessControlRequestMethod;

    @NameInMap("Origin")
    public String origin;

    public static OptionObjectHeaders build(java.util.Map<String, ?> map) throws Exception {
        OptionObjectHeaders self = new OptionObjectHeaders();
        return TeaModel.build(map, self);
    }

    public OptionObjectHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public OptionObjectHeaders setAccessControlRequestHeaders(String accessControlRequestHeaders) {
        this.accessControlRequestHeaders = accessControlRequestHeaders;
        return this;
    }
    public String getAccessControlRequestHeaders() {
        return this.accessControlRequestHeaders;
    }

    public OptionObjectHeaders setAccessControlRequestMethod(String accessControlRequestMethod) {
        this.accessControlRequestMethod = accessControlRequestMethod;
        return this;
    }
    public String getAccessControlRequestMethod() {
        return this.accessControlRequestMethod;
    }

    public OptionObjectHeaders setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

}
