// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSessionListResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeSessionListResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSessionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSessionListResponseBody self = new DescribeSessionListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSessionListResponseBody setData(java.util.List<DescribeSessionListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeSessionListResponseBodyData> getData() {
        return this.data;
    }

    public DescribeSessionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSessionListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>192.168.1.100:80</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>d2c90ad0-bc54-410f-bb89-2dcf14aa3c6d</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static DescribeSessionListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSessionListResponseBodyData self = new DescribeSessionListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSessionListResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeSessionListResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
