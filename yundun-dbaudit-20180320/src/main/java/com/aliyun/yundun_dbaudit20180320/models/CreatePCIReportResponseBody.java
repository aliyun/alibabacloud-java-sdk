// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreatePCIReportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerData")
    public CreatePCIReportResponseBodyServerData serverData;

    public static CreatePCIReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePCIReportResponseBody self = new CreatePCIReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePCIReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePCIReportResponseBody setServerData(CreatePCIReportResponseBodyServerData serverData) {
        this.serverData = serverData;
        return this;
    }
    public CreatePCIReportResponseBodyServerData getServerData() {
        return this.serverData;
    }

    public static class CreatePCIReportResponseBodyServerData extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        public static CreatePCIReportResponseBodyServerData build(java.util.Map<String, ?> map) throws Exception {
            CreatePCIReportResponseBodyServerData self = new CreatePCIReportResponseBodyServerData();
            return TeaModel.build(map, self);
        }

        public CreatePCIReportResponseBodyServerData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}
