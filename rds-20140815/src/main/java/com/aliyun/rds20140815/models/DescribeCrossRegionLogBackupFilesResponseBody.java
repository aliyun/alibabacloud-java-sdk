// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossRegionLogBackupFilesResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The end of the time range queried. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>An array that consists of cross-region log backup files.</p>
     */
    @NameInMap("Items")
    public DescribeCrossRegionLogBackupFilesResponseBodyItems items;

    /**
     * <p>The page number of the returned page. Pages start from page 1.</p>
     * <br>
     * <p>Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of cross-region log backup files on the current page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range queried. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeCrossRegionLogBackupFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossRegionLogBackupFilesResponseBody self = new DescribeCrossRegionLogBackupFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCrossRegionLogBackupFilesResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeCrossRegionLogBackupFilesResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCrossRegionLogBackupFilesResponseBody setItems(DescribeCrossRegionLogBackupFilesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeCrossRegionLogBackupFilesResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeCrossRegionLogBackupFilesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCrossRegionLogBackupFilesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeCrossRegionLogBackupFilesResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCrossRegionLogBackupFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCrossRegionLogBackupFilesResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeCrossRegionLogBackupFilesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeCrossRegionLogBackupFilesResponseBodyItemsItem extends TeaModel {
        /**
         * <p>The ID of the destination region where the cross-region log backup file is stored.</p>
         */
        @NameInMap("CrossBackupRegion")
        public String crossBackupRegion;

        /**
         * <p>The external URL from which you can download the cross-region log backup file.</p>
         */
        @NameInMap("CrossDownloadLink")
        public String crossDownloadLink;

        /**
         * <p>The internal URL from which you can download the cross-region log backup file.</p>
         */
        @NameInMap("CrossIntranetDownloadLink")
        public String crossIntranetDownloadLink;

        /**
         * <p>The ID of the cross-region log backup file.</p>
         */
        @NameInMap("CrossLogBackupId")
        public Integer crossLogBackupId;

        /**
         * <p>The size of the cross-region log backup file. Unit: bytes.</p>
         */
        @NameInMap("CrossLogBackupSize")
        public Long crossLogBackupSize;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public Integer instanceId;

        /**
         * <p>The time when the download URL of the cross-region log backup file expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("LinkExpiredTime")
        public String linkExpiredTime;

        /**
         * <p>The start time of the cross-region log backup file. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("LogBeginTime")
        public String logBeginTime;

        /**
         * <p>The end time of the cross-region log backup file. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("LogEndTime")
        public String logEndTime;

        /**
         * <p>The name of the cross-region log backup file.</p>
         */
        @NameInMap("LogFileName")
        public String logFileName;

        public static DescribeCrossRegionLogBackupFilesResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossRegionLogBackupFilesResponseBodyItemsItem self = new DescribeCrossRegionLogBackupFilesResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeCrossRegionLogBackupFilesResponseBodyItemsItem setCrossBackupRegion(String crossBackupRegion) {
            this.crossBackupRegion = crossBackupRegion;
            return this;
        }
        public String getCrossBackupRegion() {
            return this.crossBackupRegion;
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

        public DescribeCrossRegionLogBackupFilesResponseBodyItemsItem setCrossLogBackupId(Integer crossLogBackupId) {
            this.crossLogBackupId = crossLogBackupId;
            return this;
        }
        public Integer getCrossLogBackupId() {
            return this.crossLogBackupId;
        }

        public DescribeCrossRegionLogBackupFilesResponseBodyItemsItem setCrossLogBackupSize(Long crossLogBackupSize) {
            this.crossLogBackupSize = crossLogBackupSize;
            return this;
        }
        public Long getCrossLogBackupSize() {
            return this.crossLogBackupSize;
        }

        public DescribeCrossRegionLogBackupFilesResponseBodyItemsItem setInstanceId(Integer instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Integer getInstanceId() {
            return this.instanceId;
        }

        public DescribeCrossRegionLogBackupFilesResponseBodyItemsItem setLinkExpiredTime(String linkExpiredTime) {
            this.linkExpiredTime = linkExpiredTime;
            return this;
        }
        public String getLinkExpiredTime() {
            return this.linkExpiredTime;
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

        public DescribeCrossRegionLogBackupFilesResponseBodyItemsItem setLogFileName(String logFileName) {
            this.logFileName = logFileName;
            return this;
        }
        public String getLogFileName() {
            return this.logFileName;
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
