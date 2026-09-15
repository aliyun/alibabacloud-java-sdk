// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupedFieldDetailRequest extends TeaModel {
    /**
     * <p>The conditions for searching assets. This parameter is in JSON format. Separate multiple conditions with commas (,). Example: <code>[{&quot;name&quot;:&quot;riskStatus&quot;,&quot;value&quot;:&quot;YES&quot;},{&quot;name&quot;:&quot;riskLevel&quot;,&quot;value&quot;:&quot;2&quot;}]</code>.</p>
     * <blockquote>
     * <p>You can search for assets by conditions such as instance ID, instance name, VPC ID, region, and public IP address. Call <a href="~~DescribeCriteria~~">DescribeCriteria</a> to query the supported search conditions.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;clusterId\&quot;,\&quot;value\&quot;:\&quot;cfd26658431084c73a48dd97328ba8acf\&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The search item. Valid values:</p>
     * <ul>
     * <li><strong>pod</strong>: pod.</li>
     * <li><strong>appName</strong>: application name.</li>
     * <li><strong>clusterId</strong>: cluster ID.</li>
     * <li><strong>namespace</strong>: namespace.</li>
     * <li><strong>image</strong>: image.</li>
     * <li><strong>containerScan</strong>: container scan.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pod</p>
     */
    @NameInMap("GroupField")
    public String groupField;

    public static DescribeContainerGroupedFieldDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupedFieldDetailRequest self = new DescribeContainerGroupedFieldDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupedFieldDetailRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public DescribeContainerGroupedFieldDetailRequest setGroupField(String groupField) {
        this.groupField = groupField;
        return this;
    }
    public String getGroupField() {
        return this.groupField;
    }

}
