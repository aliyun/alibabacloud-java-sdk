// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddAiotPersonTableItemsForTablesRequest extends TeaModel {
    @NameInMap("PersonTableItemList")
    public java.util.List<AddAiotPersonTableItemsForTablesRequestPersonTableItemList> personTableItemList;

    @NameInMap("PersonTableList")
    public java.util.List<AddAiotPersonTableItemsForTablesRequestPersonTableList> personTableList;

    public static AddAiotPersonTableItemsForTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAiotPersonTableItemsForTablesRequest self = new AddAiotPersonTableItemsForTablesRequest();
        return TeaModel.build(map, self);
    }

    public AddAiotPersonTableItemsForTablesRequest setPersonTableItemList(java.util.List<AddAiotPersonTableItemsForTablesRequestPersonTableItemList> personTableItemList) {
        this.personTableItemList = personTableItemList;
        return this;
    }
    public java.util.List<AddAiotPersonTableItemsForTablesRequestPersonTableItemList> getPersonTableItemList() {
        return this.personTableItemList;
    }

    public AddAiotPersonTableItemsForTablesRequest setPersonTableList(java.util.List<AddAiotPersonTableItemsForTablesRequestPersonTableList> personTableList) {
        this.personTableList = personTableList;
        return this;
    }
    public java.util.List<AddAiotPersonTableItemsForTablesRequestPersonTableList> getPersonTableList() {
        return this.personTableList;
    }

    public static class AddAiotPersonTableItemsForTablesRequestPersonTableItemListIdentificationList extends TeaModel {
        @NameInMap("Number")
        public String number;

        @NameInMap("Type")
        public Long type;

        public static AddAiotPersonTableItemsForTablesRequestPersonTableItemListIdentificationList build(java.util.Map<String, ?> map) throws Exception {
            AddAiotPersonTableItemsForTablesRequestPersonTableItemListIdentificationList self = new AddAiotPersonTableItemsForTablesRequestPersonTableItemListIdentificationList();
            return TeaModel.build(map, self);
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListIdentificationList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListIdentificationList setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageListFeatureInfo extends TeaModel {
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

        public static AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageListFeatureInfo build(java.util.Map<String, ?> map) throws Exception {
            AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageListFeatureInfo self = new AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageListFeatureInfo();
            return TeaModel.build(map, self);
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageListFeatureInfo setAlgorithmType(String algorithmType) {
            this.algorithmType = algorithmType;
            return this;
        }
        public String getAlgorithmType() {
            return this.algorithmType;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageListFeatureInfo setAlgorithmVersion(String algorithmVersion) {
            this.algorithmVersion = algorithmVersion;
            return this;
        }
        public String getAlgorithmVersion() {
            return this.algorithmVersion;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageListFeatureInfo setFeatureData(String featureData) {
            this.featureData = featureData;
            return this;
        }
        public String getFeatureData() {
            return this.featureData;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageListFeatureInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageListFeatureInfo setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageListFeatureInfo setTabIed(String tabIed) {
            this.tabIed = tabIed;
            return this;
        }
        public String getTabIed() {
            return this.tabIed;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageListFeatureInfo setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageList extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("EventSort")
        public String eventSort;

        @NameInMap("FeatureInfo")
        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageListFeatureInfo featureInfo;

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

        public static AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageList build(java.util.Map<String, ?> map) throws Exception {
            AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageList self = new AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageList();
            return TeaModel.build(map, self);
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageList setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageList setEventSort(String eventSort) {
            this.eventSort = eventSort;
            return this;
        }
        public String getEventSort() {
            return this.eventSort;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageList setFeatureInfo(AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageListFeatureInfo featureInfo) {
            this.featureInfo = featureInfo;
            return this;
        }
        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageListFeatureInfo getFeatureInfo() {
            return this.featureInfo;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageList setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageList setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageList setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageList setStoragePath(String storagePath) {
            this.storagePath = storagePath;
            return this;
        }
        public String getStoragePath() {
            return this.storagePath;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageList setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class AddAiotPersonTableItemsForTablesRequestPersonTableItemList extends TeaModel {
        @NameInMap("IdentificationList")
        public java.util.List<AddAiotPersonTableItemsForTablesRequestPersonTableItemListIdentificationList> identificationList;

        @NameInMap("IdentificationNum")
        public Long identificationNum;

        @NameInMap("ImageList")
        public java.util.List<AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageList> imageList;

        @NameInMap("ImageNum")
        public Long imageNum;

        @NameInMap("PersonCode")
        public String personCode;

        @NameInMap("PersonId")
        public String personId;

        @NameInMap("PersonName")
        public String personName;

        @NameInMap("Remarks")
        public String remarks;

        public static AddAiotPersonTableItemsForTablesRequestPersonTableItemList build(java.util.Map<String, ?> map) throws Exception {
            AddAiotPersonTableItemsForTablesRequestPersonTableItemList self = new AddAiotPersonTableItemsForTablesRequestPersonTableItemList();
            return TeaModel.build(map, self);
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemList setIdentificationList(java.util.List<AddAiotPersonTableItemsForTablesRequestPersonTableItemListIdentificationList> identificationList) {
            this.identificationList = identificationList;
            return this;
        }
        public java.util.List<AddAiotPersonTableItemsForTablesRequestPersonTableItemListIdentificationList> getIdentificationList() {
            return this.identificationList;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemList setIdentificationNum(Long identificationNum) {
            this.identificationNum = identificationNum;
            return this;
        }
        public Long getIdentificationNum() {
            return this.identificationNum;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemList setImageList(java.util.List<AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageList> imageList) {
            this.imageList = imageList;
            return this;
        }
        public java.util.List<AddAiotPersonTableItemsForTablesRequestPersonTableItemListImageList> getImageList() {
            return this.imageList;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemList setImageNum(Long imageNum) {
            this.imageNum = imageNum;
            return this;
        }
        public Long getImageNum() {
            return this.imageNum;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemList setPersonCode(String personCode) {
            this.personCode = personCode;
            return this;
        }
        public String getPersonCode() {
            return this.personCode;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemList setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemList setPersonName(String personName) {
            this.personName = personName;
            return this;
        }
        public String getPersonName() {
            return this.personName;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableItemList setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

    }

    public static class AddAiotPersonTableItemsForTablesRequestPersonTableList extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("PersonTableId")
        public String personTableId;

        public static AddAiotPersonTableItemsForTablesRequestPersonTableList build(java.util.Map<String, ?> map) throws Exception {
            AddAiotPersonTableItemsForTablesRequestPersonTableList self = new AddAiotPersonTableItemsForTablesRequestPersonTableList();
            return TeaModel.build(map, self);
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddAiotPersonTableItemsForTablesRequestPersonTableList setPersonTableId(String personTableId) {
            this.personTableId = personTableId;
            return this;
        }
        public String getPersonTableId() {
            return this.personTableId;
        }

    }

}
