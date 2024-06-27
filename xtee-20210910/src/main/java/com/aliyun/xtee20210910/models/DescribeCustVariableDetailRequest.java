// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeCustVariableDetailRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("id")
    public Long id;

    @NameInMap("regId")
    public String regId;

    public static DescribeCustVariableDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustVariableDetailRequest self = new DescribeCustVariableDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustVariableDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCustVariableDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeCustVariableDetailRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
