// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ModifyBuildpackPackagesStatusRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("NewFileStatus")
    public String newFileStatus;

    @NameInMap("OriginalFileStatus")
    public String originalFileStatus;

    @NameInMap("RegionNumRepeatList")
    public java.util.List<String> regionNumRepeatList;

    public static ModifyBuildpackPackagesStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBuildpackPackagesStatusRequest self = new ModifyBuildpackPackagesStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBuildpackPackagesStatusRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyBuildpackPackagesStatusRequest setNewFileStatus(String newFileStatus) {
        this.newFileStatus = newFileStatus;
        return this;
    }
    public String getNewFileStatus() {
        return this.newFileStatus;
    }

    public ModifyBuildpackPackagesStatusRequest setOriginalFileStatus(String originalFileStatus) {
        this.originalFileStatus = originalFileStatus;
        return this;
    }
    public String getOriginalFileStatus() {
        return this.originalFileStatus;
    }

    public ModifyBuildpackPackagesStatusRequest setRegionNumRepeatList(java.util.List<String> regionNumRepeatList) {
        this.regionNumRepeatList = regionNumRepeatList;
        return this;
    }
    public java.util.List<String> getRegionNumRepeatList() {
        return this.regionNumRepeatList;
    }

}
