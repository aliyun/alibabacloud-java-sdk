// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class QueryHotfixStatusRequest extends TeaModel {
    /**
     * <p>CVE ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CVE-2026-12345</p>
     */
    @NameInMap("cveId")
    public String cveId;

    /**
     * <p>The target instances.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("instances")
    public java.util.List<QueryHotfixStatusRequestInstances> instances;

    public static QueryHotfixStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHotfixStatusRequest self = new QueryHotfixStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryHotfixStatusRequest setCveId(String cveId) {
        this.cveId = cveId;
        return this;
    }
    public String getCveId() {
        return this.cveId;
    }

    public QueryHotfixStatusRequest setInstances(java.util.List<QueryHotfixStatusRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<QueryHotfixStatusRequestInstances> getInstances() {
        return this.instances;
    }

    public static class QueryHotfixStatusRequestInstances extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1example</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static QueryHotfixStatusRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            QueryHotfixStatusRequestInstances self = new QueryHotfixStatusRequestInstances();
            return TeaModel.build(map, self);
        }

        public QueryHotfixStatusRequestInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryHotfixStatusRequestInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
