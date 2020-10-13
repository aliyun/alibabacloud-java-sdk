// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetLogsListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("LogList")
    @Validation(required = true)
    public GetLogsListResponseLogList logList;

    public static GetLogsListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogsListResponse self = new GetLogsListResponse();
        return TeaModel.build(map, self);
    }

    public GetLogsListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogsListResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetLogsListResponse setLogList(GetLogsListResponseLogList logList) {
        this.logList = logList;
        return this;
    }
    public GetLogsListResponseLogList getLogList() {
        return this.logList;
    }

    public static class GetLogsListResponseLogListLog extends TeaModel {
        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("StartDate")
        @Validation(required = true)
        public String startDate;

        @NameInMap("EndDate")
        @Validation(required = true)
        public String endDate;

        public static GetLogsListResponseLogListLog build(java.util.Map<String, ?> map) throws Exception {
            GetLogsListResponseLogListLog self = new GetLogsListResponseLogListLog();
            return TeaModel.build(map, self);
        }

        public GetLogsListResponseLogListLog setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetLogsListResponseLogListLog setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetLogsListResponseLogListLog setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public GetLogsListResponseLogListLog setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

    }

    public static class GetLogsListResponseLogList extends TeaModel {
        @NameInMap("Log")
        @Validation(required = true)
        public java.util.List<GetLogsListResponseLogListLog> log;

        public static GetLogsListResponseLogList build(java.util.Map<String, ?> map) throws Exception {
            GetLogsListResponseLogList self = new GetLogsListResponseLogList();
            return TeaModel.build(map, self);
        }

        public GetLogsListResponseLogList setLog(java.util.List<GetLogsListResponseLogListLog> log) {
            this.log = log;
            return this;
        }
        public java.util.List<GetLogsListResponseLogListLog> getLog() {
            return this.log;
        }

    }

}
