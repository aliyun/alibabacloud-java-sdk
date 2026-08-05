// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GenerateYikeLoginTokenRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoCreateProduction")
    public String autoCreateProduction;

    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Expires")
    public String expires;

    /**
     * <strong>example:</strong>
     * <p>testNickName</p>
     */
    @NameInMap("NickName")
    public String nickName;

    /**
     * <strong>example:</strong>
     * <p>common</p>
     */
    @NameInMap("ProductionAuth")
    public String productionAuth;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("SubUserCredit")
    public String subUserCredit;

    /**
     * <strong>example:</strong>
     * <p>tenttest</p>
     */
    @NameInMap("Tenant")
    public String tenant;

    /**
     * <strong>example:</strong>
     * <p>userxxx</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <strong>example:</strong>
     * <p>ws_8022674***</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GenerateYikeLoginTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateYikeLoginTokenRequest self = new GenerateYikeLoginTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateYikeLoginTokenRequest setAutoCreateProduction(String autoCreateProduction) {
        this.autoCreateProduction = autoCreateProduction;
        return this;
    }
    public String getAutoCreateProduction() {
        return this.autoCreateProduction;
    }

    public GenerateYikeLoginTokenRequest setExpires(String expires) {
        this.expires = expires;
        return this;
    }
    public String getExpires() {
        return this.expires;
    }

    public GenerateYikeLoginTokenRequest setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public GenerateYikeLoginTokenRequest setProductionAuth(String productionAuth) {
        this.productionAuth = productionAuth;
        return this;
    }
    public String getProductionAuth() {
        return this.productionAuth;
    }

    public GenerateYikeLoginTokenRequest setSubUserCredit(String subUserCredit) {
        this.subUserCredit = subUserCredit;
        return this;
    }
    public String getSubUserCredit() {
        return this.subUserCredit;
    }

    public GenerateYikeLoginTokenRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GenerateYikeLoginTokenRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public GenerateYikeLoginTokenRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
