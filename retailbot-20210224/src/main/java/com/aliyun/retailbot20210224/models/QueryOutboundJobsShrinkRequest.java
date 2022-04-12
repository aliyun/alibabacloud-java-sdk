// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryOutboundJobsShrinkRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("SaasId")
    public String saasId;

    @NameInMap("ShopId")
    public String shopId;

    @NameInMap("UserProfile")
    public String userProfileShrink;

    @NameInMap("Version")
    public String version;

    public static QueryOutboundJobsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundJobsShrinkRequest self = new QueryOutboundJobsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryOutboundJobsShrinkRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public QueryOutboundJobsShrinkRequest setSaasId(String saasId) {
        this.saasId = saasId;
        return this;
    }
    public String getSaasId() {
        return this.saasId;
    }

    public QueryOutboundJobsShrinkRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public QueryOutboundJobsShrinkRequest setUserProfileShrink(String userProfileShrink) {
        this.userProfileShrink = userProfileShrink;
        return this;
    }
    public String getUserProfileShrink() {
        return this.userProfileShrink;
    }

    public QueryOutboundJobsShrinkRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
