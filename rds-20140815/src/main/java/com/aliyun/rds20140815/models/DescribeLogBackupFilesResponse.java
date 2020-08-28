// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeLogBackupFilesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("TotalFileSize")
    @Validation(required = true)
    public Long totalFileSize;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeLogBackupFilesResponseItems items;

    public static DescribeLogBackupFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogBackupFilesResponse self = new DescribeLogBackupFilesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeLogBackupFilesResponseItemsBinLogFile extends TeaModel {
        @NameInMap("FileSize")
        @Validation(required = true)
        public Long fileSize;

        @NameInMap("LogBeginTime")
        @Validation(required = true)
        public String logBeginTime;

        @NameInMap("LogEndTime")
        @Validation(required = true)
        public String logEndTime;

        @NameInMap("DownloadLink")
        @Validation(required = true)
        public String downloadLink;

        @NameInMap("IntranetDownloadLink")
        @Validation(required = true)
        public String intranetDownloadLink;

        @NameInMap("LinkExpiredTime")
        @Validation(required = true)
        public String linkExpiredTime;

        public static DescribeLogBackupFilesResponseItemsBinLogFile build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogBackupFilesResponseItemsBinLogFile self = new DescribeLogBackupFilesResponseItemsBinLogFile();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeLogBackupFilesResponseItems extends TeaModel {
        @NameInMap("BinLogFile")
        @Validation(required = true)
        public java.util.List<DescribeLogBackupFilesResponseItemsBinLogFile> binLogFile;

        public static DescribeLogBackupFilesResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogBackupFilesResponseItems self = new DescribeLogBackupFilesResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
