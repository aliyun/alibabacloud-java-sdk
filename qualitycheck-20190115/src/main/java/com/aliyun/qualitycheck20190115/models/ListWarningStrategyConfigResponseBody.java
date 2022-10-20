// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListWarningStrategyConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public ListWarningStrategyConfigResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListWarningStrategyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWarningStrategyConfigResponseBody self = new ListWarningStrategyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWarningStrategyConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWarningStrategyConfigResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListWarningStrategyConfigResponseBody setData(ListWarningStrategyConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListWarningStrategyConfigResponseBodyData getData() {
        return this.data;
    }

    public ListWarningStrategyConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWarningStrategyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWarningStrategyConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWarningStrategyConfigResponseBodyDataData extends TeaModel {
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

        public static ListWarningStrategyConfigResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            ListWarningStrategyConfigResponseBodyDataData self = new ListWarningStrategyConfigResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public ListWarningStrategyConfigResponseBodyDataData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListWarningStrategyConfigResponseBodyDataData setIntervalTime(Long intervalTime) {
            this.intervalTime = intervalTime;
            return this;
        }
        public Long getIntervalTime() {
            return this.intervalTime;
        }

        public ListWarningStrategyConfigResponseBodyDataData setLambda(String lambda) {
            this.lambda = lambda;
            return this;
        }
        public String getLambda() {
            return this.lambda;
        }

        public ListWarningStrategyConfigResponseBodyDataData setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public ListWarningStrategyConfigResponseBodyDataData setMaxNumber(Long maxNumber) {
            this.maxNumber = maxNumber;
            return this;
        }
        public Long getMaxNumber() {
            return this.maxNumber;
        }

        public ListWarningStrategyConfigResponseBodyDataData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListWarningStrategyConfigResponseBodyData extends TeaModel {
        @NameInMap("data")
        public java.util.List<ListWarningStrategyConfigResponseBodyDataData> data;

        public static ListWarningStrategyConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWarningStrategyConfigResponseBodyData self = new ListWarningStrategyConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWarningStrategyConfigResponseBodyData setData(java.util.List<ListWarningStrategyConfigResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListWarningStrategyConfigResponseBodyDataData> getData() {
            return this.data;
        }

    }

}
