// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDocTypesRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Chinese</li>
     * <li><strong>en_us</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeDocTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocTypesRequest self = new DescribeDocTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDocTypesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
