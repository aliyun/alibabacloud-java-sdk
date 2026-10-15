// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryInspirationBalanceForPartnerRequest extends TeaModel {
    /**
     * <p>The owner ID, which can be a website ID or an Alibaba Cloud account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BelongId")
    public String belongId;

    /**
     * <p>The type of the owner ID. Valid values: siteId and uid.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("BelongIdType")
    public String belongIdType;

    public static QueryInspirationBalanceForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInspirationBalanceForPartnerRequest self = new QueryInspirationBalanceForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public QueryInspirationBalanceForPartnerRequest setBelongId(String belongId) {
        this.belongId = belongId;
        return this;
    }
    public String getBelongId() {
        return this.belongId;
    }

    public QueryInspirationBalanceForPartnerRequest setBelongIdType(String belongIdType) {
        this.belongIdType = belongIdType;
        return this;
    }
    public String getBelongIdType() {
        return this.belongIdType;
    }

}
