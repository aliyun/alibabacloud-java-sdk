// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteNodeLabelRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Force")
    public Boolean force;

    @NameInMap("LabelKey")
    public String labelKey;

    @NameInMap("LabelValue")
    public String labelValue;

    public static DeleteNodeLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodeLabelRequest self = new DeleteNodeLabelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNodeLabelRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteNodeLabelRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteNodeLabelRequest setLabelKey(String labelKey) {
        this.labelKey = labelKey;
        return this;
    }
    public String getLabelKey() {
        return this.labelKey;
    }

    public DeleteNodeLabelRequest setLabelValue(String labelValue) {
        this.labelValue = labelValue;
        return this;
    }
    public String getLabelValue() {
        return this.labelValue;
    }

}
