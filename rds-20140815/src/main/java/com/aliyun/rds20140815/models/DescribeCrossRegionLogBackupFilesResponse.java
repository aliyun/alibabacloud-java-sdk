// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossRegionLogBackupFilesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeCrossRegionLogBackupFilesResponseItems items;

    public static DescribeCrossRegionLogBackupFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossRegionLogBackupFilesResponse self = new DescribeCrossRegionLogBackupFilesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeCrossRegionLogBackupFilesResponseItemsItem extends TeaModel {
        @NameInMap("CrossLogBackupId")
        @Validation(required = true)
        public Integer crossLogBackupId;

        @NameInMap("CrossBackupRegion")
        @Validation(required = true)
        public String crossBackupRegion;

        @NameInMap("CrossLogBackupSize")
        @Validation(required = true)
        public Long crossLogBackupSize;

        @NameInMap("LogBeginTime")
        @Validation(required = true)
        public String logBeginTime;

        @NameInMap("LogEndTime")
        @Validation(required = true)
        public String logEndTime;

        @NameInMap("CrossDownloadLink")
        @Validation(required = true)
        public String crossDownloadLink;

        @NameInMap("CrossIntranetDownloadLink")
        @Validation(required = true)
        public String crossIntranetDownloadLink;

        @NameInMap("LinkExpiredTime")
        @Validation(required = true)
        public String linkExpiredTime;

        @NameInMap("LogFileName")
        @Validation(required = true)
        public String logFileName;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public Integer instanceId;

        public static DescribeCrossRegionLogBackupFilesResponseItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossRegionLogBackupFilesResponseItemsItem self = new DescribeCrossRegionLogBackupFilesResponseItemsItem();
            return TeaModel.build(map, self);
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

    }

}
