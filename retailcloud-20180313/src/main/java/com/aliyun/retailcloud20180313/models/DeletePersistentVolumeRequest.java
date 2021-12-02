// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeletePersistentVolumeRequest extends TeaModel {
    @NameInMap("ClusterInstanceId")
    public String clusterInstanceId;

    @NameInMap("PersistentVolumeName")
    public String persistentVolumeName;

    public static DeletePersistentVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePersistentVolumeRequest self = new DeletePersistentVolumeRequest();
        return TeaModel.build(map, self);
    }

    public DeletePersistentVolumeRequest setClusterInstanceId(String clusterInstanceId) {
        this.clusterInstanceId = clusterInstanceId;
        return this;
    }
    public String getClusterInstanceId() {
        return this.clusterInstanceId;
    }

    public DeletePersistentVolumeRequest setPersistentVolumeName(String persistentVolumeName) {
        this.persistentVolumeName = persistentVolumeName;
        return this;
    }
    public String getPersistentVolumeName() {
        return this.persistentVolumeName;
    }

}
