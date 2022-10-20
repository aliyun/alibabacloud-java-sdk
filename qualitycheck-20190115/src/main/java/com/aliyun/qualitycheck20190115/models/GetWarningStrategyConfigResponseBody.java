// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetWarningStrategyConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetWarningStrategyConfigResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetWarningStrategyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWarningStrategyConfigResponseBody self = new GetWarningStrategyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWarningStrategyConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWarningStrategyConfigResponseBody setData(GetWarningStrategyConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWarningStrategyConfigResponseBodyData getData() {
        return this.data;
    }

    public GetWarningStrategyConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWarningStrategyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWarningStrategyConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyListRange extends TeaModel {
        @NameInMap("RangeNum")
        public Long rangeNum;

        @NameInMap("Type")
        public Long type;

        public static GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyListRange build(java.util.Map<String, ?> map) throws Exception {
            GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyListRange self = new GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyListRange();
            return TeaModel.build(map, self);
        }

        public GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyListRange setRangeNum(Long rangeNum) {
            this.rangeNum = rangeNum;
            return this;
        }
        public Long getRangeNum() {
            return this.rangeNum;
        }

        public GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyListRange setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("DurationExpression")
        public Long durationExpression;

        @NameInMap("HitNumber")
        public Long hitNumber;

        @NameInMap("HitNumberExpression")
        public Long hitNumberExpression;

        @NameInMap("HitRuleList")
        public String hitRuleList;

        @NameInMap("HitType")
        public Long hitType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Range")
        public GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyListRange range;

        @NameInMap("Status")
        public Long status;

        public static GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyList build(java.util.Map<String, ?> map) throws Exception {
            GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyList self = new GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyList();
            return TeaModel.build(map, self);
        }

        public GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyList setDurationExpression(Long durationExpression) {
            this.durationExpression = durationExpression;
            return this;
        }
        public Long getDurationExpression() {
            return this.durationExpression;
        }

        public GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyList setHitNumber(Long hitNumber) {
            this.hitNumber = hitNumber;
            return this;
        }
        public Long getHitNumber() {
            return this.hitNumber;
        }

        public GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyList setHitNumberExpression(Long hitNumberExpression) {
            this.hitNumberExpression = hitNumberExpression;
            return this;
        }
        public Long getHitNumberExpression() {
            return this.hitNumberExpression;
        }

        public GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyList setHitRuleList(String hitRuleList) {
            this.hitRuleList = hitRuleList;
            return this;
        }
        public String getHitRuleList() {
            return this.hitRuleList;
        }

        public GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyList setHitType(Long hitType) {
            this.hitType = hitType;
            return this;
        }
        public Long getHitType() {
            return this.hitType;
        }

        public GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyList setRange(GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyListRange range) {
            this.range = range;
            return this;
        }
        public GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyListRange getRange() {
            return this.range;
        }

        public GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class GetWarningStrategyConfigResponseBodyDataWarningStrategyList extends TeaModel {
        @NameInMap("warningStrategyList")
        public java.util.List<GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyList> warningStrategyList;

        public static GetWarningStrategyConfigResponseBodyDataWarningStrategyList build(java.util.Map<String, ?> map) throws Exception {
            GetWarningStrategyConfigResponseBodyDataWarningStrategyList self = new GetWarningStrategyConfigResponseBodyDataWarningStrategyList();
            return TeaModel.build(map, self);
        }

        public GetWarningStrategyConfigResponseBodyDataWarningStrategyList setWarningStrategyList(java.util.List<GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyList> warningStrategyList) {
            this.warningStrategyList = warningStrategyList;
            return this;
        }
        public java.util.List<GetWarningStrategyConfigResponseBodyDataWarningStrategyListWarningStrategyList> getWarningStrategyList() {
            return this.warningStrategyList;
        }

    }

    public static class GetWarningStrategyConfigResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("IntervalTime")
        public Long intervalTime;

        @NameInMap("Lambda")
        public String lambda;

        @NameInMap("Level")
        public Long level;

        @NameInMap("MaxNumber")
        public Long maxNumber;

        @NameInMap("Name")
        public String name;

        @NameInMap("WarningStrategyList")
        public GetWarningStrategyConfigResponseBodyDataWarningStrategyList warningStrategyList;

        public static GetWarningStrategyConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWarningStrategyConfigResponseBodyData self = new GetWarningStrategyConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWarningStrategyConfigResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetWarningStrategyConfigResponseBodyData setIntervalTime(Long intervalTime) {
            this.intervalTime = intervalTime;
            return this;
        }
        public Long getIntervalTime() {
            return this.intervalTime;
        }

        public GetWarningStrategyConfigResponseBodyData setLambda(String lambda) {
            this.lambda = lambda;
            return this;
        }
        public String getLambda() {
            return this.lambda;
        }

        public GetWarningStrategyConfigResponseBodyData setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public GetWarningStrategyConfigResponseBodyData setMaxNumber(Long maxNumber) {
            this.maxNumber = maxNumber;
            return this;
        }
        public Long getMaxNumber() {
            return this.maxNumber;
        }

        public GetWarningStrategyConfigResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWarningStrategyConfigResponseBodyData setWarningStrategyList(GetWarningStrategyConfigResponseBodyDataWarningStrategyList warningStrategyList) {
            this.warningStrategyList = warningStrategyList;
            return this;
        }
        public GetWarningStrategyConfigResponseBodyDataWarningStrategyList getWarningStrategyList() {
            return this.warningStrategyList;
        }

    }

}
