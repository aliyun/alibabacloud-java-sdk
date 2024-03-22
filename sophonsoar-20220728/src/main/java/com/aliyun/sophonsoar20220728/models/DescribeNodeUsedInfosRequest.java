// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeNodeUsedInfosRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The node name of the component.</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The playbook UUID.</p>
     * <br>
     * <p>>  You can call the [DescribePlaybooks](~~DescribePlaybooks~~)operation to query the playbook UUID.</p>
     */
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
