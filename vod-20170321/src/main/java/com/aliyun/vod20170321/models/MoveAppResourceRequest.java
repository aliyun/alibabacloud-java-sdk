// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class MoveAppResourceRequest extends TeaModel {
    /**
     * <p>The resource ID. You can specify a maximum of 20 IDs at a time. Separate multiple IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9afb4<strong><strong>06de180880e,f7bba</strong></strong>caa546cfe2ba</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li><strong>video</strong>: video files.</li>
     * <li><strong>image</strong>: image files.</li>
     * <li><strong>attached</strong>: auxiliary media assets.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The ID of the application to which resources are migrated. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Use the multi-application service</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
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
