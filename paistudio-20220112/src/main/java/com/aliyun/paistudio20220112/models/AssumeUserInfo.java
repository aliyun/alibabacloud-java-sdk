// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class AssumeUserInfo extends TeaModel {
    /**
     * <p>The AccessKey ID of the temporary access credential.</p>
     * 
     * <strong>example:</strong>
     * <p>STS.L4aBSCSJVMuKg5U1****</p>
     */
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    /**
     * <p>The ID of the assumed user.</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The temporary security token.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The identity type of the assumed user.</p>
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
