// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePopApiRequest extends TeaModel {
    /**
     * <p>The operation name of the Alibaba Cloud service.</p>
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
     * <p>The environment in which the API operation parameter is used. Set the value to online.</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The POP code of the Alibaba Cloud service.</p>
     * <br>
     * <p>>  You can call the [DescribeApiList](~~DescribeApiList~~) operation to query the POP code.</p>
     */
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
