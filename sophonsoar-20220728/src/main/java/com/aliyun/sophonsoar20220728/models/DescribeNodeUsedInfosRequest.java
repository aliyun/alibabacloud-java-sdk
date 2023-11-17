// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeNodeUsedInfosRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("NodeName")
    public String nodeName;

    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    public static DescribeNodeUsedInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeUsedInfosRequest self = new DescribeNodeUsedInfosRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNodeUsedInfosRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeNodeUsedInfosRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public DescribeNodeUsedInfosRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

}
