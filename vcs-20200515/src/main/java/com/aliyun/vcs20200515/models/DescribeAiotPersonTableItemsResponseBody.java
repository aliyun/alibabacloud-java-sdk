// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeAiotPersonTableItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PersonTableItems")
    public DescribeAiotPersonTableItemsResponseBodyPersonTableItems personTableItems;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAiotPersonTableItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiotPersonTableItemsResponseBody self = new DescribeAiotPersonTableItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAiotPersonTableItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAiotPersonTableItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAiotPersonTableItemsResponseBody setPersonTableItems(DescribeAiotPersonTableItemsResponseBodyPersonTableItems personTableItems) {
        this.personTableItems = personTableItems;
        return this;
    }
    public DescribeAiotPersonTableItemsResponseBodyPersonTableItems getPersonTableItems() {
        return this.personTableItems;
    }

    public DescribeAiotPersonTableItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListIdentificationList extends TeaModel {
        @NameInMap("Number")
        public String number;

        @NameInMap("Type")
        public Long type;

        public static DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListIdentificationList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListIdentificationList self = new DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListIdentificationList();
            return TeaModel.build(map, self);
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListIdentificationList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListIdentificationList setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo extends TeaModel {
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

        @NameInMap("TableId")
        public String tableId;

        @NameInMap("Vendor")
        public String vendor;

        public static DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo self = new DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo setAlgorithmType(String algorithmType) {
            this.algorithmType = algorithmType;
            return this;
        }
        public String getAlgorithmType() {
            return this.algorithmType;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo setAlgorithmVersion(String algorithmVersion) {
            this.algorithmVersion = algorithmVersion;
            return this;
        }
        public String getAlgorithmVersion() {
            return this.algorithmVersion;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo setFeatureData(String featureData) {
            this.featureData = featureData;
            return this;
        }
        public String getFeatureData() {
            return this.featureData;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("EventSort")
        public String eventSort;

        @NameInMap("FeatureInfo")
        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo featureInfo;

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

        public static DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList self = new DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList();
            return TeaModel.build(map, self);
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setEventSort(String eventSort) {
            this.eventSort = eventSort;
            return this;
        }
        public String getEventSort() {
            return this.eventSort;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setFeatureInfo(DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo featureInfo) {
            this.featureInfo = featureInfo;
            return this;
        }
        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageListFeatureInfo getFeatureInfo() {
            return this.featureInfo;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setStoragePath(String storagePath) {
            this.storagePath = storagePath;
            return this;
        }
        public String getStoragePath() {
            return this.storagePath;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList extends TeaModel {
        @NameInMap("IdentificationList")
        public java.util.List<DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListIdentificationList> identificationList;

        @NameInMap("IdentificationNum")
        public Long identificationNum;

        @NameInMap("ImageList")
        public java.util.List<DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList> imageList;

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

        public static DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList self = new DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList();
            return TeaModel.build(map, self);
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList setIdentificationList(java.util.List<DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListIdentificationList> identificationList) {
            this.identificationList = identificationList;
            return this;
        }
        public java.util.List<DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListIdentificationList> getIdentificationList() {
            return this.identificationList;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList setIdentificationNum(Long identificationNum) {
            this.identificationNum = identificationNum;
            return this;
        }
        public Long getIdentificationNum() {
            return this.identificationNum;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList setImageList(java.util.List<DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList> imageList) {
            this.imageList = imageList;
            return this;
        }
        public java.util.List<DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemListImageList> getImageList() {
            return this.imageList;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList setImageNum(Long imageNum) {
            this.imageNum = imageNum;
            return this;
        }
        public Long getImageNum() {
            return this.imageNum;
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

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList setPersonName(String personName) {
            this.personName = personName;
            return this;
        }
        public String getPersonName() {
            return this.personName;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList setPersonTableId(String personTableId) {
            this.personTableId = personTableId;
            return this;
        }
        public String getPersonTableId() {
            return this.personTableId;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

    }

    public static class DescribeAiotPersonTableItemsResponseBodyPersonTableItems extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("PersonTableItemList")
        public java.util.List<DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList> personTableItemList;

        @NameInMap("TotalNum")
        public Long totalNum;

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

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItems setPersonTableItemList(java.util.List<DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList> personTableItemList) {
            this.personTableItemList = personTableItemList;
            return this;
        }
        public java.util.List<DescribeAiotPersonTableItemsResponseBodyPersonTableItemsPersonTableItemList> getPersonTableItemList() {
            return this.personTableItemList;
        }

        public DescribeAiotPersonTableItemsResponseBodyPersonTableItems setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
