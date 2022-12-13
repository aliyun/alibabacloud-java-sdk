// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateInstanceSnapshotRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("Labels")
    public java.util.List<CreateInstanceSnapshotRequestLabels> labels;

    @NameInMap("SnapshotDescription")
    public String snapshotDescription;

    @NameInMap("SnapshotName")
    public String snapshotName;

    public static CreateInstanceSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceSnapshotRequest self = new CreateInstanceSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceSnapshotRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CreateInstanceSnapshotRequest setLabels(java.util.List<CreateInstanceSnapshotRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<CreateInstanceSnapshotRequestLabels> getLabels() {
        return this.labels;
    }

    public CreateInstanceSnapshotRequest setSnapshotDescription(String snapshotDescription) {
        this.snapshotDescription = snapshotDescription;
        return this;
    }
    public String getSnapshotDescription() {
        return this.snapshotDescription;
    }

    public CreateInstanceSnapshotRequest setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }
    public String getSnapshotName() {
        return this.snapshotName;
    }

    public static class CreateInstanceSnapshotRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateInstanceSnapshotRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceSnapshotRequestLabels self = new CreateInstanceSnapshotRequestLabels();
            return TeaModel.build(map, self);
        }

        public CreateInstanceSnapshotRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateInstanceSnapshotRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
