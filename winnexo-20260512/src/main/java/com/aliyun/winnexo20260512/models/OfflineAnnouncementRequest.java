// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class OfflineAnnouncementRequest extends TeaModel {
    /**
     * <p>The business ID of the announcement.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("announcementId")
    public Long announcementId;

    /**
     * <p>The tenant ID. This is a common parameter. Pass it explicitly in winnexo-cli by using --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static OfflineAnnouncementRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineAnnouncementRequest self = new OfflineAnnouncementRequest();
        return TeaModel.build(map, self);
    }

    public OfflineAnnouncementRequest setAnnouncementId(Long announcementId) {
        this.announcementId = announcementId;
        return this;
    }
    public Long getAnnouncementId() {
        return this.announcementId;
    }

    public OfflineAnnouncementRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
