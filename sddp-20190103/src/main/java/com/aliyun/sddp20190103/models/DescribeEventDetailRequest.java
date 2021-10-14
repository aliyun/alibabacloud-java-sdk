// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeEventDetailRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("Lang")
    public String lang;

    public static DescribeEventDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventDetailRequest self = new DescribeEventDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeEventDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
