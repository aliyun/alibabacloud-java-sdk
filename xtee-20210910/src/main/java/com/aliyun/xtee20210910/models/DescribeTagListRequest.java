// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTagListRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RegId")
    public String regId;

    public static DescribeTagListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagListRequest self = new DescribeTagListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTagListRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeTagListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeTagListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
