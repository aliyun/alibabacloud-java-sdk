// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeOssObjectDetailRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Id")
    public Long id;

    public static DescribeOssObjectDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssObjectDetailRequest self = new DescribeOssObjectDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssObjectDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOssObjectDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
