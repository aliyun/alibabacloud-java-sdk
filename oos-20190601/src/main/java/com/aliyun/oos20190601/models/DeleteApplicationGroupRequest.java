// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteApplicationGroupRequest extends TeaModel {
    /**
     * <p>The name of the application.</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The name of the application group.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region. Set the value to cn-hangzhou.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteApplicationGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationGroupRequest self = new DeleteApplicationGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationGroupRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public DeleteApplicationGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteApplicationGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
