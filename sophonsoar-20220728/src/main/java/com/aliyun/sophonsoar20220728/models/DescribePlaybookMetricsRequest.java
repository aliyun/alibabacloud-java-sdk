// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookMetricsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    public static DescribePlaybookMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlaybookMetricsRequest self = new DescribePlaybookMetricsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlaybookMetricsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePlaybookMetricsRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

}
