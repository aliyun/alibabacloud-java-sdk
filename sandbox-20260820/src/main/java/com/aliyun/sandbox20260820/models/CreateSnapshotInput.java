// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateSnapshotInput extends TeaModel {
    /**
     * <p>The snapshot name.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The source sandbox ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sbx-****</p>
     */
    @NameInMap("sandboxID")
    public String sandboxID;

    /**
     * <p>The team ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>70d1****abcd</p>
     */
    @NameInMap("teamID")
    public String teamID;

    public static CreateSnapshotInput build(java.util.Map<String, ?> map) throws Exception {
        CreateSnapshotInput self = new CreateSnapshotInput();
        return TeaModel.build(map, self);
    }

    public CreateSnapshotInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSnapshotInput setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }
    public String getSandboxID() {
        return this.sandboxID;
    }

    public CreateSnapshotInput setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

}
