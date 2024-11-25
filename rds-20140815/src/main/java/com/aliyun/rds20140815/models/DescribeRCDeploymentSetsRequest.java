// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCDeploymentSetsRequest extends TeaModel {
    /**
     * <p>The IDs of the deployment sets. The value can be a JSON array that consists of deployment set IDs in the format of <code>[&quot;ds-xxxxxxxxx&quot;, &quot;ds-yyyyyyyyy&quot;, ... &quot;ds-zzzzzzzzz&quot;]</code>. You can specify up to 100 deployment set IDs in each request. Separate the deployment set IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ds-2zeeuw16zo2gr9e6****&quot;]</p>
     */
    @NameInMap("DeploymentSetIds")
    public String deploymentSetIds;

    /**
     * <p>The deployment set name. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, letters, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>deployment_test</p>
     */
    @NameInMap("DeploymentSetName")
    public String deploymentSetName;

    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Maximum value: 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The deployment strategy. Valid values:</p>
     * <ul>
     * <li><strong>Availability</strong>: high availability strategy</li>
     * <li><strong>AvailabilityGroup</strong>: high availability group strategy</li>
     * </ul>
     * <p>Default value: Availability.</p>
     * 
     * <strong>example:</strong>
     * <p>Availability</p>
     */
    @NameInMap("Strategy")
    public String strategy;

    @NameInMap("Tag")
    public String tag;

    public static DescribeRCDeploymentSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCDeploymentSetsRequest self = new DescribeRCDeploymentSetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRCDeploymentSetsRequest setDeploymentSetIds(String deploymentSetIds) {
        this.deploymentSetIds = deploymentSetIds;
        return this;
    }
    public String getDeploymentSetIds() {
        return this.deploymentSetIds;
    }

    public DescribeRCDeploymentSetsRequest setDeploymentSetName(String deploymentSetName) {
        this.deploymentSetName = deploymentSetName;
        return this;
    }
    public String getDeploymentSetName() {
        return this.deploymentSetName;
    }

    public DescribeRCDeploymentSetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRCDeploymentSetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRCDeploymentSetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRCDeploymentSetsRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public DescribeRCDeploymentSetsRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
