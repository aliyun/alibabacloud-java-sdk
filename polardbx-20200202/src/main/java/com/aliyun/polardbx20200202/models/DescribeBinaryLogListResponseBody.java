// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeBinaryLogListResponseBody extends TeaModel {
    @NameInMap("LogList")
    public java.util.List<DescribeBinaryLogListResponseBodyLogList> logList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalNumber")
    public Integer totalNumber;

    public static DescribeBinaryLogListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBinaryLogListResponseBody self = new DescribeBinaryLogListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBinaryLogListResponseBody setLogList(java.util.List<DescribeBinaryLogListResponseBodyLogList> logList) {
        this.logList = logList;
        return this;
    }
    public java.util.List<DescribeBinaryLogListResponseBodyLogList> getLogList() {
        return this.logList;
    }

    public DescribeBinaryLogListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBinaryLogListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBinaryLogListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBinaryLogListResponseBody setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }
    public Integer getTotalNumber() {
        return this.totalNumber;
    }

    public static class DescribeBinaryLogListResponseBodyLogList extends TeaModel {
        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("DownloadLink")
        public String downloadLink;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LogSize")
        public Long logSize;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("PurgeStatus")
        public Integer purgeStatus;

        @NameInMap("UploadHost")
        public String uploadHost;

        @NameInMap("UploadStatus")
        public Integer uploadStatus;

        public static DescribeBinaryLogListResponseBodyLogList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBinaryLogListResponseBodyLogList self = new DescribeBinaryLogListResponseBodyLogList();
            return TeaModel.build(map, self);
        }

        public DescribeBinaryLogListResponseBodyLogList setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public DescribeBinaryLogListResponseBodyLogList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeBinaryLogListResponseBodyLogList setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

        public DescribeBinaryLogListResponseBodyLogList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeBinaryLogListResponseBodyLogList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeBinaryLogListResponseBodyLogList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeBinaryLogListResponseBodyLogList setLogSize(Long logSize) {
            this.logSize = logSize;
            return this;
        }
        public Long getLogSize() {
            return this.logSize;
        }

        public DescribeBinaryLogListResponseBodyLogList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeBinaryLogListResponseBodyLogList setPurgeStatus(Integer purgeStatus) {
            this.purgeStatus = purgeStatus;
            return this;
        }
        public Integer getPurgeStatus() {
            return this.purgeStatus;
        }

        public DescribeBinaryLogListResponseBodyLogList setUploadHost(String uploadHost) {
            this.uploadHost = uploadHost;
            return this;
        }
        public String getUploadHost() {
            return this.uploadHost;
        }

        public DescribeBinaryLogListResponseBodyLogList setUploadStatus(Integer uploadStatus) {
            this.uploadStatus = uploadStatus;
            return this;
        }
        public Integer getUploadStatus() {
            return this.uploadStatus;
        }

    }

}
