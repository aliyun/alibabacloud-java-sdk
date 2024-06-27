// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeApisRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("apiGroupId")
    public String apiGroupId;

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

    public static DescribeApisRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisRequest self = new DescribeApisRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApisRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeApisRequest setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }
    public String getApiGroupId() {
        return this.apiGroupId;
    }

    public DescribeApisRequest setApiRegionId(String apiRegionId) {
        this.apiRegionId = apiRegionId;
        return this;
    }
    public String getApiRegionId() {
        return this.apiRegionId;
    }

    public DescribeApisRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public DescribeApisRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
