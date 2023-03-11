// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerCriteriaRequest extends TeaModel {
    /**
     * <p>The filter condition. Valid values:</p>
     * <br>
     * <p>*   **pod**: pod</p>
     * <p>*   **appName**: application name</p>
     * <p>*   **clusterId**: cluster ID</p>
     * <p>*   **namespace**: namespace</p>
     * <p>*   **image**: image</p>
     * <p>*   **containerScan**: container scan</p>
     */
    @NameInMap("GroupField")
    public String groupField;

    /**
     * <p>The value of the filter condition. The value can be an application name, node name, namespace, cluster name, public IP address, pod address, region, pod, instance ID, cluster ID, or container ID. Fuzzy match is supported.</p>
     */
    @NameInMap("Value")
    public String value;

    public static DescribeContainerCriteriaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerCriteriaRequest self = new DescribeContainerCriteriaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContainerCriteriaRequest setGroupField(String groupField) {
        this.groupField = groupField;
        return this;
    }
    public String getGroupField() {
        return this.groupField;
    }

    public DescribeContainerCriteriaRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
