// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeCallUserExpResponseBody extends TeaModel {
    @NameInMap("ExpInfoList")
    public java.util.List<DescribeCallUserExpResponseBodyExpInfoList> expInfoList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCallUserExpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCallUserExpResponseBody self = new DescribeCallUserExpResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCallUserExpResponseBody setExpInfoList(java.util.List<DescribeCallUserExpResponseBodyExpInfoList> expInfoList) {
        this.expInfoList = expInfoList;
        return this;
    }
    public java.util.List<DescribeCallUserExpResponseBodyExpInfoList> getExpInfoList() {
        return this.expInfoList;
    }

    public DescribeCallUserExpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCallUserExpResponseBodyExpInfoList extends TeaModel {
        @NameInMap("CallExp")
        public String callExp;

        @NameInMap("UserId")
        public String userId;

        public static DescribeCallUserExpResponseBodyExpInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCallUserExpResponseBodyExpInfoList self = new DescribeCallUserExpResponseBodyExpInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeCallUserExpResponseBodyExpInfoList setCallExp(String callExp) {
            this.callExp = callExp;
            return this;
        }
        public String getCallExp() {
            return this.callExp;
        }

        public DescribeCallUserExpResponseBodyExpInfoList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
