// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class MoveResourceRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The source directory ID, which is the personal directory where the resource currently resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceDirectoryId</p>
     */
    @NameInMap("sourceDirectoryId")
    public String sourceDirectoryId;

    /**
     * <p>The ID of the resource to be moved.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The target directory ID, which is the personal directory to which the resource will be moved.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleTargetDirectoryId</p>
     */
    @NameInMap("targetDirectoryId")
    public String targetDirectoryId;

    /**
     * <p>The tenant ID. You can view the tenant ID by logging on to the MaxCompute console and choosing <strong>Tenant Management</strong> &gt; <strong>Tenant Properties</strong> in the left-side navigation pane.</p>
     * 
     * <strong>example:</strong>
     * <p>PiPklI1iSRTm6VFFqlY9VzbgiEiE</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static MoveResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveResourceRequest self = new MoveResourceRequest();
        return TeaModel.build(map, self);
    }

    public MoveResourceRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public MoveResourceRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public MoveResourceRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public MoveResourceRequest setSourceDirectoryId(String sourceDirectoryId) {
        this.sourceDirectoryId = sourceDirectoryId;
        return this;
    }
    public String getSourceDirectoryId() {
        return this.sourceDirectoryId;
    }

    public MoveResourceRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public MoveResourceRequest setTargetDirectoryId(String targetDirectoryId) {
        this.targetDirectoryId = targetDirectoryId;
        return this;
    }
    public String getTargetDirectoryId() {
        return this.targetDirectoryId;
    }

    public MoveResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
