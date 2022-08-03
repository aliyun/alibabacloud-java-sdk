// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListAgingResponseBody extends TeaModel {
    @NameInMap("AgingPage")
    public ListAgingResponseBodyAgingPage agingPage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAgingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgingResponseBody self = new ListAgingResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgingResponseBody setAgingPage(ListAgingResponseBodyAgingPage agingPage) {
        this.agingPage = agingPage;
        return this;
    }
    public ListAgingResponseBodyAgingPage getAgingPage() {
        return this.agingPage;
    }

    public ListAgingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAgingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAgingResponseBodyAgingPageAgings extends TeaModel {
        @NameInMap("EndTime")
        public Object endTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("StartTime")
        public Object startTime;

        @NameInMap("TimeDay")
        public String timeDay;

        @NameInMap("Type")
        public String type;

        public static ListAgingResponseBodyAgingPageAgings build(java.util.Map<String, ?> map) throws Exception {
            ListAgingResponseBodyAgingPageAgings self = new ListAgingResponseBodyAgingPageAgings();
            return TeaModel.build(map, self);
        }

        public ListAgingResponseBodyAgingPageAgings setEndTime(Object endTime) {
            this.endTime = endTime;
            return this;
        }
        public Object getEndTime() {
            return this.endTime;
        }

        public ListAgingResponseBodyAgingPageAgings setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAgingResponseBodyAgingPageAgings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAgingResponseBodyAgingPageAgings setStartTime(Object startTime) {
            this.startTime = startTime;
            return this;
        }
        public Object getStartTime() {
            return this.startTime;
        }

        public ListAgingResponseBodyAgingPageAgings setTimeDay(String timeDay) {
            this.timeDay = timeDay;
            return this;
        }
        public String getTimeDay() {
            return this.timeDay;
        }

        public ListAgingResponseBodyAgingPageAgings setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAgingResponseBodyAgingPage extends TeaModel {
        @NameInMap("Agings")
        public java.util.List<ListAgingResponseBodyAgingPageAgings> agings;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAgingResponseBodyAgingPage build(java.util.Map<String, ?> map) throws Exception {
            ListAgingResponseBodyAgingPage self = new ListAgingResponseBodyAgingPage();
            return TeaModel.build(map, self);
        }

        public ListAgingResponseBodyAgingPage setAgings(java.util.List<ListAgingResponseBodyAgingPageAgings> agings) {
            this.agings = agings;
            return this;
        }
        public java.util.List<ListAgingResponseBodyAgingPageAgings> getAgings() {
            return this.agings;
        }

        public ListAgingResponseBodyAgingPage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
