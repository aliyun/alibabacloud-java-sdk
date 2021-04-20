// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateAiotPersonTableItemRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("PersonTableId")
    public String personTableId;

    @NameInMap("PersonTableItem")
    public UpdateAiotPersonTableItemRequestPersonTableItem personTableItem;

    public static UpdateAiotPersonTableItemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiotPersonTableItemRequest self = new UpdateAiotPersonTableItemRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAiotPersonTableItemRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateAiotPersonTableItemRequest setPersonTableId(String personTableId) {
        this.personTableId = personTableId;
        return this;
    }
    public String getPersonTableId() {
        return this.personTableId;
    }

    public UpdateAiotPersonTableItemRequest setPersonTableItem(UpdateAiotPersonTableItemRequestPersonTableItem personTableItem) {
        this.personTableItem = personTableItem;
        return this;
    }
    public UpdateAiotPersonTableItemRequestPersonTableItem getPersonTableItem() {
        return this.personTableItem;
    }

    public static class UpdateAiotPersonTableItemRequestPersonTableItemIdentificationList extends TeaModel {
        @NameInMap("Type")
        public Long type;

        @NameInMap("Number")
        public String number;

        public static UpdateAiotPersonTableItemRequestPersonTableItemIdentificationList build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiotPersonTableItemRequestPersonTableItemIdentificationList self = new UpdateAiotPersonTableItemRequestPersonTableItemIdentificationList();
            return TeaModel.build(map, self);
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemIdentificationList setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemIdentificationList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

    }

    public static class UpdateAiotPersonTableItemRequestPersonTableItemImageListFeatureInfo extends TeaModel {
        @NameInMap("Vendor")
        public String vendor;

        @NameInMap("AlgorithmVersion")
        public String algorithmVersion;

        @NameInMap("AlgorithmType")
        public String algorithmType;

        @NameInMap("TabIeId")
        public String tabIeId;

        @NameInMap("ObjectId")
        public String objectId;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("FeatureData")
        public String featureData;

        public static UpdateAiotPersonTableItemRequestPersonTableItemImageListFeatureInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiotPersonTableItemRequestPersonTableItemImageListFeatureInfo self = new UpdateAiotPersonTableItemRequestPersonTableItemImageListFeatureInfo();
            return TeaModel.build(map, self);
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemImageListFeatureInfo setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemImageListFeatureInfo setAlgorithmVersion(String algorithmVersion) {
            this.algorithmVersion = algorithmVersion;
            return this;
        }
        public String getAlgorithmVersion() {
            return this.algorithmVersion;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemImageListFeatureInfo setAlgorithmType(String algorithmType) {
            this.algorithmType = algorithmType;
            return this;
        }
        public String getAlgorithmType() {
            return this.algorithmType;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemImageListFeatureInfo setTabIeId(String tabIeId) {
            this.tabIeId = tabIeId;
            return this;
        }
        public String getTabIeId() {
            return this.tabIeId;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemImageListFeatureInfo setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemImageListFeatureInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemImageListFeatureInfo setFeatureData(String featureData) {
            this.featureData = featureData;
            return this;
        }
        public String getFeatureData() {
            return this.featureData;
        }

    }

    public static class UpdateAiotPersonTableItemRequestPersonTableItemImageList extends TeaModel {
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("EventSort")
        public String eventSort;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("StoragePath")
        public String storagePath;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Type")
        public String type;

        @NameInMap("FileFormat")
        public String fileFormat;

        @NameInMap("ShotTime")
        public String shotTime;

        @NameInMap("Width")
        public Long width;

        @NameInMap("Height")
        public Long height;

        @NameInMap("Data")
        public String data;

        @NameInMap("FeatureInfo")
        public UpdateAiotPersonTableItemRequestPersonTableItemImageListFeatureInfo featureInfo;

        public static UpdateAiotPersonTableItemRequestPersonTableItemImageList build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiotPersonTableItemRequestPersonTableItemImageList self = new UpdateAiotPersonTableItemRequestPersonTableItemImageList();
            return TeaModel.build(map, self);
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemImageList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemImageList setEventSort(String eventSort) {
            this.eventSort = eventSort;
            return this;
        }
        public String getEventSort() {
            return this.eventSort;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemImageList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemImageList setStoragePath(String storagePath) {
            this.storagePath = storagePath;
            return this;
        }
        public String getStoragePath() {
            return this.storagePath;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemImageList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemImageList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemImageList setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemImageList setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemImageList setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemImageList setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemImageList setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItemImageList setFeatureInfo(UpdateAiotPersonTableItemRequestPersonTableItemImageListFeatureInfo featureInfo) {
            this.featureInfo = featureInfo;
            return this;
        }
        public UpdateAiotPersonTableItemRequestPersonTableItemImageListFeatureInfo getFeatureInfo() {
            return this.featureInfo;
        }

    }

    public static class UpdateAiotPersonTableItemRequestPersonTableItem extends TeaModel {
        @NameInMap("PersonId")
        public String personId;

        @NameInMap("PersonCode")
        public String personCode;

        @NameInMap("PersonName")
        public String personName;

        @NameInMap("Remarks")
        public String remarks;

        @NameInMap("IdentificationNum")
        public Long identificationNum;

        @NameInMap("IdentificationList")
        public java.util.List<UpdateAiotPersonTableItemRequestPersonTableItemIdentificationList> identificationList;

        @NameInMap("ImageNum")
        public Long imageNum;

        @NameInMap("ImageList")
        public java.util.List<UpdateAiotPersonTableItemRequestPersonTableItemImageList> imageList;

        public static UpdateAiotPersonTableItemRequestPersonTableItem build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiotPersonTableItemRequestPersonTableItem self = new UpdateAiotPersonTableItemRequestPersonTableItem();
            return TeaModel.build(map, self);
        }

        public UpdateAiotPersonTableItemRequestPersonTableItem setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItem setPersonCode(String personCode) {
            this.personCode = personCode;
            return this;
        }
        public String getPersonCode() {
            return this.personCode;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItem setPersonName(String personName) {
            this.personName = personName;
            return this;
        }
        public String getPersonName() {
            return this.personName;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItem setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItem setIdentificationNum(Long identificationNum) {
            this.identificationNum = identificationNum;
            return this;
        }
        public Long getIdentificationNum() {
            return this.identificationNum;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItem setIdentificationList(java.util.List<UpdateAiotPersonTableItemRequestPersonTableItemIdentificationList> identificationList) {
            this.identificationList = identificationList;
            return this;
        }
        public java.util.List<UpdateAiotPersonTableItemRequestPersonTableItemIdentificationList> getIdentificationList() {
            return this.identificationList;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItem setImageNum(Long imageNum) {
            this.imageNum = imageNum;
            return this;
        }
        public Long getImageNum() {
            return this.imageNum;
        }

        public UpdateAiotPersonTableItemRequestPersonTableItem setImageList(java.util.List<UpdateAiotPersonTableItemRequestPersonTableItemImageList> imageList) {
            this.imageList = imageList;
            return this;
        }
        public java.util.List<UpdateAiotPersonTableItemRequestPersonTableItemImageList> getImageList() {
            return this.imageList;
        }

    }

}
