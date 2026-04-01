// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossRegionLogBackupFilesResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The end of the time range to query. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-06-15T12:10:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Items")
    public DescribeCrossRegionLogBackupFilesResponseBodyItems items;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * <p>Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of cross-region backup files on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DAC241E8-28E6-49DA-BFB0-B2DD090885C1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range to query. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-05-30T12:10:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The total number of entries that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
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
        @NameInMap("CrossBackupRegion")
        public String crossBackupRegion;

        @NameInMap("CrossDownloadLink")
        public String crossDownloadLink;

        @NameInMap("CrossIntranetDownloadLink")
        public String crossIntranetDownloadLink;

        @NameInMap("CrossLogBackupId")
        public Integer crossLogBackupId;

        @NameInMap("CrossLogBackupSize")
        public Long crossLogBackupSize;

        @NameInMap("InstanceId")
        public Integer instanceId;

        @NameInMap("LinkExpiredTime")
        public String linkExpiredTime;

        @NameInMap("LogBeginTime")
        public String logBeginTime;

        @NameInMap("LogEndTime")
        public String logEndTime;

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
