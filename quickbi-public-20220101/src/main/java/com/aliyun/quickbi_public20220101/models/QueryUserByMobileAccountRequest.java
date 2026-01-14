// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserByMobileAccountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ding</p>
     */
    @NameInMap("MobileType")
    public String mobileType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sasda</p>
     */
    @NameInMap("MobileUserId")
    public String mobileUserId;

    public static QueryUserByMobileAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserByMobileAccountRequest self = new QueryUserByMobileAccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserByMobileAccountRequest setMobileType(String mobileType) {
        this.mobileType = mobileType;
        return this;
    }
    public String getMobileType() {
        return this.mobileType;
    }

    public QueryUserByMobileAccountRequest setMobileUserId(String mobileUserId) {
        this.mobileUserId = mobileUserId;
        return this;
    }
    public String getMobileUserId() {
        return this.mobileUserId;
    }

}
