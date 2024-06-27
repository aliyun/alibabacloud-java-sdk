// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeApiGroupsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("apiRegionId")
    public String apiRegionId;

    @NameInMap("regId")
    public String regId;

    public static DescribeApiGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupsRequest self = new DescribeApiGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeApiGroupsRequest setApiRegionId(String apiRegionId) {
        this.apiRegionId = apiRegionId;
        return this;
    }
    public String getApiRegionId() {
        return this.apiRegionId;
    }

    public DescribeApiGroupsRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
