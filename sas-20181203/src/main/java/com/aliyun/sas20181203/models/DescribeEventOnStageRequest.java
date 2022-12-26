// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEventOnStageRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static DescribeEventOnStageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventOnStageRequest self = new DescribeEventOnStageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventOnStageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
