// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateAiotPersonTableItemResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PersonTableItem")
    public UpdateAiotPersonTableItemResponseBodyPersonTableItem personTableItem;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAiotPersonTableItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiotPersonTableItemResponseBody self = new UpdateAiotPersonTableItemResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAiotPersonTableItemResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateAiotPersonTableItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAiotPersonTableItemResponseBody setPersonTableItem(UpdateAiotPersonTableItemResponseBodyPersonTableItem personTableItem) {
        this.personTableItem = personTableItem;
        return this;
    }
    public UpdateAiotPersonTableItemResponseBodyPersonTableItem getPersonTableItem() {
        return this.personTableItem;
    }

    public UpdateAiotPersonTableItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateAiotPersonTableItemResponseBodyPersonTableItemIdentificationList extends TeaModel {
        @NameInMap("Number")
        public String number;

        @NameInMap("Type")
        public Long type;

        public static UpdateAiotPersonTableItemResponseBodyPersonTableItemIdentificationList build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiotPersonTableItemResponseBodyPersonTableItemIdentificationList self = new UpdateAiotPersonTableItemResponseBodyPersonTableItemIdentificationList();
            return TeaModel.build(map, self);
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemIdentificationList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemIdentificationList setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class UpdateAiotPersonTableItemResponseBodyPersonTableItemImageListFeatureInfo extends TeaModel {
        @NameInMap("AlgorithmType")
        public String algorithmType;

        @NameInMap("AlgorithmVersion")
        public String algorithmVersion;

        @NameInMap("FeatureData")
        public String featureData;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ObjectId")
        public String objectId;

        @NameInMap("TabIed")
        public String tabIed;

        @NameInMap("Vendor")
        public String vendor;

        public static UpdateAiotPersonTableItemResponseBodyPersonTableItemImageListFeatureInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiotPersonTableItemResponseBodyPersonTableItemImageListFeatureInfo self = new UpdateAiotPersonTableItemResponseBodyPersonTableItemImageListFeatureInfo();
            return TeaModel.build(map, self);
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageListFeatureInfo setAlgorithmType(String algorithmType) {
            this.algorithmType = algorithmType;
            return this;
        }
        public String getAlgorithmType() {
            return this.algorithmType;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageListFeatureInfo setAlgorithmVersion(String algorithmVersion) {
            this.algorithmVersion = algorithmVersion;
            return this;
        }
        public String getAlgorithmVersion() {
            return this.algorithmVersion;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageListFeatureInfo setFeatureData(String featureData) {
            this.featureData = featureData;
            return this;
        }
        public String getFeatureData() {
            return this.featureData;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageListFeatureInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageListFeatureInfo setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageListFeatureInfo setTabIed(String tabIed) {
            this.tabIed = tabIed;
            return this;
        }
        public String getTabIed() {
            return this.tabIed;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageListFeatureInfo setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class UpdateAiotPersonTableItemResponseBodyPersonTableItemImageList extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("EventSort")
        public String eventSort;

        @NameInMap("FeatureInfo")
        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageListFeatureInfo featureInfo;

        @NameInMap("FileFormat")
        public String fileFormat;

        @NameInMap("Height")
        public Long height;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ShotTime")
        public String shotTime;

        @NameInMap("Size")
        public Long size;

        @NameInMap("StoragePath")
        public String storagePath;

        @NameInMap("Type")
        public String type;

        @NameInMap("Width")
        public Long width;

        public static UpdateAiotPersonTableItemResponseBodyPersonTableItemImageList build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiotPersonTableItemResponseBodyPersonTableItemImageList self = new UpdateAiotPersonTableItemResponseBodyPersonTableItemImageList();
            return TeaModel.build(map, self);
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageList setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageList setEventSort(String eventSort) {
            this.eventSort = eventSort;
            return this;
        }
        public String getEventSort() {
            return this.eventSort;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageList setFeatureInfo(UpdateAiotPersonTableItemResponseBodyPersonTableItemImageListFeatureInfo featureInfo) {
            this.featureInfo = featureInfo;
            return this;
        }
        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageListFeatureInfo getFeatureInfo() {
            return this.featureInfo;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageList setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageList setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageList setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageList setStoragePath(String storagePath) {
            this.storagePath = storagePath;
            return this;
        }
        public String getStoragePath() {
            return this.storagePath;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItemImageList setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class UpdateAiotPersonTableItemResponseBodyPersonTableItem extends TeaModel {
        @NameInMap("IdentificationList")
        public java.util.List<UpdateAiotPersonTableItemResponseBodyPersonTableItemIdentificationList> identificationList;

        @NameInMap("IdentificationNum")
        public Long identificationNum;

        @NameInMap("ImageList")
        public java.util.List<UpdateAiotPersonTableItemResponseBodyPersonTableItemImageList> imageList;

        @NameInMap("ImageNum")
        public Long imageNum;

        @NameInMap("LastChange")
        public String lastChange;

        @NameInMap("PersonCode")
        public String personCode;

        @NameInMap("PersonId")
        public String personId;

        @NameInMap("PersonName")
        public String personName;

        @NameInMap("PersonTableId")
        public String personTableId;

        @NameInMap("Remarks")
        public String remarks;

        public static UpdateAiotPersonTableItemResponseBodyPersonTableItem build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiotPersonTableItemResponseBodyPersonTableItem self = new UpdateAiotPersonTableItemResponseBodyPersonTableItem();
            return TeaModel.build(map, self);
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItem setIdentificationList(java.util.List<UpdateAiotPersonTableItemResponseBodyPersonTableItemIdentificationList> identificationList) {
            this.identificationList = identificationList;
            return this;
        }
        public java.util.List<UpdateAiotPersonTableItemResponseBodyPersonTableItemIdentificationList> getIdentificationList() {
            return this.identificationList;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItem setIdentificationNum(Long identificationNum) {
            this.identificationNum = identificationNum;
            return this;
        }
        public Long getIdentificationNum() {
            return this.identificationNum;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItem setImageList(java.util.List<UpdateAiotPersonTableItemResponseBodyPersonTableItemImageList> imageList) {
            this.imageList = imageList;
            return this;
        }
        public java.util.List<UpdateAiotPersonTableItemResponseBodyPersonTableItemImageList> getImageList() {
            return this.imageList;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItem setImageNum(Long imageNum) {
            this.imageNum = imageNum;
            return this;
        }
        public Long getImageNum() {
            return this.imageNum;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItem setLastChange(String lastChange) {
            this.lastChange = lastChange;
            return this;
        }
        public String getLastChange() {
            return this.lastChange;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItem setPersonCode(String personCode) {
            this.personCode = personCode;
            return this;
        }
        public String getPersonCode() {
            return this.personCode;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItem setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItem setPersonName(String personName) {
            this.personName = personName;
            return this;
        }
        public String getPersonName() {
            return this.personName;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItem setPersonTableId(String personTableId) {
            this.personTableId = personTableId;
            return this;
        }
        public String getPersonTableId() {
            return this.personTableId;
        }

        public UpdateAiotPersonTableItemResponseBodyPersonTableItem setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

    }

}
