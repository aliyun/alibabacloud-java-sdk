// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeEnumItemsRequest extends TeaModel {
    /**
     * <p>The type of the enumeration item. Valid values:</p>
     * <br>
     * <p>*   **process**: scenarios</p>
     */
    @NameInMap("EnumType")
    public String enumType;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh_cn**: Simplified Chinese (default)</p>
     * <p>*   **en_us**: English</p>
     */
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
