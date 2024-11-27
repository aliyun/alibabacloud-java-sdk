// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qianxi-test-0812</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>scx.dev.x1</p>
     */
    @NameInMap("ClusterSpec")
    public String clusterSpec;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VSwitches")
    public java.util.List<CreateClusterRequestVSwitches> vSwitches;

    /**
     * <p>VPC id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-aa1a18236n90rqhuhhnhh</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterRequest self = new CreateClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateClusterRequest setClusterSpec(String clusterSpec) {
        this.clusterSpec = clusterSpec;
        return this;
    }
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    public CreateClusterRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public CreateClusterRequest setVSwitches(java.util.List<CreateClusterRequestVSwitches> vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public java.util.List<CreateClusterRequestVSwitches> getVSwitches() {
        return this.vSwitches;
    }

    public CreateClusterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreateClusterRequestVSwitches extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2ze745n3r2sfqtahhubpl</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateClusterRequestVSwitches build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestVSwitches self = new CreateClusterRequestVSwitches();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestVSwitches setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateClusterRequestVSwitches setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
