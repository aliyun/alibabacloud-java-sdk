// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeUserStatusRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh_cn**: Simplified Chinese (default)</p>
     * <p>*   **en_us**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeUserStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserStatusRequest self = new DescribeUserStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
