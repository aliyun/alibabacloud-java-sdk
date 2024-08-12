// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetExportDeviceInfoOssUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetExportDeviceInfoOssUrlResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetExportDeviceInfoOssUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExportDeviceInfoOssUrlResponseBody self = new GetExportDeviceInfoOssUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExportDeviceInfoOssUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetExportDeviceInfoOssUrlResponseBody setData(GetExportDeviceInfoOssUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetExportDeviceInfoOssUrlResponseBodyData getData() {
        return this.data;
    }

    public GetExportDeviceInfoOssUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetExportDeviceInfoOssUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetExportDeviceInfoOssUrlResponseBodyData extends TeaModel {
        @NameInMap("Url")
        public String url;

        public static GetExportDeviceInfoOssUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetExportDeviceInfoOssUrlResponseBodyData self = new GetExportDeviceInfoOssUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetExportDeviceInfoOssUrlResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
