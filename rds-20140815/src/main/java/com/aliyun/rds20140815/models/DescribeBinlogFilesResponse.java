// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBinlogFilesResponse extends TeaModel {
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
    public DescribeBinlogFilesResponseItems items;

    public static DescribeBinlogFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBinlogFilesResponse self = new DescribeBinlogFilesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeBinlogFilesResponseItemsBinLogFile extends TeaModel {
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

        @NameInMap("Checksum")
        @Validation(required = true)
        public String checksum;

        @NameInMap("HostInstanceID")
        @Validation(required = true)
        public String hostInstanceID;

        @NameInMap("LogFileName")
        @Validation(required = true)
        public String logFileName;

        public static DescribeBinlogFilesResponseItemsBinLogFile build(java.util.Map<String, ?> map) throws Exception {
            DescribeBinlogFilesResponseItemsBinLogFile self = new DescribeBinlogFilesResponseItemsBinLogFile();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeBinlogFilesResponseItems extends TeaModel {
        @NameInMap("BinLogFile")
        @Validation(required = true)
        public java.util.List<DescribeBinlogFilesResponseItemsBinLogFile> binLogFile;

        public static DescribeBinlogFilesResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBinlogFilesResponseItems self = new DescribeBinlogFilesResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
