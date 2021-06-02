// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class StatisQueryByDayResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 返回码
    @NameInMap("Code")
    public Long code;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 返回集合
    @NameInMap("List")
    public java.util.List<StatisQueryByDayResponseBodyList> list;

    public static StatisQueryByDayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StatisQueryByDayResponseBody self = new StatisQueryByDayResponseBody();
        return TeaModel.build(map, self);
    }

    public StatisQueryByDayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StatisQueryByDayResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public StatisQueryByDayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StatisQueryByDayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StatisQueryByDayResponseBody setList(java.util.List<StatisQueryByDayResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<StatisQueryByDayResponseBodyList> getList() {
        return this.list;
    }

    public static class StatisQueryByDayResponseBodyList extends TeaModel {
        // 是否已发布 0:未发布 1：已发布
        @NameInMap("Status")
        public Integer status;

        // 当前类型数量
        @NameInMap("Count")
        public Integer count;

        // 日期格式yyyy-MM-dd
        @NameInMap("Day")
        public String day;

        public static StatisQueryByDayResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            StatisQueryByDayResponseBodyList self = new StatisQueryByDayResponseBodyList();
            return TeaModel.build(map, self);
        }

        public StatisQueryByDayResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public StatisQueryByDayResponseBodyList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public StatisQueryByDayResponseBodyList setDay(String day) {
            this.day = day;
            return this;
        }
        public String getDay() {
            return this.day;
        }

    }

}
