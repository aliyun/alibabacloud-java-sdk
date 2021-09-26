// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GradeProtectionReportResponseBody extends TeaModel {
    @NameInMap("ServerData")
    public String serverData;

    @NameInMap("RequestId")
    public String requestId;

    public static GradeProtectionReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GradeProtectionReportResponseBody self = new GradeProtectionReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GradeProtectionReportResponseBody setServerData(String serverData) {
        this.serverData = serverData;
        return this;
    }
    public String getServerData() {
        return this.serverData;
    }

    public GradeProtectionReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateGradeProtectionReportResponseBodyServerData extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        public static CreateGradeProtectionReportResponseBodyServerData build(java.util.Map<String, ?> map) throws Exception {
            CreateGradeProtectionReportResponseBodyServerData self = new CreateGradeProtectionReportResponseBodyServerData();
            return TeaModel.build(map, self);
        }

        public CreateGradeProtectionReportResponseBodyServerData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}
