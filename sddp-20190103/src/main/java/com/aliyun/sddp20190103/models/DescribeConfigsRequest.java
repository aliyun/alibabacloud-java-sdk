// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeConfigsRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Chinese (Simplified). Default value.</p>
     * </li>
     * <li><p><strong>en_us</strong>: English (United States).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigsRequest self = new DescribeConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConfigsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
