// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RenamePlaybookNodeRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and the response. Valid values:</p>
     * <br>
     * <p>*   **zh** (default): Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The new name of the node.</p>
     */
    @NameInMap("NewNodeName")
    public String newNodeName;

    /**
     * <p>The original name of the node.</p>
     */
    @NameInMap("OldNodeName")
    public String oldNodeName;

    /**
     * <p>The UUID of the playbook.</p>
     * <br>
     * <p>>  You can call the [DescribePlaybooks](~~DescribePlaybooks~~)operation to query the UUIDs of playbooks.</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    public static RenamePlaybookNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RenamePlaybookNodeRequest self = new RenamePlaybookNodeRequest();
        return TeaModel.build(map, self);
    }

    public RenamePlaybookNodeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public RenamePlaybookNodeRequest setNewNodeName(String newNodeName) {
        this.newNodeName = newNodeName;
        return this;
    }
    public String getNewNodeName() {
        return this.newNodeName;
    }

    public RenamePlaybookNodeRequest setOldNodeName(String oldNodeName) {
        this.oldNodeName = oldNodeName;
        return this;
    }
    public String getOldNodeName() {
        return this.oldNodeName;
    }

    public RenamePlaybookNodeRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

}
