// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class ListComputeTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListComputeTaskResponseBodyData> data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListComputeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComputeTaskResponseBody self = new ListComputeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComputeTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListComputeTaskResponseBody setData(java.util.List<ListComputeTaskResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListComputeTaskResponseBodyData> getData() {
        return this.data;
    }

    public ListComputeTaskResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ListComputeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListComputeTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListComputeTaskResponseBodyDataTaskResultList extends TeaModel {
        @NameInMap("bcId")
        public Long bcId;

        @NameInMap("code")
        public Integer code;

        @NameInMap("lineNum")
        public Long lineNum;

        public static ListComputeTaskResponseBodyDataTaskResultList build(java.util.Map<String, ?> map) throws Exception {
            ListComputeTaskResponseBodyDataTaskResultList self = new ListComputeTaskResponseBodyDataTaskResultList();
            return TeaModel.build(map, self);
        }

        public ListComputeTaskResponseBodyDataTaskResultList setBcId(Long bcId) {
            this.bcId = bcId;
            return this;
        }
        public Long getBcId() {
            return this.bcId;
        }

        public ListComputeTaskResponseBodyDataTaskResultList setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public ListComputeTaskResponseBodyDataTaskResultList setLineNum(Long lineNum) {
            this.lineNum = lineNum;
            return this;
        }
        public Long getLineNum() {
            return this.lineNum;
        }

    }

    public static class ListComputeTaskResponseBodyData extends TeaModel {
        @NameInMap("appId")
        public Long appId;

        @NameInMap("bcId")
        public Long bcId;

        @NameInMap("computeOssFileTitle")
        public String computeOssFileTitle;

        @NameInMap("datasetIds")
        public String datasetIds;

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
        public java.util.List<ListComputeTaskResponseBodyDataTaskResultList> taskResultList;

        public static ListComputeTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListComputeTaskResponseBodyData self = new ListComputeTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListComputeTaskResponseBodyData setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public ListComputeTaskResponseBodyData setBcId(Long bcId) {
            this.bcId = bcId;
            return this;
        }
        public Long getBcId() {
            return this.bcId;
        }

        public ListComputeTaskResponseBodyData setComputeOssFileTitle(String computeOssFileTitle) {
            this.computeOssFileTitle = computeOssFileTitle;
            return this;
        }
        public String getComputeOssFileTitle() {
            return this.computeOssFileTitle;
        }

        public ListComputeTaskResponseBodyData setDatasetIds(String datasetIds) {
            this.datasetIds = datasetIds;
            return this;
        }
        public String getDatasetIds() {
            return this.datasetIds;
        }

        public ListComputeTaskResponseBodyData setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ListComputeTaskResponseBodyData setFileNum(Long fileNum) {
            this.fileNum = fileNum;
            return this;
        }
        public Long getFileNum() {
            return this.fileNum;
        }

        public ListComputeTaskResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListComputeTaskResponseBodyData setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public ListComputeTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListComputeTaskResponseBodyData setTaskResultList(java.util.List<ListComputeTaskResponseBodyDataTaskResultList> taskResultList) {
            this.taskResultList = taskResultList;
            return this;
        }
        public java.util.List<ListComputeTaskResponseBodyDataTaskResultList> getTaskResultList() {
            return this.taskResultList;
        }

    }

}
