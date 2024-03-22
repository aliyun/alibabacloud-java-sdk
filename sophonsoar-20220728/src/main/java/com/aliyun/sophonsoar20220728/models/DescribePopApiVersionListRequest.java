// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePopApiVersionListRequest extends TeaModel {
    /**
     * <p>The environment in which the API operation parameters are used. Set the value to **online**.</p>
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
