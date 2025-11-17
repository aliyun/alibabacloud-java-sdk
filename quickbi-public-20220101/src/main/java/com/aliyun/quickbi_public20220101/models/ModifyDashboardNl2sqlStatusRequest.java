// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ModifyDashboardNl2sqlStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asda,sadaf</p>
     */
    @NameInMap("DashboardIds")
    public String dashboardIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static ModifyDashboardNl2sqlStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDashboardNl2sqlStatusRequest self = new ModifyDashboardNl2sqlStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDashboardNl2sqlStatusRequest setDashboardIds(String dashboardIds) {
        this.dashboardIds = dashboardIds;
        return this;
    }
    public String getDashboardIds() {
        return this.dashboardIds;
    }

    public ModifyDashboardNl2sqlStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
