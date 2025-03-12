// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeRestorableTenantsRequest extends TeaModel {
    /**
     * <p>The ID of the OceanBase cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether the target cluster is online. <strong>Note</strong> This parameter is used for compatibility with earlier versions and can be left empty. When left empty, it specifies negation for the value of <code>isRemote</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsOnline")
    public Boolean isOnline;

    /**
     * <p>This parameter is provided for compatibility with earlier versions and can be left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsRemote")
    public Boolean isRemote;

    /**
     * <p>The backup method.</p>
     * 
     * <strong>example:</strong>
     * <p>native_logical</p>
     */
    @NameInMap("Method")
    public String method;

    /**
     * <p>The restore method. This parameter is required when <code>IsRemote</code> is set to <code>true</code>, and is optional otherwise.</p>
     * 
     * <strong>example:</strong>
     * <p>from_time_point</p>
     */
    @NameInMap("RestoreMode")
    public String restoreMode;

    /**
     * <p>The type of the restore object.</p>
     * 
     * <strong>example:</strong>
     * <p>tenant</p>
     */
    @NameInMap("RestoreObjectType")
    public String restoreObjectType;

    /**
     * <p>The ID of the backup set.</p>
     * 
     * <strong>example:</strong>
     * <p>bak-xxxxx</p>
     */
    @NameInMap("SetId")
    public String setId;

    public static DescribeRestorableTenantsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestorableTenantsRequest self = new DescribeRestorableTenantsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRestorableTenantsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRestorableTenantsRequest setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
        return this;
    }
    public Boolean getIsOnline() {
        return this.isOnline;
    }

    public DescribeRestorableTenantsRequest setIsRemote(Boolean isRemote) {
        this.isRemote = isRemote;
        return this;
    }
    public Boolean getIsRemote() {
        return this.isRemote;
    }

    public DescribeRestorableTenantsRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public DescribeRestorableTenantsRequest setRestoreMode(String restoreMode) {
        this.restoreMode = restoreMode;
        return this;
    }
    public String getRestoreMode() {
        return this.restoreMode;
    }

    public DescribeRestorableTenantsRequest setRestoreObjectType(String restoreObjectType) {
        this.restoreObjectType = restoreObjectType;
        return this;
    }
    public String getRestoreObjectType() {
        return this.restoreObjectType;
    }

    public DescribeRestorableTenantsRequest setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

}
