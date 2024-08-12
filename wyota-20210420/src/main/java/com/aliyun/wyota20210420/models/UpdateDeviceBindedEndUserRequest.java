// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class UpdateDeviceBindedEndUserRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SerialNo")
    public String serialNo;

    @NameInMap("SourceAdEndUsers")
    public java.util.List<UpdateDeviceBindedEndUserRequestSourceAdEndUsers> sourceAdEndUsers;

    @NameInMap("SourceEndUserIds")
    public String sourceEndUserIds;

    @NameInMap("TargetAdEndUsers")
    public java.util.List<UpdateDeviceBindedEndUserRequestTargetAdEndUsers> targetAdEndUsers;

    @NameInMap("TargetEndUserIds")
    public String targetEndUserIds;

    @NameInMap("UserType")
    public String userType;

    public static UpdateDeviceBindedEndUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceBindedEndUserRequest self = new UpdateDeviceBindedEndUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceBindedEndUserRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public UpdateDeviceBindedEndUserRequest setSourceAdEndUsers(java.util.List<UpdateDeviceBindedEndUserRequestSourceAdEndUsers> sourceAdEndUsers) {
        this.sourceAdEndUsers = sourceAdEndUsers;
        return this;
    }
    public java.util.List<UpdateDeviceBindedEndUserRequestSourceAdEndUsers> getSourceAdEndUsers() {
        return this.sourceAdEndUsers;
    }

    public UpdateDeviceBindedEndUserRequest setSourceEndUserIds(String sourceEndUserIds) {
        this.sourceEndUserIds = sourceEndUserIds;
        return this;
    }
    public String getSourceEndUserIds() {
        return this.sourceEndUserIds;
    }

    public UpdateDeviceBindedEndUserRequest setTargetAdEndUsers(java.util.List<UpdateDeviceBindedEndUserRequestTargetAdEndUsers> targetAdEndUsers) {
        this.targetAdEndUsers = targetAdEndUsers;
        return this;
    }
    public java.util.List<UpdateDeviceBindedEndUserRequestTargetAdEndUsers> getTargetAdEndUsers() {
        return this.targetAdEndUsers;
    }

    public UpdateDeviceBindedEndUserRequest setTargetEndUserIds(String targetEndUserIds) {
        this.targetEndUserIds = targetEndUserIds;
        return this;
    }
    public String getTargetEndUserIds() {
        return this.targetEndUserIds;
    }

    public UpdateDeviceBindedEndUserRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public static class UpdateDeviceBindedEndUserRequestSourceAdEndUsers extends TeaModel {
        @NameInMap("AdDomain")
        public String adDomain;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("EndUserId")
        public String endUserId;

        public static UpdateDeviceBindedEndUserRequestSourceAdEndUsers build(java.util.Map<String, ?> map) throws Exception {
            UpdateDeviceBindedEndUserRequestSourceAdEndUsers self = new UpdateDeviceBindedEndUserRequestSourceAdEndUsers();
            return TeaModel.build(map, self);
        }

        public UpdateDeviceBindedEndUserRequestSourceAdEndUsers setAdDomain(String adDomain) {
            this.adDomain = adDomain;
            return this;
        }
        public String getAdDomain() {
            return this.adDomain;
        }

        public UpdateDeviceBindedEndUserRequestSourceAdEndUsers setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public UpdateDeviceBindedEndUserRequestSourceAdEndUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

    }

    public static class UpdateDeviceBindedEndUserRequestTargetAdEndUsers extends TeaModel {
        @NameInMap("AdDomain")
        public String adDomain;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("EndUserId")
        public String endUserId;

        public static UpdateDeviceBindedEndUserRequestTargetAdEndUsers build(java.util.Map<String, ?> map) throws Exception {
            UpdateDeviceBindedEndUserRequestTargetAdEndUsers self = new UpdateDeviceBindedEndUserRequestTargetAdEndUsers();
            return TeaModel.build(map, self);
        }

        public UpdateDeviceBindedEndUserRequestTargetAdEndUsers setAdDomain(String adDomain) {
            this.adDomain = adDomain;
            return this;
        }
        public String getAdDomain() {
            return this.adDomain;
        }

        public UpdateDeviceBindedEndUserRequestTargetAdEndUsers setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public UpdateDeviceBindedEndUserRequestTargetAdEndUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

    }

}
