// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackRequest extends TeaModel {
    @NameInMap("StackId")
    public String stackId;

    @NameInMap("RetainAllResources")
    public Boolean retainAllResources;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("RetainResources")
    public java.util.List<String> retainResources;

    public static DeleteStackRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackRequest self = new DeleteStackRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStackRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public DeleteStackRequest setRetainAllResources(Boolean retainAllResources) {
        this.retainAllResources = retainAllResources;
        return this;
    }
    public Boolean getRetainAllResources() {
        return this.retainAllResources;
    }

    public DeleteStackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteStackRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public DeleteStackRequest setRetainResources(java.util.List<String> retainResources) {
        this.retainResources = retainResources;
        return this;
    }
    public java.util.List<String> getRetainResources() {
        return this.retainResources;
    }

}
