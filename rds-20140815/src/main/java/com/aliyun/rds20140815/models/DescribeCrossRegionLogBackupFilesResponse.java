// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossRegionLogBackupFilesResponse extends TeaModel {
    // description: 请求ID。; 
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    // description: 实例所在地域ID。; 
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    // description: 实例ID。; 
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    // description: 查询开始时间。格式：<i>yyyy-MM-dd</i>T<i>HH:mm</i>Z（UTC时间）。; 
    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    // description: 查询结束时间。格式：<i>yyyy-MM-dd</i>T<i>HH:mm</i>Z（UTC时间）。; 
    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    // description: 总记录数。; 
    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    // description: 本页备份文件个数。; 
    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    // description: 页码，取值：大于0且不超过Integer的最大值。默认值：**1**。; 
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    // description: 跨地域日志备份列表。
    @NameInMap("Items")
    @Validation(required = true)
    public DescribeCrossRegionLogBackupFilesResponseItems items;

    public static DescribeCrossRegionLogBackupFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossRegionLogBackupFilesResponse self = new DescribeCrossRegionLogBackupFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCrossRegionLogBackupFilesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCrossRegionLogBackupFilesResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCrossRegionLogBackupFilesResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeCrossRegionLogBackupFilesResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeCrossRegionLogBackupFilesResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCrossRegionLogBackupFilesResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeCrossRegionLogBackupFilesResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeCrossRegionLogBackupFilesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCrossRegionLogBackupFilesResponse setItems(DescribeCrossRegionLogBackupFilesResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeCrossRegionLogBackupFilesResponseItems getItems() {
        return this.items;
    }

    public static class DescribeCrossRegionLogBackupFilesResponseItemsItem extends TeaModel {
        // description: 跨地域日志备份文件ID。; 
        @NameInMap("CrossLogBackupId")
        @Validation(required = true)
        public Integer crossLogBackupId;

        // description: 跨地域备份目的地域ID。; 
        @NameInMap("CrossBackupRegion")
        @Validation(required = true)
        public String crossBackupRegion;

        // description: 跨地域日志备份文件大小，单位：Byte。; 
        @NameInMap("CrossLogBackupSize")
        @Validation(required = true)
        public Long crossLogBackupSize;

        // description: 跨地域日志备份文件记录的开始时间。格式：<i>yyyy-MM-dd</i>T<i>HH:mm</i>Z（UTC时间）。; 
        @NameInMap("LogBeginTime")
        @Validation(required = true)
        public String logBeginTime;

        // description: 跨地域日志备份文件记录的结束时间。格式：<i>yyyy-MM-dd</i>T<i>HH:mm</i>Z（UTC时间）。; 
        @NameInMap("LogEndTime")
        @Validation(required = true)
        public String logEndTime;

        // description: 跨地域日志备份外网下载链接。; 
        @NameInMap("CrossDownloadLink")
        @Validation(required = true)
        public String crossDownloadLink;

        // description: 跨地域日志备份内网下载链接。; 
        @NameInMap("CrossIntranetDownloadLink")
        @Validation(required = true)
        public String crossIntranetDownloadLink;

        // description: 下载链接过期时间。格式：<i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z（UTC时间）。; 
        @NameInMap("LinkExpiredTime")
        @Validation(required = true)
        public String linkExpiredTime;

        // description: 跨地域日志备份文件名称。; 
        @NameInMap("LogFileName")
        @Validation(required = true)
        public String logFileName;

        // description: 实例编号。; 
        @NameInMap("InstanceId")
        @Validation(required = true)
        public Integer instanceId;

        public static DescribeCrossRegionLogBackupFilesResponseItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossRegionLogBackupFilesResponseItemsItem self = new DescribeCrossRegionLogBackupFilesResponseItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeCrossRegionLogBackupFilesResponseItemsItem setCrossLogBackupId(Integer crossLogBackupId) {
            this.crossLogBackupId = crossLogBackupId;
            return this;
        }
        public Integer getCrossLogBackupId() {
            return this.crossLogBackupId;
        }

        public DescribeCrossRegionLogBackupFilesResponseItemsItem setCrossBackupRegion(String crossBackupRegion) {
            this.crossBackupRegion = crossBackupRegion;
            return this;
        }
        public String getCrossBackupRegion() {
            return this.crossBackupRegion;
        }

        public DescribeCrossRegionLogBackupFilesResponseItemsItem setCrossLogBackupSize(Long crossLogBackupSize) {
            this.crossLogBackupSize = crossLogBackupSize;
            return this;
        }
        public Long getCrossLogBackupSize() {
            return this.crossLogBackupSize;
        }

        public DescribeCrossRegionLogBackupFilesResponseItemsItem setLogBeginTime(String logBeginTime) {
            this.logBeginTime = logBeginTime;
            return this;
        }
        public String getLogBeginTime() {
            return this.logBeginTime;
        }

        public DescribeCrossRegionLogBackupFilesResponseItemsItem setLogEndTime(String logEndTime) {
            this.logEndTime = logEndTime;
            return this;
        }
        public String getLogEndTime() {
            return this.logEndTime;
        }

        public DescribeCrossRegionLogBackupFilesResponseItemsItem setCrossDownloadLink(String crossDownloadLink) {
            this.crossDownloadLink = crossDownloadLink;
            return this;
        }
        public String getCrossDownloadLink() {
            return this.crossDownloadLink;
        }

        public DescribeCrossRegionLogBackupFilesResponseItemsItem setCrossIntranetDownloadLink(String crossIntranetDownloadLink) {
            this.crossIntranetDownloadLink = crossIntranetDownloadLink;
            return this;
        }
        public String getCrossIntranetDownloadLink() {
            return this.crossIntranetDownloadLink;
        }

        public DescribeCrossRegionLogBackupFilesResponseItemsItem setLinkExpiredTime(String linkExpiredTime) {
            this.linkExpiredTime = linkExpiredTime;
            return this;
        }
        public String getLinkExpiredTime() {
            return this.linkExpiredTime;
        }

        public DescribeCrossRegionLogBackupFilesResponseItemsItem setLogFileName(String logFileName) {
            this.logFileName = logFileName;
            return this;
        }
        public String getLogFileName() {
            return this.logFileName;
        }

        public DescribeCrossRegionLogBackupFilesResponseItemsItem setInstanceId(Integer instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Integer getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeCrossRegionLogBackupFilesResponseItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<DescribeCrossRegionLogBackupFilesResponseItemsItem> item;

        public static DescribeCrossRegionLogBackupFilesResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossRegionLogBackupFilesResponseItems self = new DescribeCrossRegionLogBackupFilesResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeCrossRegionLogBackupFilesResponseItems setItem(java.util.List<DescribeCrossRegionLogBackupFilesResponseItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeCrossRegionLogBackupFilesResponseItemsItem> getItem() {
            return this.item;
        }

    }

}
