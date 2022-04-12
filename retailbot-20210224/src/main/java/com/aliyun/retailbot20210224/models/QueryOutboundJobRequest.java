// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryOutboundJobRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("SaasId")
    public String saasId;

    @NameInMap("UserProfile")
    public QueryOutboundJobRequestUserProfile userProfile;

    public static QueryOutboundJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundJobRequest self = new QueryOutboundJobRequest();
        return TeaModel.build(map, self);
    }

    public QueryOutboundJobRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryOutboundJobRequest setSaasId(String saasId) {
        this.saasId = saasId;
        return this;
    }
    public String getSaasId() {
        return this.saasId;
    }

    public QueryOutboundJobRequest setUserProfile(QueryOutboundJobRequestUserProfile userProfile) {
        this.userProfile = userProfile;
        return this;
    }
    public QueryOutboundJobRequestUserProfile getUserProfile() {
        return this.userProfile;
    }

    public static class QueryOutboundJobRequestUserProfile extends TeaModel {
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

        public static QueryOutboundJobRequestUserProfile build(java.util.Map<String, ?> map) throws Exception {
            QueryOutboundJobRequestUserProfile self = new QueryOutboundJobRequestUserProfile();
            return TeaModel.build(map, self);
        }

        public QueryOutboundJobRequestUserProfile setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryOutboundJobRequestUserProfile setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public QueryOutboundJobRequestUserProfile setPlatformCode(String platformCode) {
            this.platformCode = platformCode;
            return this;
        }
        public String getPlatformCode() {
            return this.platformCode;
        }

        public QueryOutboundJobRequestUserProfile setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryOutboundJobRequestUserProfile setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public QueryOutboundJobRequestUserProfile setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

    }

}
