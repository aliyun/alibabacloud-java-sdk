// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeComponentPlaybookRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    public static DescribeComponentPlaybookRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentPlaybookRequest self = new DescribeComponentPlaybookRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComponentPlaybookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeComponentPlaybookRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

}
