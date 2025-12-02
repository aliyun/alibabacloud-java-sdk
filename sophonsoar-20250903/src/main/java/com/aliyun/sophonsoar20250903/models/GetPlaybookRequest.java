// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class GetPlaybookRequest extends TeaModel {
    /**
     * <p>The language type for requests and received messages.</p>
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
     * <p>The UUID of the playbook.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e99dab31-499b-4307-9248-xxxxxx</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>The version ID of the playbook, which is only effective when <strong>PlaybookVersionType</strong> is <strong>History</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>36c9dcd6-<strong><strong>-4262-</strong></strong>-d508464ebd21</p>
     */
    @NameInMap("PlaybookVersion")
    public String playbookVersion;

    /**
     * <p>The version type of the playbook, with the following values:</p>
     * <ul>
     * <li><strong>Draft</strong>: Editing state.</li>
     * <li><strong>Online</strong>: Online version.</li>
     * <li><strong>History</strong>: Historical version.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>History</p>
     */
    @NameInMap("PlaybookVersionType")
    public String playbookVersionType;

    /**
     * <p>The user ID for the administrator to switch to another member\&quot;s perspective.</p>
     * 
     * <strong>example:</strong>
     * <p>13760*****718726</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static GetPlaybookRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPlaybookRequest self = new GetPlaybookRequest();
        return TeaModel.build(map, self);
    }

    public GetPlaybookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetPlaybookRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public GetPlaybookRequest setPlaybookVersion(String playbookVersion) {
        this.playbookVersion = playbookVersion;
        return this;
    }
    public String getPlaybookVersion() {
        return this.playbookVersion;
    }

    public GetPlaybookRequest setPlaybookVersionType(String playbookVersionType) {
        this.playbookVersionType = playbookVersionType;
        return this;
    }
    public String getPlaybookVersionType() {
        return this.playbookVersionType;
    }

    public GetPlaybookRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
