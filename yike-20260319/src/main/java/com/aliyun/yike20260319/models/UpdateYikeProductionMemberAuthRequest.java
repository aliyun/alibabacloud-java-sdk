// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class UpdateYikeProductionMemberAuthRequest extends TeaModel {
    /**
     * <p>The permission name. Valid values:</p>
     * <ul>
     * <li>Manage: manageable</li>
     * <li>Edit: editable</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Manage</p>
     */
    @NameInMap("Auth")
    public String auth;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pd_061716****</p>
     */
    @NameInMap("ProductionId")
    public String productionId;

    /**
     * <p>The RAM user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21******</p>
     */
    @NameInMap("YikeUserId")
    public String yikeUserId;

    public static UpdateYikeProductionMemberAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateYikeProductionMemberAuthRequest self = new UpdateYikeProductionMemberAuthRequest();
        return TeaModel.build(map, self);
    }

    public UpdateYikeProductionMemberAuthRequest setAuth(String auth) {
        this.auth = auth;
        return this;
    }
    public String getAuth() {
        return this.auth;
    }

    public UpdateYikeProductionMemberAuthRequest setProductionId(String productionId) {
        this.productionId = productionId;
        return this;
    }
    public String getProductionId() {
        return this.productionId;
    }

    public UpdateYikeProductionMemberAuthRequest setYikeUserId(String yikeUserId) {
        this.yikeUserId = yikeUserId;
        return this;
    }
    public String getYikeUserId() {
        return this.yikeUserId;
    }

}
