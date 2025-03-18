// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class CopyPlaybookRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>playbook description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>playbook_xxx</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReleaseVersion")
    public String releaseVersion;

    /**
     * <strong>example:</strong>
     * <p>137602*****718726</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>94bc318c-<strong><strong>-4cba-</strong></strong>-801ccb0d739f</p>
     */
    @NameInMap("SourcePlaybookUuid")
    public String sourcePlaybookUuid;

    public static CopyPlaybookRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyPlaybookRequest self = new CopyPlaybookRequest();
        return TeaModel.build(map, self);
    }

    public CopyPlaybookRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CopyPlaybookRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CopyPlaybookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CopyPlaybookRequest setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    public CopyPlaybookRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public CopyPlaybookRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

    public CopyPlaybookRequest setSourcePlaybookUuid(String sourcePlaybookUuid) {
        this.sourcePlaybookUuid = sourcePlaybookUuid;
        return this;
    }
    public String getSourcePlaybookUuid() {
        return this.sourcePlaybookUuid;
    }

}
