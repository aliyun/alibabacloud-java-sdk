// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeEventDetailRequest extends TeaModel {
    /**
     * <p>The ID of the anomalous event.</p>
     * <blockquote>
     * <p>You can call the <strong>DescribeEvents</strong> operation to query the ID of the anomalous event.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13456723343</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeEventDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventDetailRequest self = new DescribeEventDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeEventDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
