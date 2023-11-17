// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookNodesOutputRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("NodeName")
    public String nodeName;

    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    public static DescribePlaybookNodesOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlaybookNodesOutputRequest self = new DescribePlaybookNodesOutputRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlaybookNodesOutputRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePlaybookNodesOutputRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public DescribePlaybookNodesOutputRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

}
