// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UnbindNodeLabelRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LabelKey")
    public String labelKey;

    @NameInMap("LabelValue")
    public String labelValue;

    public static UnbindNodeLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindNodeLabelRequest self = new UnbindNodeLabelRequest();
        return TeaModel.build(map, self);
    }

    public UnbindNodeLabelRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UnbindNodeLabelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UnbindNodeLabelRequest setLabelKey(String labelKey) {
        this.labelKey = labelKey;
        return this;
    }
    public String getLabelKey() {
        return this.labelKey;
    }

    public UnbindNodeLabelRequest setLabelValue(String labelValue) {
        this.labelValue = labelValue;
        return this;
    }
    public String getLabelValue() {
        return this.labelValue;
    }

}
