// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreateSOXReportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerData")
    public CreateSOXReportResponseBodyServerData serverData;

    public static CreateSOXReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSOXReportResponseBody self = new CreateSOXReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSOXReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSOXReportResponseBody setServerData(CreateSOXReportResponseBodyServerData serverData) {
        this.serverData = serverData;
        return this;
    }
    public CreateSOXReportResponseBodyServerData getServerData() {
        return this.serverData;
    }

    public static class CreateSOXReportResponseBodyServerData extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        public static CreateSOXReportResponseBodyServerData build(java.util.Map<String, ?> map) throws Exception {
            CreateSOXReportResponseBodyServerData self = new CreateSOXReportResponseBodyServerData();
            return TeaModel.build(map, self);
        }

        public CreateSOXReportResponseBodyServerData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}
