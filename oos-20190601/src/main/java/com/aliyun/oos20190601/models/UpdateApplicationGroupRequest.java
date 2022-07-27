// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateApplicationGroupRequest extends TeaModel {
    @NameInMap("ApplicationName")
    public String applicationName;

    @NameInMap("Name")
    public String name;

    @NameInMap("NewName")
    public String newName;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateApplicationGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationGroupRequest self = new UpdateApplicationGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationGroupRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public UpdateApplicationGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateApplicationGroupRequest setNewName(String newName) {
        this.newName = newName;
        return this;
    }
    public String getNewName() {
        return this.newName;
    }

    public UpdateApplicationGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
