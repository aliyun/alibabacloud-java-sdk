// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ParseKeywordsResponseBody extends TeaModel {
    @NameInMap("address_line")
    public String addressLine;

    @NameInMap("tags")
    public java.util.List<SystemTag> tags;

    @NameInMap("time_range")
    public ParseKeywordsResponseBodyTimeRange timeRange;

    public static ParseKeywordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ParseKeywordsResponseBody self = new ParseKeywordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ParseKeywordsResponseBody setAddressLine(String addressLine) {
        this.addressLine = addressLine;
        return this;
    }
    public String getAddressLine() {
        return this.addressLine;
    }

    public ParseKeywordsResponseBody setTags(java.util.List<SystemTag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<SystemTag> getTags() {
        return this.tags;
    }

    public ParseKeywordsResponseBody setTimeRange(ParseKeywordsResponseBodyTimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public ParseKeywordsResponseBodyTimeRange getTimeRange() {
        return this.timeRange;
    }

    public static class ParseKeywordsResponseBodyTimeRange extends TeaModel {
        @NameInMap("end")
        public String end;

        @NameInMap("start")
        public String start;

        public static ParseKeywordsResponseBodyTimeRange build(java.util.Map<String, ?> map) throws Exception {
            ParseKeywordsResponseBodyTimeRange self = new ParseKeywordsResponseBodyTimeRange();
            return TeaModel.build(map, self);
        }

        public ParseKeywordsResponseBodyTimeRange setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public ParseKeywordsResponseBodyTimeRange setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

}
