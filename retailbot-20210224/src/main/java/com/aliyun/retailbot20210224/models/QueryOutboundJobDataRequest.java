// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryOutboundJobDataRequest extends TeaModel {
    // 结束时间 yyyyMMddHHmmss
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("SaasId")
    public String saasId;

    // 开始时间 yyyyMMddHHmmss
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("UserProfile")
    public QueryOutboundJobDataRequestUserProfile userProfile;

    public static QueryOutboundJobDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundJobDataRequest self = new QueryOutboundJobDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryOutboundJobDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryOutboundJobDataRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public QueryOutboundJobDataRequest setSaasId(String saasId) {
        this.saasId = saasId;
        return this;
    }
    public String getSaasId() {
        return this.saasId;
    }

    public QueryOutboundJobDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryOutboundJobDataRequest setUserProfile(QueryOutboundJobDataRequestUserProfile userProfile) {
        this.userProfile = userProfile;
        return this;
    }
    public QueryOutboundJobDataRequestUserProfile getUserProfile() {
        return this.userProfile;
    }

    public static class QueryOutboundJobDataRequestUserProfile extends TeaModel {
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

        public static QueryOutboundJobDataRequestUserProfile build(java.util.Map<String, ?> map) throws Exception {
            QueryOutboundJobDataRequestUserProfile self = new QueryOutboundJobDataRequestUserProfile();
            return TeaModel.build(map, self);
        }

        public QueryOutboundJobDataRequestUserProfile setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryOutboundJobDataRequestUserProfile setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public QueryOutboundJobDataRequestUserProfile setPlatformCode(String platformCode) {
            this.platformCode = platformCode;
            return this;
        }
        public String getPlatformCode() {
            return this.platformCode;
        }

        public QueryOutboundJobDataRequestUserProfile setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryOutboundJobDataRequestUserProfile setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public QueryOutboundJobDataRequestUserProfile setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

    }

}
