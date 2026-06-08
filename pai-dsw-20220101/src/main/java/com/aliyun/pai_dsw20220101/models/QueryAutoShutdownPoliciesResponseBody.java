// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class QueryAutoShutdownPoliciesResponseBody extends TeaModel {
    @NameInMap("AutoShutdownPolicies")
    public java.util.List<QueryAutoShutdownPoliciesResponseBodyAutoShutdownPolicies> autoShutdownPolicies;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryAutoShutdownPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAutoShutdownPoliciesResponseBody self = new QueryAutoShutdownPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAutoShutdownPoliciesResponseBody setAutoShutdownPolicies(java.util.List<QueryAutoShutdownPoliciesResponseBodyAutoShutdownPolicies> autoShutdownPolicies) {
        this.autoShutdownPolicies = autoShutdownPolicies;
        return this;
    }
    public java.util.List<QueryAutoShutdownPoliciesResponseBodyAutoShutdownPolicies> getAutoShutdownPolicies() {
        return this.autoShutdownPolicies;
    }

    public QueryAutoShutdownPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryAutoShutdownPoliciesResponseBodyAutoShutdownPoliciesConditions extends TeaModel {
        @NameInMap("Context")
        public java.util.Map<String, ?> context;

        /**
         * <strong>example:</strong>
         * <p>IdleDuration &gt; 1440 min AND CpuUtilization &lt;= 1%</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <strong>example:</strong>
         * <p>Workspace</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static QueryAutoShutdownPoliciesResponseBodyAutoShutdownPoliciesConditions build(java.util.Map<String, ?> map) throws Exception {
            QueryAutoShutdownPoliciesResponseBodyAutoShutdownPoliciesConditions self = new QueryAutoShutdownPoliciesResponseBodyAutoShutdownPoliciesConditions();
            return TeaModel.build(map, self);
        }

        public QueryAutoShutdownPoliciesResponseBodyAutoShutdownPoliciesConditions setContext(java.util.Map<String, ?> context) {
            this.context = context;
            return this;
        }
        public java.util.Map<String, ?> getContext() {
            return this.context;
        }

        public QueryAutoShutdownPoliciesResponseBodyAutoShutdownPoliciesConditions setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public QueryAutoShutdownPoliciesResponseBodyAutoShutdownPoliciesConditions setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class QueryAutoShutdownPoliciesResponseBodyAutoShutdownPolicies extends TeaModel {
        @NameInMap("Conditions")
        public java.util.List<QueryAutoShutdownPoliciesResponseBodyAutoShutdownPoliciesConditions> conditions;

        @NameInMap("Context")
        @Deprecated
        public java.util.Map<String, ?> context;

        /**
         * <strong>example:</strong>
         * <p>IdleDuration &gt; 1440 min AND CpuUtilization &lt;= 1%</p>
         */
        @NameInMap("Expression")
        @Deprecated
        public String expression;

        /**
         * <strong>example:</strong>
         * <p>dsw-05cefd0be2e5a278</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>Workspace</p>
         */
        @NameInMap("SourceType")
        @Deprecated
        public String sourceType;

        public static QueryAutoShutdownPoliciesResponseBodyAutoShutdownPolicies build(java.util.Map<String, ?> map) throws Exception {
            QueryAutoShutdownPoliciesResponseBodyAutoShutdownPolicies self = new QueryAutoShutdownPoliciesResponseBodyAutoShutdownPolicies();
            return TeaModel.build(map, self);
        }

        public QueryAutoShutdownPoliciesResponseBodyAutoShutdownPolicies setConditions(java.util.List<QueryAutoShutdownPoliciesResponseBodyAutoShutdownPoliciesConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<QueryAutoShutdownPoliciesResponseBodyAutoShutdownPoliciesConditions> getConditions() {
            return this.conditions;
        }

        @Deprecated
        public QueryAutoShutdownPoliciesResponseBodyAutoShutdownPolicies setContext(java.util.Map<String, ?> context) {
            this.context = context;
            return this;
        }
        public java.util.Map<String, ?> getContext() {
            return this.context;
        }

        @Deprecated
        public QueryAutoShutdownPoliciesResponseBodyAutoShutdownPolicies setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public QueryAutoShutdownPoliciesResponseBodyAutoShutdownPolicies setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        @Deprecated
        public QueryAutoShutdownPoliciesResponseBodyAutoShutdownPolicies setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
