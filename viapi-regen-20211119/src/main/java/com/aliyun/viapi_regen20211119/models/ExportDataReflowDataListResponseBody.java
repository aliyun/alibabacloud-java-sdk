// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ExportDataReflowDataListResponseBody extends TeaModel {
    @NameInMap("Data")
    public ExportDataReflowDataListResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ExportDataReflowDataListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportDataReflowDataListResponseBody self = new ExportDataReflowDataListResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportDataReflowDataListResponseBody setData(ExportDataReflowDataListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExportDataReflowDataListResponseBodyData getData() {
        return this.data;
    }

    public ExportDataReflowDataListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ExportDataReflowDataListResponseBodyData extends TeaModel {
        @NameInMap("OssHttpUrl")
        public String ossHttpUrl;

        public static ExportDataReflowDataListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExportDataReflowDataListResponseBodyData self = new ExportDataReflowDataListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExportDataReflowDataListResponseBodyData setOssHttpUrl(String ossHttpUrl) {
            this.ossHttpUrl = ossHttpUrl;
            return this;
        }
        public String getOssHttpUrl() {
            return this.ossHttpUrl;
        }

    }

}
