// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UninstallHotfixRequest extends TeaModel {
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
    public java.util.List<UninstallHotfixRequestInstances> instances;

    public static UninstallHotfixRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallHotfixRequest self = new UninstallHotfixRequest();
        return TeaModel.build(map, self);
    }

    public UninstallHotfixRequest setCveId(String cveId) {
        this.cveId = cveId;
        return this;
    }
    public String getCveId() {
        return this.cveId;
    }

    public UninstallHotfixRequest setInstances(java.util.List<UninstallHotfixRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<UninstallHotfixRequestInstances> getInstances() {
        return this.instances;
    }

    public static class UninstallHotfixRequestInstances extends TeaModel {
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

        public static UninstallHotfixRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            UninstallHotfixRequestInstances self = new UninstallHotfixRequestInstances();
            return TeaModel.build(map, self);
        }

        public UninstallHotfixRequestInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UninstallHotfixRequestInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
