// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RenamePlaybookNodeRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("NewNodeName")
    public String newNodeName;

    @NameInMap("OldNodeName")
    public String oldNodeName;

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
