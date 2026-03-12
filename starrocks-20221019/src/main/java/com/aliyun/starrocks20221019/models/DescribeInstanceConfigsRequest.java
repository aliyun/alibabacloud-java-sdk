// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeInstanceConfigsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowModify")
    public Boolean allowModify;

    /**
     * <strong>example:</strong>
     * <p>enable_udf</p>
     */
    @NameInMap("ConfigKey")
    public String configKey;

    /**
     * <strong>example:</strong>
     * <p>FE</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedTotal")
    public Boolean needTotal;

    /**
     * <strong>example:</strong>
     * <p>ng-3d5ce6454354****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
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
