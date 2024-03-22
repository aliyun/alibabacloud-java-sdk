// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePopApiItemListRequest extends TeaModel {
    /**
     * <p>The API operation name of the Alibaba Cloud service. Fuzzy match is supported.</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The version number of the API.</p>
     * <br>
     * <p>>  You can call the [DescribePopApiVersionList](~~DescribePopApiVersionList~~) operation to query the version number.</p>
     */
    @NameInMap("ApiVersion")
    public String apiVersion;

    /**
     * <p>The environment in which the API operation parameters are used. Set the value to online.</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh** (default): Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The POP code of the Alibaba Cloud service.</p>
     * <br>
     * <p>>  You can call the [DescribeApiList](~~DescribeApiList~~) operation to query the POP code.</p>
     */
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
