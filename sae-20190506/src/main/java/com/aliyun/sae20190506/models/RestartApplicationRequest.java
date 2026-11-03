// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RestartApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0099b7be-5f5b-4512-a7fc-56049ef1****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Specifies whether the elastic scaling policy for the application is automatically enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the policy.</li>
     * <li><strong>false</strong>: disables the policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoEnableApplicationScalingRule")
    public Boolean autoEnableApplicationScalingRule;

    /**
     * <p>The percentage of the minimum number of ready instances. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: the initial value, which indicates that the percentage is not used.</li>
     * <li><strong>0 to 100</strong>: the percentage, which is rounded up. For example, if you set this parameter to <strong>50</strong> and you have 5 instances, the minimum number of ready instances is 3.</li>
     * </ul>
     * <blockquote>
     * <p>If both <strong>MinReadyInstances</strong> and <strong>MinReadyInstanceRatio</strong> are specified and the value of <strong>MinReadyInstanceRatio</strong> is not <strong>-1</strong>, the <strong>MinReadyInstanceRatio</strong> parameter takes precedence. For example, if <strong>MinReadyInstances</strong> is set to <strong>5</strong> and <strong>MinReadyInstanceRatio</strong> is set to <strong>50</strong>, the system uses <strong>50</strong> to calculate the minimum number of ready instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("MinReadyInstanceRatio")
    public Integer minReadyInstanceRatio;

    /**
     * <p>The minimum number of ready instances. Valid values:</p>
     * <ul>
     * <li>If you set this parameter to <strong>0</strong>, services are interrupted during the application upgrade.</li>
     * <li>If you set this parameter to <strong>-1</strong>, the system uses the recommended value, which is 25% of the current number of instances. For example, if you have 5 instances, 5 × 25% = 1.25. The value is rounded up to 2.</li>
     * </ul>
     * <blockquote>
     * <p>For each rolling deployment, set the minimum number of ready instances to 1 or greater to ensure service continuity.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinReadyInstances")
    public Integer minReadyInstances;

    public static RestartApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartApplicationRequest self = new RestartApplicationRequest();
        return TeaModel.build(map, self);
    }

    public RestartApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RestartApplicationRequest setAutoEnableApplicationScalingRule(Boolean autoEnableApplicationScalingRule) {
        this.autoEnableApplicationScalingRule = autoEnableApplicationScalingRule;
        return this;
    }
    public Boolean getAutoEnableApplicationScalingRule() {
        return this.autoEnableApplicationScalingRule;
    }

    public RestartApplicationRequest setMinReadyInstanceRatio(Integer minReadyInstanceRatio) {
        this.minReadyInstanceRatio = minReadyInstanceRatio;
        return this;
    }
    public Integer getMinReadyInstanceRatio() {
        return this.minReadyInstanceRatio;
    }

    public RestartApplicationRequest setMinReadyInstances(Integer minReadyInstances) {
        this.minReadyInstances = minReadyInstances;
        return this;
    }
    public Integer getMinReadyInstances() {
        return this.minReadyInstances;
    }

}
