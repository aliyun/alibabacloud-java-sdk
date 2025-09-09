// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListSystemLogsResponseBody extends TeaModel {
    @NameInMap("Offset")
    public String offset;

    @NameInMap("SystemLogs")
    public java.util.List<ListSystemLogsResponseBodySystemLogs> systemLogs;

    public static ListSystemLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSystemLogsResponseBody self = new ListSystemLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSystemLogsResponseBody setOffset(String offset) {
        this.offset = offset;
        return this;
    }
    public String getOffset() {
        return this.offset;
    }

    public ListSystemLogsResponseBody setSystemLogs(java.util.List<ListSystemLogsResponseBodySystemLogs> systemLogs) {
        this.systemLogs = systemLogs;
        return this;
    }
    public java.util.List<ListSystemLogsResponseBodySystemLogs> getSystemLogs() {
        return this.systemLogs;
    }

    public static class ListSystemLogsResponseBodySystemLogs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>You are using******</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-08T16:00:00Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>Error。</p>
         */
        @NameInMap("Level")
        public String level;

        public static ListSystemLogsResponseBodySystemLogs build(java.util.Map<String, ?> map) throws Exception {
            ListSystemLogsResponseBodySystemLogs self = new ListSystemLogsResponseBodySystemLogs();
            return TeaModel.build(map, self);
        }

        public ListSystemLogsResponseBodySystemLogs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListSystemLogsResponseBodySystemLogs setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListSystemLogsResponseBodySystemLogs setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

}
