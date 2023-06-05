// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListAccessNumberResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAccessNumberResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAccessNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccessNumberResponseBody self = new ListAccessNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccessNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAccessNumberResponseBody setData(java.util.List<ListAccessNumberResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAccessNumberResponseBodyData> getData() {
        return this.data;
    }

    public ListAccessNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAccessNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAccessNumberResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public String count;

        @NameInMap("Item")
        public String item;

        @NameInMap("Percent")
        public String percent;

        public static ListAccessNumberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAccessNumberResponseBodyData self = new ListAccessNumberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAccessNumberResponseBodyData setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public ListAccessNumberResponseBodyData setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public ListAccessNumberResponseBodyData setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

    }

}
