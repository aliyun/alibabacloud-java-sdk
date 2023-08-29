// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class FeatureViewConfigValue extends TeaModel {
    @NameInMap("Partitions")
    public java.util.Map<String, java.util.Map<String, ?>> partitions;

    public static FeatureViewConfigValue build(java.util.Map<String, ?> map) throws Exception {
        FeatureViewConfigValue self = new FeatureViewConfigValue();
        return TeaModel.build(map, self);
    }

    public FeatureViewConfigValue setPartitions(java.util.Map<String, java.util.Map<String, ?>> partitions) {
        this.partitions = partitions;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getPartitions() {
        return this.partitions;
    }

}
