// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLLogFilesResponse extends TeaModel {
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

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeSQLLogFilesResponseItems items;

    public static DescribeSQLLogFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogFilesResponse self = new DescribeSQLLogFilesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSQLLogFilesResponseItemsLogFile extends TeaModel {
        @NameInMap("FileID")
        @Validation(required = true)
        public String fileID;

        @NameInMap("LogStatus")
        @Validation(required = true)
        public String logStatus;

        @NameInMap("LogDownloadURL")
        @Validation(required = true)
        public String logDownloadURL;

        @NameInMap("LogSize")
        @Validation(required = true)
        public String logSize;

        @NameInMap("LogStartTime")
        @Validation(required = true)
        public String logStartTime;

        @NameInMap("LogEndTime")
        @Validation(required = true)
        public String logEndTime;

        public static DescribeSQLLogFilesResponseItemsLogFile build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogFilesResponseItemsLogFile self = new DescribeSQLLogFilesResponseItemsLogFile();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSQLLogFilesResponseItems extends TeaModel {
        @NameInMap("LogFile")
        @Validation(required = true)
        public java.util.List<DescribeSQLLogFilesResponseItemsLogFile> logFile;

        public static DescribeSQLLogFilesResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLLogFilesResponseItems self = new DescribeSQLLogFilesResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
