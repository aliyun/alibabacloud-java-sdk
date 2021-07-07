// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateDevicesStorageRequest extends TeaModel {
    @NameInMap("UpdateStorageRequests")
    public java.util.List<UpdateDevicesStorageRequestUpdateStorageRequests> updateStorageRequests;

    public static UpdateDevicesStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevicesStorageRequest self = new UpdateDevicesStorageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDevicesStorageRequest setUpdateStorageRequests(java.util.List<UpdateDevicesStorageRequestUpdateStorageRequests> updateStorageRequests) {
        this.updateStorageRequests = updateStorageRequests;
        return this;
    }
    public java.util.List<UpdateDevicesStorageRequestUpdateStorageRequests> getUpdateStorageRequests() {
        return this.updateStorageRequests;
    }

    public static class UpdateDevicesStorageRequestUpdateStorageRequestsStorageDays extends TeaModel {
        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("StorageDays")
        public Long storageDays;

        public static UpdateDevicesStorageRequestUpdateStorageRequestsStorageDays build(java.util.Map<String, ?> map) throws Exception {
            UpdateDevicesStorageRequestUpdateStorageRequestsStorageDays self = new UpdateDevicesStorageRequestUpdateStorageRequestsStorageDays();
            return TeaModel.build(map, self);
        }

        public UpdateDevicesStorageRequestUpdateStorageRequestsStorageDays setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public UpdateDevicesStorageRequestUpdateStorageRequestsStorageDays setStorageDays(Long storageDays) {
            this.storageDays = storageDays;
            return this;
        }
        public Long getStorageDays() {
            return this.storageDays;
        }

    }

    public static class UpdateDevicesStorageRequestUpdateStorageRequests extends TeaModel {
        @NameInMap("DeviceIds")
        public String deviceIds;

        @NameInMap("StorageDays")
        public java.util.List<UpdateDevicesStorageRequestUpdateStorageRequestsStorageDays> storageDays;

        public static UpdateDevicesStorageRequestUpdateStorageRequests build(java.util.Map<String, ?> map) throws Exception {
            UpdateDevicesStorageRequestUpdateStorageRequests self = new UpdateDevicesStorageRequestUpdateStorageRequests();
            return TeaModel.build(map, self);
        }

        public UpdateDevicesStorageRequestUpdateStorageRequests setDeviceIds(String deviceIds) {
            this.deviceIds = deviceIds;
            return this;
        }
        public String getDeviceIds() {
            return this.deviceIds;
        }

        public UpdateDevicesStorageRequestUpdateStorageRequests setStorageDays(java.util.List<UpdateDevicesStorageRequestUpdateStorageRequestsStorageDays> storageDays) {
            this.storageDays = storageDays;
            return this;
        }
        public java.util.List<UpdateDevicesStorageRequestUpdateStorageRequestsStorageDays> getStorageDays() {
            return this.storageDays;
        }

    }

}
