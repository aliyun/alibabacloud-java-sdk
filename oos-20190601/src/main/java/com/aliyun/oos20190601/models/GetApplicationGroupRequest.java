// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetApplicationGroupRequest extends TeaModel {
    /**
     * <p>The name of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyApplication</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The name of the application group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyApplicationGroup</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region. Set the value to cn-hangzhou.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetApplicationGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationGroupRequest self = new GetApplicationGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationGroupRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public GetApplicationGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetApplicationGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
