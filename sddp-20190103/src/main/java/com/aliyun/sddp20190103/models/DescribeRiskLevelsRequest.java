// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeRiskLevelsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static DescribeRiskLevelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskLevelsRequest self = new DescribeRiskLevelsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRiskLevelsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
