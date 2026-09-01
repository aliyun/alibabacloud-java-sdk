// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeEnumItemsRequest extends TeaModel {
    /**
     * <p>The type of the enumeration. Valid value:</p>
     * <ul>
     * <li><strong>process</strong>: The enumeration for response scenarios.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>process</p>
     */
    @NameInMap("EnumType")
    public String enumType;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: The default value. Simplified Chinese.</p>
     * </li>
     * <li><p><strong>en_us</strong>: American English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
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
