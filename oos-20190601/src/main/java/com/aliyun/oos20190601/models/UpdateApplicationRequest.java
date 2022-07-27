// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateApplicationRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    public static UpdateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationRequest self = new UpdateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApplicationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateApplicationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateApplicationRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

}
