// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class DeletePlaybookRequest extends TeaModel {
    /**
     * <p>The language type for requests and received messages. Values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>UUID of the playbook.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e99dab31-499b-4307-9248-xxxxxx</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>User ID for the administrator to switch to another member\&quot;s perspective.</p>
     * 
     * <strong>example:</strong>
     * <p>13760*****718726</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static DeletePlaybookRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePlaybookRequest self = new DeletePlaybookRequest();
        return TeaModel.build(map, self);
    }

    public DeletePlaybookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeletePlaybookRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public DeletePlaybookRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
