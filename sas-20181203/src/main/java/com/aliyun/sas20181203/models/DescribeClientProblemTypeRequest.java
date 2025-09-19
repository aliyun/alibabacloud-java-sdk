// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClientProblemTypeRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static DescribeClientProblemTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientProblemTypeRequest self = new DescribeClientProblemTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClientProblemTypeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
