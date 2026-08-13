// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceObjectBindingsShrinkRequest extends TeaModel {
    /**
     * <p>新的对象绑定列表（全量替换；传空列表表示清空所有绑定）</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("objectBindings")
    public String objectBindingsShrink;

    /**
     * <p>数据源 ID（租户内唯一）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ReplaceObjectBindingsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceObjectBindingsShrinkRequest self = new ReplaceObjectBindingsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceObjectBindingsShrinkRequest setObjectBindingsShrink(String objectBindingsShrink) {
        this.objectBindingsShrink = objectBindingsShrink;
        return this;
    }
    public String getObjectBindingsShrink() {
        return this.objectBindingsShrink;
    }

    public ReplaceObjectBindingsShrinkRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ReplaceObjectBindingsShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
