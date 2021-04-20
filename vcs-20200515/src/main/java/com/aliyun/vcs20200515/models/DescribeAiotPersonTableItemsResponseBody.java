// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeAiotPersonTableItemsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("PersonTableItems")
    public DescribeAiotPersonTableItemsResponseBodyPersonTableItems personTableItems;

    @NameInMap("Message")
    public String message;

    public static DescribeAiotPersonTableItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiotPersonTableItemsResponseBody self = new DescribeAiotPersonTableItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAiotPersonTableItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAiotPersonTableItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAiotPersonTableItemsResponseBody setPersonTableItems(DescribeAiotPersonTableItemsResponseBodyPersonTableItems personTableItems) {
        this.personTableItems = personTableItems;
        return this;
    }
    public DescribeAiotPersonTableItemsResponseBodyPersonTableItems getPersonTableItems() {
        return this.personTableItems;
    }

    public DescribeAiotPersonTableItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListIdentificationList extends TeaModel {
        @NameInMap("Type")
        public Long type;

        @NameInMap("Number")
        public String number;

        public static DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListIdentificationList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListIdentificationList self = new DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListIdentificationList();
            return TeaModel.build(map, self);
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListIdentificationList setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListIdentificationList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

    }

    public static class DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo extends TeaModel {
        @NameInMap("Vendor")
        public String vendor;

        @NameInMap("AlgorithmVersion")
        public String algorithmVersion;

        @NameInMap("AlgorithmType")
        public String algorithmType;

        @NameInMap("TableId")
        public String tableId;

        @NameInMap("ObjectId")
        public String objectId;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("FeatureData")
        public String featureData;

        public static DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo self = new DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo setAlgorithmVersion(String algorithmVersion) {
            this.algorithmVersion = algorithmVersion;
            return this;
        }
        public String getAlgorithmVersion() {
            return this.algorithmVersion;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo setAlgorithmType(String algorithmType) {
            this.algorithmType = algorithmType;
            return this;
        }
        public String getAlgorithmType() {
            return this.algorithmType;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo setFeatureData(String featureData) {
            this.featureData = featureData;
            return this;
        }
        public String getFeatureData() {
            return this.featureData;
        }

    }

    public static class DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList extends TeaModel {
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
        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo featureInfo;

        public static DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList self = new DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList();
            return TeaModel.build(map, self);
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setEventSort(String eventSort) {
            this.eventSort = eventSort;
            return this;
        }
        public String getEventSort() {
            return this.eventSort;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setStoragePath(String storagePath) {
            this.storagePath = storagePath;
            return this;
        }
        public String getStoragePath() {
            return this.storagePath;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setFeatureInfo(DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo featureInfo) {
            this.featureInfo = featureInfo;
            return this;
        }
        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo getFeatureInfo() {
            return this.featureInfo;
        }

    }

    public static class DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList extends TeaModel {
        @NameInMap("PersonTableId")
        public String personTableId;

        @NameInMap("PersonId")
        public String personId;

        @NameInMap("LastChange")
        public String lastChange;

        @NameInMap("PersonCode")
        public String personCode;

        @NameInMap("PersonName")
        public String personName;

        @NameInMap("Remarks")
        public String remarks;

        @NameInMap("IdentificationNum")
        public Long identificationNum;

        @NameInMap("IdentificationList")
        public java.util.List<DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListIdentificationList> identificationList;

        @NameInMap("ImageNum")
        public Long imageNum;

        @NameInMap("ImageList")
        public java.util.List<DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList> imageList;

        public static DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList self = new DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList();
            return TeaModel.build(map, self);
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList setPersonTableId(String personTableId) {
            this.personTableId = personTableId;
            return this;
        }
        public String getPersonTableId() {
            return this.personTableId;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList setLastChange(String lastChange) {
            this.lastChange = lastChange;
            return this;
        }
        public String getLastChange() {
            return this.lastChange;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList setPersonCode(String personCode) {
            this.personCode = personCode;
            return this;
        }
        public String getPersonCode() {
            return this.personCode;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList setPersonName(String personName) {
            this.personName = personName;
            return this;
        }
        public String getPersonName() {
            return this.personName;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList setIdentificationNum(Long identificationNum) {
            this.identificationNum = identificationNum;
            return this;
        }
        public Long getIdentificationNum() {
            return this.identificationNum;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList setIdentificationList(java.util.List<DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListIdentificationList> identificationList) {
            this.identificationList = identificationList;
            return this;
        }
        public java.util.List<DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListIdentificationList> getIdentificationList() {
            return this.identificationList;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList setImageNum(Long imageNum) {
            this.imageNum = imageNum;
            return this;
        }
        public Long getImageNum() {
            return this.imageNum;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList setImageList(java.util.List<DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList> imageList) {
            this.imageList = imageList;
            return this;
        }
        public java.util.List<DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList> getImageList() {
            return this.imageList;
        }

    }

    public static class DescribeAiotPersonTableItemsResponseBodyPersonTableItems extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalNum")
        public Long totalNum;

        @NameInMap("PersonTableItemList")
        public java.util.List<DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList> personTableItemList;

        public static DescribeAiotPersonTableItemsResponseBodyPersonTableItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiotPersonTableItemsResponseBodyPersonTableItems self = new DescribeAiotPersonTableItemsResponseBodyPersonTableItems();
            return TeaModel.build(map, self);
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItems setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItems setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItems setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItems setPersonTableItemList(java.util.List<DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList> personTableItemList) {
            this.personTableItemList = personTableItemList;
            return this;
        }
        public java.util.List<DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList> getPersonTableItemList() {
            return this.personTableItemList;
        }

    }

}
