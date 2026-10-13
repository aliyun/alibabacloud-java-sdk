// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ImportUserRequest extends TeaModel {
    /**
     * <p>The display name of the authentication method.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("authentication_display_name")
    public String authenticationDisplayName;

    /**
     * <p>The authentication type. Valid values are:</p>
     * <ul>
     * <li><p><code>mobile</code>: a mobile number.</p>
     * </li>
     * <li><p><code>email</code>: an email address.</p>
     * </li>
     * <li><p><code>ding</code>: a DingTalk account.</p>
     * </li>
     * <li><p><code>ram</code>: an Alibaba Cloud RAM sub-account.</p>
     * </li>
     * <li><p><code>wechat</code>: a WeCom account.</p>
     * </li>
     * <li><p><code>ldap</code>: an LDAP account.</p>
     * </li>
     * <li><p><code>custom</code>: a custom account.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mobile</p>
     */
    @NameInMap("authentication_type")
    public String authenticationType;

    /**
     * <p>Specifies whether to automatically create a drive for the user.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("auto_create_drive")
    public Boolean autoCreateDrive;

    /**
     * <p>The total size of the drive. The value must be an integer that is greater than or equal to <code>-1</code>. A value of <code>-1</code> indicates an unlimited size.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("drive_total_size")
    public Long driveTotalSize;

    /**
     * <p>Extra information.</p>
     * <p>If <code>authentication_type</code> is <code>mobile</code>, this parameter specifies the country code. The default is <code>86</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("extra")
    public String extra;

    /**
     * <p>The unique identifier for the user.</p>
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
     * <p>The ID of the group to add the user to.</p>
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
