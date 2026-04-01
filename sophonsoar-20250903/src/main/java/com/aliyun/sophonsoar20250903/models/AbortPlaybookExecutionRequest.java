// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class AbortPlaybookExecutionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e776dab31-499b-4307-9248-xxxxxx</p>
     */
    @NameInMap("PlaybookExecutionUuid")
    public String playbookExecutionUuid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e99dab31-499b-4307-9248-xxxxxx</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <strong>example:</strong>
     * <p>13760*****718726</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    public static AbortPlaybookExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        AbortPlaybookExecutionRequest self = new AbortPlaybookExecutionRequest();
        return TeaModel.build(map, self);
    }

    public AbortPlaybookExecutionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AbortPlaybookExecutionRequest setPlaybookExecutionUuid(String playbookExecutionUuid) {
        this.playbookExecutionUuid = playbookExecutionUuid;
        return this;
    }
    public String getPlaybookExecutionUuid() {
        return this.playbookExecutionUuid;
    }

    public AbortPlaybookExecutionRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public AbortPlaybookExecutionRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public AbortPlaybookExecutionRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}
