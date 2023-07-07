// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeOssObjectDetailV2Request extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Lang")
    public String lang;

    public static DescribeOssObjectDetailV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssObjectDetailV2Request self = new DescribeOssObjectDetailV2Request();
        return TeaModel.build(map, self);
    }

    public DescribeOssObjectDetailV2Request setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeOssObjectDetailV2Request setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
