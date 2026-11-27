// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteMPULayoutRequest extends TeaModel {
    /**
     * <p>The application ID. Only a single ID is supported. You can create and query application IDs in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The layout ID. Only a single ID is supported. To obtain a layout ID, see <a href="https://help.aliyun.com/document_detail/162192.html">CreateMPULayout</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LayoutId")
    public Long layoutId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DeleteMPULayoutRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMPULayoutRequest self = new DeleteMPULayoutRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMPULayoutRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMPULayoutRequest setLayoutId(Long layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public Long getLayoutId() {
        return this.layoutId;
    }

    public DeleteMPULayoutRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
