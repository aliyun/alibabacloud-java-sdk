// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class MoveGroupResourceRequest extends TeaModel {
    /**
     * <p>协作空间 ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>资料当前所在的空间物理目录真实 ID，不支持 root 哨兵</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceDirectoryId")
    public String sourceDirectoryId;

    /**
     * <p>待移动的物理 GROUP 资料 ID；引用资料只读</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>同一空间目标物理目录真实 ID，必须与源目录不同</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("targetDirectoryId")
    public String targetDirectoryId;

    /**
     * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static MoveGroupResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveGroupResourceRequest self = new MoveGroupResourceRequest();
        return TeaModel.build(map, self);
    }

    public MoveGroupResourceRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public MoveGroupResourceRequest setSourceDirectoryId(String sourceDirectoryId) {
        this.sourceDirectoryId = sourceDirectoryId;
        return this;
    }
    public String getSourceDirectoryId() {
        return this.sourceDirectoryId;
    }

    public MoveGroupResourceRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public MoveGroupResourceRequest setTargetDirectoryId(String targetDirectoryId) {
        this.targetDirectoryId = targetDirectoryId;
        return this;
    }
    public String getTargetDirectoryId() {
        return this.targetDirectoryId;
    }

    public MoveGroupResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
