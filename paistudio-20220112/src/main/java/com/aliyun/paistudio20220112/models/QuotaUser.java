// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QuotaUser extends TeaModel {
    /**
     * <p>The resources.</p>
     */
    @NameInMap("Resources")
    public QuotaUserResources resources;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The workload count.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
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
        /**
         * <p>The submitted resources.</p>
         */
        @NameInMap("Submitted")
        public ResourceAmount submitted;

        /**
         * <p>The used resources.</p>
         */
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
