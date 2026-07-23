// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class SplitTrafficControlTargetRequest extends TeaModel {
    /**
     * <p>The environment. Valid values:</p>
     * <ul>
     * <li><p><code>Pre</code>: pre-production environment.</p>
     * </li>
     * <li><p><code>Prod</code>: production environment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>The instance ID. For information about how to obtain the instance ID, see <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>learn-pairec-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("SetPoints")
    public java.util.List<Long> setPoints;

    /**
     * <p>The target values that correspond to the time intervals defined by the <code>TimePoints</code> parameter.</p>
     */
    @NameInMap("SetValues")
    public java.util.List<Long> setValues;

    /**
     * <p>The time points that define the traffic-splitting intervals.</p>
     */
    @NameInMap("TimePoints")
    public java.util.List<Long> timePoints;

    public static SplitTrafficControlTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        SplitTrafficControlTargetRequest self = new SplitTrafficControlTargetRequest();
        return TeaModel.build(map, self);
    }

    public SplitTrafficControlTargetRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public SplitTrafficControlTargetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SplitTrafficControlTargetRequest setSetPoints(java.util.List<Long> setPoints) {
        this.setPoints = setPoints;
        return this;
    }
    public java.util.List<Long> getSetPoints() {
        return this.setPoints;
    }

    public SplitTrafficControlTargetRequest setSetValues(java.util.List<Long> setValues) {
        this.setValues = setValues;
        return this;
    }
    public java.util.List<Long> getSetValues() {
        return this.setValues;
    }

    public SplitTrafficControlTargetRequest setTimePoints(java.util.List<Long> timePoints) {
        this.timePoints = timePoints;
        return this;
    }
    public java.util.List<Long> getTimePoints() {
        return this.timePoints;
    }

}
