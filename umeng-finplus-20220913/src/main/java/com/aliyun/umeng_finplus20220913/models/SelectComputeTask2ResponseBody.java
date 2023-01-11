// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class SelectComputeTask2ResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SelectComputeTask2ResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SelectComputeTask2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SelectComputeTask2ResponseBody self = new SelectComputeTask2ResponseBody();
        return TeaModel.build(map, self);
    }

    public SelectComputeTask2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SelectComputeTask2ResponseBody setData(SelectComputeTask2ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SelectComputeTask2ResponseBodyData getData() {
        return this.data;
    }

    public SelectComputeTask2ResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SelectComputeTask2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SelectComputeTask2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SelectComputeTask2ResponseBodyDataExportOssFileList extends TeaModel {
        @NameInMap("downLoadUrl")
        public String downLoadUrl;

        @NameInMap("password")
        public String password;

        public static SelectComputeTask2ResponseBodyDataExportOssFileList build(java.util.Map<String, ?> map) throws Exception {
            SelectComputeTask2ResponseBodyDataExportOssFileList self = new SelectComputeTask2ResponseBodyDataExportOssFileList();
            return TeaModel.build(map, self);
        }

        public SelectComputeTask2ResponseBodyDataExportOssFileList setDownLoadUrl(String downLoadUrl) {
            this.downLoadUrl = downLoadUrl;
            return this;
        }
        public String getDownLoadUrl() {
            return this.downLoadUrl;
        }

        public SelectComputeTask2ResponseBodyDataExportOssFileList setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

    }

    public static class SelectComputeTask2ResponseBodyDataTaskResultList extends TeaModel {
        @NameInMap("bcId")
        public Long bcId;

        @NameInMap("code")
        public Integer code;

        @NameInMap("lineNum")
        public Long lineNum;

        public static SelectComputeTask2ResponseBodyDataTaskResultList build(java.util.Map<String, ?> map) throws Exception {
            SelectComputeTask2ResponseBodyDataTaskResultList self = new SelectComputeTask2ResponseBodyDataTaskResultList();
            return TeaModel.build(map, self);
        }

        public SelectComputeTask2ResponseBodyDataTaskResultList setBcId(Long bcId) {
            this.bcId = bcId;
            return this;
        }
        public Long getBcId() {
            return this.bcId;
        }

        public SelectComputeTask2ResponseBodyDataTaskResultList setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public SelectComputeTask2ResponseBodyDataTaskResultList setLineNum(Long lineNum) {
            this.lineNum = lineNum;
            return this;
        }
        public Long getLineNum() {
            return this.lineNum;
        }

    }

    public static class SelectComputeTask2ResponseBodyData extends TeaModel {
        @NameInMap("appId")
        public Long appId;

        @NameInMap("bcId")
        public Long bcId;

        @NameInMap("computeOssFileTitle")
        public String computeOssFileTitle;

        @NameInMap("datasetIds")
        public String datasetIds;

        @NameInMap("exportOssFileList")
        public java.util.List<SelectComputeTask2ResponseBodyDataExportOssFileList> exportOssFileList;

        @NameInMap("extInfo")
        public String extInfo;

        @NameInMap("fileNum")
        public Long fileNum;

        @NameInMap("hint")
        public String hint;

        @NameInMap("name")
        public String name;

        @NameInMap("remarks")
        public String remarks;

        @NameInMap("status")
        public String status;

        @NameInMap("taskResultList")
        public java.util.List<SelectComputeTask2ResponseBodyDataTaskResultList> taskResultList;

        public static SelectComputeTask2ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SelectComputeTask2ResponseBodyData self = new SelectComputeTask2ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SelectComputeTask2ResponseBodyData setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public SelectComputeTask2ResponseBodyData setBcId(Long bcId) {
            this.bcId = bcId;
            return this;
        }
        public Long getBcId() {
            return this.bcId;
        }

        public SelectComputeTask2ResponseBodyData setComputeOssFileTitle(String computeOssFileTitle) {
            this.computeOssFileTitle = computeOssFileTitle;
            return this;
        }
        public String getComputeOssFileTitle() {
            return this.computeOssFileTitle;
        }

        public SelectComputeTask2ResponseBodyData setDatasetIds(String datasetIds) {
            this.datasetIds = datasetIds;
            return this;
        }
        public String getDatasetIds() {
            return this.datasetIds;
        }

        public SelectComputeTask2ResponseBodyData setExportOssFileList(java.util.List<SelectComputeTask2ResponseBodyDataExportOssFileList> exportOssFileList) {
            this.exportOssFileList = exportOssFileList;
            return this;
        }
        public java.util.List<SelectComputeTask2ResponseBodyDataExportOssFileList> getExportOssFileList() {
            return this.exportOssFileList;
        }

        public SelectComputeTask2ResponseBodyData setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public SelectComputeTask2ResponseBodyData setFileNum(Long fileNum) {
            this.fileNum = fileNum;
            return this;
        }
        public Long getFileNum() {
            return this.fileNum;
        }

        public SelectComputeTask2ResponseBodyData setHint(String hint) {
            this.hint = hint;
            return this;
        }
        public String getHint() {
            return this.hint;
        }

        public SelectComputeTask2ResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SelectComputeTask2ResponseBodyData setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public SelectComputeTask2ResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SelectComputeTask2ResponseBodyData setTaskResultList(java.util.List<SelectComputeTask2ResponseBodyDataTaskResultList> taskResultList) {
            this.taskResultList = taskResultList;
            return this;
        }
        public java.util.List<SelectComputeTask2ResponseBodyDataTaskResultList> getTaskResultList() {
            return this.taskResultList;
        }

    }

}
