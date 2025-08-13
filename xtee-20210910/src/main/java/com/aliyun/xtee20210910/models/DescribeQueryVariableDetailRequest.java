// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeQueryVariableDetailRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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

    /**
     * <p>Variable ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>355</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>Region code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribeQueryVariableDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQueryVariableDetailRequest self = new DescribeQueryVariableDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQueryVariableDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeQueryVariableDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeQueryVariableDetailRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
