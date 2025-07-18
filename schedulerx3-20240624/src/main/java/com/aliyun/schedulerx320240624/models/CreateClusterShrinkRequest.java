// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateClusterShrinkRequest extends TeaModel {
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

    @NameInMap("Tag")
    public java.util.List<CreateClusterShrinkRequestTag> tag;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VSwitches")
    public String vSwitchesShrink;

    /**
     * <p>VPC id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-aa1a18236n90rqhuhhnhh</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterShrinkRequest self = new CreateClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterShrinkRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateClusterShrinkRequest setClusterSpec(String clusterSpec) {
        this.clusterSpec = clusterSpec;
        return this;
    }
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    public CreateClusterShrinkRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public CreateClusterShrinkRequest setTag(java.util.List<CreateClusterShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateClusterShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateClusterShrinkRequest setVSwitchesShrink(String vSwitchesShrink) {
        this.vSwitchesShrink = vSwitchesShrink;
        return this;
    }
    public String getVSwitchesShrink() {
        return this.vSwitchesShrink;
    }

    public CreateClusterShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreateClusterShrinkRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateClusterShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterShrinkRequestTag self = new CreateClusterShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateClusterShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateClusterShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
