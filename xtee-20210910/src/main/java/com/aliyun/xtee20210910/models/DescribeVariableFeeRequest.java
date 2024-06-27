// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableFeeRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ids")
    public java.util.List<Long> ids;

    @NameInMap("regId")
    public String regId;

    public static DescribeVariableFeeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVariableFeeRequest self = new DescribeVariableFeeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVariableFeeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVariableFeeRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public DescribeVariableFeeRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
