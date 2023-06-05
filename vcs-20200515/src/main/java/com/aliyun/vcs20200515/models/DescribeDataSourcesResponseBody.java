// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeDataSourcesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeDataSourcesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourcesResponseBody self = new DescribeDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDataSourcesResponseBody setData(DescribeDataSourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDataSourcesResponseBodyData getData() {
        return this.data;
    }

    public DescribeDataSourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDataSourcesResponseBodyDataRecords extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("DataSourceName")
        public String dataSourceName;

        @NameInMap("DataSourceType")
        public String dataSourceType;

        @NameInMap("Description")
        public String description;

        /**
         * <p>kafka topic</p>
         */
        @NameInMap("KafkaTopic")
        public String kafkaTopic;

        @NameInMap("OssPath")
        public String ossPath;

        @NameInMap("StreamStatus")
        public String streamStatus;

        @NameInMap("Url")
        public String url;

        public static DescribeDataSourcesResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataSourcesResponseBodyDataRecords self = new DescribeDataSourcesResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public DescribeDataSourcesResponseBodyDataRecords setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeDataSourcesResponseBodyDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public DescribeDataSourcesResponseBodyDataRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDataSourcesResponseBodyDataRecords setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public DescribeDataSourcesResponseBodyDataRecords setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public DescribeDataSourcesResponseBodyDataRecords setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public DescribeDataSourcesResponseBodyDataRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDataSourcesResponseBodyDataRecords setKafkaTopic(String kafkaTopic) {
            this.kafkaTopic = kafkaTopic;
            return this;
        }
        public String getKafkaTopic() {
            return this.kafkaTopic;
        }

        public DescribeDataSourcesResponseBodyDataRecords setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public DescribeDataSourcesResponseBodyDataRecords setStreamStatus(String streamStatus) {
            this.streamStatus = streamStatus;
            return this;
        }
        public String getStreamStatus() {
            return this.streamStatus;
        }

        public DescribeDataSourcesResponseBodyDataRecords setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeDataSourcesResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<DescribeDataSourcesResponseBodyDataRecords> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static DescribeDataSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataSourcesResponseBodyData self = new DescribeDataSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDataSourcesResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public DescribeDataSourcesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeDataSourcesResponseBodyData setRecords(java.util.List<DescribeDataSourcesResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<DescribeDataSourcesResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public DescribeDataSourcesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeDataSourcesResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
