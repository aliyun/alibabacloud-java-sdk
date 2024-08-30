// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QuotaUser extends TeaModel {
    @NameInMap("Resources")
    public QuotaUserResources resources;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("Username")
    public String username;

    @NameInMap("WorkloadCount")
    public Integer workloadCount;

    public static QuotaUser build(java.util.Map<String, ?> map) throws Exception {
        QuotaUser self = new QuotaUser();
        return TeaModel.build(map, self);
    }

    public QuotaUser setResources(QuotaUserResources resources) {
        this.resources = resources;
        return this;
    }
    public QuotaUserResources getResources() {
        return this.resources;
    }

    public QuotaUser setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QuotaUser setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public QuotaUser setWorkloadCount(Integer workloadCount) {
        this.workloadCount = workloadCount;
        return this;
    }
    public Integer getWorkloadCount() {
        return this.workloadCount;
    }

    public static class QuotaUserResources extends TeaModel {
        @NameInMap("Submitted")
        public ResourceAmount submitted;

        @NameInMap("Used")
        public ResourceAmount used;

        public static QuotaUserResources build(java.util.Map<String, ?> map) throws Exception {
            QuotaUserResources self = new QuotaUserResources();
            return TeaModel.build(map, self);
        }

        public QuotaUserResources setSubmitted(ResourceAmount submitted) {
            this.submitted = submitted;
            return this;
        }
        public ResourceAmount getSubmitted() {
            return this.submitted;
        }

        public QuotaUserResources setUsed(ResourceAmount used) {
            this.used = used;
            return this;
        }
        public ResourceAmount getUsed() {
            return this.used;
        }

    }

}
