// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GenerateYikeLoginTokenRequest extends TeaModel {
    /**
     * <p>Specifies whether automatic creation of a project is enabled. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoCreateProduction")
    public String autoCreateProduction;

    /**
     * <p>The token expiration time, in seconds. Default value: 30 days.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Expires")
    public String expires;

    /**
     * <p>The nickname.</p>
     * <ul>
     * <li>Format check: The maximum length is 50 characters.</li>
     * <li>Special format validation: Chinese characters, English characters, digits, _ \ / () ] [</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>冯凯</p>
     */
    @NameInMap("NickName")
    public String nickName;

    /**
     * <p>The role of the user in the project.</p>
     * 
     * <strong>example:</strong>
     * <p>common</p>
     */
    @NameInMap("ProductionAuth")
    public String productionAuth;

    /**
     * <p>The default credits granted to the user.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("SubUserCredit")
    public String subUserCredit;

    /**
     * <p>The tenant identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>wanyou</p>
     */
    @NameInMap("Tenant")
    public String tenant;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>userxxx</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>581236</p>
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
