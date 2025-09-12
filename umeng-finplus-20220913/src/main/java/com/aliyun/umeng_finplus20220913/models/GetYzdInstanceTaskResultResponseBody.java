// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class GetYzdInstanceTaskResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public Boolean code;

    @NameInMap("Data")
    public java.util.List<GetYzdInstanceTaskResultResponseBodyData> data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetYzdInstanceTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetYzdInstanceTaskResultResponseBody self = new GetYzdInstanceTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetYzdInstanceTaskResultResponseBody setCode(Boolean code) {
        this.code = code;
        return this;
    }
    public Boolean getCode() {
        return this.code;
    }

    public GetYzdInstanceTaskResultResponseBody setData(java.util.List<GetYzdInstanceTaskResultResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetYzdInstanceTaskResultResponseBodyData> getData() {
        return this.data;
    }

    public GetYzdInstanceTaskResultResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetYzdInstanceTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetYzdInstanceTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetYzdInstanceTaskResultResponseBodyDataDownloadUrls extends TeaModel {
        @NameInMap("pwd")
        public String pwd;

        @NameInMap("url")
        public String url;

        public static GetYzdInstanceTaskResultResponseBodyDataDownloadUrls build(java.util.Map<String, ?> map) throws Exception {
            GetYzdInstanceTaskResultResponseBodyDataDownloadUrls self = new GetYzdInstanceTaskResultResponseBodyDataDownloadUrls();
            return TeaModel.build(map, self);
        }

        public GetYzdInstanceTaskResultResponseBodyDataDownloadUrls setPwd(String pwd) {
            this.pwd = pwd;
            return this;
        }
        public String getPwd() {
            return this.pwd;
        }

        public GetYzdInstanceTaskResultResponseBodyDataDownloadUrls setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetYzdInstanceTaskResultResponseBodyData extends TeaModel {
        @NameInMap("appid")
        public String appid;

        @NameInMap("bcid")
        public String bcid;

        @NameInMap("datasetIds")
        public String datasetIds;

        @NameInMap("downloadUrls")
        public java.util.List<GetYzdInstanceTaskResultResponseBodyDataDownloadUrls> downloadUrls;

        @NameInMap("resultCnt")
        public String resultCnt;

        @NameInMap("status")
        public String status;

        @NameInMap("timeDuration")
        public String timeDuration;

        public static GetYzdInstanceTaskResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetYzdInstanceTaskResultResponseBodyData self = new GetYzdInstanceTaskResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetYzdInstanceTaskResultResponseBodyData setAppid(String appid) {
            this.appid = appid;
            return this;
        }
        public String getAppid() {
            return this.appid;
        }

        public GetYzdInstanceTaskResultResponseBodyData setBcid(String bcid) {
            this.bcid = bcid;
            return this;
        }
        public String getBcid() {
            return this.bcid;
        }

        public GetYzdInstanceTaskResultResponseBodyData setDatasetIds(String datasetIds) {
            this.datasetIds = datasetIds;
            return this;
        }
        public String getDatasetIds() {
            return this.datasetIds;
        }

        public GetYzdInstanceTaskResultResponseBodyData setDownloadUrls(java.util.List<GetYzdInstanceTaskResultResponseBodyDataDownloadUrls> downloadUrls) {
            this.downloadUrls = downloadUrls;
            return this;
        }
        public java.util.List<GetYzdInstanceTaskResultResponseBodyDataDownloadUrls> getDownloadUrls() {
            return this.downloadUrls;
        }

        public GetYzdInstanceTaskResultResponseBodyData setResultCnt(String resultCnt) {
            this.resultCnt = resultCnt;
            return this;
        }
        public String getResultCnt() {
            return this.resultCnt;
        }

        public GetYzdInstanceTaskResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetYzdInstanceTaskResultResponseBodyData setTimeDuration(String timeDuration) {
            this.timeDuration = timeDuration;
            return this;
        }
        public String getTimeDuration() {
            return this.timeDuration;
        }

    }

}
