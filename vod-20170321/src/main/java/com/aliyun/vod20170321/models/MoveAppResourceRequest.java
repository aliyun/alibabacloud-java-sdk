// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class MoveAppResourceRequest extends TeaModel {
    /**
     * <p>The ID of the resource. You can specify a maximum of 20 IDs at a time. Separate them with commas (,).</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <br>
     * <p>*   **video**</p>
     * <p>*   **image**</p>
     * <p>*   **attached**</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The ID of the application to which resources are migrated. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).</p>
     */
    @NameInMap("TargetAppId")
    public String targetAppId;

    public static MoveAppResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveAppResourceRequest self = new MoveAppResourceRequest();
        return TeaModel.build(map, self);
    }

    public MoveAppResourceRequest setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

    public MoveAppResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public MoveAppResourceRequest setTargetAppId(String targetAppId) {
        this.targetAppId = targetAppId;
        return this;
    }
    public String getTargetAppId() {
        return this.targetAppId;
    }

}
