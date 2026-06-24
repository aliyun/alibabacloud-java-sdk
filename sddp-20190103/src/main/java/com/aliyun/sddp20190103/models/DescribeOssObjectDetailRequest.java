// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeOssObjectDetailRequest extends TeaModel {
    /**
     * <p>The unique ID of the OSS object.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/410152.html">DescribeOssObjects</a> operation to obtain the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345213</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the request and response. The default value is <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en_us</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
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
