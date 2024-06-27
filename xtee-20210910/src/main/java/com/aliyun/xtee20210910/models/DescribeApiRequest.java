// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeApiRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("apiId")
    public String apiId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("apiRegionId")
    public String apiRegionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("apiType")
    public String apiType;

    @NameInMap("regId")
    public String regId;

    public static DescribeApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiRequest self = new DescribeApiRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApiRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeApiRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeApiRequest setApiRegionId(String apiRegionId) {
        this.apiRegionId = apiRegionId;
        return this;
    }
    public String getApiRegionId() {
        return this.apiRegionId;
    }

    public DescribeApiRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public DescribeApiRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
