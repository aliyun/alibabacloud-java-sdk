// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreateIntegratedReportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerData")
    public CreateIntegratedReportResponseBodyServerData serverData;

    public static CreateIntegratedReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIntegratedReportResponseBody self = new CreateIntegratedReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIntegratedReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIntegratedReportResponseBody setServerData(CreateIntegratedReportResponseBodyServerData serverData) {
        this.serverData = serverData;
        return this;
    }
    public CreateIntegratedReportResponseBodyServerData getServerData() {
        return this.serverData;
    }

    public static class CreateIntegratedReportResponseBodyServerData extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        public static CreateIntegratedReportResponseBodyServerData build(java.util.Map<String, ?> map) throws Exception {
            CreateIntegratedReportResponseBodyServerData self = new CreateIntegratedReportResponseBodyServerData();
            return TeaModel.build(map, self);
        }

        public CreateIntegratedReportResponseBodyServerData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}
