// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateClusterShrinkRequest extends TeaModel {
    /**
     * <p>The billing type.</p>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The name of the cluster.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The cluster specification. Valid values:</p>
     * <ul>
     * <li>scx.dev.x1</li>
     * <li>scx.small.x1</li>
     * <li>scx.small.x2</li>
     * <li>scx.medium.x1</li>
     * <li>scx.medium.x2.</li>
     * </ul>
     */
    @NameInMap("ClusterSpec")
    public String clusterSpec;

    /**
     * <p>The cluster type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClusterType")
    public Integer clusterType;

    /**
     * <p>The duration.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The engine type. Valid values: xxljob.</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The pricing cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The source.</p>
     * 
     * <strong>example:</strong>
     * <p>schedulerx</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The list of tags. A maximum of 20 tags are supported.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateClusterShrinkRequestTag> tag;

    /**
     * <p>The information about the vSwitches.</p>
     */
    @NameInMap("VSwitches")
    public String vSwitchesShrink;

    /**
     * <p>The ID of the VPC.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterShrinkRequest self = new CreateClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterShrinkRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
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

    public CreateClusterShrinkRequest setClusterType(Integer clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public Integer getClusterType() {
        return this.clusterType;
    }

    public CreateClusterShrinkRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateClusterShrinkRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public CreateClusterShrinkRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateClusterShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
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
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
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
