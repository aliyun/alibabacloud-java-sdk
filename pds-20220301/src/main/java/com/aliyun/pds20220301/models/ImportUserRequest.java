// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ImportUserRequest extends TeaModel {
    /**
     * <p>The display name of the authentication type.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("authentication_display_name")
    public String authenticationDisplayName;

    /**
     * <p>The authentication type. Valid values:</p>
     * <ul>
     * <li>mobile: mobile number.</li>
     * <li>email: email address.</li>
     * <li>ding: DingTalk account.</li>
     * <li>ram: Alibaba Cloud Resource Access Management (RAM) user.</li>
     * <li>wechat: WeCom account.</li>
     * <li>ldap: Lightweight Directory Access Protocol (LDAP) account.</li>
     * <li>custom: custom account.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mobile</p>
     */
    @NameInMap("authentication_type")
    public String authenticationType;

    /**
     * <p>Specifies whether to automatically create a drive.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("auto_create_drive")
    public Boolean autoCreateDrive;

    /**
     * <p>The size of the drive. The value cannot be smaller than -1. A value of -1 specifies that the size is unlimited.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("drive_total_size")
    public Long driveTotalSize;

    /**
     * <p>The additional information.</p>
     * <p>If authentication_type is set to mobile, set this parameter to a country code. If you do not specify this parameter, 86 is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("extra")
    public String extra;

    /**
     * <p>The unique identifier.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>130****</p>
     */
    @NameInMap("identity")
    public String identity;

    /**
     * <p>The nickname of the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pdsuer</p>
     */
    @NameInMap("nick_name")
    public String nickName;

    /**
     * <p>The ID of the group to which the user is added.</p>
     * 
     * <strong>example:</strong>
     * <p>g12</p>
     */
    @NameInMap("parent_group_id")
    public String parentGroupId;

    public static ImportUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportUserRequest self = new ImportUserRequest();
        return TeaModel.build(map, self);
    }

    public ImportUserRequest setAuthenticationDisplayName(String authenticationDisplayName) {
        this.authenticationDisplayName = authenticationDisplayName;
        return this;
    }
    public String getAuthenticationDisplayName() {
        return this.authenticationDisplayName;
    }

    public ImportUserRequest setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    public ImportUserRequest setAutoCreateDrive(Boolean autoCreateDrive) {
        this.autoCreateDrive = autoCreateDrive;
        return this;
    }
    public Boolean getAutoCreateDrive() {
        return this.autoCreateDrive;
    }

    public ImportUserRequest setDriveTotalSize(Long driveTotalSize) {
        this.driveTotalSize = driveTotalSize;
        return this;
    }
    public Long getDriveTotalSize() {
        return this.driveTotalSize;
    }

    public ImportUserRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public ImportUserRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public ImportUserRequest setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public ImportUserRequest setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
        return this;
    }
    public String getParentGroupId() {
        return this.parentGroupId;
    }

}
