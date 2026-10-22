// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyAccessTimeRangeConfigRequest extends TeaModel {
    /**
     * <p>The logon time limit configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccessTimeRangeConfig")
    public SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfig accessTimeRangeConfig;

    /**
     * <p>The instance ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to retrieve this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the control policy.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2758876.html">ListPolicies</a> operation to retrieve this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The region ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>For the mappings between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SetPolicyAccessTimeRangeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyAccessTimeRangeConfigRequest self = new SetPolicyAccessTimeRangeConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetPolicyAccessTimeRangeConfigRequest setAccessTimeRangeConfig(SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfig accessTimeRangeConfig) {
        this.accessTimeRangeConfig = accessTimeRangeConfig;
        return this;
    }
    public SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfig getAccessTimeRangeConfig() {
        return this.accessTimeRangeConfig;
    }

    public SetPolicyAccessTimeRangeConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetPolicyAccessTimeRangeConfigRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public SetPolicyAccessTimeRangeConfigRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public SetPolicyAccessTimeRangeConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfigEffectiveTime extends TeaModel {
        /**
         * <p>The days of the week when logon is allowed.</p>
         */
        @NameInMap("Days")
        public java.util.List<Integer> days;

        /**
         * <p>The hours of the day when logon is allowed.</p>
         */
        @NameInMap("Hours")
        public java.util.List<Integer> hours;

        public static SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfigEffectiveTime build(java.util.Map<String, ?> map) throws Exception {
            SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfigEffectiveTime self = new SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfigEffectiveTime();
            return TeaModel.build(map, self);
        }

        public SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfigEffectiveTime setDays(java.util.List<Integer> days) {
            this.days = days;
            return this;
        }
        public java.util.List<Integer> getDays() {
            return this.days;
        }

        public SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfigEffectiveTime setHours(java.util.List<Integer> hours) {
            this.hours = hours;
            return this;
        }
        public java.util.List<Integer> getHours() {
            return this.hours;
        }

    }

    public static class SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfig extends TeaModel {
        /**
         * <p>The details of the allowed logon periods.</p>
         */
        @NameInMap("EffectiveTime")
        public java.util.List<SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfigEffectiveTime> effectiveTime;

        public static SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfig build(java.util.Map<String, ?> map) throws Exception {
            SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfig self = new SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfig();
            return TeaModel.build(map, self);
        }

        public SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfig setEffectiveTime(java.util.List<SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfigEffectiveTime> effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public java.util.List<SetPolicyAccessTimeRangeConfigRequestAccessTimeRangeConfigEffectiveTime> getEffectiveTime() {
            return this.effectiveTime;
        }

    }

}
