// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateNodeLabelRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("LabelKey")
    public String labelKey;

    @NameInMap("LabelValue")
    public String labelValue;

    public static CreateNodeLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeLabelRequest self = new CreateNodeLabelRequest();
        return TeaModel.build(map, self);
    }

    public CreateNodeLabelRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateNodeLabelRequest setLabelKey(String labelKey) {
        this.labelKey = labelKey;
        return this;
    }
    public String getLabelKey() {
        return this.labelKey;
    }

    public CreateNodeLabelRequest setLabelValue(String labelValue) {
        this.labelValue = labelValue;
        return this;
    }
    public String getLabelValue() {
        return this.labelValue;
    }

}
