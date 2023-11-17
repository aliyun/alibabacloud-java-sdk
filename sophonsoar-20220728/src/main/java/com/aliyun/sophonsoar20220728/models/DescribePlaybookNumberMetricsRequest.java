// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookNumberMetricsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static DescribePlaybookNumberMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlaybookNumberMetricsRequest self = new DescribePlaybookNumberMetricsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlaybookNumberMetricsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
