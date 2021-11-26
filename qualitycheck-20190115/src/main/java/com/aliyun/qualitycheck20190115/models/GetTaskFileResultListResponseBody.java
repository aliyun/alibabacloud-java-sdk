// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetTaskFileResultListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTaskFileResultListResponseBodyData data;

    @NameInMap("DataSize")
    public Integer dataSize;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetTaskFileResultListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskFileResultListResponseBody self = new GetTaskFileResultListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskFileResultListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTaskFileResultListResponseBody setData(GetTaskFileResultListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTaskFileResultListResponseBodyData getData() {
        return this.data;
    }

    public GetTaskFileResultListResponseBody setDataSize(Integer dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Integer getDataSize() {
        return this.dataSize;
    }

    public GetTaskFileResultListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskFileResultListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetTaskFileResultListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskFileResultListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTaskFileResultListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetTaskFileResultListResponseBodyDataTaskResultReviewInfoHitRuleSet extends TeaModel {
        @NameInMap("HitRuleSet")
        public java.util.List<String> hitRuleSet;

        public static GetTaskFileResultListResponseBodyDataTaskResultReviewInfoHitRuleSet build(java.util.Map<String, ?> map) throws Exception {
            GetTaskFileResultListResponseBodyDataTaskResultReviewInfoHitRuleSet self = new GetTaskFileResultListResponseBodyDataTaskResultReviewInfoHitRuleSet();
            return TeaModel.build(map, self);
        }

        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfoHitRuleSet setHitRuleSet(java.util.List<String> hitRuleSet) {
            this.hitRuleSet = hitRuleSet;
            return this;
        }
        public java.util.List<String> getHitRuleSet() {
            return this.hitRuleSet;
        }

    }

    public static class GetTaskFileResultListResponseBodyDataTaskResultReviewInfo extends TeaModel {
        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("CheckNumber")
        public Integer checkNumber;

        @NameInMap("DataType")
        public Integer dataType;

        @NameInMap("FileMergeName")
        public String fileMergeName;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("HandTaskFile")
        public Boolean handTaskFile;

        @NameInMap("HitNumber")
        public Integer hitNumber;

        @NameInMap("HitRule")
        public Boolean hitRule;

        @NameInMap("HitRuleSet")
        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfoHitRuleSet hitRuleSet;

        @NameInMap("IsHitRule")
        public Boolean isHitRule;

        @NameInMap("NextVid")
        public String nextVid;

        @NameInMap("PreVid")
        public String preVid;

        @NameInMap("RealViolationNumber")
        public Integer realViolationNumber;

        @NameInMap("ReviewAccuracyRate")
        public Float reviewAccuracyRate;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TotalScore")
        public Integer totalScore;

        @NameInMap("Vid")
        public String vid;

        public static GetTaskFileResultListResponseBodyDataTaskResultReviewInfo build(java.util.Map<String, ?> map) throws Exception {
            GetTaskFileResultListResponseBodyDataTaskResultReviewInfo self = new GetTaskFileResultListResponseBodyDataTaskResultReviewInfo();
            return TeaModel.build(map, self);
        }

        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfo setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfo setCheckNumber(Integer checkNumber) {
            this.checkNumber = checkNumber;
            return this;
        }
        public Integer getCheckNumber() {
            return this.checkNumber;
        }

        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfo setDataType(Integer dataType) {
            this.dataType = dataType;
            return this;
        }
        public Integer getDataType() {
            return this.dataType;
        }

        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfo setFileMergeName(String fileMergeName) {
            this.fileMergeName = fileMergeName;
            return this;
        }
        public String getFileMergeName() {
            return this.fileMergeName;
        }

        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfo setHandTaskFile(Boolean handTaskFile) {
            this.handTaskFile = handTaskFile;
            return this;
        }
        public Boolean getHandTaskFile() {
            return this.handTaskFile;
        }

        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfo setHitNumber(Integer hitNumber) {
            this.hitNumber = hitNumber;
            return this;
        }
        public Integer getHitNumber() {
            return this.hitNumber;
        }

        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfo setHitRule(Boolean hitRule) {
            this.hitRule = hitRule;
            return this;
        }
        public Boolean getHitRule() {
            return this.hitRule;
        }

        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfo setHitRuleSet(GetTaskFileResultListResponseBodyDataTaskResultReviewInfoHitRuleSet hitRuleSet) {
            this.hitRuleSet = hitRuleSet;
            return this;
        }
        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfoHitRuleSet getHitRuleSet() {
            return this.hitRuleSet;
        }

        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfo setIsHitRule(Boolean isHitRule) {
            this.isHitRule = isHitRule;
            return this;
        }
        public Boolean getIsHitRule() {
            return this.isHitRule;
        }

        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfo setNextVid(String nextVid) {
            this.nextVid = nextVid;
            return this;
        }
        public String getNextVid() {
            return this.nextVid;
        }

        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfo setPreVid(String preVid) {
            this.preVid = preVid;
            return this;
        }
        public String getPreVid() {
            return this.preVid;
        }

        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfo setRealViolationNumber(Integer realViolationNumber) {
            this.realViolationNumber = realViolationNumber;
            return this;
        }
        public Integer getRealViolationNumber() {
            return this.realViolationNumber;
        }

        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfo setReviewAccuracyRate(Float reviewAccuracyRate) {
            this.reviewAccuracyRate = reviewAccuracyRate;
            return this;
        }
        public Float getReviewAccuracyRate() {
            return this.reviewAccuracyRate;
        }

        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfo setTotalScore(Integer totalScore) {
            this.totalScore = totalScore;
            return this;
        }
        public Integer getTotalScore() {
            return this.totalScore;
        }

        public GetTaskFileResultListResponseBodyDataTaskResultReviewInfo setVid(String vid) {
            this.vid = vid;
            return this;
        }
        public String getVid() {
            return this.vid;
        }

    }

    public static class GetTaskFileResultListResponseBodyData extends TeaModel {
        @NameInMap("TaskResultReviewInfo")
        public java.util.List<GetTaskFileResultListResponseBodyDataTaskResultReviewInfo> taskResultReviewInfo;

        public static GetTaskFileResultListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskFileResultListResponseBodyData self = new GetTaskFileResultListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTaskFileResultListResponseBodyData setTaskResultReviewInfo(java.util.List<GetTaskFileResultListResponseBodyDataTaskResultReviewInfo> taskResultReviewInfo) {
            this.taskResultReviewInfo = taskResultReviewInfo;
            return this;
        }
        public java.util.List<GetTaskFileResultListResponseBodyDataTaskResultReviewInfo> getTaskResultReviewInfo() {
            return this.taskResultReviewInfo;
        }

    }

}
