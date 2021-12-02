// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class BindNodeLabelRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LabelKey")
    public String labelKey;

    @NameInMap("LabelValue")
    public String labelValue;

    public static BindNodeLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        BindNodeLabelRequest self = new BindNodeLabelRequest();
        return TeaModel.build(map, self);
    }

    public BindNodeLabelRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public BindNodeLabelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BindNodeLabelRequest setLabelKey(String labelKey) {
        this.labelKey = labelKey;
        return this;
    }
    public String getLabelKey() {
        return this.labelKey;
    }

    public BindNodeLabelRequest setLabelValue(String labelValue) {
        this.labelValue = labelValue;
        return this;
    }
    public String getLabelValue() {
        return this.labelValue;
    }

}
