// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20190430.models;

import com.aliyun.tea.*;

public class CreateComputeTaskRequest extends TeaModel {
    @NameInMap("AlgorithmCodeList")
    public String algorithmCodeList;

    @NameInMap("DeviceCodeList")
    public String deviceCodeList;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("VcsId")
    public String vcsId;

    public static CreateComputeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeTaskRequest self = new CreateComputeTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateComputeTaskRequest setAlgorithmCodeList(String algorithmCodeList) {
        this.algorithmCodeList = algorithmCodeList;
        return this;
    }
    public String getAlgorithmCodeList() {
        return this.algorithmCodeList;
    }

    public CreateComputeTaskRequest setDeviceCodeList(String deviceCodeList) {
        this.deviceCodeList = deviceCodeList;
        return this;
    }
    public String getDeviceCodeList() {
        return this.deviceCodeList;
    }

    public CreateComputeTaskRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateComputeTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateComputeTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateComputeTaskRequest setVcsId(String vcsId) {
        this.vcsId = vcsId;
        return this;
    }
    public String getVcsId() {
        return this.vcsId;
    }

}
