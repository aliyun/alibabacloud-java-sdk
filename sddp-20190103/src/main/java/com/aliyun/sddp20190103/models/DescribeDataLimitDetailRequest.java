// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitDetailRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Id")
    public Long id;

    @NameInMap("NetworkType")
    public Integer networkType;

    public static DescribeDataLimitDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataLimitDetailRequest self = new DescribeDataLimitDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataLimitDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDataLimitDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeDataLimitDetailRequest setNetworkType(Integer networkType) {
        this.networkType = networkType;
        return this;
    }
    public Integer getNetworkType() {
        return this.networkType;
    }

}
