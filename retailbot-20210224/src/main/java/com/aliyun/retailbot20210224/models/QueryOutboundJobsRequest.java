// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryOutboundJobsRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("SaasId")
    public String saasId;

    @NameInMap("ShopId")
    public String shopId;

    @NameInMap("UserProfile")
    public QueryOutboundJobsRequestUserProfile userProfile;

    @NameInMap("Version")
    public String version;

    public static QueryOutboundJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundJobsRequest self = new QueryOutboundJobsRequest();
        return TeaModel.build(map, self);
    }

    public QueryOutboundJobsRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public QueryOutboundJobsRequest setSaasId(String saasId) {
        this.saasId = saasId;
        return this;
    }
    public String getSaasId() {
        return this.saasId;
    }

    public QueryOutboundJobsRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public QueryOutboundJobsRequest setUserProfile(QueryOutboundJobsRequestUserProfile userProfile) {
        this.userProfile = userProfile;
        return this;
    }
    public QueryOutboundJobsRequestUserProfile getUserProfile() {
        return this.userProfile;
    }

    public QueryOutboundJobsRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class QueryOutboundJobsRequestUserProfile extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("BuId")
        public Long buId;

        @NameInMap("PlatformCode")
        public String platformCode;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserNick")
        public String userNick;

        public static QueryOutboundJobsRequestUserProfile build(java.util.Map<String, ?> map) throws Exception {
            QueryOutboundJobsRequestUserProfile self = new QueryOutboundJobsRequestUserProfile();
            return TeaModel.build(map, self);
        }

        public QueryOutboundJobsRequestUserProfile setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryOutboundJobsRequestUserProfile setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public QueryOutboundJobsRequestUserProfile setPlatformCode(String platformCode) {
            this.platformCode = platformCode;
            return this;
        }
        public String getPlatformCode() {
            return this.platformCode;
        }

        public QueryOutboundJobsRequestUserProfile setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryOutboundJobsRequestUserProfile setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public QueryOutboundJobsRequestUserProfile setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

    }

}
