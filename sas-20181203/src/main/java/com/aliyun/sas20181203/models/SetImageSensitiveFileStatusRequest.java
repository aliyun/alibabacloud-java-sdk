// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetImageSensitiveFileStatusRequest extends TeaModel {
    @NameInMap("ImageUuids")
    public String imageUuids;

    @NameInMap("SensitiveFileKey")
    public String sensitiveFileKey;

    @NameInMap("Status")
    public Integer status;

    public static SetImageSensitiveFileStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetImageSensitiveFileStatusRequest self = new SetImageSensitiveFileStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetImageSensitiveFileStatusRequest setImageUuids(String imageUuids) {
        this.imageUuids = imageUuids;
        return this;
    }
    public String getImageUuids() {
        return this.imageUuids;
    }

    public SetImageSensitiveFileStatusRequest setSensitiveFileKey(String sensitiveFileKey) {
        this.sensitiveFileKey = sensitiveFileKey;
        return this;
    }
    public String getSensitiveFileKey() {
        return this.sensitiveFileKey;
    }

    public SetImageSensitiveFileStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
