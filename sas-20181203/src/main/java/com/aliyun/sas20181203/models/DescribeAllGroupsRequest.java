// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAllGroupsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static DescribeAllGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllGroupsRequest self = new DescribeAllGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAllGroupsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
