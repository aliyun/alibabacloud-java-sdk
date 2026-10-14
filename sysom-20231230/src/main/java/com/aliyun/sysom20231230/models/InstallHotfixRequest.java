// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InstallHotfixRequest extends TeaModel {
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
    public java.util.List<InstallHotfixRequestInstances> instances;

    public static InstallHotfixRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallHotfixRequest self = new InstallHotfixRequest();
        return TeaModel.build(map, self);
    }

    public InstallHotfixRequest setCveId(String cveId) {
        this.cveId = cveId;
        return this;
    }
    public String getCveId() {
        return this.cveId;
    }

    public InstallHotfixRequest setInstances(java.util.List<InstallHotfixRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<InstallHotfixRequestInstances> getInstances() {
        return this.instances;
    }

    public static class InstallHotfixRequestInstances extends TeaModel {
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

        public static InstallHotfixRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            InstallHotfixRequestInstances self = new InstallHotfixRequestInstances();
            return TeaModel.build(map, self);
        }

        public InstallHotfixRequestInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public InstallHotfixRequestInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
