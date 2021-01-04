// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeUserServiceStatusRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static DescribeUserServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserServiceStatusRequest self = new DescribeUserServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserServiceStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeUserServiceStatusRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
