// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerCriteriaRequest extends TeaModel {
    /**
     * <p>The search field. Valid values:</p>
     * <ul>
     * <li><strong>pod</strong>: pod.</li>
     * <li><strong>appName</strong>: application name.</li>
     * <li><strong>clusterId</strong>: cluster ID.</li>
     * <li><strong>namespace</strong>: namespace.</li>
     * <li><strong>image</strong>: image.</li>
     * <li><strong>containerScan</strong>: container scan.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>clusterId</p>
     */
    @NameInMap("GroupField")
    public String groupField;

    /**
     * <p>The value of the search field. Fuzzy match is supported for application names, node names, namespaces, cluster names, public IP addresses, pod addresses, regions, pods, instance IDs, cluster IDs, and container IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cfb41a869c71e4678a97021582dd8a****</p>
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
