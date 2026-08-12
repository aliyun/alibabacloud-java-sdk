// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeInstanceConfigsRequest extends TeaModel {
    /**
     * <p>Indicates whether the configuration item can be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowModify")
    public Boolean allowModify;

    /**
     * <p>The key of the configuration item.</p>
     * 
     * <strong>example:</strong>
     * <p>enable_udf</p>
     */
    @NameInMap("ConfigKey")
    public String configKey;

    /**
     * <p>The type of the configuration item. Valid values:</p>
     * <ul>
     * <li><p>FE</p>
     * </li>
     * <li><p>BE</p>
     * </li>
     * <li><p>CORE</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FE</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>The description of the configuration item\&quot;s feature.</p>
     * 
     * <strong>example:</strong>
     * <p>Whether to enable UDF.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Indicates whether to return all configuration items.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedTotal")
    public Boolean needTotal;

    /**
     * <p>The compute group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-3d5ce6454354****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The page number for the query. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for a paged query. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeInstanceConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceConfigsRequest self = new DescribeInstanceConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceConfigsRequest setAllowModify(Boolean allowModify) {
        this.allowModify = allowModify;
        return this;
    }
    public Boolean getAllowModify() {
        return this.allowModify;
    }

    public DescribeInstanceConfigsRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public DescribeInstanceConfigsRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public DescribeInstanceConfigsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeInstanceConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceConfigsRequest setNeedTotal(Boolean needTotal) {
        this.needTotal = needTotal;
        return this;
    }
    public Boolean getNeedTotal() {
        return this.needTotal;
    }

    public DescribeInstanceConfigsRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public DescribeInstanceConfigsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceConfigsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
