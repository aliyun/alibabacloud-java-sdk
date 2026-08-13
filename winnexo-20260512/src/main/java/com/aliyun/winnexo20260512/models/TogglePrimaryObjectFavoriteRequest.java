// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class TogglePrimaryObjectFavoriteRequest extends TeaModel {
    /**
     * <p>操作：add-关注，remove-取消关注</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>add</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>主对象业务ID列表</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("objectIds")
    public java.util.List<String> objectIds;

    /**
     * <p>对象类型（如 customer、project）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("objectType")
    public String objectType;

    /**
     * <p>运营对象名称（如 customer_1）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static TogglePrimaryObjectFavoriteRequest build(java.util.Map<String, ?> map) throws Exception {
        TogglePrimaryObjectFavoriteRequest self = new TogglePrimaryObjectFavoriteRequest();
        return TeaModel.build(map, self);
    }

    public TogglePrimaryObjectFavoriteRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public TogglePrimaryObjectFavoriteRequest setObjectIds(java.util.List<String> objectIds) {
        this.objectIds = objectIds;
        return this;
    }
    public java.util.List<String> getObjectIds() {
        return this.objectIds;
    }

    public TogglePrimaryObjectFavoriteRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public TogglePrimaryObjectFavoriteRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public TogglePrimaryObjectFavoriteRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
