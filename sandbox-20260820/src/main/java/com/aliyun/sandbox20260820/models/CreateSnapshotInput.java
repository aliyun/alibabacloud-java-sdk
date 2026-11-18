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
     * <p>The resource tags.</p>
     */
    @NameInMap("resourceTags")
    public java.util.List<CreateSnapshotInputResourceTags> resourceTags;

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

    public CreateSnapshotInput setResourceTags(java.util.List<CreateSnapshotInputResourceTags> resourceTags) {
        this.resourceTags = resourceTags;
        return this;
    }
    public java.util.List<CreateSnapshotInputResourceTags> getResourceTags() {
        return this.resourceTags;
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

    public static class CreateSnapshotInputResourceTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateSnapshotInputResourceTags build(java.util.Map<String, ?> map) throws Exception {
            CreateSnapshotInputResourceTags self = new CreateSnapshotInputResourceTags();
            return TeaModel.build(map, self);
        }

        public CreateSnapshotInputResourceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateSnapshotInputResourceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
