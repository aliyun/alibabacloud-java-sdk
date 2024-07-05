// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UnbindDirectoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>34871************3380-cn-qingdao</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3998**************9488-cn-qingdao</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static UnbindDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindDirectoryRequest self = new UnbindDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public UnbindDirectoryRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public UnbindDirectoryRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UnbindDirectoryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
