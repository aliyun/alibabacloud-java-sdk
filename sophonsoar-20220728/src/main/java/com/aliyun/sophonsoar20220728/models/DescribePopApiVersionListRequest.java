// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePopApiVersionListRequest extends TeaModel {
    @NameInMap("Env")
    public String env;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PopCode")
    public String popCode;

    public static DescribePopApiVersionListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePopApiVersionListRequest self = new DescribePopApiVersionListRequest();
        return TeaModel.build(map, self);
    }

    public DescribePopApiVersionListRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public DescribePopApiVersionListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePopApiVersionListRequest setPopCode(String popCode) {
        this.popCode = popCode;
        return this;
    }
    public String getPopCode() {
        return this.popCode;
    }

}
