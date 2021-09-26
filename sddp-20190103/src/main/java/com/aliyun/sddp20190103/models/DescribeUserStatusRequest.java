// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeUserStatusRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static DescribeUserStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserStatusRequest self = new DescribeUserStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
