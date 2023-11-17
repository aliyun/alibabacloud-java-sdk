// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeNodeParamTagsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("NodeName")
    public String nodeName;

    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    public static DescribeNodeParamTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeParamTagsRequest self = new DescribeNodeParamTagsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNodeParamTagsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeNodeParamTagsRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public DescribeNodeParamTagsRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

}
