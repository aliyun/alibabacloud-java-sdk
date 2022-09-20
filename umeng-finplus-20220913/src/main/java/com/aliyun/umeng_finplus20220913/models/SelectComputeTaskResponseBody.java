// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class SelectComputeTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SelectComputeTaskResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SelectComputeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SelectComputeTaskResponseBody self = new SelectComputeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SelectComputeTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SelectComputeTaskResponseBody setData(SelectComputeTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SelectComputeTaskResponseBodyData getData() {
        return this.data;
    }

    public SelectComputeTaskResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SelectComputeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SelectComputeTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SelectComputeTaskResponseBodyDataExportOssFileList extends TeaModel {
        @NameInMap("downLoadUrl")
        public String downLoadUrl;

        @NameInMap("password")
        public String password;

        public static SelectComputeTaskResponseBodyDataExportOssFileList build(java.util.Map<String, ?> map) throws Exception {
            SelectComputeTaskResponseBodyDataExportOssFileList self = new SelectComputeTaskResponseBodyDataExportOssFileList();
            return TeaModel.build(map, self);
        }

        public SelectComputeTaskResponseBodyDataExportOssFileList setDownLoadUrl(String downLoadUrl) {
            this.downLoadUrl = downLoadUrl;
            return this;
        }
        public String getDownLoadUrl() {
            return this.downLoadUrl;
        }

        public SelectComputeTaskResponseBodyDataExportOssFileList setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

    }

    public static class SelectComputeTaskResponseBodyDataTaskResultList extends TeaModel {
        @NameInMap("bcId")
        public Long bcId;

        @NameInMap("code")
        public Integer code;

        @NameInMap("lineNum")
        public Long lineNum;

        public static SelectComputeTaskResponseBodyDataTaskResultList build(java.util.Map<String, ?> map) throws Exception {
            SelectComputeTaskResponseBodyDataTaskResultList self = new SelectComputeTaskResponseBodyDataTaskResultList();
            return TeaModel.build(map, self);
        }

        public SelectComputeTaskResponseBodyDataTaskResultList setBcId(Long bcId) {
            this.bcId = bcId;
            return this;
        }
        public Long getBcId() {
            return this.bcId;
        }

        public SelectComputeTaskResponseBodyDataTaskResultList setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public SelectComputeTaskResponseBodyDataTaskResultList setLineNum(Long lineNum) {
            this.lineNum = lineNum;
            return this;
        }
        public Long getLineNum() {
            return this.lineNum;
        }

    }

    public static class SelectComputeTaskResponseBodyData extends TeaModel {
        @NameInMap("appId")
        public Long appId;

        @NameInMap("bcId")
        public Long bcId;

        @NameInMap("computeOssFileTitle")
        public String computeOssFileTitle;

        @NameInMap("datasetIds")
        public String datasetIds;

        @NameInMap("exportOssFileList")
        public java.util.List<SelectComputeTaskResponseBodyDataExportOssFileList> exportOssFileList;

        @NameInMap("extInfo")
        public String extInfo;

        @NameInMap("fileNum")
        public Long fileNum;

        @NameInMap("name")
        public String name;

        @NameInMap("remarks")
        public String remarks;

        @NameInMap("status")
        public String status;

        @NameInMap("taskResultList")
        public java.util.List<SelectComputeTaskResponseBodyDataTaskResultList> taskResultList;

        public static SelectComputeTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SelectComputeTaskResponseBodyData self = new SelectComputeTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SelectComputeTaskResponseBodyData setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public SelectComputeTaskResponseBodyData setBcId(Long bcId) {
            this.bcId = bcId;
            return this;
        }
        public Long getBcId() {
            return this.bcId;
        }

        public SelectComputeTaskResponseBodyData setComputeOssFileTitle(String computeOssFileTitle) {
            this.computeOssFileTitle = computeOssFileTitle;
            return this;
        }
        public String getComputeOssFileTitle() {
            return this.computeOssFileTitle;
        }

        public SelectComputeTaskResponseBodyData setDatasetIds(String datasetIds) {
            this.datasetIds = datasetIds;
            return this;
        }
        public String getDatasetIds() {
            return this.datasetIds;
        }

        public SelectComputeTaskResponseBodyData setExportOssFileList(java.util.List<SelectComputeTaskResponseBodyDataExportOssFileList> exportOssFileList) {
            this.exportOssFileList = exportOssFileList;
            return this;
        }
        public java.util.List<SelectComputeTaskResponseBodyDataExportOssFileList> getExportOssFileList() {
            return this.exportOssFileList;
        }

        public SelectComputeTaskResponseBodyData setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public SelectComputeTaskResponseBodyData setFileNum(Long fileNum) {
            this.fileNum = fileNum;
            return this;
        }
        public Long getFileNum() {
            return this.fileNum;
        }

        public SelectComputeTaskResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SelectComputeTaskResponseBodyData setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public SelectComputeTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SelectComputeTaskResponseBodyData setTaskResultList(java.util.List<SelectComputeTaskResponseBodyDataTaskResultList> taskResultList) {
            this.taskResultList = taskResultList;
            return this;
        }
        public java.util.List<SelectComputeTaskResponseBodyDataTaskResultList> getTaskResultList() {
            return this.taskResultList;
        }

    }

}
