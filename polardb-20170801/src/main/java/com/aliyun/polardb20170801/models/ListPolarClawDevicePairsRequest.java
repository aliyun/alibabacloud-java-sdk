// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ListPolarClawDevicePairsRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    public static ListPolarClawDevicePairsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPolarClawDevicePairsRequest self = new ListPolarClawDevicePairsRequest();
        return TeaModel.build(map, self);
    }

    public ListPolarClawDevicePairsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}
