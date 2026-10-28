// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class AssumeUserInfo extends TeaModel {
    /**
     * <p>The AccessKey ID used for role assumption.</p>
     */
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>203610320085271232</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The security token used for role assumption.</p>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The user identity type.</p>
     * 
     * <strong>example:</strong>
     * <p>sub</p>
     */
    @NameInMap("Type")
    public String type;

    public static AssumeUserInfo build(java.util.Map<String, ?> map) throws Exception {
        AssumeUserInfo self = new AssumeUserInfo();
        return TeaModel.build(map, self);
    }

    public AssumeUserInfo setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public AssumeUserInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AssumeUserInfo setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AssumeUserInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
