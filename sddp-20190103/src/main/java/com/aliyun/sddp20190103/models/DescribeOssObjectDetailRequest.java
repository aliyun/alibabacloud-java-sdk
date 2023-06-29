// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeOssObjectDetailRequest extends TeaModel {
    /**
     * <p>The ID of the OSS object.</p>
     * <br>
     * <p>> You can call the **DescribeOssObjects** operation to obtain the ID of the OSS object.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response. Default value: **zh_cn**. Valid values:</p>
     * <br>
     * <p>*   **zh_cn**: Chinese</p>
     * <p>*   **en_us**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeOssObjectDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssObjectDetailRequest self = new DescribeOssObjectDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssObjectDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeOssObjectDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
