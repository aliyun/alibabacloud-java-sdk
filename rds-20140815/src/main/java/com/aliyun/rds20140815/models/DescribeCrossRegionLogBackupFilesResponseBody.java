// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossRegionLogBackupFilesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public DescribeCrossRegionLogBackupFilesResponseBodyItems items;

    public static DescribeCrossRegionLogBackupFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossRegionLogBackupFilesResponseBody self = new DescribeCrossRegionLogBackupFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCrossRegionLogBackupFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCrossRegionLogBackupFilesResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCrossRegionLogBackupFilesResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeCrossRegionLogBackupFilesResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeCrossRegionLogBackupFilesResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCrossRegionLogBackupFilesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeCrossRegionLogBackupFilesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeCrossRegionLogBackupFilesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCrossRegionLogBackupFilesResponseBody setItems(DescribeCrossRegionLogBackupFilesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeCrossRegionLogBackupFilesResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeCrossRegionLogBackupFilesResponseBodyItemsItem extends TeaModel {
        @NameInMap("CrossLogBackupId")
        public Integer crossLogBackupId;

        @NameInMap("CrossBackupRegion")
        public String crossBackupRegion;

        @NameInMap("CrossLogBackupSize")
        public Long crossLogBackupSize;

        @NameInMap("LogBeginTime")
        public String logBeginTime;

        @NameInMap("LogEndTime")
        public String logEndTime;

        @NameInMap("CrossDownloadLink")
        public String crossDownloadLink;

        @NameInMap("CrossIntranetDownloadLink")
        public String crossIntranetDownloadLink;

        @NameInMap("LinkExpiredTime")
        public String linkExpiredTime;

        @NameInMap("LogFileName")
        public String logFileName;

        @NameInMap("InstanceId")
        public Integer instanceId;

        public static DescribeCrossRegionLogBackupFilesResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossRegionLogBackupFilesResponseBodyItemsItem self = new DescribeCrossRegionLogBackupFilesResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeCrossRegionLogBackupFilesResponseBodyItemsItem setCrossLogBackupId(Integer crossLogBackupId) {
            this.crossLogBackupId = crossLogBackupId;
            return this;
        }
        public Integer getCrossLogBackupId() {
            return this.crossLogBackupId;
        }

        public DescribeCrossRegionLogBackupFilesResponseBodyItemsItem setCrossBackupRegion(String crossBackupRegion) {
            this.crossBackupRegion = crossBackupRegion;
            return this;
        }
        public String getCrossBackupRegion() {
            return this.crossBackupRegion;
        }

        public DescribeCrossRegionLogBackupFilesResponseBodyItemsItem setCrossLogBackupSize(Long crossLogBackupSize) {
            this.crossLogBackupSize = crossLogBackupSize;
            return this;
        }
        public Long getCrossLogBackupSize() {
            return this.crossLogBackupSize;
        }

        public DescribeCrossRegionLogBackupFilesResponseBodyItemsItem setLogBeginTime(String logBeginTime) {
            this.logBeginTime = logBeginTime;
            return this;
        }
        public String getLogBeginTime() {
            return this.logBeginTime;
        }

        public DescribeCrossRegionLogBackupFilesResponseBodyItemsItem setLogEndTime(String logEndTime) {
            this.logEndTime = logEndTime;
            return this;
        }
        public String getLogEndTime() {
            return this.logEndTime;
        }

        public DescribeCrossRegionLogBackupFilesResponseBodyItemsItem setCrossDownloadLink(String crossDownloadLink) {
            this.crossDownloadLink = crossDownloadLink;
            return this;
        }
        public String getCrossDownloadLink() {
            return this.crossDownloadLink;
        }

        public DescribeCrossRegionLogBackupFilesResponseBodyItemsItem setCrossIntranetDownloadLink(String crossIntranetDownloadLink) {
            this.crossIntranetDownloadLink = crossIntranetDownloadLink;
            return this;
        }
        public String getCrossIntranetDownloadLink() {
            return this.crossIntranetDownloadLink;
        }

        public DescribeCrossRegionLogBackupFilesResponseBodyItemsItem setLinkExpiredTime(String linkExpiredTime) {
            this.linkExpiredTime = linkExpiredTime;
            return this;
        }
        public String getLinkExpiredTime() {
            return this.linkExpiredTime;
        }

        public DescribeCrossRegionLogBackupFilesResponseBodyItemsItem setLogFileName(String logFileName) {
            this.logFileName = logFileName;
            return this;
        }
        public String getLogFileName() {
            return this.logFileName;
        }

        public DescribeCrossRegionLogBackupFilesResponseBodyItemsItem setInstanceId(Integer instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Integer getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeCrossRegionLogBackupFilesResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<DescribeCrossRegionLogBackupFilesResponseBodyItemsItem> item;

        public static DescribeCrossRegionLogBackupFilesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossRegionLogBackupFilesResponseBodyItems self = new DescribeCrossRegionLogBackupFilesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeCrossRegionLogBackupFilesResponseBodyItems setItem(java.util.List<DescribeCrossRegionLogBackupFilesResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeCrossRegionLogBackupFilesResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
