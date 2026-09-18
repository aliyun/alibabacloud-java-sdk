// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateGroupSourceContentRequest extends TeaModel {
    /**
     * <p>更新后的完整正文，可为空字符串；TEXT 存储时去首尾空白；支持 TEXT/本地 txt、md FILE，已有 skip_parse 资料沿用免解析与本地文件扩展名规则</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>更新后的正文</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>是否等待解析完成；默认 false 异步受理，true 同步等待，网关超时 300000ms</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("forceSync")
    public Boolean forceSync;

    /**
     * <p>资料所属协作空间 ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>当前空间物理 GROUP 资料 ID；引用资料只读</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>source_example</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static UpdateGroupSourceContentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupSourceContentRequest self = new UpdateGroupSourceContentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupSourceContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateGroupSourceContentRequest setForceSync(Boolean forceSync) {
        this.forceSync = forceSync;
        return this;
    }
    public Boolean getForceSync() {
        return this.forceSync;
    }

    public UpdateGroupSourceContentRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateGroupSourceContentRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public UpdateGroupSourceContentRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
