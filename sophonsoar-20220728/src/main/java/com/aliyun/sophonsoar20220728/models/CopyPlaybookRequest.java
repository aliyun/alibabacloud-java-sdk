// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class CopyPlaybookRequest extends TeaModel {
    /**
     * <p>The description of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>playbook description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name of the playbook.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>playbook_xxx</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The language of the content within the request and the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default).</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The release version of the playbook that you want to copy. Default value: 0. Valid values:</p>
     * <ul>
     * <li>\-1: The version that is being edited.</li>
     * <li>0: The latest online version of the current playbook.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReleaseVersion")
    public String releaseVersion;

    /**
     * <p>The ID of the user who switches from the current view to the destination view by using the management account.</p>
     * 
     * <strong>example:</strong>
     * <p>137602*****718726</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view. Valid values:</p>
     * <ul>
     * <li><strong>0</strong> (default): the view of the current account.</li>
     * <li><strong>1</strong>: the view of the global account.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    /**
     * <p>The UUID of the playbook that you want to copy.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> operation to query the UUIDs of playbooks.</p>
     * </blockquote>
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
