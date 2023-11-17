// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePopApiItemListRequest extends TeaModel {
    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("Env")
    public String env;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PopCode")
    public String popCode;

    public static DescribePopApiItemListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePopApiItemListRequest self = new DescribePopApiItemListRequest();
        return TeaModel.build(map, self);
    }

    public DescribePopApiItemListRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DescribePopApiItemListRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public DescribePopApiItemListRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public DescribePopApiItemListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePopApiItemListRequest setPopCode(String popCode) {
        this.popCode = popCode;
        return this;
    }
    public String getPopCode() {
        return this.popCode;
    }

}
