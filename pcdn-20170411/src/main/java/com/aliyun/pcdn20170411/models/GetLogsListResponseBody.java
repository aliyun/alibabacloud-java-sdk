// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetLogsListResponseBody extends TeaModel {
    @NameInMap("LogList")
    public GetLogsListResponseBodyLogList logList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    public static GetLogsListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogsListResponseBody self = new GetLogsListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogsListResponseBody setLogList(GetLogsListResponseBodyLogList logList) {
        this.logList = logList;
        return this;
    }
    public GetLogsListResponseBodyLogList getLogList() {
        return this.logList;
    }

    public GetLogsListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogsListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetLogsListResponseBodyLogListLog extends TeaModel {
        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("Url")
        public String url;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("FileName")
        public String fileName;

        public static GetLogsListResponseBodyLogListLog build(java.util.Map<String, ?> map) throws Exception {
            GetLogsListResponseBodyLogListLog self = new GetLogsListResponseBodyLogListLog();
            return TeaModel.build(map, self);
        }

        public GetLogsListResponseBodyLogListLog setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetLogsListResponseBodyLogListLog setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetLogsListResponseBodyLogListLog setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public GetLogsListResponseBodyLogListLog setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

    public static class GetLogsListResponseBodyLogList extends TeaModel {
        @NameInMap("Log")
        public java.util.List<GetLogsListResponseBodyLogListLog> log;

        public static GetLogsListResponseBodyLogList build(java.util.Map<String, ?> map) throws Exception {
            GetLogsListResponseBodyLogList self = new GetLogsListResponseBodyLogList();
            return TeaModel.build(map, self);
        }

        public GetLogsListResponseBodyLogList setLog(java.util.List<GetLogsListResponseBodyLogListLog> log) {
            this.log = log;
            return this;
        }
        public java.util.List<GetLogsListResponseBodyLogListLog> getLog() {
            return this.log;
        }

    }

}
