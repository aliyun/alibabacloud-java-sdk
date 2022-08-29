// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ImportUserRequest extends TeaModel {
    @NameInMap("authentication_display_name")
    public String authenticationDisplayName;

    @NameInMap("authentication_type")
    public String authenticationType;

    @NameInMap("auto_create_drive")
    public Boolean autoCreateDrive;

    @NameInMap("drive_total_size")
    public Long driveTotalSize;

    @NameInMap("extra")
    public String extra;

    @NameInMap("identity")
    public String identity;

    @NameInMap("nick_name")
    public String nickName;

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
