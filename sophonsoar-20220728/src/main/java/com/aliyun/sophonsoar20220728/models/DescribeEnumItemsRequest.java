// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeEnumItemsRequest extends TeaModel {
    @NameInMap("EnumType")
    public String enumType;

    @NameInMap("Lang")
    public String lang;

    public static DescribeEnumItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnumItemsRequest self = new DescribeEnumItemsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnumItemsRequest setEnumType(String enumType) {
        this.enumType = enumType;
        return this;
    }
    public String getEnumType() {
        return this.enumType;
    }

    public DescribeEnumItemsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
