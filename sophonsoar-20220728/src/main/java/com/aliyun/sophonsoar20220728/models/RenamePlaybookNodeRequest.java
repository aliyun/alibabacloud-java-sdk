// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RenamePlaybookNodeRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The new name of the node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_process</p>
     */
    @NameInMap("NewNodeName")
    public String newNodeName;

    /**
     * <p>The original name of the node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>firewall_process</p>
     */
    @NameInMap("OldNodeName")
    public String oldNodeName;

    /**
     * <p>The UUID of the playbook.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a>operation to query the UUIDs of playbooks.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac343acc-1a61-4084-9a1c-xxxxxxxx</p>
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
