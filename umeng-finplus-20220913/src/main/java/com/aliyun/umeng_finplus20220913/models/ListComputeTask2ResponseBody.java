// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class ListComputeTask2ResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListComputeTask2ResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListComputeTask2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComputeTask2ResponseBody self = new ListComputeTask2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComputeTask2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListComputeTask2ResponseBody setData(ListComputeTask2ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListComputeTask2ResponseBodyData getData() {
        return this.data;
    }

    public ListComputeTask2ResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ListComputeTask2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListComputeTask2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListComputeTask2ResponseBodyDataDataTaskResultList extends TeaModel {
        @NameInMap("bcId")
        public Long bcId;

        @NameInMap("code")
        public Integer code;

        @NameInMap("lineNum")
        public Long lineNum;

        public static ListComputeTask2ResponseBodyDataDataTaskResultList build(java.util.Map<String, ?> map) throws Exception {
            ListComputeTask2ResponseBodyDataDataTaskResultList self = new ListComputeTask2ResponseBodyDataDataTaskResultList();
            return TeaModel.build(map, self);
        }

        public ListComputeTask2ResponseBodyDataDataTaskResultList setBcId(Long bcId) {
            this.bcId = bcId;
            return this;
        }
        public Long getBcId() {
            return this.bcId;
        }

        public ListComputeTask2ResponseBodyDataDataTaskResultList setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public ListComputeTask2ResponseBodyDataDataTaskResultList setLineNum(Long lineNum) {
            this.lineNum = lineNum;
            return this;
        }
        public Long getLineNum() {
            return this.lineNum;
        }

    }

    public static class ListComputeTask2ResponseBodyDataData extends TeaModel {
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
        public java.util.List<ListComputeTask2ResponseBodyDataDataTaskResultList> taskResultList;

        public static ListComputeTask2ResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            ListComputeTask2ResponseBodyDataData self = new ListComputeTask2ResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public ListComputeTask2ResponseBodyDataData setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public ListComputeTask2ResponseBodyDataData setBcId(Long bcId) {
            this.bcId = bcId;
            return this;
        }
        public Long getBcId() {
            return this.bcId;
        }

        public ListComputeTask2ResponseBodyDataData setComputeOssFileTitle(String computeOssFileTitle) {
            this.computeOssFileTitle = computeOssFileTitle;
            return this;
        }
        public String getComputeOssFileTitle() {
            return this.computeOssFileTitle;
        }

        public ListComputeTask2ResponseBodyDataData setDatasetIds(String datasetIds) {
            this.datasetIds = datasetIds;
            return this;
        }
        public String getDatasetIds() {
            return this.datasetIds;
        }

        public ListComputeTask2ResponseBodyDataData setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ListComputeTask2ResponseBodyDataData setFileNum(Long fileNum) {
            this.fileNum = fileNum;
            return this;
        }
        public Long getFileNum() {
            return this.fileNum;
        }

        public ListComputeTask2ResponseBodyDataData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListComputeTask2ResponseBodyDataData setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public ListComputeTask2ResponseBodyDataData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListComputeTask2ResponseBodyDataData setTaskResultList(java.util.List<ListComputeTask2ResponseBodyDataDataTaskResultList> taskResultList) {
            this.taskResultList = taskResultList;
            return this;
        }
        public java.util.List<ListComputeTask2ResponseBodyDataDataTaskResultList> getTaskResultList() {
            return this.taskResultList;
        }

    }

    public static class ListComputeTask2ResponseBodyData extends TeaModel {
        @NameInMap("data")
        public java.util.List<ListComputeTask2ResponseBodyDataData> data;

        @NameInMap("totalNum")
        public Integer totalNum;

        public static ListComputeTask2ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListComputeTask2ResponseBodyData self = new ListComputeTask2ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListComputeTask2ResponseBodyData setData(java.util.List<ListComputeTask2ResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListComputeTask2ResponseBodyDataData> getData() {
            return this.data;
        }

        public ListComputeTask2ResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
