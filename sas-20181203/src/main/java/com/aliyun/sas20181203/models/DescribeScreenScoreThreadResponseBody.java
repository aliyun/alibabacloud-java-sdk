// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeScreenScoreThreadResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeScreenScoreThreadResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D03DD0FD-6041-5107-AC00-383E28F1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeScreenScoreThreadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenScoreThreadResponseBody self = new DescribeScreenScoreThreadResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScreenScoreThreadResponseBody setData(DescribeScreenScoreThreadResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeScreenScoreThreadResponseBodyData getData() {
        return this.data;
    }

    public DescribeScreenScoreThreadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeScreenScoreThreadResponseBodyData extends TeaModel {
        /**
         * <p>The trends of the scores on the security dashboard.</p>
         */
        @NameInMap("SocreThread")
        public java.util.List<String> socreThread;

        /**
         * <p>The dates of the scores on the security dashboard.</p>
         */
        @NameInMap("SocreThreadDate")
        public java.util.List<String> socreThreadDate;

        public static DescribeScreenScoreThreadResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeScreenScoreThreadResponseBodyData self = new DescribeScreenScoreThreadResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeScreenScoreThreadResponseBodyData setSocreThread(java.util.List<String> socreThread) {
            this.socreThread = socreThread;
            return this;
        }
        public java.util.List<String> getSocreThread() {
            return this.socreThread;
        }

        public DescribeScreenScoreThreadResponseBodyData setSocreThreadDate(java.util.List<String> socreThreadDate) {
            this.socreThreadDate = socreThreadDate;
            return this;
        }
        public java.util.List<String> getSocreThreadDate() {
            return this.socreThreadDate;
        }

    }

}
