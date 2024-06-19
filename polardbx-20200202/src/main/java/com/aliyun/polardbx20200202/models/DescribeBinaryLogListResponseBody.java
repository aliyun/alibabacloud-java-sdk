// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeBinaryLogListResponseBody extends TeaModel {
    @NameInMap("LogList")
    public java.util.List<DescribeBinaryLogListResponseBodyLogList> logList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>2DFF784E-DC31-5BBC-9B25-9261CD9E0AA9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2021-09-09 10:27:46</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <strong>example:</strong>
         * <p>2021-09-09 10:27:46</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p><a href="http://polarx-cdc-binlog-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/polardbx_cdc/pxc-hzfd132143sfds1/binlog.000001?Expires=1636469502&OSSAccessKeyId=LT13fds12dsafddsf&Signature=fdpm%bdsfadsa%2F%bdsafdsaf%3D">http://polarx-cdc-binlog-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/polardbx_cdc/pxc-hzfd132143sfds1/binlog.000001?Expires=1636469502&amp;OSSAccessKeyId=LT13fds12dsafddsf&amp;Signature=fdpm%bdsfadsa%2F%bdsafdsaf%3D</a></p>
         */
        @NameInMap("DownloadLink")
        public String downloadLink;

        /**
         * <strong>example:</strong>
         * <p>2021-11-09 10:27:46</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>binlog.000001</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>536870912</p>
         */
        @NameInMap("LogSize")
        public Long logSize;

        /**
         * <strong>example:</strong>
         * <p>2021-11-09 10:27:46</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PurgeStatus")
        public Integer purgeStatus;

        /**
         * <strong>example:</strong>
         * <p>10.110.88.9</p>
         */
        @NameInMap("UploadHost")
        public String uploadHost;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
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
