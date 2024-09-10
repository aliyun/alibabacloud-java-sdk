// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupedFieldDetailRequest extends TeaModel {
    /**
     * <p>The search conditions that are used to query assets. The value of this parameter is in the JSON format. Separate multiple search conditions with commas (,). Example: <code>[{&quot;name&quot;:&quot;riskStatus&quot;,&quot;value&quot;:&quot;YES&quot;},{&quot;name&quot;:&quot;riskLevel&quot;,&quot;value&quot;:&quot;2&quot;}]</code>.</p>
     * <blockquote>
     * <p> Supported search conditions include the instance ID, instance name, virtual private cloud (VPC) ID, region, and public IP address. You can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to query the supported search conditions.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;clusterId\&quot;,\&quot;value\&quot;:\&quot;cfd26658431084c73a48dd97328ba8acf\&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The filter condition for a grouping and aggregation query. Valid values:</p>
     * <ul>
     * <li><strong>pod</strong></li>
     * <li><strong>appName</strong></li>
     * <li><strong>clusterId</strong></li>
     * <li><strong>namespace</strong></li>
     * <li><strong>image</strong></li>
     * <li><strong>containerScan</strong></li>
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
