// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class BindResourceControlRequest extends TeaModel {
    /**
     * <p>The PolarDB cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region ID of the PolarDB cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query available regions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the resource control rule. The name must be 1 to 63 ASCII bytes in length, start with a letter, and can contain only letters, digits, and underscores.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_rc</p>
     */
    @NameInMap("ResourceControlName")
    public String resourceControlName;

    /**
     * <p>The type of the binding target. Valid values: USER, DATABASE, QUERY, CONNECTION. The value is case-insensitive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The value of the binding target. The format depends on the value of TargetType. For more information, see the table below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_user</p>
     */
    @NameInMap("TargetValue")
    public String targetValue;

    public static BindResourceControlRequest build(java.util.Map<String, ?> map) throws Exception {
        BindResourceControlRequest self = new BindResourceControlRequest();
        return TeaModel.build(map, self);
    }

    public BindResourceControlRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public BindResourceControlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BindResourceControlRequest setResourceControlName(String resourceControlName) {
        this.resourceControlName = resourceControlName;
        return this;
    }
    public String getResourceControlName() {
        return this.resourceControlName;
    }

    public BindResourceControlRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public BindResourceControlRequest setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

}
