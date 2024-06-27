// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CheckReadableRequest extends TeaModel {
    /**
     * <p>The user ID of the Quick BI to be checked.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de4bc5f9429141cc8091cdd1c15b****</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The ID of the work. Resources here include BI portal, dashboards, spreadsheets, and self-service access.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
     */
    @NameInMap("WorksId")
    public String worksId;

    public static CheckReadableRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckReadableRequest self = new CheckReadableRequest();
        return TeaModel.build(map, self);
    }

    public CheckReadableRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CheckReadableRequest setWorksId(String worksId) {
        this.worksId = worksId;
        return this;
    }
    public String getWorksId() {
        return this.worksId;
    }

}
