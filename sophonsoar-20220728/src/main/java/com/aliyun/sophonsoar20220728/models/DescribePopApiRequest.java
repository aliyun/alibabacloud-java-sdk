// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePopApiRequest extends TeaModel {
    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("Env")
    public String env;

    @NameInMap("PopCode")
    public String popCode;

    public static DescribePopApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePopApiRequest self = new DescribePopApiRequest();
        return TeaModel.build(map, self);
    }

    public DescribePopApiRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DescribePopApiRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public DescribePopApiRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public DescribePopApiRequest setPopCode(String popCode) {
        this.popCode = popCode;
        return this;
    }
    public String getPopCode() {
        return this.popCode;
    }

}
