// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAvgExecuteCostReportRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    public static DescribeAvgExecuteCostReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvgExecuteCostReportRequest self = new DescribeAvgExecuteCostReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvgExecuteCostReportRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAvgExecuteCostReportRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
