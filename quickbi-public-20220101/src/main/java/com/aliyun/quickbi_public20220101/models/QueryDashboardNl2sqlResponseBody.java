// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDashboardNl2sqlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>46e537a5****,3dadsu****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<QueryDashboardNl2sqlResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDashboardNl2sqlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDashboardNl2sqlResponseBody self = new QueryDashboardNl2sqlResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDashboardNl2sqlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDashboardNl2sqlResponseBody setResult(java.util.List<QueryDashboardNl2sqlResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryDashboardNl2sqlResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryDashboardNl2sqlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDashboardNl2sqlResponseBodyResult extends TeaModel {
        @NameInMap("Authorities")
        public java.util.List<String> authorities;

        /**
         * <strong>example:</strong>
         * <p>612b</p>
         */
        @NameInMap("DashboardName")
        public String dashboardName;

        /**
         * <strong>example:</strong>
         * <p>sasdas****sawdau</p>
         */
        @NameInMap("DashboardNl2sqlId")
        public String dashboardNl2sqlId;

        /**
         * <strong>example:</strong>
         * <p>46e5374665ba4b679ee22e2a2927****</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        public static QueryDashboardNl2sqlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryDashboardNl2sqlResponseBodyResult self = new QueryDashboardNl2sqlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryDashboardNl2sqlResponseBodyResult setAuthorities(java.util.List<String> authorities) {
            this.authorities = authorities;
            return this;
        }
        public java.util.List<String> getAuthorities() {
            return this.authorities;
        }

        public QueryDashboardNl2sqlResponseBodyResult setDashboardName(String dashboardName) {
            this.dashboardName = dashboardName;
            return this;
        }
        public String getDashboardName() {
            return this.dashboardName;
        }

        public QueryDashboardNl2sqlResponseBodyResult setDashboardNl2sqlId(String dashboardNl2sqlId) {
            this.dashboardNl2sqlId = dashboardNl2sqlId;
            return this;
        }
        public String getDashboardNl2sqlId() {
            return this.dashboardNl2sqlId;
        }

        public QueryDashboardNl2sqlResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

    }

}
