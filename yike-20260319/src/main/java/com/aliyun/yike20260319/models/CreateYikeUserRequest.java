// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class CreateYikeUserRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nick</p>
     */
    @NameInMap("Nickname")
    public String nickname;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>id1,id2</p>
     */
    @NameInMap("ProductionIds")
    public String productionIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("UserNamePrefix")
    public String userNamePrefix;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-az2gglkjauwnnhpq</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateYikeUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateYikeUserRequest self = new CreateYikeUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateYikeUserRequest setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public CreateYikeUserRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateYikeUserRequest setProductionIds(String productionIds) {
        this.productionIds = productionIds;
        return this;
    }
    public String getProductionIds() {
        return this.productionIds;
    }

    public CreateYikeUserRequest setUserNamePrefix(String userNamePrefix) {
        this.userNamePrefix = userNamePrefix;
        return this;
    }
    public String getUserNamePrefix() {
        return this.userNamePrefix;
    }

    public CreateYikeUserRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
