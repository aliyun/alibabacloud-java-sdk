// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateGuestClusterConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c42186268a27f475c975e5667bb66****</p>
     */
    @NameInMap("GuestClusterId")
    public String guestClusterId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SMCEnabled")
    public Boolean SMCEnabled;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cb8963379255149cb98c8686f274x****</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static UpdateGuestClusterConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGuestClusterConfigRequest self = new UpdateGuestClusterConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGuestClusterConfigRequest setGuestClusterId(String guestClusterId) {
        this.guestClusterId = guestClusterId;
        return this;
    }
    public String getGuestClusterId() {
        return this.guestClusterId;
    }

    public UpdateGuestClusterConfigRequest setSMCEnabled(Boolean SMCEnabled) {
        this.SMCEnabled = SMCEnabled;
        return this;
    }
    public Boolean getSMCEnabled() {
        return this.SMCEnabled;
    }

    public UpdateGuestClusterConfigRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
